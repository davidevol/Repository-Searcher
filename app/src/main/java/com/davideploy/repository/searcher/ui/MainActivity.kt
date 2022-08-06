package com.davideploy.repository.searcher.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.davideploy.repository.searcher.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)
    }

}