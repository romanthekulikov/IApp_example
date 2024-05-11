package com.example.iapp.api

import com.example.iapp.entity.IImage

data class CImageApi(
    @Json(name = "url")
    override val url: String
) : IImage
