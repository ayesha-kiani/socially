package com.example.assignment1

data class SearchResult(
    val type: ItemType,
    val initials: String?,
    val title: String,
    val subtitle: String?
)

enum class ItemType { PROFILE, HASHTAG, PLACE }
