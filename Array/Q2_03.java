package Array;

/*
3. 가위 바위 보

설명
A, B 두 사람이 가위바위보 게임을 합니다. 총 N번의 게임을 하여 A가 이기면 A를 출력하고, B가 이기면 B를 출력합니다. 비길 경우에는 D를 출력합니다.
가위, 바위, 보의 정보는 1:가위, 2:바위, 3:보로 정하겠습니다.
예를 들어 N=5이면
Image1.jpg
두 사람의 각 회의 가위, 바위, 보 정보가 주어지면 각 회를 누가 이겼는지 출력하는 프로그램을 작성하세요.

입력
첫 번째 줄에 게임 횟수인 자연수 N(1<=N<=100)이 주어집니다.
두 번째 줄에는 A가 낸 가위, 바위, 보 정보가 N개 주어집니다.
세 번째 줄에는 B가 낸 가위, 바위, 보 정보가 N개 주어집니다.

출력
각 줄에 각 회의 승자를 출력합니다. 비겼을 경우는 D를 출력합니다.
*/
import java.util.*;

public class Q2_03 {
  public char[] solution(int n, int[] A, int[] B) {
    char[] answer = new char[n];
    for (int i = 0; i < n; i++) {
      if (A[i] == B[i])
        answer[i] = 'D';
      else {
        if ((A[i] == 1 && B[i] == 3) || (A[i] == 2 && B[i] == 1) || (A[i] == 3 && B[i] == 2))
          answer[i] = 'A';
        else
          answer[i] = 'B';
      }
    }
    return answer;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    Q2_03 T = new Q2_03();
    int n = in.nextInt();
    int[] A = new int[n];
    int[] B = new int[n];

    for (int i = 0; i < n; i++) {
      A[i] = in.nextInt();
    }
    in.nextLine();
    for (int i = 0; i < n; i++) {
      B[i] = in.nextInt();
    }
    char[] answer = T.solution(n, A, B);
    for (char c : answer) {
      System.out.println(c);
    }
    in.close();
  }
}