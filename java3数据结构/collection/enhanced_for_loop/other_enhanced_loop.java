public class demo{
	public static void main(String[] args){
		HashSet<String> set=new HashSet<String>();
		set.add("hello");
		set.add("fourous");
		set.add("adila");

		//使用迭代器遍历
		Iterator<String> it =set.iterator();
		while(it.hasNext()){
			String temp=it.next();
			System.out.println(temp);
			it.remove;
			}

		//使用增强for循环
		for(String item:it){
			System.out.println(item);
			}
			
		int [] arr ={12,2,3,4};
		//普通
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
			}
		//增强
		for(int item:arr){
			System.out.println(item);
			}
/*这里注意，Ｍａｐ集合没有实现iterable接口，所map不能直接增强for循环，如果需要，如下*/
			HashMap<String,String> map=new HashMap<String,String>();
			map.put("001","hello");
			map.put("002","fourous");
			map.put("003","adila");
			Set<Map.Entry<String,String>> entrys=map.entrySet();
			for(Map.Entry<String,String> entry :entrys){
				//或者直接for(Map<String,String> m:map.entrySet())
				System.out.println(entry.getKey()+entry.getValue);
				}
			//另一种方式
			Itetator iterator=map.entrySet().iterator();
			while(iterator.hasNext()){
				Map.Entry<String.String> entry=(Entry<String,String>) iterator.next();
				System.out.println(entry.getKey()+entry.getValue);
				}
		}
	}













































