package com.example.demo.model;

import javax.validation.constraints.NotNull;

public class TestModel {
@NotNull(message = "name required")
 private String name;
 private int value;
 
 public TestModel() {
	 
 }
 
 
public TestModel(@NotNull(message = "name required") String name, int value) {
	super();
	this.name = name;
	this.value = value;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getValue() {
	return value;
}
public void setValue(int value) {
	this.value = value;
}
@Override
public String toString() {
	return "Test [name=" + name + ", value=" + value + "]";
}
 
}
