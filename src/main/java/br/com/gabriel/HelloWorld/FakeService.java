package br.com.gabriel.HelloWorld;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class FakeService {

    private static Map<Integer, String> USERS = new HashMap<>();

    public FakeService(){
        USERS.put(1,"ygor");
        USERS.put(2,"gabriel");
        USERS.put(3, "marcio");
    }

    public String findUserById(final Integer id)  {
        try {
            Thread.sleep(2000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        return USERS.get(id);
    }
}
