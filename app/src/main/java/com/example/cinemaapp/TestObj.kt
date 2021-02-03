package com.example.cinemaapp

object TestObj {
    fun copy(dayData: DayData)  : DayData  {
        val newDayData = dayData.copy()
        return newDayData
    }
}