package com.fackerdev.housedomonitc.modules.moduleLogin.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.fackerdev.housedomonitc.HouseDomoticApplication
import com.fackerdev.housedomonitc.R
import com.fackerdev.housedomonitc.databinding.ActivityLoginBinding
import com.fackerdev.housedomonitc.modules.moduleLogin.viewModel.LoginActivityViewModel

class LoginActivity : AppCompatActivity() {
    private lateinit var mBinding:ActivityLoginBinding
    private lateinit var mViewModel: LoginActivityViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(mBinding.root)

        initAnimation()
        setupButtons()
        setupViewModel()

        val application = HouseDomoticApplication()


    }

    private fun setupViewModel() {
        mViewModel = ViewModelProvider(this)[LoginActivityViewModel::class.java]
        mViewModel.mUserEntity.observe(this) { userEntity ->
            if (userEntity == null) {
                mBinding.tilUsername.isErrorEnabled = true;
                mBinding.tilPassword.isErrorEnabled = true;
            }else{
                openHome()
            }

        }
    }
    private fun openHome(){
        val intent = Intent()
        startActivity(intent)
    }
    private fun setupButtons() {
        mBinding.btnLogin.setOnClickListener {
            mBinding.tilPassword.animation = AnimationUtils.loadAnimation(this,R.anim.title_login)
            mBinding.tilUsername.animation = AnimationUtils.loadAnimation(this,R.anim.til_login_error)
            Toast.makeText(this, "hello world", Toast.LENGTH_SHORT).show()
        }
    }

    private fun initAnimation() {
        mBinding.ivPhotoLogin.animation = AnimationUtils.loadAnimation(this,R.anim.iv_profile_login)
        mBinding.tvTitleLogin.animation = AnimationUtils.loadAnimation(this,R.anim.title_login)
        mBinding.tvForgotPassword.animation = AnimationUtils.loadAnimation(this,R.anim.title_login)
        mBinding.tilPassword.animation = AnimationUtils.loadAnimation(this,R.anim.til_login)
        mBinding.tilUsername.animation = AnimationUtils.loadAnimation(this,R.anim.til_login)
        mBinding.btnLogin.animation = AnimationUtils.loadAnimation(this,R.anim.til_login)
    }
}