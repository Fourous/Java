//实现阶乘
public class Factorial{
	public static void main(String[] args){
		for(int num=1;num<=10;num++){
			System.out.printf("%d! factorial is %d\n",num,Factorial(num));
		}

	}
	public static long Factorial(long num){
		if(num==1)
			return num;
		else
			return num*Factorial(num-1);
	}
}