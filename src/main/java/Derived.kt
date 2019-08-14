class Derived : Base {

    constructor(s: String) : super(s)

    constructor(s: String, n: Int) : super(s, n)
}

fun main(args: Array<String>) {
    val derived1 = Derived("derived1")
    val derived2 = Derived("derived2", 0)

    println("derived1.getMessage() = ${derived1.message}")
    println("derived2.getMessage() = ${derived2.message}")
}