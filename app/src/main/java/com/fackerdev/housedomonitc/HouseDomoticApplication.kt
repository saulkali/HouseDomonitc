package com.fackerdev.housedomonitc

import android.app.Application
import com.uchuhimo.konf.Config
import com.uchuhimo.konf.ConfigSpec

class HouseDomoticApplication:Application() {
    lateinit var configSpec: ConfigSpec;
    lateinit var config:Config
    override fun onCreate() {
        super.onCreate()

        setupRedisConfig()
    }

    private fun setupRedisConfig() {
        configSpec = ConfigSpec()
        configSpec.required<String>("redis","host")
        configSpec.required<String>("redis","port")
        configSpec.required<String>("redis","password")

        config = Config{
            addSpec(configSpec)
        }.from.file("config.ini")
    }
}