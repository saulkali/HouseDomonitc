package com.fackerdev.housedomonitc.common.entities

import java.util.*

data class UserEntity(
    val id:UUID,
    val firstName:String,
    val lastName:String,
    val email:String,
    val numberPhone:String
){
    fun getFullName() = "$firstName $lastName"
}
