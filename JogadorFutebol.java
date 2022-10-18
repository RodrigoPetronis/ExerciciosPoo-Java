/*
 10. Crie uma classe para representar um jogador de futebol, com os atributos:
a. nome;
b. posição;
c. data de nascimento;
d. nacionalidade;
e. altura;
f. peso;
Crie os métodos públicos necessários para getters e setters e também um método para imprimir todos os
dados do jogador.

Crie um método para calcula r a idade do jogador e outro método para mostrar quanto
tempo falta para o jogador se aposentar.
Para isso, considere que os jogadores da posição de 
defesa se aposentam em média aos 40 anos, 
os jogadores de meio-campo aos 38 e 
os atacantes aos 35.
*/
package com.mycompany.exerciciopoo10;


public class JogadorFutebol {
    private String nome;
    private String posicao;
    private int AnoNascimento;
    private String nacionalidade;
    private float altura;
    private float peso;
    private int AnoAtual = 2022;
    

    
  public JogadorFutebol(String nome, String posicao, int AnoNascimento, String nacionalidade, float altura, float peso) {
        this.setPosicao(posicao);
        this.AnoNascimento = AnoNascimento;
        this.nacionalidade = nacionalidade;
        this.altura = altura;
        this.peso = peso;
    }

  
    public String Imprimir(){
        return ("Posição "+getPosicao()+"\n Data de Nascimento: " + getAnoNascimento()
                +"\n Nacionalidade: "+getNacionalidade()+"\n Altura: "+getAltura()+
                "\n Peso: "+getPeso()+" \n Idade: "+idade());
    }
    
    public int idade(){
        int idade = getAnoAtual() - getAnoNascimento();
        return idade;
    }
    
    public int Aposentar(){
       
       int faltam = 0;
        if (getPosicao().toLowerCase()== "defesa" ){
            faltam = 40 - idade();
                       
        }else if (getPosicao().toLowerCase() == "meio campo"){
            faltam = 38 - idade();
            
        }else if (getPosicao().toLowerCase() == "atacante"){
            faltam = 35 - idade();
            
        } else{
            
        }return faltam;
    }

   /* public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }*/

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
   
    
    public int getAnoAtual() {
        return AnoAtual;
    }

    public void setAnoAtual(int dataAtual) {
        this.AnoAtual = AnoAtual;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao.toLowerCase();
    }

    public int getAnoNascimento() {
        return AnoNascimento;
    }

    public void setAnoNascimento(int AnoNascimento) {
        this.AnoNascimento = AnoNascimento;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
       
}
