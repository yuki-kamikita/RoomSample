package com.akaiyukiusagi.roomsample

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface SampleDao {
//    @Query("SELECT * FROM user")
//    fun getAll(): List<SampleEntity>
//
//    @Query("SELECT * FROM user WHERE uid IN (:userIds)")
//    fun loadAllByIds(userIds: IntArray): List<SampleEntity>

    @Query("SELECT * FROM table_name WHERE first_name LIKE :first AND last_name LIKE :last LIMIT 1")
    fun findByName(first: String, last: String): SampleEntity

    @Insert
    fun insertAll(vararg users: SampleEntity)

    @Delete
    fun delete(user: SampleEntity)
}