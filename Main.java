import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Person.hello("Bob", 29);
    Person.hello("Tom", 39);

    Scanner scanner = new Scanner(System.in);
    System.out.println("あなたの名前を教えてください");
    String yourName = scanner.next();
    System.out.println("あなたの名前は" + yourName + "さんですね");


    String name = Person.fullName("Kate", "Jones");
    System.out.println(name);

    int total = add(10, 45);
    System.out.println(total);
  }

  public static int add(int a, int b){
    return a + b;
  }
}