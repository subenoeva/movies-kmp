package com.kalamares.movies

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform