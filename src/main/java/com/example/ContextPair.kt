package com.example

import org.springframework.stereotype.Component
import java.time.LocalDateTime
import java.util.*

@Component
class ContextPair : IContext<Pair<LocalDateTime, Locale>> {

  override fun getContentAsString(instance: Pair<LocalDateTime, Locale>): String {
    val ldt = instance.first
    val locale = instance.second
    return "time = $ldt , locale = $locale"
  }

}