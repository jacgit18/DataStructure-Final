package edu.citytech.cst.finalexam.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;



import edu.citytech.cst.finalexam.model.Stock;
import edu.citytech.cst.finalexam.utility.FileUtility;

public class StockDAO {

	public List<Stock> findAll() {		

		List<Stock> stocks = new ArrayList<>();
		File file = new FileUtility().getFileFromResources("./stocks.ser");
		
		 try (FileInputStream fileIn = new FileInputStream(file);
		       ObjectInputStream in = new ObjectInputStream(fileIn);) {         
	         
	         @SuppressWarnings("unchecked")
			 List<Stock> e = (List<Stock>) in.readObject();
	         return e;	         
	         
	      } catch (IOException | ClassNotFoundException i) {
	         i.printStackTrace();
	         return stocks;
	      } 		
		
	}
}
