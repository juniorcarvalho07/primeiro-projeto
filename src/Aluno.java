/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Júnior Carvalho
 */
public class Aluno {

    public String nome, sexo,comentario;
   public String[]disciplinas;
   
   public Aluno(String nome, String sexo, String []disciplinas, String comentario){
   
   this.nome=nome;
   this.sexo=sexo;
   this.disciplinas=disciplinas;
   this.comentario=comentario;
   
   }
   public Aluno(){}
   
   public String getNome(){
       return nome;
   }
   public String getSexo(){
     return sexo;
   }
   public String[]getDisciplinas(){
   return disciplinas;
   }
   public String getComentario(){
   return comentario;
   }
   public void setNome(String nome){
       this.nome=nome;
   }
   public void setSexo(String sexo){
    this.sexo=sexo;   
   }
   public void setDisciplinas(String[] disciplinas){
       
       this.disciplinas=disciplinas;
       
   }
   public void setComentario(String comentario){
   this.comentario=comentario;
   }   
   
}
