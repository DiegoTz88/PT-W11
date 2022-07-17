package homework_week_11.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import homework_week_11.entity.Cheese;

public class dao {

	public List<Cheese> cheeses = new ArrayList<>(List.of(
			new Cheese("Gouda"),
			new Cheese("Colby Jack"),
			new Cheese("Pepper Jack"),
			new Cheese("American")));
	
	public static int compare ( Cheese c1, Cheese c2) {
		return c1.getName().compareTo(c2.getName());
	}
	
	public Cheese findCheese(Optional<Cheese> optionalCh) {
		if(optionalCh.isPresent()) {
			return optionalCh.get();
		} else {
			throw new NoSuchElementException("Object is missing.");
		}
	}
	
}
