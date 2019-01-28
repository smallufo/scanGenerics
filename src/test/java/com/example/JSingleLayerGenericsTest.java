/**
 * Created by smallufo on 2019-01-28.
 */
package com.example;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import javax.inject.Inject;
import java.util.Locale;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = "classpath:core.xml")
public class JSingleLayerGenericsTest {

  @Inject
  private ContextLocale ctxLocale;

  @Inject
  private IContext<Locale> ctxInterface;

  /**
   * both works
   */
  @Test
  public void testCtx() {
    assertNotNull(ctxLocale);
    assertNotNull(ctxInterface);
  }
}
