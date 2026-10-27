package petshop;

public class BathMachine {

    private boolean clean;

    private int water;

    private int shampoo;

    private Pet pet;

    public void batheAPet(){
        if (this.pet == null) {
            System.out.println("Coloque o pet na máquina de banho.");
        }

        this.water -= 10;
        this.shampoo -= 2;

        pet.setClean(true);
        System.out.println("O pet " + pet.getName() + " está limpo!");
    }

    public void addWater(){
        if (water == 30){
            System.out.println("Armazenamento de água cheio.");
        }

        water += 2;
    }

    public void addShampoo(){
        if (shampoo == 10){
            System.out.println("Armazenamento de shampoo cheio.");
        }

        shampoo += 2;
    }

    public int getWater() {
        return water;
    }

    public int getShampoo() {
        return shampoo;
    }

    public boolean hasPet(){
        return pet != null;
    }

    public void setPet(Pet pet) {
        if (!this.clean){
            System.out.println("Limpe a máquina antes de adicionar um pet");
        }

        if (hasPet()){
            System.out.println("O pet " + this.pet.getName() + " está na máquina.");
        }

        this.pet = pet;
    }

    public void removePet(){
       this.clean = this.pet.isClean();
       this.pet = null;
    }

    public void washMachine(){
        this.water -= 10;
        this.shampoo -= 2;
        this.clean = true;
        System.out.println("A máquina está limpa.");
    }
}
