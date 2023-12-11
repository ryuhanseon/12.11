package org.example;

class WiseSaying { //WiseSaying의 클래스를 지정해 준다.
    private long id; //getter를 시행해 주기 위해서 long id를 초기화한다.
    private String author; //getter를 시행해 주기 위해서 String author를 초기화한다.
    private String content; //getter를 시행해 주기 위해서 String content를 초기화한다.

    WiseSaying (long id, String author, String content) { //WiseSaying의 생성자를 만들어 주고 매개변수의 값으로 id, author content를 넣어준다.
        this.id = id;  // 위의 초기화 한 변수에 id 값을 넣어준다.
        this.author = author; // 위의 초기화 한 변수에 author 값을 넣어준다.
        this.content = content; // 위의 초기화 한 변수에 content 값을 넣어준다.
    }


    public long getId() { //getter를 실행해주기 위해 id값을 반환하는 getId를 만들어준다.
        return this.id;
    }

    public String getAuthor() { //getter를 실행해주기 위해 author값을 반환하는 getAuthor를 만들어준다.
        return this.author;
    }

    public String getContent() { //getter를 실행해주기 위해 content값을 반환하는 getContent를 만들어준다.
        return this.content;
    }
}