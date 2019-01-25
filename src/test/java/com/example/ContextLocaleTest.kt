/**
 * Created by smallufo on 2019-01-25.
 */
package com.example

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.junit4.SpringRunner
import java.util.*
import javax.inject.Inject

@RunWith(SpringRunner::class)
@ContextConfiguration(locations = ["classpath:core.xml"])
class ContextLocaleTest {

  @Inject
  lateinit var ctxConcrete : ContextLocale

  @Inject
  lateinit var ctxInterface : IContext<Locale>

  /**
   * both works fine
   */
  @Test
  fun getContentAsString() {

    println("ctxConcrete = $ctxConcrete")
    println("ctxInterface = $ctxInterface")
  }
}