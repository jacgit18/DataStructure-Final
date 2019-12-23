package edu.citytech.cst.finalexam._questions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

import edu.citytech.cst.finalexam.dao.StockDAO;
import edu.citytech.cst.finalexam.model.Stock;

public class F13 {	
 
	/*How many stocks (symbol) start with the letters 
	 * I as (ill) through U excluding the U but including 
	 * all the I?
	 * 		this.gender = e.gender.substring(0, 1).toUpperCase();

	 * */
	
	// figure out f09
	 public static void main(String[] args) {		 
		List<Stock> list = new StockDAO().findAll();
		Predicate<Stock> SymEx = e -> e.getAnnualPayout() > 1.00;

		 long count = list.stream()
		     .filter(e -> e.getExchange().equals("NYSE")).filter(SymEx)
		     .map( e -> {
		    	 Map<String,String> map = new HashMap<>();
		    	 map.put("symbol", e.getSymbol());
//		    	 map.put("annualPayout", e.getAnnualPayout());


		    	 return map;
		     }).peek(System.out::println)

		     .count();

			System.out.println("Number of Stocks: " + count);
			
		 
		 
	 }
	 
	 
	 
	 
}
