package com.example.patternsfirst.common.factories

import com.example.patternsfirst.common.interfaces.Movie

// Movies factory for different country of creation
class MoviesFactory : WatchableFactory {

    override fun getInstance(country: WatchableFactory.County): Movie {
        return when (country) {
            WatchableFactory.County.RUSSIA -> RussiaMovie()
            WatchableFactory.County.USA -> USAMovie()
        }
    }

    private class RussiaMovie : Movie {
        override var name = "Russia"

        override fun startWatching() {
            println("Started watching russian movie \"$name\"")
        }
    }

    private class USAMovie : Movie {
        override var name = "USA"

        override fun startWatching() {
            println("Started watching USA movie \"$name\"")
        }
    }

    // Prototype (some kind of joke in kotlin lmao)
    fun clone(): MoviesFactory {
        return this.clone()
    }
}