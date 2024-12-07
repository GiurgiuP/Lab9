package Prob1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class DemoApplication
{


	private static final Logger logger = LoggerFactory.getLogger(DemoApplication.class);

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);


		System.out.println("Aplicația a pornit!");
		logger.info("Aplicația a pornit!");


		Masina masinaTest = new Masina();
		masinaTest.setNumarInmatriculare("B12XYZ");
		masinaTest.setMarca("Dacia");
		masinaTest.setAnFabricatie(2018);
		masinaTest.setCuloare("Albastru");
		masinaTest.setKilometri(80000);


		System.out.println("Adăugăm mașina: " + masinaTest);
		logger.info("Adăugăm mașina: {}", masinaTest);

	}

	@Override
	public String toString() {
		return "DemoApplication{}";
	}
}
