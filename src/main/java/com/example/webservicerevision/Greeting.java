package com.example.webservicerevision;

public class Greeting {
    private Long Id;
    private String content;

    public Greeting(Long id, String content) {
        Id = id;
        this.content = content;
    }

    public Long getId() {
        return Id;
    }

    public String getContent() {
        return content;
    }

    public void setId(Long id) {
        Id = id;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
