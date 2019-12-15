package edu.citytech.cst.finalexam._questions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

import edu.citytech.cst.finalexam.dao.StockDAO;
import edu.citytech.cst.finalexam.model.Stock;

public class F03 {	
 
	/* How many stock symbols start with letters A through H
	 * 
	 * Answer is 132
	 * 
	 * */
	 public static void main(String[] args) {		 
		 List<Stock> list = new StockDAO().findAll();
		Predicate<Stock> SymEx = e -> e.toString().contains(e.getSymbol());
		Predicate<Stock> SymEx1 = e -> e.getSymbol().contentEquals("");


		 long count = list.stream()
		     .filter(e -> e.getSymbol().compareTo("I") < 0).filter(SymEx1)
		     .map( e -> {
		    	 Map<String,String> map = new HashMap<>();
		    	 map.put("symbol", e.getSymbol());
		    	 map.put("exchange", e.getExchange());		    	 
		    	 return map;
		     })
		     .peek(System.out::println)
		     .count();
		 
		 System.out.println("count: " + count);

//		 list.stream().filter(SymEx)
//			.forEach(System.out::println);
			
		 // w t v o s m n j u x p
			
//			long size = list.stream().filter(SymEx).toArray().length;
//			System.out.println("Number of Stocks: " + size);
		 
	 }
}
