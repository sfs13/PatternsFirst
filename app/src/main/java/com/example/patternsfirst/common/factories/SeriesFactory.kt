package com.example.patternsfirst.common.factories

import com.example.patternsfirst.common.interfaces.Series

// Series factory for different country of creation
class SeriesFactory : WatchableFactory {
    override fun getInstance(country: WatchableFactory.County): Series {
        return when (country) {
            WatchableFactory.County.RUSSIA -> RussiaSeries()
            WatchableFactory.County.USA -> USASeries()
        }
    }

    private class RussiaSeries : Series {
        override var name = "Russia"

        override fun startWatching() {
            println("Started watching russian series \"$name\"")
        }
    }

    private class USASeries : Series {
        override var name = "USA"

        override fun startWatching() {
            println("Started watching USA series \"$name\"")
        }
    }

    // Prototype (some kind of joke in kotlin lmao)
    fun clone(): MoviesFactory {
        return this.clone()
    }
}