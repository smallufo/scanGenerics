/**
 * Created by smallufo on 2019-01-25.
 */
package com.example

import org.springframework.stereotype.Component
import java.util.*

@Component
class ContextLocale : IContext<Locale> {

  override fun getContentAsString(instance: Locale): String {
    return "locale is $instance"
  }
}