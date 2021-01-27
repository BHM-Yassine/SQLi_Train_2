package com.yassine.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.yassine.decorator.TrainDecorator;
import com.yassine.factory.ITrainFactory;
import com.yassine.factory.TrainFactory;

public class Train implements ITrain {
	ITrainFactory factory = new TrainFactory();
	
	private String design = "Basic Train";

	public Train() {
		super();
	}
	
	public Train(String wagonsChar) {
		this.design = factory.createTrain(wagonsChar).print();
	}
	
	
	@Override
	public String print() {
		return this.design;
	}


}
