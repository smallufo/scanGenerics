/**
 * Created by smallufo on 2019-01-28.
 */
package com.example;

import kotlin.Pair;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import javax.inject.Inject;
import java.time.LocalDateTime;
import java.util.Locale;

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = "classpath:core.xml")
public class JNestedGenericsByInterfaceTest {

  /**
   * To make it working , {@link ContextConfig} needs to un-comment the @bean contextPair
   *
   * NoSuchBeanDefinitionException: No qualifying bean of type
   * 'com.example.IContext<kotlin.Pair<java.time.LocalDateTime, java.util.Locale>>' available:
   */
  @Inject
  private IContext<Pair<LocalDateTime, Locale>> ctx;

  @Test
  public void printCtx() {
    System.out.println("ctx = " + ctx);
  }
}
