package co.simplon.restcountries.controllers;

public class CountryTableItem {
    private String name;
    private Double area;
    private Integer population;
    private String capital;

    public CountryTableItem(String name, Double area, Integer population, String capital) {
	this.name = name;
	this.area = area;
	this.population = population;
	this.capital = capital;

    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public Double getArea() {
	return area;
    }

    public void setArea(Double area) {
	this.area = area;
    }

    public Integer getPopulation() {
	return population;
    }

    public void setPopulation(Integer population) {
	this.population = population;
    }

    public String getCapital() {
	return capital;
    }

    public void setCapital(String capital) {
	this.capital = capital;
    }

    @Override
    public String toString() {
	return "CountryTableItem [name=" + name + ", area=" + area + ", population=" + population + ", capital="
		+ capital + "]";
    }

}
