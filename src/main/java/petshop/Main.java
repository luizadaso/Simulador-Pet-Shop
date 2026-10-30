package petshop;

import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner (System.in);

    private static final BathMachine bathMachine = new BathMachine();

    public static void main(String[] args) {
        int option = -1;

        String menu = """                
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
                   """;
        option = scanner.nextInt();

        do {
            System.out.println("Hora do banho!");
            System.out.println(menu);

        } while (option != 0){

            switch (option) {
                case 1 -> {
                // verificar se o pet está na maquina, se tem agua e shampoo, se o pet sairá limpo.
                    bathMachine.setPet();
                    bathMachine.batheAPet();

                }

                case 2 -> {
                    bathMachine.addWater();
                }

                case 3 -> {
                    bathMachine.addShampoo();
                }

                case 4 -> {
                    verifyShampoo();
                }

                case 5 -> {
                    int amount = bathMachine.getShampoo();

                    System.out.println("Nível de Shampoo: " + amount " litros");
                }

                case 6 -> {
                    checkIfHasPet();
                }

                case 7 -> {
                    setPetMachine();
                }

                case 8 -> {
                    bathMachine.removePet();
                }

                case 9 -> {
                    bathMachine.washMachine();
                }

                case 0 -> {

                }
            }
        }

    }

    private static void verifyShampoo() {
        int amount = bathMachine.getWater();

        System.out.println("Nível de Água: " + amount + " litros");
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

