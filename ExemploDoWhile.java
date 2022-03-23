import javax.swing.JOptionPane;
public class ExemploDoWhile {
    public static void main(String[] args) {
        //usuário deve digitar uma opção entre 1, 2 ou 3
        int op;
        /*
            +=
            -=
            *=
            /=
            %=
        */ 
        do {
            op = Integer.parseInt(
                JOptionPane.showInputDialog("Digite a sua opcao")
            );
            if (op != 1 && op != 2 && op != 3){
               JOptionPane.showMessageDialog(null, "Opcao invalida");     
            }
        } while (op != 1 && op != 2 && op != 3);
        JOptionPane.showMessageDialog(null, "Opcao valida!");
    }  
}
