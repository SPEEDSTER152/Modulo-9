package br.com.gabriel.HelloWorld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/HelloWorld")

public class HelloWorldController {

    private final List<Message> messages;

    public HelloWorldController(){
     this.messages = new ArrayList<>();
      Message message1 = new Message(1,"Hello World");
      this.messages.add(message1);

    }
    @GetMapping
    public List<Message> HelloWorld(){
        return messages;
    }
}
