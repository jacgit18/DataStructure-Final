package edu.citytech.cst.finalexam._questions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

import edu.citytech.cst.finalexam.dao.StockDAO;
import edu.citytech.cst.finalexam.model.Stock;

public class F15 {	
 
	/*How many stocks have a net income greater than 1000? 
	 *  Create method called getNetIncomeInMillions which returns a float.
	 *  The calculation is based on getNetIncome which returns a String.

Conversion 
    • 87.6M becomes 87.6 [if it contains an M remove the M]

		3.19B becomes 3190 [if it contains a B, remove the B and multiply it by 1000]
	 * */
	
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
