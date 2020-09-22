package gg.rsmod.plugins.content.areas.clanwars.chat

on_npc_option(Npcs.ALI_MORRISANE, "talk-to") {
    open_shop(player)
}

fun open_shop(p: Player) {
    p.openShop("Ali the Fence's Shop")
}