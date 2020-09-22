package gg.rsmod.plugins.content.skills.thieving.stalls

import gg.rsmod.plugins.content.combat.isAttacking
import gg.rsmod.plugins.content.combat.isBeingAttacked

private val PICKPOCKET_ANIMATION = 881

Stall.values.forEach { stall ->
    stall.stallIDs.forEach { stallId ->
        on_obj_option(obj = stallId, option = "steal from") {
            player.queue {
                stealFromStall(stallId, stall)
            }
        }
    }
}

suspend fun QueueTask.stealFromStall(stallId: Int, stall: Stall) {
    val playerThievingLvl = player.getSkills().getCurrentLevel(Skills.THIEVING)
    val stallName = stall.stallName ?: world.definitions.get(ObjectDef::class.java, stallId).name
    if (playerThievingLvl < stall.reqLevel) {
        player.message("You need level ${stall.reqLevel} thieving to steal from the $stallName.")
        return
    }
    if (player.isAttacking() || player.isBeingAttacked()) {
        player.message("You can't steal while in combat!")
        return
    }
    if (!player.inventory.hasSpace) {
        player.message("You don't have enough inventory space to steal anymore!")
        return
    }

    //pickpocketing animation and starting message
    player.animate(PICKPOCKET_ANIMATION)
    player.message("You attempt to steal from the $stallName...")

    //wait 3 game cycles
    player.lock = LockState.FULL_WITH_ITEM_INTERACTION
    wait(3)
    player.lock = LockState.NONE

    // Get double loot if player is has a thieving cape equipped
    if (player.hasEquipped(EquipmentType.CAPE, Items.THIEVING_CAPE) || player.hasEquipped(EquipmentType.CAPE, Items.THIEVING_CAPET) && player.inventory.freeSlotCount > 2) {
        player.message("...and you succeed!")
        val reward = stall.reward
        player.inventory.add(reward, 2)
        player.addXp(Skills.THIEVING, (stall.experience * 2))
    } else {
        player.message("...and you succeed!")
        val reward = stall.reward
        player.inventory.add(reward)
        player.addXp(Skills.THIEVING, stall.experience)
    }
}