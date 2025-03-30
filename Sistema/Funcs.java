import java.time.LocalDate;
import java.util.Scanner;
import java.util.*;

public class Funcs {
    
    public static Emprestimos LerLivro() {
        Scanner scanner = new Scanner(System.in);
        Principal.limparTela();
        System.out.println("Digite o nome do livro: ");
        String nome = scanner.nextLine();
        System.out.println("Digite o autor do livro: ");
        String autor = scanner.nextLine();
        System.out.println("Digite a editora do livro: ");
        String editora = scanner.nextLine();
        System.out.println("Digite o ano de lançamento do livro: ");
        int ano = scanner.nextInt();
        Livro a = new Livro(nome, autor, editora, ano);
        System.out.println("O Livro foi pego hoje? ");
        scanner.nextLine();
        String test = scanner.next();
        test =test.toLowerCase();
        LocalDate data;
        LocalDate dataDev;
        if(test.equals("não") == true|| test.equals("nao") == true){
            System.out.println("Quando o Livro foi pego (AAAA-MM-DD) ? ");
            String da = scanner.next();
            data = LocalDate.parse(da);
        }else{
            data = LocalDate.now();
        }
        System.out.println("Em quantos dias o Livro deverá ser devolvido? ");
        int da2 = scanner.nextInt();
        dataDev = data.plusDays(da2);
        System.out.println("Qual o email para contato: ");
        scanner.nextLine();
        String emailString = scanner.nextLine();
        Emprestimos b = new Emprestimos(data, dataDev, null, emailString, a);
        return b;
    }

    public static Emprestimos LerUtensilios(){
        Scanner scanner = new Scanner(System.in);
        Principal.limparTela();
        System.out.println("Digite o nome do Utensilio: ");
        String nome = scanner.nextLine();
        System.out.println("Digite um descrição do Utensilio: ");
        String descricao = scanner.nextLine();
        System.out.println("Digite o material do Utensilio: ");
        String material = scanner.nextLine();
        Utensilios a = new Utensilios(nome, descricao, material);
        System.out.println("O Utensilio foi pego hoje? ");
        String test = scanner.next();
        test =test.toLowerCase();
        LocalDate data;
        LocalDate dataDev;
        if(test.equals("não") == true|| test.equals("nao") == true){
            System.out.println("Quando o Utensilio foi pego (AAAA-MM-DD) ? ");
            String da = scanner.next();
            data = LocalDate.parse(da);
        }else{
            data = LocalDate.now();
        }
        System.out.println("Em quantos dias o Utensilio deverá ser devolvido? ");
        int da2 = scanner.nextInt();
        dataDev = data.plusDays(da2);
        System.out.println("Qual o email para contato: ");
        scanner.nextLine();
        String emailString = scanner.nextLine();
        Emprestimos b = new Emprestimos(data, dataDev, null, emailString, a);
        return b;
    }


    public static void removeItem(List<Emprestimos> emprestados, String nome){
        Iterator<Emprestimos> iterator = emprestados.iterator();
        while (iterator.hasNext()) {
            Emprestimos i = iterator.next();
            if (i.verificarIgual(nome)) {
                iterator.remove();
            }
        }
    }
}
