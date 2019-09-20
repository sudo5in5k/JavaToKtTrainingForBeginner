package ktFiles


enum class ParticipantType(val price: Int) {
    STUDENT(900),
    NORMAL(1200),
    AGED(800)
}

fun main() {
    showPrice(ParticipantType.STUDENT)
}

private fun showPrice(type: ParticipantType) {
    // when
    when (type) {
        ParticipantType.STUDENT -> println("入館料金は${type.price}円です")
        ParticipantType.NORMAL -> println("入館料金は${type.price}円です")
        ParticipantType.AGED -> println("入館料金は${type.price}円です")
    }
}
