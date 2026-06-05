package com.narrow.reprenncre

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform