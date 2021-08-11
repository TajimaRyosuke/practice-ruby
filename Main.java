class Main{
  public static void main(String [] args){
    System.out.println("Hello");
    
    System.out.println(3 % 5);
    
    String greeting = "Hello !!";
    
    String name = "Miyamoto"; 
    name = "Sasaki";
    System.out.println(greeting + " "  + name + " " + "Kojiro");
    
    int number;
    number = 3;
    System.out.println(number = number + 1);
    
    System.out.println(name == "Sasaki");
    
    if(name == "Sasaki"){
      System.out.println("あなたの名前は" + name + "です" );
    } else {
      System.out.println("あなたは誰ですか？");
    }
    
    String bigName = "Snake";
    // bigName = "camel";
    switch(bigName){
      case "Snake":
        System.out.println("あなたの名前は" + bigName + "です");
        break;
      default:
        System.out.println("あなたに名前はありません");
        break;
    }
    
    // int i = 10;
    // while(i > 0){
    //   System.out.println(i);
    //   i-= 1;
    // }
    
    for(int i = 1; i <= 10; i+= 1){
      if(i % 3 == 0){
        continue;
      }
      System.out.println(i + "回ジャンプしました");
    }
    
    String[] yourNames = {"yusuke", "junya", "emit"};
    System.out.println("あなたの名前は" + yourNames[0] + "ですよ");
  }
}