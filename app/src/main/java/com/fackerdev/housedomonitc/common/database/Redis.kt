package com.fackerdev.housedomonitc.common.database

class Redis private constructor(host:String,port:String,password:String? = null) {
    companion object{
        private var instance:Redis? = null
        fun getInstance(host: String, port: String, password: String? = null):Redis{
            if(instance == null)
                instance = Redis(host,port,password)
            return instance!!
        }
    }



}