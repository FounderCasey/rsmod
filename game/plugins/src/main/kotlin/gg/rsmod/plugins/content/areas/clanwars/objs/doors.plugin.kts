package gg.rsmod.plugins.content.areas.clanwars.objs

import gg.rsmod.plugins.content.inter.bank.openBank

on_obj_option(obj = Objs.DOOR_29067, option = "forfeit") {
    player.message("This door is closed, need to open it", ChatMessageType.GAME_MESSAGE)
    if (player.tile.sameAs(3410, 3184)) {
        player.moveTo(3411, 3184, 0)
    } else {
        player.moveTo(3410, 3184, 0)
    }
}

on_obj_option(obj = Objs.DOOR_29066, option = "open") {
    player.message("This door is closed, need to open it", ChatMessageType.GAME_MESSAGE)
    if (player.tile.sameAs(3404, 3183)) {
        player.moveTo(3403, 3183, 0)
    } else {
        player.moveTo(3404, 3183, 0)
    }
}