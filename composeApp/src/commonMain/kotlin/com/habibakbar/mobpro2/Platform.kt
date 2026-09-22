package com.habibakbar.mobpro2

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform