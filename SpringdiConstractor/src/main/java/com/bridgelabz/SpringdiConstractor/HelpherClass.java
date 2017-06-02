package com.bridgelabz.SpringdiConstractor;

public class HelpherClass {
	ConstructorInterface constructorInterface;

	public void GetDisplay() {
		constructorInterface.Display();
	}
        public HelpherClass(ConstructorInterface constructorInterface) 
        {
        	this.constructorInterface=constructorInterface;
		}
}
