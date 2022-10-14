package exerciciopoo1;

import java.util.Calendar;

public class Pessoa {

    private String nome;
    private int anoNascimento;
    private int anoAtual;
    private float altura;
    
    public int Idade(){
        Calendar data = Calendar.getInstance();
        anoAtual = data.get(Calendar.YEAR);
        return anoAtual - anoNascimento;
    }

    /*
    public Pessoa(String nome, int anoNascimento, int anoAtual, float altura) {
        this.nome = nome;
        this.anoNascimento = anoNascimento;
        this.anoAtual = anoAtual;
        this.altura = altura;
    }
*/
 
       public String dadosPessoa() {

        return "O Nome é " + nome + "\n O ano de nasciimento é "+ anoNascimento 
                +"\n A altura é "+ altura + "\n Idade é " + Idade();
    }

    public void setnome(String nome) {
        this.nome = nome;
    }

    public String getnome() {
        return nome;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

}
