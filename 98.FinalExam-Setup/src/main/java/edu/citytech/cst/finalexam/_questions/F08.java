package edu.citytech.cst.finalexam._questions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

import edu.citytech.cst.finalexam.dao.StockDAO;
import edu.citytech.cst.finalexam.model.Stock;

public class F08 {	
 
	/* 
	 * How many stocks contain the word Company in the name? 	 
	 * */
	 public static void main(String[] args) {		 
		 List<Stock> list = new StockDAO().findAll();
			Predicate<Stock> SymEx = e -> e.getName().contains("Company");

		 long count = list.stream()
		     .filter(e -> e.getDividendFrequence().equals("Quarterly") ).filter(SymEx)
		     .map( e -> {
		    	 Map<String,String> map = new HashMap<>();
		    	 map.put("symbol", e.getSymbol());
		    	 map.put("exchange", e.getExchange());
		    	 map.put("mame", e.getName());	
		    	 return map;
		     })
		     .peek(System.out::println)
		     .count();
		 
		 System.out.println("count: " + count);
	 }
}
