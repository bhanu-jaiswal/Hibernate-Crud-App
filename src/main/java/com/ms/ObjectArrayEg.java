package com.ms;

import java.util.ArrayList;
import java.util.List;

public class ObjectArrayEg {

	public static void main(String[] args) {
		Object o1[]= {101,"Dheeraj-1"};
		Object o2[]= {102,"Dheeraj-2"};
		Object o3[]= {103,"Dheeraj-3"};
		List<Object[]> list=new ArrayList<>();
		list.add(o3);list.add(o2);list.add(o1);
		
		for(Object o[]:list)
		{
			for(Object item:o)
			{
				System.out.println(item);
			}
			System.out.println();
		}

	}

}
