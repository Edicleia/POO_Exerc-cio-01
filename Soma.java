import javax.swing.JOptionPane;//pacote gráfico

public class Soma {
 
    public static void main(String[] args) {
       
        double n1, n2, resultado;
        //entrada de dados
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primero valor: "));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor: "));
        //processamento
        resultado = n1 + n2;
       
        JOptionPane.showMessageDialog(
            null,
            String.format(
                "%.2f + %.2f = %.2f\n",n1,n2,resultado));
    }
}
