package ktFiles

data class BookData(var title: String, var author: String, var price: Int) {

    fun printBook() {
        print("タイトル: $title, 著者: $author, 値段: $price")
    }
}