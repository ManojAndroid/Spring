package com.bridgelabz.SpringDI;

public class helpherclass 
{
	CsvOutputGenerator outputGenerator;

	public void generateOutput() {
		outputGenerator.generateOutput();
	}

	//DI via setter method
	public void setOutputGenerator(CsvOutputGenerator outputGenerator) {
		this.outputGenerator = outputGenerator;
	}
}
