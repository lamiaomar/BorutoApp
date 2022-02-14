package com.example.borutoapp.data.local

import androidx.room.Database
import com.example.borutoapp.data.local.dao.HeroDao
import com.example.borutoapp.domain.model.Hero

@Database(entities = [Hero::class], version = 1)
abstract class BorutoDatabase {

    abstract fun heroDao():HeroDao

}