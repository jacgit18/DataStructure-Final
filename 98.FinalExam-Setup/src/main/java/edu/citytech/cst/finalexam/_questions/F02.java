package edu.citytech.cst.finalexam._questions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

import edu.citytech.cst.finalexam.dao.StockDAO;
import edu.citytech.cst.finalexam.model.Stock;

public class F02 {	
 
	/* 
	 * How Many Stocks belong to the exchange equal to NASDAQ?
	 *
	 * */
	 public static void main(String[] args) {		 
		List<Stock> list = new StockDAO().findAll();
		Predicate<Stock> SymEx = e -> e.getExchange().equals("NASDAQ");

		 long count = list.stream()
		     .filter(e -> e.getExchange().equals("NASDAQ")).filter(SymEx)
		     .map( e -> {
		    	 Map<String,String> map = new HashMap<>();
		    	 map.put("symbol", e.getSymbol());
		    	 map.put("exchange", e.getExchange());		    	 
		    	 return map;
		     }).peek(System.out::println)
		     .count();
		 

//			list.stream().filter(SymEx)
//			.forEach(System.out::println);
			
			
			long size = list.stream().filter(SymEx).toArray().length;
			System.out.println("Number of Stocks: " + size);
			
	 }
}
