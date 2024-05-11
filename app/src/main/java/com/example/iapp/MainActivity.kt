package com.example.iapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.iapp.api.CFactApi
import com.example.iapp.api.CImageApi
import com.example.iapp.database.CCatDataEntity
import com.example.iapp.entity.IFact

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val factApi = CFactApi("string")
        val imageApi = CImageApi("string")
        val catData = CCatDataEntity("str", "str")

        test(factApi)
    }

    private fun test(data: IFact) {

    }
}