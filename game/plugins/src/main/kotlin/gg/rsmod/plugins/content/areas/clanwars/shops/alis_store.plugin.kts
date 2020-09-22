package gg.rsmod.plugins.content.areas.clanwars.shops

import gg.rsmod.plugins.content.mechanics.shops.CoinCurrency

create_shop("Ali the Fence's Shop", CoinCurrency(), stockType = StockType.INFINITE, purchasePolicy = PurchasePolicy.BUY_STOCK) {
    items[0] = ShopItem(Items.BANANA, 10500000, sellPrice = 800, buyPrice = 500)
    items[1] = ShopItem(Items.GOLD_RING, 10500000, sellPrice = 2200, buyPrice = 1500)
    items[2] = ShopItem(Items.POT_OF_WEEDS, 10500000, sellPrice = 4500, buyPrice = 3300)
    items[3] = ShopItem(Items.BATTLESTAFF, 10500000, sellPrice = 7600, buyPrice = 6500)
    items[4] = ShopItem(Items.ADAMANT_SCIMITAR, 10500000, sellPrice = 10000, buyPrice = 8500)
    items[5] = ShopItem(Items.SILVER_BAR, 10500000, sellPrice = 13800, buyPrice = 11000)
}