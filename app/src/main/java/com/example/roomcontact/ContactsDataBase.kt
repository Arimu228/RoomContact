package com.example.roomcontact

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [Contact::class],
    version = 1
)
abstract class ContactsDataBase : RoomDatabase() {
    abstract val dao: ContactDao

}