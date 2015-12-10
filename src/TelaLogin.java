


import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

public class TelaLogin extends JFrame {

    Label email=  new Label("E-mail"),
            senha= new Label("Senha");
    TextField logo = new TextField(25);
    JPasswordField logo1 = new JPasswordField(20);
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
  setSize(300,400);
  setVisible(true);
  botao.addActionListener(new ActionListener(){

  public void actionPerformed(ActionEvent e){
  analisar();} });
}

   public void analisar(){
   String loginUsuario = "junior_sousa95@hotmail.com";
   String senhaUsuario = "12345";
   String senhalogin = new String(logo1.getPassword());
   if(logo.getText().contains(loginUsuario)&& senhalogin.contains(senhaUsuario)){
     CadastroEscolar cadastroAluno = new CadastroEscolar();
    this.setVisible(false);
   }else{
       JOptionPane.showMessageDialog(null,"Login ou Senha incorreto");
       JOptionPane.showMessageDialog(null,"Ensira os dados corretamente");
   }
   }
    public static void main(String[] args) {
          new TelaLogin();
         
          
          
    }
    
}
