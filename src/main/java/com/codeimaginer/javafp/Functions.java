package com.codeimaginer.javafp;

public class Functions {
  public static <T, U, V> Function<Function<U, V>,
    Function<Function<T, U>, Function<T, V>>> higherCompose() {
      return (Function<U, V> f) -> (Function<T, U> g) -> (T x) -> f.apply(g.apply(x));
  }

  public static <T, U, V> Function<Function<T, U>,
    Function<Function<U, V>, Function<T, V>>> higherAndThen() {
    return (Function<T, U> f) -> (Function<U, V> g) -> (T x) -> g.apply(f.apply(x));
  }
}
