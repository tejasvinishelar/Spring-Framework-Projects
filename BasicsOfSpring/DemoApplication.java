package com.spring1.example.demo.basics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		
		//what are the beans?
		//where are the dependencies
		//Where to search them?
		
		//BinarySearch search = new BinarySearch(new BubbleSortImplementation());
		
		ConfigurableApplicationContext applicationContext = SpringApplication.run(DemoApplication.class, args);
		
		BinarySearch binarySearch = applicationContext.getBean(BinarySearch.class); 
		
		int result = binarySearch.binarySearch(new int[] {10,11,12,6,7,4}, 3);
		
		System.out.println("binary Search 1 : "+binarySearch);
		
		BinarySearch binarysearch2 = applicationContext.getBean(BinarySearch.class);
		System.out.println("binary Search 2 : "+binarysearch2);
		
		
	}

}
