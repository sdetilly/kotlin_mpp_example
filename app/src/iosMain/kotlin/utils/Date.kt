package utils

import platform.CoreFoundation.kCFAbsoluteTimeIntervalSince1970
import platform.Foundation.*

actual class Date actual constructor(val unix: Long) {
    val date = NSDate.dateWithTimeIntervalSince1970(unix.toDouble())
    val formatter = NSDateFormatter()

    init {
        formatter.setLocale(NSLocale("en_CA"))
    }

    actual fun getFullDate(): String {
        formatter.dateFormat = "dd-MM-YYYY"
        return formatter.stringFromDate(date)
    }

    actual fun getMonthAsInt(): Int {
        formatter.dateFormat = "MM"
        return formatter.stringFromDate(date).toInt()
    }

    actual fun getMonthAsString(): String {
        formatter.dateFormat = "MMMM"
        return formatter.stringFromDate(date)
    }

    actual fun getYear(): Int {
        formatter.dateFormat = "YYYY"
        return formatter.stringFromDate(date).toInt()
    }

    actual fun getDayInMonth(): Int {
        formatter.dateFormat = "d"
        return formatter.stringFromDate(date).toInt()
    }

    actual fun getTime(): String {
        formatter.dateFormat = "HH:mm"
        return formatter.stringFromDate(date)
    }
}