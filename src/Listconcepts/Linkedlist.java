package Listconcepts;


import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> al=new LinkedList<String>();  
		  al.add("Ravi");  
		  al.add("Vijay");  
		  al.add("Ravi");  
		  al.add("Ajay"); 
		  al.add("Ajay");  
		  al.addFirst("amar");
		  al.addLast("Prasad");
		  al.set(2,"deepak");
		  al.remove(2);
		  
	//	  for (int n1=0;n1<=(al.size());n1++) {
	//		  System.out.println(al.get(n1));
	//	  }
		  
		  System.out.println("##########################");
		  
		  Iterator<String> itr=al.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  
	
		 
	}
}
	


