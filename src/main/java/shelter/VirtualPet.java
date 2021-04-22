package shelter;
public class VirtualPet {
// tried my best to complete the coding assignment.

    private String name;
    private int hunger;
    private String type;
    private String description;
    private int sleepy;
    private int bored;

    public VirtualPet(String name, String type,  String description , int hunger, int sleepy, int bored){


        this.name = name;
        this.type = type;
        this.description = description;
        this.sleepy = sleepy;
        this.hunger = hunger;
        this.bored = bored;

    }

    public VirtualPet(String newPet, String petDescription) {
    }

    public String getName() {
        return name;
    }

    public int getHunger() {
        return hunger;
    }

    public int getSleepy() {
        return sleepy;
    }

    public int getBored() {
        return bored;
    }
    public int getType(){ return type;}
    public String getDescription(){return description;}




    public void setHunger(int h) {
        hunger = h;
    }

    public void setSleepy(int s) {
        sleepy = s;
    }

    public void setBored(int b) {
        bored = b;
    }

    public void modifyHunger(int h) {
        hunger += h;
    }

    public void updateSleepy(int s) {
        sleepy += s;
    }

    public void updateHunger(int h) { hunger += h;
    }
    public void updateBored(int b ) { bored += b;
    }
    public void feed(int f) { updateHunger(f);}
    public void rest(int r) { updateSleepy(r);}
    public void play(int p) { updateBored(p);}
    public void tick() {
        updateSleepy(1);
        updateHunger(1);
        updateBored(1);



    }

}
