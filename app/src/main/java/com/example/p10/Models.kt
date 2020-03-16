package com.example.p10

class PaginaWeb(val items: List<Items>)

class Items(val name: String, val full_name: String, val forks_count: Int, val owner: Owner, val id: Int, val node_id: String)

class Owner(val avatar_url: String, val stargazers_count: Int)