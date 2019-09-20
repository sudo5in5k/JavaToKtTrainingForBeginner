package ktFiles

fun main() {
    val age: Int = 20
    age.times(5)

    var nullableAge: Int? = 20
    print(nullableAge?.times(5))

    print("\n``````````````\n")

    if (nullableAge != null) {
        print(nullableAge.times(5))
    }

    print("\n``````````````\n")

    nullableAge = null

    print("\n``````````````\n")

    print(nullableAge?.times(5)?.div(10))

    print("\n``````````````\n")

    // elvis operator
    print(nullableAge ?: 0)

    print("\n``````````````\n")

    print(isAdult(nullableAge))
}

fun isAdult(age: Int?): Boolean {
    age ?: return false
    return age >= 18
}