package com.activityGuard.model

/**
 * Created by DengLongFei
 * 2024/10/28
 */
data class UserModel(val name: String = "")
data class UserModel1(val name: String = "")
data class UserModel2(val name: String = "")
data class UserModel3(val name: String = ""){
    fun aaaaaaaaa(userModel1: UserModel1):UserModel4{
        val ss =   userModel1.name
        return  UserModel4(ss)
    }
}
data class UserModel4(val name: String = "")