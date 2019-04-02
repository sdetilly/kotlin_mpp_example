package utils

expect object Logger{
    fun e(tag: String = "kotlinMain", msg: String)
    fun w(tag: String = "kotlinMain", msg: String)
    fun i(tag: String = "kotlinMain", msg: String)
    fun d(tag: String = "kotlinMain", msg: String)
}