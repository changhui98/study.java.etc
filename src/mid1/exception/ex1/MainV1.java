package mid1.exception.ex1;

import java.util.Scanner;

public class MainV1 {

    public static void main(String[] args) {

        NetworkServiceV1_1 networkService = new NetworkServiceV1_1();

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("전송할 문자 : ");
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            networkService.sendMessage(input);
            System.out.println();
        }
        System.out.println("로그램을 정상 종료합니다.");
    }

}
