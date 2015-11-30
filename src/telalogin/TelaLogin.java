
package telalogin;


import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class TelaLogin extends JFrame {

    Label email=  new Label("E-mail"),
            senha= new Label("Senha");
    TextField logo = new TextField(30),
            logo1 = new TextField(30);
    Button botao= new Button("LOGIN");
    Panel painel= new Panel( new FlowLayout());
    
    
    public TelaLogin(){
            
      painel.add(email);
      painel.add(logo);
      painel.add(senha);
      painel.add(logo1);
      painel.add(botao);
      add(painel);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  setSize(200,200);
  setVisible(true);
}

    public static void main(String[] args) {
          new TelaLogin();
         
    }
    
}
