import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		// 整数の入力
		int a = scanner.nextInt();
		// スペース区切りの整数の入力
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		// 文字列の入力
		String s = scanner.next();
		// 出力
		System.out.println((a+b+c) + " " + s);
	}
}