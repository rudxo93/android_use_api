package com.pinekim.myapiproject.presentation.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.pinekim.myapiproject.R
import com.pinekim.myapiproject.databinding.ActivityUpbitBinding

class UpbitActivity : AppCompatActivity() {

    private var mBidning: ActivityUpbitBinding? = null
    private val binding get() = mBidning!!

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        mBidning = ActivityUpbitBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}