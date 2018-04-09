import java.util.*;
public class BinarySearch{
	public static int BinarySearch(int [] arr,int key){
		int low=0;
		int last=arr.length-1;//这里注意，获取数组长度，是length不是length()

		while(low<=last){

			int mid=(low+last)>>>1;//这里很巧妙得通过移位运算将其除以２
			int midVal=arr[mid];
			if(midVal>key)	last=mid-1;
			else if(midVal<key)	low=mid+1;
			else return mid;
				
		}
		return -(low+1);//如果没有找到，返回负数
	}
public static void main(String[] args){
	int array[]={1,2,3,4,5,6,7,8};
	int index=BinarySearch(array,5);
	System.out.println(index);
	}
}


