//这里是自定义class增强函数遍历
package com.abc;
import java.util.*;

public class MyList implements Iterable<String>{
	Object[] arr=new Object[10];
	int index=0;//当前指针

	public void add (Object o){
		arr[index++]=o;
		}
	public int size(){
		return index;
		}	
	public Iterator<String> iterator(){
		return new Iterator<String>(){
			int cursor=0;
			public boolean hasNext(){
				return cursor < index;
				}
			public String next(){
				return (String) arr[cursor++];
				}
			public void remove(){
				}
			};
		}
	}
