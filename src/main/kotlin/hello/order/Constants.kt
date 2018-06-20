package hello.order

class Constants {
    companion object {
        val FOO = "foo"
    }
}

enum class OrderStatus(val status: String) {
    PENDING("pending"),
    DONE("done"),
    FAIL("fail")
}


enum class OrderType(val type: String) {
    REGISTER("register")
}