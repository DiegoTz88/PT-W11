package homework_week_11.application;

import homework_week_11.dao.dao;
import homework_week_11.service.SortCheese;

public class lambdaSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		dao daoCheese = new dao();
		SortCheese sortCheese = new SortCheese();
		
		sortCheese.sortLambda(daoCheese.cheeses);
	}

}
