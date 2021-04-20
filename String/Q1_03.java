package String;

/*
3. 문장 속 단어

설명
한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요.
문장속의 각 단어는 공백으로 구분됩니다.

입력
첫 줄에 길이가 100을 넘지 않는 한 개의 문장이 주어집니다. 문장은 영어 알파벳으로만 구성되어 있습니다.

출력
첫 줄에 가장 긴 단어를 출력한다. 가장 길이가 긴 단어가 여러개일 경우 문장속에서 가장 앞쪽에 위치한
단어를 답으로 합니다.
*/
import java.util.Scanner;

public class Q1_03 {
  public String solution(String str) {
    String answer = "";
    // int length = -1;
    // Integer.MIN_VALUE 표현 가능한 가장 작은 정수 값
    // String[] list = str.split(" ");
    // for (String s : list) {
    // if (s.length() > length) {
    // answer = s;
    // length = s.length();
    // }
    // }

    // indexOf(), substring() 사용
    int length = -1, pos;
    while ((pos = str.indexOf(' ')) != -1) { // 찾는 문자의 index 반환, 없을 때 -1 반환
      String x = str.substring(0, pos);
      if (x.length() > length) {
        answer = x;
        length = x.length();
      }
      str = str.substring(pos + 1); // 공백 이전문자 삭제
    }
    if (str.length() > length) {
      answer = str;
    }

    return answer;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    Q1_03 T = new Q1_03();

    System.out.println(T.solution(in.nextLine()));
    in.close();
  }
}
