package ktFiles

fun main() {
    printSkillList()
    printResourceArrayList()
}

private fun printSkillList() = getSkillList().forEach {
    if (getSkillList().last() == it) {
        print("$it\n")
    } else {
        print("$it, ")
    }
}

// 配列
private fun getSkillList() = arrayOf("Java", "COBOL", "PHP", "BASIC", "Perl")

private fun printResourceArrayList() = getResourceArrayList().forEach { print(it) }

// Collection <- ArrayList
private fun getResourceArrayList() = arrayListOf<Int>().apply {
    add(5)
    add(16)
    add(7)
    add(10)
    add(0)
}
