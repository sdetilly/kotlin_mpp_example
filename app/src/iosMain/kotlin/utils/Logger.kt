package utils

actual object Logger {
    actual fun e(tag: String, msg: String) {
        print("ERROR: $tag; $msg")
    }
    actual fun w(tag: String, msg: String) {
        print("WARNING: $tag; $msg")
    }
    actual fun i(tag: String, msg: String) {
        print("INFO: $tag; $msg")
    }
    actual fun d(tag: String, msg: String) {
        print("DEBUG: $tag; $msg")
    }
}