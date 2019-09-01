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

  static <T, U, V> Function<V, U> compose(Function<T, U> f1, Function<V, T> f2) {
    return (V arg) -> f1.apply(f2.apply(arg));
  }

  static <T, U, V> Function<V, U> composeAndThen(Function<V, T> f1, Function<T, U> f2) {
    return (V arg) -> f2.apply(f1.apply(arg));
  }
}
