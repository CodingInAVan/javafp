package com.codeimaginer.javafp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FunctionsTest {
  @Test
  public void higherComposeTest() {
    Function<Integer, Integer> square = x -> x * x;
    Function<Integer, Integer> triple = x -> x * 3;
    Integer x = Functions.<Integer, Integer, Integer> higherCompose().apply(square).apply(triple).apply(10);
    Assertions.assertEquals(900, x);
  }

  @Test
  public void higherComposeAndThen() {
    Function<Integer, Integer> square = x -> x * x;
    Function<Integer, Integer> triple = x -> x * 3;
    Integer x = Functions.<Integer, Integer, Integer> higherAndThen().apply(square).apply(triple).apply(10);
    Assertions.assertEquals(300, x);
  }
}
