package test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> s= new HashSet<String>();
		s.add("A");
		s.add("B");
		s.add("C");
		s.add("D");
		s.add("D");
		s.add("E");
		s.add("F");
		s.add("G");
		
		System.out.println(s.size());
		System.out.println(s);
		
		Iterator<String> it=s.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

		System.out.println("=========================================");
		List<String> l = new ArrayList<String>();
		l.add("A");
		l.add("B");
		l.add("C");
		l.add("D");
		l.add("D");
		l.add("E");
		l.add("F");
		l.add("G");
		
		System.out.println(l.size());
		for( int i=0;i<l.size();i++) {
			System.out.println(l.get(i));
		}
		
		System.out.println("=========================================");
		Hashtable<String,String> table= new Hashtable<String,String>();
		table.put("Name", "Ravi");
		table.put("Role", "Lead");
		table.put("City", "London");
		table.put("email", "test@test.com");
		
		System.out.println(table.get("Name"));
		
		
		int a=200;
		int x=500;
		String str="600";
		String str3="  400  ";	
		int b = Integer.parseInt(str);
		 String str1=Integer.toString(a);
		 int c = Integer.parseInt(str3.trim());
		 System.out.println(a+b+c);
		 System.out.println(str + str1);
		 
		 String str4=String.valueOf(x);
		 System.out.println(str+str1+str4);
		
				
	}
	
	
	

}
