package co.simplon.restcountries.controllers;

public class CountryCard {
    private String name;
    private String capital;
    private String isocode;
    private String flag;
    private String map;

    public CountryCard(String name, String capital, String isocode, String flag, String map) {
	this.name = name;
	this.capital = capital;
	this.isocode = isocode;
	this.flag = flag;
	this.map = map;

    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public String getCapital() {
	return capital;
    }

    public void setCapital(String capital) {
	this.capital = capital;
    }

    public String getIsocode() {
	return isocode;
    }

    public void setIsocode(String isocode) {
	this.isocode = isocode;
    }

    public String getFlag() {
	return flag;
    }

    public void setFlag(String flag) {
	this.flag = flag;
    }

    public String getMap() {
	return map;
    }

    public void setMap(String map) {
	this.map = map;
    }

    @Override
    public String toString() {
	return "CountryCard [name=" + name + ", capital=" + capital + ", isocode=" + isocode + ", flag=" + flag
		+ ", map=" + map + "]";
    }

}
