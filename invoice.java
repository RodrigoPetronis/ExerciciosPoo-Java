/*
6. Crie uma classe chamada Invoice que possa ser utilizado por uma loja de suprimentos de informática para
representar uma fatura de um item vendido na loja. 
Uma fatura deve incluir as seguintes informações como atributos:

a. o número do item faturado,
b. a descrição do item,
c. a quantidade comprada do item e
d. o preço unitário do item.

Sua classe deve ter um construtor que inicialize os quatro atributos. 
Se a quantidade não for positiva, ela deve ser configurada como 0. 

Se o preço por item não for positivo ele deve ser configurado como 0.0.

Forneça os métodos getters e setters para cada variável de instância. Além disso, forneça um método
chamado getInvoiceAmount que calcula o valor da fatura (isso é, multiplica a quantidade pelo preço por
item) e depois retorna o valor como um double. 
Escreva um aplicativo de teste que demonstra as capacidades da classe Invoice.*/
package com.mycompany.exerciciopoo6;

public class invoice {

    private int numItem;
    private String Item;
    private int QntComprada;
    private float precoItem;

    public invoice(int numItem, String Item, int QntComprada, float precoItem){
        this.setnumItens(numItem);
        this.setItem(Item);
        this.setQntComprada(QntComprada);
        this.setPrecoItem(precoItem);
    }
    
    public double getInvoiceAmount(int QntComprada, float precoItem){
        return (QntComprada*precoItem);
    }

    public void setnumItens(int numItem) {
        this.numItem = numItem;
    }

    public int getnumItens() {
        return numItem;
    }

    public String getItem() {
        return Item;
    }

    public void setItem(String Item) {
        this.Item = Item;
    }

    public int getQntComprada() {
        return QntComprada;
    }

    public void setQntComprada(int QntComprada) {
        if (QntComprada > 0) {
            this.QntComprada = QntComprada;
        } else {
            this.QntComprada = 0;
        }
    }

    public float getPrecoItem() {
        return precoItem;
    }

    public void setPrecoItem(float precoItem) {
        if (precoItem > 0) {
            this.precoItem = precoItem;
        } else {
            this.precoItem = 0.0f;
        }

    }
}
