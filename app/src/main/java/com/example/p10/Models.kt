package com.example.p10

class PaginaWeb(val items: List<Items>)

class Items(val name: String, val full_name: String, val forks_count: Int, val owner: Owner)

class Owner(val avatar_url: String)