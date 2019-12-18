package com.spring1.example.demo.basics;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("bubble")
public class BubbleSortImplementation implements SortAlgorithm {

	@Override
	public int[] sort(int[] numbers) {
		// TODO Auto-generated method stub
		return numbers;
	}

}
