
import java.awt.Dimension;
import java.awt.FlowLayout;
import static java.awt.FlowLayout.CENTER;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DesejaCadastrar extends JFrame {

 public JLabel frase; 
public JButton confirmar;
public JButton cancelar;
public JPanel painel;


public DesejaCadastrar(){

    super("CADASTRO");
    setLayout(null);
    setResizable(false);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    frase = new JLabel("Deseja realmente cadastrar esssas informações?");
    confirmar = new JButton("CONFIRMAR");
    cancelar= new JButton("CANCELAR");

    painel= new JPanel(new FlowLayout(CENTER));
    painel.setBounds(50,50,300,100);
    painel.add(frase);
    painel.add(confirmar);
    painel.add(cancelar);
    
     add(painel);

setMinimumSize(new Dimension(420,220));
setVisible(true);
}

    public static void main(String[] args) {
        
        new DesejaCadastrar();
        
    }
}
