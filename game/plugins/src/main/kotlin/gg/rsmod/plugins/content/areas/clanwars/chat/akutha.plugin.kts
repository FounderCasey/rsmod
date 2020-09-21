package gg.rsmod.plugins.content.areas.clanwars.chat

on_npc_option(Npcs.WIZARD_AKUTHA, "talk-to") {
    player.queue { dialog(this) }
}

on_npc_option(Npcs.WIZARD_AKUTHA, "trade") {
    open_shop(player)
}

suspend fun dialog(it: QueueTask) {
    it.chatNpc("Welcome Wizard! Want to browse my shop?", animation = 567)
    when (it.options("Yes please.", "No thanks.")) {
        1 -> open_shop(it.player)
        2 -> it.chatPlayer("No thanks.", animation = 588)
    }
}

fun open_shop(p: Player) {
    p.openShop("Akutha's Magic Store")
}