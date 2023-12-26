import java.util.Scanner;
import java.lang.String;

public class Main {
    public static void main(String[] args) {
    
    }
    public static void Cadstro(){

       try {
           Scanner Scan = new Scanner(System.in);
           System.out.println("Digite o seu nome!");
           String nome = Scan.nextLine();
           System.out.println("Digite a sua senha!");
           String Senha = Scan.nextLine();
           if(nome.equals("") || Senha.equals("") ){
               System.out.println("Por favo preencha os campos!!");
           }else{
               System.out.println("Parabens!! Você foi registrado!!");
           }
       }catch (Exception e ){
           System.out.println("Ocorreu um erro!");
       }

    }
   public static void Excluir(){

   }

}