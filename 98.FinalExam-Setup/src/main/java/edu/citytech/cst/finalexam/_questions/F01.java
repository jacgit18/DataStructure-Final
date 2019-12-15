package edu.citytech.cst.finalexam._questions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

import edu.citytech.cst.finalexam.dao.StockDAO;
import edu.citytech.cst.finalexam.model.Stock;

public class F01 {	
 
	/* How many stocks belong to exchange equal to NYSE? 
	 * Not required but project symbol, and exchange
	 * to see the answer beter?
	 * 
	 * Answer is 132
	 * 
	 * */
	 public static void main(String[] args) {		 
		List<Stock> list = new StockDAO().findAll();
		Predicate<Stock> SymEx = e -> e.getExchange().equals("NYSE");

		 long count = list.stream()
		     .filter(e -> e.getExchange().equals("NYSE")).filter(SymEx)
		     .map( e -> {
		    	 Map<String,String> map = new HashMap<>();
		    	 map.put("symbol", e.getSymbol());
		    	 map.put("exchange", e.getExchange());		    	 
		    	 return map;
		     }).peek(System.out::println)

		     .count();
	
			
			list.stream().filter(SymEx)
			.forEach(System.out::println);
			
			
			long size = list.stream().filter(SymEx).toArray().length;
			System.out.println("Number of Stocks: " + size);
			
		 
		 
	 }
	 
	 
	 
	 
}
