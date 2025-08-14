package com.mycompany.cadastroclientes;
import java.util.InputMismatchException; //Import do tratamento Error
import java.util.Scanner; // Import classe Scanner

public class CadastroClientes {
    public static void main(String[] args){   
        
        //bib     Variavel  Novo Scanner/Oque for digitado
        Scanner scanner = new Scanner(System.in);
        

        
        
        
    while (true) {
        
        System.out.print("Write your name: ");
        String name = scanner.nextLine();
        
        if (name.matches(".*\\d.*")) {
            System.out.print("Name cannot contain numbers.");
            continue;
        }
        try {
            System.out.print("How old are you: "); //Mensagem de Print
            int age = scanner.nextInt();//Nome Var  Ler o numero Digitado
            System.out.println("Your name is "+ name + " and "+ "you have "+ age +" Years.");
            break;
        }  
        catch(InputMismatchException e){
            System.out.println("You need write a number for age.");
            scanner.nextLine();
        }
        catch(Exception e) {
            System.out.println("Error");
        }
      
        }
    }
}
