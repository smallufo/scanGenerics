/**
 * Created by smallufo on 2019-01-28.
 */
package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import javax.inject.Inject;

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = "classpath:core.xml")
public class JNestedGenericsByConcreteTest {

  @Inject
  private ContextPair ctx;

  /**
   * It successes , but it's injected by concrete class
   */
  @Test
  public void printCtx() {
    System.out.println("ctx = " + ctx);
  }
}
