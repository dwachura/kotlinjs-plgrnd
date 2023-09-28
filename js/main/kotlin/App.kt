package io.dwsoft.kotlinjsplgrnd

import kotlinx.browser.document
import kotlinx.html.dom.create
import kotlinx.html.js.div
import kotlinx.html.p

fun main() {
    console.log("Hello, Kotlin/JS!")
    document.body?.appendChild(
        document.create.div {
            p { +"Hello, Kotlin/JS!" }
        }
    )
}
