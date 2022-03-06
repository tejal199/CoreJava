package fileprocessors;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class StockFileData {
	
	List<HashMap<String, Double>> data = new LinkedList<HashMap<String, Double>>();
	
	ArrayList<String> values = new ArrayList<>();
	
	public void printData(){
		System.out.println(data);
	}
	
	public void addData(List<HashMap<String, Double>> dataIn){
		data = dataIn;
	}
}
