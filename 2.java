import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Solution2 {
  public static void main(String[] args) {
    partOne();
  }

  public static void partOne() {
    try (Scanner sc = new Scanner(new File("input2.txt"))) {
      while (sc.hasNextLine()) {
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }

  public static void partTwo() {
    try (Scanner sc = new Scanner(new File("input2.txt"))) {
      while (sc.hasNextLine()) {
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }
}