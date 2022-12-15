package br.com.gabriel.HelloWorld;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

@Service
public class AsyncService {

    private final FakeService fakeService;

    public AsyncService(FakeService fakeService){
        this.fakeService = fakeService;
    }

@Async
 public CompletableFuture<String> findUserById(final Integer id){
        System.out.println("Executing " + Thread.currentThread().getName());
        return CompletableFuture.completedFuture(fakeService.findUserById(id));
}
}