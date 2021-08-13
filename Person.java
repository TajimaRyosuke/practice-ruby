class Person{
  public static void hello(String name, int age){
    System.out.println("Hello" + " " + name);
    System.out.println(name + "さんは" + age + "歳です。");
  }

  public static String fullName(String firstName, String lastName){
    return firstName + " " + lastName;
  }
  
  public static void bodyData(String weight, String height){
    System.out.println("体重は" + weight + "です。身長は" + height + "です。");
    System.out.println('就活は大変です。')
  }
}