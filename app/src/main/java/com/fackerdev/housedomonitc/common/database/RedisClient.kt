package com.fackerdev.housedomonitc.common.database
class RedisClient private constructor(host:String, port:String, password:String? = null) {
    companion object{
        private var instance:RedisClient? = null
        fun getInstance(host: String, port: String, password: String? = null):RedisClient{
            if(instance == null)
                instance = RedisClient(host,port,password)
            return instance!!
        }
    }
}