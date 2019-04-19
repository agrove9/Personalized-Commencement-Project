package edu.ycp.cs320.PersonalizedCommencementProject.controller;

import edu.ycp.cs320.PersonalizedCommencementProject.model.ZUNUSED_Numbers;

public class ZUNUSED_NumbersController {
	private ZUNUSED_Numbers model;

	public void setModel(ZUNUSED_Numbers a) {
		this.model = a;
	}

	public Double add(Double first, Double second, Double third) {
		model.setNum(first, second, third);
		model.add();
		return model.getResult();
	}

	public Double multiply(Double first, Double second) {
		model.setNum(first, second, 0);
		model.multiply();
		return model.getResult();
	}
}
