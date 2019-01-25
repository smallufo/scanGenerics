package com.example

import org.junit.runner.RunWith
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.junit4.SpringRunner
import java.time.LocalDateTime
import java.util.*
import javax.inject.Inject
import kotlin.test.Test

@RunWith(SpringRunner::class)
@ContextConfiguration(locations = ["classpath:core.xml"])
class ContextPairTestByInterface {

  /**
   * to make it working ,  [ContextConfig] must un-comment @Bean contextPair
   */
  @Inject
  private lateinit var ctx: IContext<Pair<LocalDateTime, Locale>>

  /**
   * UnsatisfiedDependencyException: Error creating bean with name
   * 'com.example.ContextPairTestByInterface':
   * Unsatisfied dependency expressed through field 'ctx';
   * nested exception is org.springframework.beans.factory.NoSuchBeanDefinitionException:
   * No qualifying bean of type 'com.example.IContext<kotlin.Pair<java.time.LocalDateTime, java.util.Locale>>'
   * available: expected at least 1 bean which qualifies as autowire candidate. Dependency annotations: {@javax.inject.Inject()}
   */
  @Test
  fun testContext() {
    println("ctx = $ctx")
  }
}