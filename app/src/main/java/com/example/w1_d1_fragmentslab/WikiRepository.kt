package com.example.w1_d1_fragmentslab

class WikiRepository {
    private val call = ServiceApi.service
    suspend fun hitCountCheck(name: String) = call.userName(name)
}