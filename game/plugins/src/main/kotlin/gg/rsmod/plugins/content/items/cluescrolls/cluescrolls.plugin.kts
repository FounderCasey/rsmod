package gg.rsmod.plugins.content.items.cluescrolls

import gg.rsmod.game.model.entity.Player
import gg.rsmod.plugins.api.cfg.Items
import gg.rsmod.plugins.api.InterfaceDestination
import gg.rsmod.plugins.api.ext.openInterface
import gg.rsmod.plugins.api.ext.setInterfaceUnderlay

on_item_option(Items.CLUE_SCROLL_EASY, "read") {
    getLoot(player)
}

fun openRewards(p: Player) {
    p.setInterfaceUnderlay(color = -1, transparency = -1)
    p.openInterface(interfaceId = 73, dest = InterfaceDestination.MAIN_SCREEN)
}

fun getLoot(p: Player) {
    p.inventory.add(item = Items.COINS_995, amount = 48933994)
}