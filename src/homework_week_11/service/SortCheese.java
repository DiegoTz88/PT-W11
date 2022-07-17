package homework_week_11.service;


import java.util.List;

import homework_week_11.dao.dao;
import homework_week_11.entity.Cheese;


public class SortCheese {
	
	public void sortLambda(List<Cheese> cheeses) {
		
		cheeses.sort((Cheese c3, Cheese c4) -> dao.compare(c3, c4));
		cheeses.forEach(System.out::println);
		
	}
}

