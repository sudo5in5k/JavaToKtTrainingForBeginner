package ktFiles

open class Greeting(private val language: String = "") {

    private var length = 0

    // Secondary constructor
    constructor(language: String, length: Int) : this(language) {
        this.length = length
    }

    fun greet() {
        println("Hello $language")
    }

    fun loopGreet() {
        for (i in 0..length) {
            if (i == 0) {
                println("Hello! $language")
            }
        }
    }
}