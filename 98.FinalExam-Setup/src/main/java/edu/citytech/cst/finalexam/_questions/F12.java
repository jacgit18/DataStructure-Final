package edu.citytech.cst.finalexam._questions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

import edu.citytech.cst.finalexam.dao.StockDAO;
import edu.citytech.cst.finalexam.model.Stock;

public class F12 {	
 
	/* How Many Stocks belong to exchange 
	 * equal to NYSE and have annual pay greater
	 *  than 1.00. Based on these criteria what 
	 *  company has the highest payout?
	 * 
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
