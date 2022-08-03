package com.azimut4946777.shoppinglist.domain

class EditShopItemUseCase(private val shopListRepository: ShopListRepository) {
    fun editShopItem(shopItem: ShopItem){
shopListRepository.editShopItem(shopItem)
    }
}