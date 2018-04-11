public class Hanota{
	public static void main(String[] args){
			int n=5;
			Hanota(3,'A','B','C');		
	}

	public static void Hanota(int n,char A,char B,char C){
			if (n==1)
				System.out.println("disk from "+A+"to"+C);
			else{
				Hanota(n-1,A,C,B);
				System.out.println("disk from"+A+"to"+C);
				Hanota(n-1,B,A,C);
	}

}

}