import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

class Solution1 {
  public static void main(String[] args) {
    partTwo();
  }

  public static void partOne() {
    long max = 0;
    long cur = 0;
    try (Scanner sc = new Scanner(new File("input1.txt"))) {
      while (sc.hasNextLine()) {
        String s = sc.nextLine();
        if (s.isEmpty()) {
          max = Math.max(max, cur);
          cur = 0;
        } else {
          cur += Long.parseLong(s);
        }
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
    System.out.println(max);
  }

  public static void partTwo() {
    long cur = 0;
    PriorityQueue<Long> pq = new PriorityQueue<>(Collections.reverseOrder());
    try (Scanner sc = new Scanner(new File("input1.txt"))) {
      while (sc.hasNextLine()) {
        String s = sc.nextLine();
        if (s.isEmpty()) {
          pq.add(cur);
          cur = 0;
        } else {
          cur += Long.parseLong(s);
        }
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
    long result = 0;
    for (int i = 0; i < 3; i++) {
      result += pq.poll();
    }
    System.out.println(result);
  }
}