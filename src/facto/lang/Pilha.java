/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facto.lang;

import static javafx.scene.input.KeyCode.T;

/**
 *
 * @author Kleber Junio
 */
public class Pilha <T> extends MeuArrayList {
    
    public void empilhar(T elemeto){
        if(elemeto == null){
            throw new IllegalArgumentException("O elemento não pode ser nulo!");
        }
        this.adicionar(elemeto);
    }
    
    public T desempilhar(){
        return (T) this.remover(this.tamanho() - 1);
    }
    public void status(){
        if(this.tamanho() == 0){
            System.out.println("nenhum elemento");
        }else{
            for (int posicao = 0; posicao < this.tamanho(); posicao++) {
                System.out.println(buscarUmElementoNaLista(posicao));
            }
        }
    }
    @Override
    public int tamanho(){
        return this.tamanho();
    }
}
