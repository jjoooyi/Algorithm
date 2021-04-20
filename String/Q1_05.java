package String;

/*
5. 특정 문자 뒤집기

설명
영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,
특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.

입력
첫 줄에 길이가 100을 넘지 않는 문자열이 주어집니다.

출력
첫 줄에 알파벳만 뒤집힌 문자열을 출력합니다. 
*/

import java.util.Scanner;

public class Q1_05 {
  public String solution(String str) {
    String answer = "";
    char[] chars = str.toCharArray();
    int ls = 0, rs = chars.length - 1;
    while (ls < rs) {
      if (!Character.isAlphabetic(chars[ls])) { // chars[ls] 알파벳이 아닌 경우 다음 인덱스로
        ls++;
      } else if (!Character.isAlphabetic(chars[rs])) {// chars[rs] 알파벳이 아닌 경우 이전 인덱스로
        rs--;
      } else {
        char tmp = chars[ls];
        chars[ls] = chars[rs];
        chars[rs] = tmp;
        ls++;
        rs--;
      }
    }
    answer = String.valueOf(chars);
    return answer;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    Q1_05 T = new Q1_05();

    System.out.println(T.solution(in.nextLine()));
    in.close();
  }
}
