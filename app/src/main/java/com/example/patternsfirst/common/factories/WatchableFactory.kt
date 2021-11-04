package com.example.patternsfirst.common.factories

import com.example.patternsfirst.common.interfaces.Watchable

// Interface which will be implemented inside others
interface WatchableFactory {
    enum class County {
        RUSSIA, USA
    }

    fun getInstance(country: County): Watchable
}