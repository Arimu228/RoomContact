package com.example.roomcontact

data class ContactState(
    val contacts: List<Contact> = emptyList(),
    val firstName:String = "",
    val lastName:String = "",
    val phoneNumber:String = "",
    val isAdding:Boolean = false,
    val sortType:SortType = SortType.FIRST_NAME
)