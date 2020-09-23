package gg.rsmod.plugins.content.areas.clanwars.chat

on_npc_option(Npcs.GERRANT, "talk-to") {
    player.queue { dialog(this) }
}

on_npc_option(Npcs.GERRANT, "trade") {
    open_shop(player)
}

suspend fun dialog(it: QueueTask) {
    it.chatNpc("I've got the fishing supplies you need!", animation = 567)
    when (it.options("Sweet!", "No thanks.")) {
        1 -> open_shop(it.player)
        2 -> it.chatPlayer("No thanks.", animation = 588)
    }
}

fun open_shop(p: Player) {
    p.openShop("Bait and Tackle Shop")
}