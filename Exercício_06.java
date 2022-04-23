import javax.swing.JOptionPane;

public class IdadeEmDias {
    public static void main(String[] args) {
       
        int idadeAnos = 0, idadeDias = 0;

        idadeAnos = Integer.parseInt(JOptionPane.showInputDialog(
            null, "Quantos anos você tem?"));

        idadeDias = idadeAnos * 365;
        JOptionPane.showMessageDialog(null, String.format("Você viveu %d dias.", idadeDias));
    }
}
