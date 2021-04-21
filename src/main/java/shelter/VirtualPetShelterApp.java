package shelter;


import java.util.Scanner;

public class VirtualPetShelterApp {

    public static void main(String[] args) {

    VirtualPet petC = new  VirtualPet("Clelion","wild","testing",0,0,0);
    VirtualPet petD = new VirtualPet("Pella","dog", "testing2",0,0,0);
    VirtualPet petE = new VirtualPet("Rowdy", "dog", "testing3",0,0,0);

    VirtualPetShelter pets  = new VirtualPetShelter();
    pets.firstAdd(petC);
    pets.firstAdd(petD);
    pets.firstAdd(petE);

    Scanner input = new Scanner(System.in);

    String select;
    do{
        System.out.println("Welcome to Wild Shelter");
        System.out.println("Status of your pets");

        //Status of animal
        System.out.println(petC.getName(),petC.getHunger(),petC.getSleepy(),petC.getBored());


        System.out.println("Choose from the following");
        System.out.println("[0] Quit");
        System.out.println("[1] Feed the pets");
        System.out.println("[2] Rest All");
        System.out.println("[3] Play with pet you like");
        System.out.println("[4] Adopt a pet");
        System.out.println("[5] Admit a pet");

        select = input.nextLine();

        if (select.equals(0)) {
            continue;
        }
    else if (select.equals(2)){
        pets.feedAll();

        for(VirtualPet petAfterFeed: pets.getAllPets()){
            petAfterFeed.updateHunger(+5);
            petAfterFeed.updateBored(+5);
        }
            System.out.println("All are full");
        }
    else if(select.equals(2)){
        pets.restAll;

        for(VirtualPet petAfterPlay: pets.getAllPets()){
            petAfterPlay.updateSleepy(+5);
            petAfterPlay.updateHunger(-5);
        }
            System.out.println("Needed a break");
        }
    else if(select.equals(3))
            System.out.println("You chose to play");
        String selectPet;
    for(VirtualPet myPet: pets.getAllPets()){
        System.out.println(myPet.getName()+ myPet.getDescription());
    }
        System.out.println("Enter name of pet");
    input.nextLine();
    selectPet = input.nextLine();
        System.out.println("You want to play" + selectPet);
        VirtualPet thisPet = pets.findPet(selectPet);

        thisPet.updateHunger(5);
        thisPet.updateSleepy(5);
        thisPet.updateBored(5);

        continue;


    }
    else if (select.equals(4) ) {
            System.out.println("So! You want to take a pet? Great");
    for (VirtualPet adoptPet : pets.getAllPets()){
        System.out.println(adoptPet.getName()+ adoptPet.getDescription());
    }
    System.out.println("Which pet? Not all..");
    input.nextLine();
    String adoptPet = input.nextLine();

    pets.remove(adoptPet);
            System.out.println("Great call! Pet " + adoptPet + " yours to take.");
        }
    else if (select.equals(5)) {
            System.out.println("You want to donate a pet");
            System.out.println("Type in name of your pet");
            input.nextLine();
            String newPet = input.nextLine();
            System.out.println("Describe your pet");
            String petDescription = input.nextLine();
            VirtualPet petF = new VirtualPet(newPet, petDescription);
            pets.add(petF);
            System.out.println("Taking in " + newPet);
    }
    else {
            System.out.println("Wrong number");
        }
    for (VirtualPet myPetTick: pets.getAllPets()) {
        pets.tick(myPetTick);
    }

        }
    while(select ==0)

}
}
