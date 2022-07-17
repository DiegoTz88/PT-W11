package homework_week_11.application;


import java.util.stream.Collectors;
import homework_week_11.dao.dao;
import homework_week_11.entity.Cheese;

public class stream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dao daoCheese = new dao();
		
		String sortCheese = daoCheese.cheeses.stream().map(Cheese :: toString).sorted().collect(Collectors.joining(", "));
		
		System.out.println(sortCheese);
	}

}
