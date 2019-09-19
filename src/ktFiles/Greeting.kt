package ktFiles

open class Greeting(private val language: String = "") {

    private var count = 0
    // Secondary constructor
    constructor(language: String, length: Int):  this(language) {
        count = length
    }

    fun greet() {
        println("Hello $language")
    }

    fun loopGreet() {
        for (i in 0..count) {
            if (i == 0) {
                println("Hello! $language")
            }
        }
    }
}