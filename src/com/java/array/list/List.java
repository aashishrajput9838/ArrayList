package com.java.array.list;

import java.util.ArrayList;
import java.util.Collections;

public class List {

	public static void main(String[] args) {
		ArrayList<Integer> list= new ArrayList<Integer>();
		
		//add elements
		list.add(0);
		list.add(1);
		list.add(2);
		
		System.out.println(list);
		
		//get element
		int element= list.get(0);
		System.out.println(element);
		
		//add element in between
		list.add(3, 3);
		System.out.println(list);
		
		//set element 
		list.set(0, 5);
		System.out.println(list);		
		
		//remove element
		list.remove(0);
		System.out.println(list);
	
		int  size= list.size();
		System.out.println(size);
		
		//Loops
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
			
		}
		//sorting
		Collections.sort(list);
		System.out.println(list);
	}
}
