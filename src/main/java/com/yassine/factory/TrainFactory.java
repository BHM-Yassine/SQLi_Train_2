package com.yassine.factory;

import com.yassine.basic.Train;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.yassine.basic.ITrain;
import com.yassine.decorator.Cargo;
import com.yassine.decorator.Head;
import com.yassine.decorator.Passenger;
import com.yassine.decorator.Restaurant;
import com.yassine.decorator.TrainDecorator;

public class TrainFactory implements ITrainFactory {

	public ITrain createDecorator(char wagonChar, ITrain train) {
		ITrain newTrain = null;

		switch (wagonChar) {

		case 'H':
			newTrain = new Head(train);
			break;

		case 'P':
			newTrain = new Passenger(train);
			break;

		case 'R':
			newTrain = new Restaurant(train);
			break;

		case 'C':
			newTrain = new Cargo(train);
			break;

		default:
			new IllegalArgumentException("type of wagon not defined");

		}
		return newTrain;
	}
	
	@Override
	public ITrain createTrain(String wagonsChar) {
		ITrain myTrain = new Train();
		
		// List<ITrain> tmpList = new ArrayList<>();
       
        for (int i = 0; i < wagonsChar.length(); i++) {
	           ITrain tmpTrain = createDecorator(wagonsChar.charAt(i), myTrain);
	      
	           // tmpList.add(tmpTrain);
	           
	           if(tmpTrain instanceof Head && i != 0)
					((Head) tmpTrain).setHeadLast();
           
	           myTrain = tmpTrain;
	           
	           System.out.println(myTrain.print());	           
        }
        
        
        // String newDesign = tmpList.stream().map(ITrain::print).collect(Collectors.joining("::"));
        // System.out.println(newDesign);
        
        // myTrain.print();
        
		return myTrain;
	}
	
}
