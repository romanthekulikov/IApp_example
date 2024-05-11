package com.example.iapp.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.iapp.entity.IFact
import com.example.iapp.entity.IImage

@Entity
data class CCatDataEntity(
    @PrimaryKey
    @ColumnInfo(name = "fact")
    override val fact: String,
    @ColumnInfo(name = "image_url")
    override val url: String
) : IFact, IImage
