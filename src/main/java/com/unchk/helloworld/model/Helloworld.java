package com.unchk.helloworld.model;

/**
 * Modèle représentant un message "Hello World"
 */
public class Helloworld {
private String value = "hello world";

public String getValue() {
	return value;
}

public void setValue(String value) {
	this.value = value;
}
@Override
public String toString() {
	return value;
}


}
