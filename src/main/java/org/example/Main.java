package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==명언 앱==");
        int id = 1;
        List<WiseSaying> sayingList = new ArrayList<>();
        while (true) {
            System.out.println("명령) ");
            String command = sc.nextLine();

            if (command.equals("종료")) {
                break;
            } else if (command.equals("등록")) {
                System.out.println("명언: ");
                String content = sc.nextLine();
                System.out.println("작가: ");
                String author = sc.nextLine();

                WiseSaying wiseSaying = new WiseSaying(content, author);
                sayingList.add(wiseSaying);
            }
            //목록
            else if (command.equals("목록")) {

                System.out.println("번호/ 작가/ 명언 ");
                System.out.println("---------------");
                for (WiseSaying saying : sayingList) {
                    System.out.println(id + "/" + saying.getAuthor() + "/" + saying.getContent());
                    id++;
                }
            }

        }   sc.close();
    }
}

class WiseSaying {
    private String content;
    private String author;

    WiseSaying(String content, String author) {
        this.content = content;
        this.author = author;
    }

    String getContent() {
        return content;
    }

    String getAuthor() {
        return author;
    }

}