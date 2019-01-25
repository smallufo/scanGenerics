/**
 * Created by smallufo on 2019-01-25.
 */
package com.example

import org.junit.runner.RunWith
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.junit4.SpringRunner
import javax.inject.Inject
import kotlin.test.Test

@RunWith(SpringRunner::class)
@ContextConfiguration(locations = ["classpath:core.xml"])
class ContextPairTestByConcreteClass {

  /**
   * injected by concrete class
   */
  @Inject
  private lateinit var ctx: ContextPair

  /**
   * It successes , but it's injected by concrete class
   */
  @Test
  fun testContext() {
    println("ctx = $ctx")
  }
}


