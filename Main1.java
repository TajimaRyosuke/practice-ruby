class Main1{
  public static void main1(String [] args){
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

    for(int i = 1; i <= 10; i+= 1){
      if(i % 3 == 0){
        continue;
      }
      System.out.println(i + "回ジャンプしました");
    }

    String[] yourNames = {"yusuke", "junya", "emit"};
    yourNames[0] = "seiya";

    System.out.println("普通のfor文");
    for(int i = 0; i < yourNames.length; i++){
      System.out.println("あなたの名前は" + yourNames[i] + "ですよ");
    }

    System.out.println("拡張for文");
    for(String nname: yourNames){
      System.out.println("あなたの名前は" + nname + "ですよ");
    }

}