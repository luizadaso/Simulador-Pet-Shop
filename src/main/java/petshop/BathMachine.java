package petshop;

public class BathMachine {

    private boolean clean = true;

    private int water = 30;

    private int shampoo = 10;

    private Pet pet;

    public void batheAPet() {
        if (this.pet == null) {
            System.out.println("Coloque o pet na máquina de banho.");
            return;
        }

        if (pet.isClean()) {
            System.out.println("Este pet já está limpo.");
            return;
        }

        this.water -= 10;
        this.shampoo -= 2;

        pet.setClean(true);
        this.clean = false;

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
        return this.pet != null;
    }

    public void setPet(Pet pet) {
        if (!this.clean){
            System.out.println("Limpe a máquina antes de colocar o pet.");
            return;
        }

        if (hasPet()){
            System.out.println("O pet " + this.pet.getName() + " está na máquina.");
            return;
        }

        this.pet = pet;
    }

    public void removePet() {
        if (hasPet()) {
            System.out.println("Pet retirado da máquina.");
        }else {
            System.out.println("Não há pet na máquina.");
            return;
        }

        this.pet = null;
    }

    public void washMachine(){
        this.water -= 10;
        this.shampoo -= 2;
        this.clean = true;
        System.out.println("A limpeza da máquina foi concluída.");
    }
}
