package com.akaiyukiusagi.roomsample

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class SampleViewModel(application: Application) : AndroidViewModel(application) {

    private val dao: SampleDao
    init{
        val db = SampleDatabase.buildDatabase(application)
        dao = db.sampleDao()
    }

    fun insert(uid: Int, firstName: String, lastName: String) {
        viewModelScope.launch(Dispatchers.IO) {
            dao.insertAll(
                SampleEntity(
                    uid = 1,
                    firstName = "佐藤",
                    lastName = "太郎"
                )
            )
        }
    }

}