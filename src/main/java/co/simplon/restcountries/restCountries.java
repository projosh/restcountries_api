package co.simplon.restcountries;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class restCountries {

	public static void main(String[] args) {
		SpringApplication.run(restCountries.class, args);
	}
	
	@GetMapping("/ping")
	public String ping () {
		return "pong";
	}
	
	@GetMapping("/learners")
	public ArrayList<Person> learners() {
		ArrayList<Person> learners = new ArrayList<>();
		Person frank = new Person("Frank", "Marshall");
		learners.add(frank);
		Person glecia = new Person("Glecia", "Maindron");
		learners.add(glecia);
		return learners;

		
	} 
	
	@PostMapping("/create")
	public void create (@RequestBody Person person) {
		System.out.println(person);
		
		
	}
	
	//ecrire une classe Person avec : 
	//firstname,lastname
	//dans le package existant package co.simplon.restcountries
	//1 constructeur sans argument
	//1 constructeur avec 2 argument


}
