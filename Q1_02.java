
/*
2. 대소문자 변환

설명
대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로 변환하여 출력하는 프로그램을 작성하세요.

입력
첫 줄에 문자열이 입력된다. 문자열의 길이는 100을 넘지 않습니다.
문자열은 영어 알파벳으로만 구성되어 있습니다.

출력
첫 줄에 대문자는 소문자로, 소문자는 대문자로 변환된 문자열을 출력합니다.
*/
import java.util.Scanner;

public class Q1_02 {
  public String solution(String str) {
    String answer = "";

    // for (char c : str.toCharArray()) {
    // if (Character.isUpperCase(c)) {
    // answer += Character.toLowerCase(c);
    // } else {
    // answer += Character.toUpperCase(c);
    // }
    // }

    // 아스키코드를 활용한 코드
    // 대문자 65~90, 소문자 97~122, 대소문자 차이 32
    for (char c : str.toCharArray()) {
      if (c >= 65 && c <= 90) { // 대문자
        answer += (char) (c + 32);
      } else {
        answer += (char) (c - 32);
      }
    }
    return answer;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    Q1_02 T = new Q1_02();

    System.out.println(T.solution(in.nextLine()));

    in.close();
  }

}
