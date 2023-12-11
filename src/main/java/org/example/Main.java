package org.example;

import lombok.Builder;
import lombok.experimental.Delegate;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main { //Main 클래스를 지정
    public static void main(String[] args) { //main 메서드를 지정
        Scanner sc = new Scanner(System.in); // 각 출력을 위한 Scanner를 실행
        List<WiseSaying> wiseSayingList = new ArrayList<>(); //ArrayList를 이용해서 wiseSaying객체를 만들고 후에 이용한다.
        long id = 1;  // long 타입의 변수 id의 값을 1로 초기화

        System.out.println("== 명언앱 ==");  //"==명언웹==" 이라는 것을 출력

        while (true) {    //반복문 안에 true값을 이용해서 무한루프를 돌린다.
            System.out.printf("명령) ");  //명령을 출력한다.
            String command = sc.nextLine(); //문자열 String를 command라 정하고 스캐너의 sc를 이용해서 바로위의 명령에 값을 넣을 수 있게끔한다.

            if (command.equals("종료")) { //반복문안에서 if문을 사용해서 먼저 종료를 만들어준다.
                break;  //종료를 입력하면 탈출할 수 있게 해준다.
            } else if (command.equals("등록")) { // 종료 이외에 command의 값이 "등록"이라 입력하면 명언으로 이동한다.
                System.out.printf("명언: "); // 명언: 을 출력한다.
                String content = sc.nextLine(); //content를 지정해주고 바로 위 명언에 입력을 받을 수 있게끔 한다.
                System.out.printf("작가: "); // 작가: 를 출력한다.
                String author = sc.nextLine(); //author를 지정해주고 바로 위 작가에 값을 입력해줄수 있게끔 한다.
                System.out.println(id + "번 명언이 등록 되었습니다."); // 반복문 밖에 있는 id의 값과 나머지 "번 명언이 등록 되었습니다.를 출력해준다.

                WiseSaying wiseSaying = new WiseSaying(id, author, content); // wiseSaying의 객체를 지정해주고 그 안에다 각 id, author, content의 값을 넣어준다.
                wiseSayingList.add(wiseSaying); // wiseSayingList의 값에 wiseSaying의 값을 넣어준다.

                id++; // id의 값이 늘어날 수 있게끔 ++를 붙여준다.

            } else if (command.equals("목록")) { // 종료나 등록 이외가 목록일 시
                System.out.println("번호 / 작가 / 명언"); // 번호 작가 명언을 출력한다.
                for (WiseSaying wiseSaying : wiseSayingList) { //목록의 들어갈 값들을 선별하기 위해서 for each문을 시행한다.
                    System.out.printf("%d, %s, %s \n", wiseSaying.getId(), wiseSaying.getAuthor(), wiseSaying.getContent());
                }  //각 정수들이 들어갈 것을 염두하고 %d등을 넣어주고 wiseSaying 객체에 각 생성자에서 지정한 값을 가져오고
            }
        }


        sc.close(); //반복문이 더이상 시행되지 않도록 닫아준다.
    }
}


