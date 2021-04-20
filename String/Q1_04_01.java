package String;
/*
4. 단어 뒤집기

설명
N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요.

입력
첫 줄에 자연수 N(3<=N<=20)이 주어집니다.
두 번째 줄부터 N개의 단어가 각 줄에 하나씩 주어집니다. 단어는 영어 알파벳으로만 구성되어 있습니다.

출력
N개의 단어를 입력된 순서대로 한 줄에 하나씩 뒤집어서 출력합니다. */

import java.util.Scanner;

public class Q1_04_01 {
  public String solution(String str) {
    String answer = "";
    char[] chars = str.toCharArray();
    for (int i = chars.length; i > 0; i--) {
      answer += chars[i - 1];
    }
    return answer;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    Q1_04_01 T = new Q1_04_01();

    int cnt = in.nextInt();
    in.nextLine();
    for (int i = 0; i < cnt; i++) {
      String x = in.nextLine();
      System.out.println(T.solution(x));
    }

    in.close();
  }
}
