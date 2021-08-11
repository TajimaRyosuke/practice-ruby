class Person{
  public static void hello(String name, int age){
    System.out.println("Hello" + " " + name);
    System.out.println(name + "さんは" + age + "歳です。");
  }

  public static String fullName(String firstName, String lastName){
    return firstName + " " + lastName;
  }
}