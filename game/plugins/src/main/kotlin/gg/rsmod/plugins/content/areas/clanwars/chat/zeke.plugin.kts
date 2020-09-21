package gg.rsmod.plugins.content.areas.clanwars.chat

on_npc_option(Npcs.ZEKE, "talk-to") {
    player.queue { dialog(this) }
}

on_npc_option(Npcs.ZEKE, "trade") {
    open_shop(player)
}

suspend fun dialog(it: QueueTask) {
    it.chatNpc("Hey! I have the some great melee gear here. Take a look", animation = 567)
    when (it.options("Let me see.", "No thanks.")) {
        1 -> open_shop(it.player)
        2 -> it.chatPlayer("No thanks.", animation = 588)
    }
}

fun open_shop(p: Player) {
    p.openShop("Zeke's Melee Store")
}