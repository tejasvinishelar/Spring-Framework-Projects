package com.spring1.example.demo.basics;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearch {
	@Autowired
	@Qualifier("bubble")
	SortAlgorithm sortAlgorithm;	//bubbleSortImplementation
	
	public int binarySearch(int[] numbers, int numberToBeSearch) {
		
		int[] sortedNUmbers = sortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm);
		return numberToBeSearch;
	}

}
