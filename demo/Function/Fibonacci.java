public class Fibonacci{
	public static void main(String[] args){
			for(int i=0;i<=10;i++){
				System.out.printf("Fibonacci of %d is : %d\n",i,Fibonacci(i)); 
			}
	}
	public static long Fibonacci(long num){//注意返回值
		if(num==0||num==1)	return num;
		else
			return Fibonacci(num-2)+Fibonacci(num-1);
	}
}