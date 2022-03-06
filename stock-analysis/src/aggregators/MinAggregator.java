package aggregators;

import java.util.ArrayList;
import java.util.List;

public class MinAggregator extends Aggregator{
	//If the aggregatorApp.java runs then comment of below code
	public MinAggregator(List<Double> numbers) {
		this.numbers = new ArrayList<Double>(numbers);
	}

	@Override
	public double calculate() {
		double min = numbers.get(0);
		for(double number : numbers){
			if(number < min){
				min = number;
			}
		}
		return min;
	}

	@Override
	public List<Double> getValues() {
		return numbers;
	}

}
