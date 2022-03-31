package co.simplon.restcountries.controllers;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class CountryController {

    @GetMapping("/countryNames")
    public ArrayList<CountryName> countryNames() {
	ArrayList<CountryName> countryNames = new ArrayList<>();
	CountryName france = new CountryName("france");
	countryNames.add(france);
	CountryName spain = new CountryName("spain");
	countryNames.add(spain);
	return countryNames;
    }

    @GetMapping("/countryTableItems")
    public ArrayList<CountryTableItem> countryTableItems() {
	ArrayList<CountryTableItem> countries = new ArrayList<>();
	CountryTableItem france = new CountryTableItem("French Republic", 531.695, 67391582, "Paris");
	countries.add(france);
	CountryTableItem RepublicOfIreland = new CountryTableItem("Republic of Ireland", 70.273, 4994724, "Dublin");
	countries.add(RepublicOfIreland);
	return countries;

    }

    @GetMapping("/countryCard")
    public ArrayList<CountryCard> countryCards() {
	ArrayList<CountryCard> listCountryCard = new ArrayList<>();
	CountryCard france = new CountryCard("France", "Paris", "FR", "https://flagcdn.com/w320/fr.png",
		"https://www.openstreetmap.org/relation/1403916");
	CountryCard espagne = new CountryCard("Espagne", "Madrid", "ES", "https://flagcdn.com/w320/es.png",
		"https://www.openstreetmap.org/relation/1311341");
	listCountryCard.add(france);
	listCountryCard.add(espagne);
	return listCountryCard;

    }

}
