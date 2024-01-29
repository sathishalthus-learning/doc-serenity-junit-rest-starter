package starter.petstore;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractions;

import static net.serenitybdd.rest.SerenityRest.*;

import org.hamcrest.Matchers;

import io.restassured.http.ContentType;
import io.restassured.mapper.ObjectMapperType;

public class PetApiActions extends UIInteractions{
	//
	@Step("Kitty is available on the store")
	public Long givenKittyIsAvailableInThePetStore() {
		
		Pet pet = new Pet("Kitty","available");
		Long newId = given()
				.baseUri("https://petstore.swagger.io")
				.basePath("v2/pet")
				.body(pet,ObjectMapperType.GSON)
				.accept(ContentType.JSON)
				.contentType(ContentType.JSON)
				.post()
				.getBody()
				.as(Pet.class,ObjectMapperType.GSON)
				.getId();
		
		return newId;
	}
	
	@Step("I ask for the pet using Id {0}")
	public void whenIAskForPetWithId(Long id) {
		//
		when().get("/"+id);
	}
	
	@Step("get the kitty result")
	public void thenISeeKittyAsResult() {
		//
		then().body("name", Matchers.equalTo("Kitty"));
	}
}
