package org.paoloaltonetworks.javaapp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class TestingPrograms {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1; i<= 5; i++)list.add(i);
        
		List<ArrayList<Integer>> storage = new ArrayList<>();

		arrange(list, 0, storage, new ArrayList<>());
		
		storage.forEach(System.out::println);
	}

	private static void arrange(ArrayList<Integer> list, int k, List<ArrayList<Integer>> storage, 
			ArrayList<Integer> arrayList) {
		
		

       if(k == list.size()) {
    	   storage.add(new ArrayList<>(arrayList));
    	   return;
       }
		
		for (int i = k; i < list.size(); i++) {
			   arrayList.add(list.get(i));

			   arrange(list, i+1, storage, arrayList);
			   arrayList.remove(arrayList.size()-1);
			   
 		}

	}
}
