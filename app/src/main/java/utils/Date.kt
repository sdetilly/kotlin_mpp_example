package utils

import java.text.SimpleDateFormat
import java.util.*
import java.util.Date

actual class Date actual constructor(unix: Long) {
    val date = Date(unix*1000) // in mills

    actual fun getFullDate(): String {
        val dateFormat = SimpleDateFormat("dd-MM-yyyy", Locale.getDefault())
        return dateFormat.format(date)
    }

    actual fun getMonthAsInt(): Int {
        val dateFormat = SimpleDateFormat("MM", Locale.getDefault())
        return dateFormat.format(date).toInt()
    }

    actual fun getMonthAsString(): String {
        val dateFormat = SimpleDateFormat("LLLL", Locale.getDefault())
        return dateFormat.format(date)
    }

    actual fun getYear(): Int {
        val dateFormat = SimpleDateFormat("yyyy", Locale.getDefault())
        return dateFormat.format(date).toInt()
    }

    actual fun getDayInMonth(): Int {
        val dateFormat = SimpleDateFormat("dd", Locale.getDefault())
        return dateFormat.format(date).toInt()
    }

    actual fun getTime(): String{
        val dateFormat = SimpleDateFormat("HH:mm", Locale.getDefault())
        return dateFormat.format(date)
    }
}