
import static java.awt.Color.blue;
import static java.awt.Color.orange;
import static java.awt.Color.pink;
import static java.awt.Color.red;
import static java.awt.Color.white;
import static java.awt.Color.yellow;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.List;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.plaf.synth.ColorType;


public class CadastroEscolar extends JFrame{

    public  JLabel nome;
    public JLabel sexo;
    public JLabel comentario;
    public JTextField tnome , tcomentario;
    public JRadioButton masculino , feminino;
    public ButtonGroup grupo;
    public List lista;
    public JButton botao;
    public JPanel painel;
    
 public CadastroEscolar(){ 
     //layout
    super("CADASTRO DE MATRICULAS");
    setLayout(null);
    setResizable(false);
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   
     //o texto que vai aparece para auxiliar o usuario
     nome = new JLabel("NOME");
     sexo = new JLabel("SEXO");
     comentario = new JLabel("COMENTARIO");
     
     tnome= new JTextField(50);//largura da caixa de texto
     tcomentario = new JTextField(40);// largura da caixa de comentario
     
     //butons para marcar se e masculino ou feminino.
    masculino= new JRadioButton("Masculino",false);
    feminino= new JRadioButton("Feminino",false);
     
    //LISTA DE MATERIAS 
    lista = new List (5,true);
     
    lista.add("Matematica");
    lista.add("Portugues");
    lista.add("Historia");
    lista.add("Geografia");
    lista.add("Algoritmos I");
    
    botao = new JButton("CONFIRMAR");
    painel= new JPanel(new FlowLayout());
    painel.setBounds(20,20,900,400);
    painel.setBackground(blue);
    painel.add(nome);
    painel.add(tnome);
    painel.add(sexo);
    painel.add(masculino);
    painel.add(feminino);
    painel.add(lista);
    painel.add(comentario);
    painel.add(tcomentario);
    painel.add(botao);
    add(painel);
    grupo = new ButtonGroup();
    grupo.add(masculino);
    grupo.add(feminino);
    
    setMinimumSize(new Dimension(1000,400));
     setVisible(true);
 }

    public static void main(String[] args) {
        new CadastroEscolar();
    }
 
}
