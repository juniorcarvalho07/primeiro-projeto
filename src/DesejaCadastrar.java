
import java.awt.Dimension;
import java.awt.FlowLayout;
import static java.awt.FlowLayout.CENTER;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class DesejaCadastrar extends JFrame {

 public JLabel frase; 
public JButton confirmar;
public JButton cancelar;
public JPanel painel;
public Aluno aluno;

public DesejaCadastrar(Aluno aluno){

    super("CADASTRO");
    setLayout(null);
    setResizable(false);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    this.aluno= aluno;
    
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

confirmar.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e){
        mostrarDados();
    }
});
cancelar.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e){
        terminar();
    }
});
}

     public void mostrarDados(){
     JOptionPane.showMessageDialog(null,"Nome: "+aluno.getNome()+"\n Sexo: "+aluno.getSexo()+"\n Disciplinas: "
             +Arrays.toString(aluno.getDisciplinas())+"\n Comentario: "+aluno.getComentario());
     this.setVisible(false);
     }
     public void terminar(){
     this.setVisible(false);
     }
   
}
