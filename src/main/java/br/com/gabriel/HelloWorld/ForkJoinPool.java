package br.com.gabriel.HelloWorld;


import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class ForkJoinPool {

  public static void main(String[] args) throws ExecutionException, InterruptedException {
      final List<Double> list = Arrays.asList(10.0);

      list.parallelStream()
              .map(x -> x * 2)
              .forEach(System.out::println);

      CompletableFuture.runAsync(
              () -> System.out.println(Thread.currentThread().getName())).get();
  }

}
