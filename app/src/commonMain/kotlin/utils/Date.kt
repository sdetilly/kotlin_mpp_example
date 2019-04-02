package utils

expect class Date constructor(unix: Long){
    fun getFullDate(): String
    fun getMonthAsInt(): Int
    fun getMonthAsString(): String
    fun getYear(): Int
    fun getDayInMonth(): Int
    fun getTime(): String
}