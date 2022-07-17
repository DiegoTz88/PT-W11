package homework_week_11.application;

import java.util.NoSuchElementException;
import java.util.Optional;

import homework_week_11.dao.dao;
import homework_week_11.entity.Cheese;

public class optional {
	
	private static dao daoCheese = new dao();

	public static void main(String[] args) {
		Cheese tester = new Cheese("Parmasan");
		Optional<Cheese> test = Optional.of(tester);
		run(test);
	}
	
	private static void run(Optional<Cheese> optionalCheese) {
		try {
			optionalCheese.orElseThrow(() -> new NoSuchElementException ("Object: " + optionalCheese + " is missing"));
			System.out.println(daoCheese.findCheese(optionalCheese));
		} catch (NoSuchElementException e) {
			System.out.println(e.getMessage());
		}
	}
}
