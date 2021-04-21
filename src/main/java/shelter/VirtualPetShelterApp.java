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

        if (select == 0) {
            continue;
        }
    else if (select == 1){
        pets.feedAll();

        for(VirtualPet petAfterFeed: pets.getAllPets()){
            petAfterFeed.updateHunger(+5);
            petAfterFeed.updateBored(+5);
        }
            System.out.println("All are full");
        }
    else if(select == 2){
        pets.restAll;

        for(VirtualPet petAfterPlay: pets.getAllPets()){
            petAfterPlay.updateSleepy(+5);
            petAfterPlay.updateHunger(-5);
        }
            System.out.println("Needed a break");
        }
    else if(select ==3)
        String getAllPet;
    for(VirtualPet myPet: pets.getAllPets()){
        System.out.println(myPet.getName()+ myPet.getDescription());
    }
        System.out.println("Enter name of pet");
    input.nextLine();
    getAllPet = input.nextLine();
    }




    }
}
