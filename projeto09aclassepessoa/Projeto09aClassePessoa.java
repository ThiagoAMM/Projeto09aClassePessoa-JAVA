/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto09aclassepessoa;

/**
 *
 * @author USER
 */
public class Projeto09aClassePessoa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int N = 4;
        
        //Instanciando 4 objetos.
        Pessoa[] p = new Pessoa[N];
        p[0] = new Pessoa(1,"Thiago", "14 99111-1111", "thiago@01.com", "R. UM - Nº1");
        p[1] = new Pessoa(2,"Gabriela", "14 99222-2222", "gabi@02.com", "R. DOIS - Nº2");
        p[2] = new Pessoa(3,"Marlon", "14 99333-3333", "marlon@03.com", "R. TRES - Nº3");
        p[3] = new Pessoa(4,"Matheus", "14 99444-4444", "matheus@04.com", "R. QUATRO - Nº4");
         
        //Exibinto (sout) os dados dos atributos dos objetos.
         System.out.println("---> DADOS PESSOAS");
         
        for(int i = 0 ; i < N; i++){
            System.out.println("\nDados "+ (i+1) +"ª pessoa:");
            System.out.println("Código  : " + p[i].getCodPessoa());
            System.out.println("Nome    : " + p[i].getNome());
            System.out.println("Celular : " + p[i].getCelular());
            System.out.println("Email   : " + p[i].getEmail());
            System.out.println("Endereço: " + p[i].getEndereco());
        }
        
    }
    
}
