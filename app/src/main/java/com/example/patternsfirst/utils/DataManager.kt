package com.example.patternsfirst.utils

import com.example.patternsfirst.common.factories.MoviesFactory
import com.example.patternsfirst.common.factories.SeriesFactory
import com.example.patternsfirst.common.factories.WatchableFactory

// Singleton + Kotlin = <3
object DataManager {
    val fullList = listOf(
        MoviesFactory().getInstance(WatchableFactory.County.RUSSIA)
            .apply { name = "Пробуждение" },

        SeriesFactory().getInstance(WatchableFactory.County.RUSSIA)
            .apply { name = "Сваты" },

        MoviesFactory().getInstance(WatchableFactory.County.USA)
            .apply { name = "The Gentlemen" },

        MoviesFactory().getInstance(WatchableFactory.County.USA)
            .apply { name = "Mandalorian" }
    )
}