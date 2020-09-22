package gg.rsmod.plugins.content.skills.thieving.stalls

import gg.rsmod.game.model.weight.impl.WeightItemSet
import gg.rsmod.plugins.api.cfg.Items
import gg.rsmod.plugins.api.cfg.Objs

//Rarity weighting
private const val ALWAYS = 0
private const val COMMON = 256
private const val UNCOMMON = 32
private const val RARE = 8
private const val VERY_RARE = 1

/**
 * @property stallIDs an array of NPC npcIds for them to pickpocket
 * @property experience the amount of experienceerience given per pickpocket
 * @property reqLevel the level requirement to pickpocket that npc
 * @property reward the item the player gets from stealing from the stall
 */
enum class Stall(val stallIDs: IntArray, val experience: Double, val reqLevel: Int, val stallName: String? = null,
                 val reward: Int) {
    FOOD_STALL(
            stallIDs = intArrayOf(
                    Objs.FOOD_STALL
            ),
            experience = 10.0,
            reqLevel = 1,
            reward = Items.BANANA
    ),

    CRAFTING_STALL(
            stallIDs = intArrayOf(
                    Objs.CRAFTING_STALL
            ),
            experience = 16.0,
            reqLevel = 30,
            reward = Items.GOLD_RING
    ),

    GENERAL_STALL(
            stallIDs = intArrayOf(
                    Objs.GENERAL_STALL
            ),
            experience = 28.50,
            reqLevel = 60,
            reward = Items.POT_OF_WEEDS
    ),


    MAGIC_STALL(
            stallIDs = intArrayOf(
                    Objs.MAGIC_STALL
            ),
            experience = 55.0,
            reqLevel = 75,
            reward = Items.BATTLESTAFF
    ),

    SCIMITAR_STALL(
            stallIDs = intArrayOf(
                    Objs.SCIMITAR_STALL
            ),
            experience = 75.0,
            reqLevel = 85,
            reward = Items.ADAMANT_SCIMITAR
    );

    // TODO: Silver & Gem stalls have the option "steal-from" - either change this or adopt a way to use both(either or)
//    SILVER_STALL(
//            stallIDs = intArrayOf(
//                    Objs.SILVER_STALL_6164
//            ),
//            experience = 100.0,
//            reqLevel = 90,
//            reward = Items.SILVER_BAR
//    ),

//    GEM_STALL(
//            stallIDs = intArrayOf(
//                    Objs.GEM_STALL_6162
//            ),
//            experience = 120.0,
//            reqLevel = 90,
//            reward = Items.UNCUT_DRAGONSTONE
//    );

    companion object {
        val values = enumValues<Stall>()
    }
}