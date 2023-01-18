package com.velocity;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
public class Test2 {

	public static void main(String[] args) {
		
		String str="Krantisurya";
	char ch[]=	str.toCharArray();
	
	  System.out.println(ch);
	 
	
	  List l=new ArrayList();
	  l.add("Sunil");
	  l.add("Rahul");
	  l.add(86);
	  
	  
	  System.out.println(l);

	Iterator itr  =l.iterator();
	
	while(itr.hasNext()) {
		
		System.out.println(itr.next());
	}
	
	}

}
