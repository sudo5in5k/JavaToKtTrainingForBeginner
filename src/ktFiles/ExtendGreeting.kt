package ktFiles

class ExtendGreeting(private val gesture: String) : Greeting(gesture) {

    fun gesture() {
        print(gesture)
    }

}