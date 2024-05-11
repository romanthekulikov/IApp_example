package com.example.iapp.api

import com.example.iapp.entity.IFact

data class CFactApi(
    @Json(name = "fact")
    override val fact: String
) : IFact
