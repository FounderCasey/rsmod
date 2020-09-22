package gg.rsmod.plugins.content.areas.clanwars.objs

import gg.rsmod.plugins.content.inter.bank.openBank

on_obj_option(obj = Objs.BANK_CHEST, option = "use") {
    openBank(player)
}

fun openBank(p: Player) {
    p.openBank()
}
