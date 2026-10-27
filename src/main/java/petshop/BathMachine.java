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


}
