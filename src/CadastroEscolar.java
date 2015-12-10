
import static java.awt.Color.blue;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.List;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class CadastroEscolar extends JFrame{

    public  JLabel nome;
    public JLabel sexo;
    public JLabel comentario,disciplinas;
    public JTextField tnome ;
    public TextArea tcomentario;
    public JRadioButton masculino , feminino;
    public RadioButtonHandler handler;
    public ButtonGroup grupo;
    public List lista;
    public JButton botao;
    public JPanel painel;
    Aluno aluno = new Aluno();
  String selecionarSexo;  
    
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
     disciplinas = new JLabel("Disciplinas");
      
     tnome= new JTextField(50);//largura da caixa de texto
      tcomentario = new TextArea(); // largura da caixa de comentario
     
     //butons para marcar se e masculino ou feminino.
    masculino= new JRadioButton("Masculino",false);
    feminino= new JRadioButton("Feminino",false);
     handler = new RadioButtonHandler();
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
    
    masculino.addItemListener(handler);
    feminino.addItemListener(handler);
    
    botao.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
           Cadastro();
           DesejaCadastrar cad= new DesejaCadastrar(aluno);
        }
 
    });
    
    setMinimumSize(new Dimension(1000,400));
     setVisible(true);
 
 }
 
     public void Cadastro(){
     this.aluno.setNome(tnome.getText());
     this.aluno.setSexo(selecionarSexo);
     this.aluno.setDisciplinas(lista.getSelectedItems());
     this.aluno.setComentario(tcomentario.getText());
     }
     
     public void DesejaCadastrar(){
     
     DesejaCadastrar confirma = new DesejaCadastrar(aluno);
     
     }
   
    private  class RadioButtonHandler implements ItemListener {

      @Override
      public void itemStateChanged(ItemEvent e){
      if(masculino.isSelected()){
      selecionarSexo="masculino";
      }
      if(feminino.isSelected()){
      selecionarSexo="feminino";
      }
      }
        
    }
 
    public static void main(String[] args) {
        new CadastroEscolar();
    }

}
