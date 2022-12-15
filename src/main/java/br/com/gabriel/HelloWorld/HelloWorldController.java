package br.com.gabriel.HelloWorld;

import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

@RestController
@RequestMapping("/HelloWorld")
@Async
public class HelloWorldController{
    public HelloWorldController() throws ExecutionException, InterruptedException {


    CompletableFuture<String> completedFuture = CompletableFuture.completedFuture("Hello World");
    String result = completedFuture.get();
    System.out.println(result);

 }
}

