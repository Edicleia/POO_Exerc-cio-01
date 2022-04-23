import javax.swing.JOptionPane;

public class CustoCarro {
    public static void main(String[] args) {
        
        double valorCarro, resultado, pDistribuidora = 28, pImpostos=45;
        
        valorCarro = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do carro:"));


        pDistribuidora = valorCarro + (valorCarro * pDistribuidora/100);
        pImpostos = valorCarro + (valorCarro * pImpostos/100);
        resultado = valorCarro + pDistribuidora + pImpostos;

        JOptionPane.showMessageDialog(null,
        String.format("O custará ao consumidor: R$%.2f", resultado));
    }
}
