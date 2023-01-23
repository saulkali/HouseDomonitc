package com.fackerdev.housedomonitc.modules.moduleHome.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.fackerdev.housedomonitc.databinding.ActivityHomeBinding
import com.fackerdev.housedomonitc.modules.moduleHome.viewModel.HomeViewModel

class HomeActivity : AppCompatActivity() {
    private lateinit var mBinding:ActivityHomeBinding
    private lateinit var mViewModel: HomeViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(mBinding.root)

        setupViewModel()
    }

    private fun setupViewModel() {
        mViewModel = ViewModelProvider(this)[HomeViewModel::class.java]
    }
}