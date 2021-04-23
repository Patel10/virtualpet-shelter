package shelter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collection;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualPetShelterTest {
    VirtualPetShelter underTest;
    VirtualPet petC;
    VirtualPet petD;
    VirtualPet petE;



@BeforeEach
public void setup() {
        underTest = new VirtualPetShelter();
        petC = new VirtualPet("Clelion","wild","testing",0,0,0);

    }
@Test
public void ableToAddPet(){
    underTest.add(petC);  //test passes
    VirtualPet getPet = underTest.findPet("Clelion");
    assertEquals(getPet, petC);
}
@Test
public void ableToFindPet(){
    //underTest.add(petC);
    underTest.findPet(petC); //error review
    VirtualPet findPet = underTest.findPet("Clelion");
    assertEquals(findPet, petC);
}
@Test
public void ableToAddPetTwoPets(){
    underTest.add(petC);
    underTest.add(petD);
    Collection <VirtualPet> allPets = underTest.getAllPets();
    assertEquals(1,allPets.size());
}




}
