import java.util.Scanner;
public class ExemploWhile{
    public static void main(String[] args) {
        //calcular média de notas de uma turma de 10 alunos
        Scanner leitor = new Scanner (System.in);
        //repetição controlada por contador
        int contador = 1;
        while (++contador <= 2){
            System.out.println("Digite a primeira nota");
            double nota1 = leitor.nextDouble();
            System.out.println("Digite a segunda nota");
            double nota2 = leitor.nextDouble();
            System.out.printf("Média: %.2f\n", (nota1 + nota2) / 2);
            //contador = contador + 1;
            //contador += 1; //operador composto
            //contador++; // operador de pós incremento
            //++contador; // operador de pré incremento
        }
        leitor.close();
    }   
}