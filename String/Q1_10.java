package String;

/*
10. 가장 짧은 문자거리

설명
한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하세요.

입력
첫 번째 줄에 문자열 s와 문자 t가 주어진다. 문자열과 문자는 소문자로만 주어집니다.
문자열의 길이는 100을 넘지 않는다.

출력
첫 번째 줄에 각 문자열 s의 각 문자가 문자 t와 떨어진 거리를 순서대로 출력한다.
*/
import java.util.Scanner;

public class Q1_10 {
  public int[] solution(String str) {
    String[] params = str.split(" ");
    String s = params[0];
    char c = Character.valueOf(params[1].charAt(0));

    int len = s.length();
    int[] answer = new int[len];
    int p = 1000;
    // 양방향으로 for문을 돌려 체크, p에 해당 문자에서부터 거리를 1씩 증가시키며 체크
    // 왼쪽 -> 오른쪽
    for (int i = 0; i < len; i++) {
      if (s.charAt(i) == c) {
        p = 0;
        answer[i] = 0;
      } else {
        answer[i] = ++p;
      }
    }

    p = 1000;
    for (int i = len - 1; i >= 0; i--) {
      if (s.charAt(i) == c) {
        p = 0;
      } else {
        // if (++p < answer[i]) {
        // answer[i] = p;
        // }
        answer[i] = Math.min(answer[i], ++p); // 두 값 중에 작은 것
      }
    }

    return answer;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    Q1_10 T = new Q1_10();
    int[] answer = T.solution(in.nextLine());

    for (int i = 0; i < answer.length; i++) {
      System.out.print(answer[i] + " ");
    }

    in.close();
  }
}
