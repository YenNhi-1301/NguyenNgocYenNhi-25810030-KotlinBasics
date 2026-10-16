// Nguyễn Ngọc Yến Nhi:25810030
package com.example.cupcake.data

data class OrderUiState(

    val quantity: Int = 0,

    val flavor: String = "",

    val date: String = "",

    val price: String = "",

    val pickupOptions: List<String> = listOf()
)
