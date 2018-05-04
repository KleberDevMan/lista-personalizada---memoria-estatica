
import facto.lang.Pilha;

/**
 * Classe main (laboratorio de testes)
 */

/**
 *
 * @author FC20163243
 */
public class Laboratorio {

    public Laboratorio() {
    }
    
    public static void main(String[] args) {
        Pilha p = new Pilha();
        
        p.empilhar("a");
        p.empilhar("b");
        p.empilhar("c");
        
        p.desempilhar();
        
        p.status();
        
        
    }
}
