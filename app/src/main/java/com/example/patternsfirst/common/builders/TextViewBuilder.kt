package com.example.patternsfirst.common.builders

import java.util.*

// Builder who can add a new line to your String, nothing interesting
class TextViewBuilder(private var targetText: String) {

    fun addLine(lineText: String): TextViewBuilder {
        targetText = String.format(
            Locale.getDefault(),
            "%s\n%s",
            targetText,
            lineText
        )

        return TextViewBuilder(targetText)
    }

    fun getResult(): String {
        return targetText
    }
}