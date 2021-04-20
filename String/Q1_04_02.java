package String;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q1_04_02 {
  public List<String> solution(int n, List<String> str) {
    List<String> answer = new ArrayList<>();
    // 1) StringBuilder 사용
    // for (String s : str) {
    // String tmp = new StringBuilder(s).reverse().toString();
    // answer.add(tmp);
    // }

    // 2) ls, rs index 이용하여 문자열 양 끝에서부터 값 교환하여 reverse
    for (String s : str) {
      char[] chars = s.toCharArray();
      int ls = 0, rs = chars.length - 1;
      while (ls < rs) {
        char tmp = chars[ls];
        chars[ls] = chars[rs];
        chars[rs] = tmp;
        ls++;
        rs--;
      }
      answer.add(String.valueOf(chars));
    }
    return answer;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    Q1_04_02 T = new Q1_04_02();

    List<String> str = new ArrayList<>();

    int n = in.nextInt();
    in.nextLine();

    for (int i = 0; i < n; i++) {
      str.add(in.nextLine());
    }

    for (String s : T.solution(n, str)) {
      System.out.println(s);
    }

    in.close();
  }
}
