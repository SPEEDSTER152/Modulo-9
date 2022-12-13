package br.com.gabriel.HelloWorld;

public class Message {

    public Integer id;

    public String message;

    public Integer getId() {
        return id;
    }

    public Message(final Integer id, final String message) {
        this.id = id;
        this.message = message;
    }

    public void setId(final Integer id) {
        this.id = id;
    }

    public String getMessage(){
        return message;
    }

    public void setMessage(final String message) {
        this.message = message;
    }
}
