package gg.rsmod.game.message.handler

import gg.rsmod.game.message.MessageHandler
import gg.rsmod.game.message.impl.WorldMapClickMessage
import gg.rsmod.game.model.Tile
import gg.rsmod.game.model.entity.Client
import gg.rsmod.game.model.priv.Privilege

/**
 * @author HolyRSPS <dagreenrs@gmail.com>
 */
class ClickWorldMapHandler : MessageHandler<WorldMapClickMessage> {

    override fun handle(client: Client, message: WorldMapClickMessage) {
        if (client.world.privileges.isEligible(client.privilege, Privilege.ADMIN_POWER)) {
            log(client, "Click world map: %d", Tile.from30BitHash(message.data).toString())
            client.moveTo(Tile.from30BitHash(message.data))
        }
    }
}