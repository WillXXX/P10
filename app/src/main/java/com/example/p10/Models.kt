package com.example.p10

class PaginaWeb(val items: List<Items>)

class Items(val name: String, val repos_url: String, val forks_count: Int, val avatar_url:String)