class Main{
	public static void main(String[] args){
		for(int i = 0; i < 5; i++){
			for(int j=0; j < i; j++){
				System.out.print(" ");
			}
			for(int k=0; k<(5-i)*2-1; k++){
				System.out.print("*");
			}
			System.out.print("\n");

		}

		for(int l=0; l<5; l++){
			for(int m=0; m<5-(l+1); m++){
				System.out.print(" ");
			}
			for(int n = 0; n<(l+1)*2-1; n++){
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}