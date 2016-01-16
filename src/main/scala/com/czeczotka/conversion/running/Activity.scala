package com.czeczotka.conversion.running

case class Activity(pace: Pace, distance: Distance) {

  def totalTime: String = {
    val totalSeconds: Int = (distance.metres / 1000.0 * pace.inSeconds).toInt
    val totalMinutes: Int = totalSeconds / 60
    val totalHours: Int = totalMinutes / 60
    totalHours match {
      case 0 => "%dm%02ds".format(totalMinutes, totalSeconds % 60)
      case _ => "%dh%02dm%02ds".format(totalHours, totalMinutes % 60, totalSeconds % 60)
    }
  }
}
