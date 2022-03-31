package co.simplon.restcountries.controllers;

public class CountryName {
    private String name;

    public CountryName() {

    }

    public CountryName(String name) {
	this.name = name;

    }

    @Override
    public String toString() {
	return "Country [name=" + name + "]";
    }

    public String getName() {
	return name;
    }

    public String setName() {
	return name;
    }

}
