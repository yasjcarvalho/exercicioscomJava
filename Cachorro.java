/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cachorro;

/**
 *
 * @author Yasmi
 */
public class Cachorro {

    /**
     * Atributos da Classe Cachorro
     */
    
        private String nome;
        private int idade;
        private int compPelos;
        private String raca;
        private String corOlhos;
        private int peso;
        
    public String getNome() {
        return nome;
        // Métodos de acesso ao atributo Nome
    }
    
     public void setNome(String nome) {
        this.nome = nome;
              // Métodos de acesso ao atributo Idades
    }
     
    public int getIdade(){
        return idade;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
              // Métodos de acesso ao atributo Idade
    }
    
    public int getCompPelos(){;
        return compPelos;
    }
    
    public void setCompPelos (int compPelos){
        this.compPelos = compPelos;
    }
    
    public String getRaca(){
        return raca;   
    }
    
    public void setRaca(String raca){
        this.raca = raca;
    }
    
    public String getCorOlhos(){
        return corOlhos;   
    }
    
    public void setCorOlhos(String corOlhos){
        this.corOlhos = corOlhos;
    }
    
    public int getPeso(){
        return peso;   
    }
    
    public void setPeso(int peso){
        this.peso = peso;
    }
    
    
    //demais getters e setters para os outros atributos
    //Métodos da Classe Cachorro
    public void latir(){
        System.out.println("Au Au");
    }
    
    public void andar(){
        System.out.println("Andando...");
    }
    
    public void comer(){
        System.out.println("Comendo a ração");
    }

    public void imprimirInformacoes() {
    System.out.println("Nome: " + getNome());
    System.out.println("Idade: " + getIdade() + " anos");
    System.out.println("Comprimento dos pelos: " + getCompPelos() + " cm");
    System.out.println("Raça: " + getRaca());
    System.out.println("Cor dos olhos: " + getCorOlhos());
    System.out.println("Peso: " + getPeso() + " kg");
}


    public static void main(String[] args){
        //Cria um objeto da Classe Cachorro
        Cachorro bob = new Cachorro();
        bob.setNome("Bob");
        bob.setIdade(2);
        bob.setCompPelos(2);
        bob.setRaca("beagle");
        bob.setCorOlhos("pretos");
        bob.setPeso(5);
        
        bob.andar();
        bob.latir();
        bob.comer();
        
          bob.imprimirInformacoes(); 
         
 
    }
}
