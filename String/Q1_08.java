package String;

/* 
8. 유효한 팰린드롬

설명
앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 팰린드롬이라고 합니다.
문자열이 입력되면 해당 문자열이 팰린드롬이면 "YES", 아니면 “NO"를 출력하는 프로그램을 작성하세요.
단 회문을 검사할 때 알파벳만 가지고 회문을 검사하며, 대소문자를 구분하지 않습니다.
알파벳 이외의 문자들의 무시합니다.

입력
첫 줄에 길이 100을 넘지 않는 공백이 없는 문자열이 주어집니다.

출력
첫 번째 줄에 팰린드롬인지의 결과를 YES 또는 NO로 출력합니다.
*/
import java.util.Scanner;

public class Q1_08 {
  public String solution(String str) {
    String answer = "NO";

    // String s = "";
    // for (int i = 0; i < str.length(); i++) {
    // if (Character.isAlphabetic(str.charAt(i))) {
    // s += str.charAt(i);
    // }
    // }
    // String tmp = new StringBuilder(s).reverse().toString();
    // if (s.equalsIgnoreCase(tmp)) {
    // return "YES";
    // }
    // return answer;

    str = str.toUpperCase().replaceAll("[^A-Z]", ""); // 대문자가 아닌 것을 모두 빈문자열로 치환(정규식 이용)

    String tmp = new StringBuilder(str).reverse().toString();
    if (str.equals(tmp)) {
      return "YES";
    }
    return answer;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    Q1_08 T = new Q1_08();

    System.out.println(T.solution(in.nextLine()));
    in.close();
  }
}
