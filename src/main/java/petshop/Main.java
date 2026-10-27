package petshop;

import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner (System.in);

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

        }

    }

    public void setPetMachine(){
        System.out.println("informe o nome do pet:");
        String name = scanner.nextLine();
    }
}
