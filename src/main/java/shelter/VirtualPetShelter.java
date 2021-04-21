package shelter;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {


    Map<String, VirtualPet> pets = new HashMap<>();

    public void firstAdd(VirtualPet pet) {
        pets.put(pet.getName(),pet);
    }
    public VirtualPet findPet(String petName){
    return pets.get(petName);
    }
    public void remove(String myPet){
        pets.remove(myPet);
    }
    public VirtualPet getPet(String name){
        return pets.get(name);
    }
    public Collection<VirtualPet> getAllPets(){
        return pets.values();
    }
    public void feed(VirtualPet pet1){
        pet1.modifyHunger(2);
    }
    public void tick(VirtualPet tick){
        if(tick.getHunger() == 0) {
            System.out.println("Overloaded with feeding, easy off.");
        }
    if (tick.getHunger()>-10) {
        System.out.println("Unresponsive");
    }
    if (tick.getBored() == 10 ) {
        System.out.println("Break Needed");
    }
    if (tick.getBored() == -1) {
        System.out.println("Unresponsive");
    }
    if (tick.getSleepy() == 10) {
        System.out.println("Break Needed");
    }
    if (tick.getSleepy() == -1) {
        System.out.println("Unresponsive");
    }

    }
    public void feedAll(){
        for (VirtualPet feedPet: pets.values()){
            feedPet.updateHunger(-10);
        }
    }
    public void playAll() {
        for (VirtualPet playPet : pets.values()) {
            playPet.updateBored(10);
        }
    }
    public void restAll() {
        for (VirtualPet sleepPet: pets.values()){
            sleepPet.updateSleepy(10);
        }
    }


}
