package starter.petstore;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import net.serenitybdd.junit5.SerenityJUnit5Extension;

@ExtendWith(SerenityJUnit5Extension.class)
public class WhenSearchiingPet {
	//
	//
	Long newPetId = null;
	PetApiActions petApi;
	
	//
	@Test
	public void fetchAvailablePet() {
		//
		newPetId = petApi.givenKittyIsAvailableInThePetStore();
		petApi.whenIAskForPetWithId(newPetId);
		petApi.thenISeeKittyAsResult();
	}
}
