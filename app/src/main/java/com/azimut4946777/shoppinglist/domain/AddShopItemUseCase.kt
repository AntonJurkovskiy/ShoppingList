package com.azimut4946777.shoppinglist.domain

class AddShopItemUseCase(private val shopListRepository: ShopListRepository) {
    fun addShopItem(shopItem: ShopItem) {
       shopListRepository.addShopItem(shopItem)
    }
}