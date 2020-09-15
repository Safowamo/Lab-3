import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a number to count down or up from: ");
    int count = in.nextInt();
    in.close();
    if (count < 0){
      while(count != 0){
        System.out.println(count);
        count++;
      }
      
    } else if (count > 0){

      while(count != 0){
        System.out.println(count);
        count--;
      }

    }

    System.out.println("0");
    System.out.println("Blast Off!");
  }
}