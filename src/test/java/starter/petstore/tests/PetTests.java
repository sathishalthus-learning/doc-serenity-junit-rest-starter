package starter.petstore.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static net.serenitybdd.rest.SerenityRest.*;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.junit5.SerenityJUnit5Extension;

@ExtendWith(SerenityJUnit5Extension.class)
public class PetTests {
	//
	//
	@Test
	@DisplayName("Get Pet details by Id")
	public void getPetById() {
		//
		given()
		.when()
			.get("https://petstore.swagger.io/v2/pet/100")
		.then()
			.statusCode(200)
			.log().body()
		;
	}
}
