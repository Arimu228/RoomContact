package com.example.roomcontact

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Contact(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val firstName: String? = null,
    val lastName: String? = null,
    val phoneNumber: String? = null,

)