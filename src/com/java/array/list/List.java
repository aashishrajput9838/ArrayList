package com.java.array.list;

import java.util.ArrayList;
import java.util.Collections;

public class List {

	public static void main(String[] args) {
		ArrayList<Integer> list= new ArrayList<>();
		
		//add elements
		list.add(0);
		list.add(1);
		list.add(2);
		
		System.out.println("ORIGNAL LIST: "+ list);
		
		//get element
		int element= list.get(0);
		System.out.println("ELEMENT AT INDEX 0 is: "+ element);
		
		//add element in between
		list.add(3, 3);
		System.out.println("LIST AFTER INSERTING 3 AT POSITION 4 is: "+ list);
		
		//set element 
		list.set(0, 5);
		System.out.println("LIST AFTER UPDATING 1st ELEMENT TO 5 is: "+ list);		
		
		//remove element
		list.remove(0);
		System.out.println("LIST AFTER REMOVING 1st ELEMENT is: "+ list);
	
		int  size= list.size();
		System.out.println("SIZE is: "+ size);
		
		//Loops
		System.out.println("DISPLAYING LIST USING FOR LOOP");
		for(int i=0; i<list.size(); i++) {
			System.out.print(" " +list.get(i));
			
		}
		System.out.println();	
		//sorting
		Collections.sort(list);
		System.out.println("LIST AFTER SORTING is: "+ list);
	}
}
