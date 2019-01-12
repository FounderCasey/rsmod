
import gg.rsmod.plugins.osrs.api.InterfacePane
import gg.rsmod.plugins.osrs.api.OSRSGameframe
import gg.rsmod.plugins.osrs.api.helper.*
import gg.rsmod.plugins.osrs.content.inter.options.OptionsTab

r.bindButton(parent = OptionsTab.ADVANCED_INTERFACE_ID, child = 4) {
    it.player().toggleVarbit(OSRSGameframe.CHATBOX_SCROLLBAR_VARBIT)
}

r.bindButton(parent = OptionsTab.ADVANCED_INTERFACE_ID, child = 6) {
    it.player().toggleVarbit(OSRSGameframe.DISABLE_SIDEPANELS_OPAQUE_VARBIT)
}

r.bindButton(parent = OptionsTab.ADVANCED_INTERFACE_ID, child = 8) {
    it.player().toggleVarbit(OSRSGameframe.DISABLE_XP_TILL_LEVEL_VARBIT)
}

r.bindButton(parent = OptionsTab.ADVANCED_INTERFACE_ID, child = 10) {
    it.player().toggleVarbit(OSRSGameframe.DISABLE_PRAYER_TOOLTIP_VARBIT)
}

r.bindButton(parent = OptionsTab.ADVANCED_INTERFACE_ID, child = 12) {
    it.player().toggleVarbit(OSRSGameframe.DISABLE_SPECIAL_ATTACK_TOOLTIP_VARBIT)
}

r.bindButton(parent = OptionsTab.ADVANCED_INTERFACE_ID, child = 16) {
    val p = it.player()
    p.toggleVarbit(OSRSGameframe.HIDE_DATA_ORBS_VARBIT)

    /**
     * Close or open the XP drop interface.
     */
    if (p.getVarbit(OSRSGameframe.HIDE_DATA_ORBS_VARBIT) == 0) {
        p.closeInterface(interfaceId = 160)
        p.openInterface(interfaceId = 160, pane = InterfacePane.MINI_MAP)
    } else {
        p.closeInterface(interfaceId = 160)
    }
}

r.bindButton(parent = OptionsTab.ADVANCED_INTERFACE_ID, child = 18) {
    it.player().toggleVarbit(OSRSGameframe.CHATBOX_TRANSPARENT_VARBIT)
}

r.bindButton(parent = OptionsTab.ADVANCED_INTERFACE_ID, child = 20) {
    it.player().toggleVarbit(OSRSGameframe.CHATBOX_SOLID_VARBIT)
}

r.bindButton(parent = OptionsTab.ADVANCED_INTERFACE_ID, child = 21) {
    it.player().toggleVarbit(OSRSGameframe.SIDESTONES_ARRAGEMENT_VARBIT)
    // TODO: when in resizable client mode, we have to send the new display mode
}

r.bindButton(parent = OptionsTab.ADVANCED_INTERFACE_ID, child = 23) {
    it.player().toggleVarbit(OSRSGameframe.CLOSE_TABS_WITH_HOTKEY_VARBIT)
}