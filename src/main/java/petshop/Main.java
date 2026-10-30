package petshop;

import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner (System.in);

    private static final BathMachine bathMachine = new BathMachine();

    public static void main(String[] args) {
        int option;

        do {
            System.out.println("""                
                   Escolha a opção desejada:
                
                   1 - Dar banho no pet
                   2 - Abastecer com água
                   3 - Abastecer com shampoo
                   4 - Verificar nivel de água
                   5 - Verificar nivel de shampoo
                   6 - Verificar se tem pet no banho
                   7 - Colocar pet na maquina
                   8 - Retirar pet da máquina
                   9 - Limpar máquina
                   0 - Sair
                   """);

            option = scanner.nextInt();

            switch (option) {
                case 1 -> showerPet();

                case 2 -> setWater();

                case 3 -> setShampoo();

                case 4 -> verifyWater();

                case 5 -> verifyShampoo();

                case 6 -> checkIfHasPet();

                case 7 -> setPetMachine();

                case 8 -> bathMachine.removePet();

                case 9 -> bathMachine.washMachine();

                case 0 -> {
                    System.out.println("Encerrando...");
                    System.exit(0);
                }

                default -> System.out.println("Opção inválida");
            }

        } while (true);

    }

    private static void showerPet(){
        int amountWater = bathMachine.getWater();
        int amountShampoo = bathMachine.getShampoo();

        if (amountWater < 10 && amountShampoo < 2) {
            System.out.println("Água e shampoo insuficientes.");
        } else if (amountWater < 10) {
            System.out.println("Água insuficiente.");
        } else if (amountShampoo < 2) {
            System.out.println("Shampoo insuficiente.");
        }

        bathMachine.batheAPet();
    }

    private static void setWater(){
        System.out.println("Água adicionada ao recipiente.");
        bathMachine.addWater();
    }

    private static void setShampoo(){
        System.out.println("Shampoo adicionado ao recipiente.");
        bathMachine.addShampoo();
    }

    private static void verifyWater() {
        int amount = bathMachine.getWater();

        System.out.println("Nível de Água: " + amount + " litros");
    }

    private static void verifyShampoo() {
        int amount = bathMachine.getShampoo();

        System.out.println("Nível de Shampoo: " + amount + " litros");
    }

    private static void checkIfHasPet() {
        boolean hasPet = bathMachine.hasPet();
        System.out.println(hasPet ? "O pet está na máquina." : "Não há pet na máquina");
    }

    public static void setPetMachine(){
        String name = "";
        while (name == null || name.isEmpty()){
            System.out.println("informe o nome do pet:");
            name = scanner.nextLine();
        }

        Pet pet = new Pet(name);
        bathMachine.setPet(pet);
        System.out.println("O pet " + pet.getName() + " foi colocado na máquina.");
    }

}

