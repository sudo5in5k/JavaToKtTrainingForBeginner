package ktFiles

import java.awt.print.Book

fun main() {
    // Greeting
    val kotlinGreet: Greeting = Greeting("Kotlin")
    kotlinGreet.greet()

    val emptyGreet = Greeting()
    emptyGreet.greet()

    val loopKotlinGreet = Greeting("Kotlin", 3)
    loopKotlinGreet.loopGreet()

    println("\n-------------------\n")

    // Extends
    val extendGreeting = ExtendGreeting("byebye")
    extendGreeting.greet()
    extendGreeting.gesture()

    println("\n-------------------\n")

    val bookData = BookData("サポーターズCoLab", "ussy", 50000)
    println("著者: ${bookData.author}")
    bookData.author = "さのし"
    bookData.printBook()
}