import javax.swing.JOptionPane;

public class Ex9 {
    public static void main(String[] args) {
       

        double salario = 0, percentual = 0, reajuste = 0;

        salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Salário atual do funcionário:"));
        percentual = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual o percentual de reajuste:"));
        reajuste = salario + (salario * percentual/100);
        JOptionPane.showMessageDialog(null, String.format("O salário com reajuste de %.2f%% será de:\n R$%.2f",percentual, reajuste ));
    }
}
