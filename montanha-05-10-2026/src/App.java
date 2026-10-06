import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);

        String senha = "";
        String resultado = "";
        
       do {
        System.out.print("Escolha sua Senha: ");
        senha = leitor.nextLine();

        resultado = avaliarSenha(senha);

        
        System.out.println(resultado);

       }   while (!resultado.equals("A senha passou pelos requisitos!"

       ));
    
        leitor.close();
    }

    public static String avaliarSenha(String senha) {
        //  Se colocar o println dentro do avaliarSenha,
        //  estaria fazendo duas coisas ao mesmo tempo
        //  avaliando e exibindo
           if (senha.length() < 8) {
        return "DICA: A senha deve ter no mínimo 8 caracteres.";
    }

    boolean temNumero = false;
        
        //char avalia caracteria por caracteria do (senha)
    for (int i = 0; i < senha.length(); i++) {

        char caractere = senha.charAt(i);

        if (Character.isDigit(caractere)) {
            temNumero = true;
        }
    }
            if (!temNumero) {
                return "DICA: A Senha deve haver pelo menos um número!";
                
            }
            
            //"[]" mais de 1 opçao de string
            // ".length" avalia as 3 opções, uma por uma.

            String[] senhasObvias = {
                "12345678",
                "senha123",
                "admin123"
            };
                // é = a 0 para ler 1, 2, 3 (i++)
            for (int i = 0; i < senhasObvias.length; i++) {

                if (senha.equals(senhasObvias[i])) {
                    return "DICA: Sua senha não pode ser comum ou óbvia!";
                }

            }

            boolean letraMaiuscula = false;
            for (int i = 0; i < senha.length();i++){
                char caractere = senha.charAt(i);
            
             if (Character.isUpperCase(caractere)){
                
                    letraMaiuscula = true;
                }
            }
                if (!letraMaiuscula) {
                return "DICA: sua senha deve haver letra Maiuscula!";
               }
            
                // isUpperCase = é maiúscula?
                // isDigit = é número?
                // .equals() = é igual ao conteúdo?


                return "A senha passou pelos requisitos!";
            

    }

}