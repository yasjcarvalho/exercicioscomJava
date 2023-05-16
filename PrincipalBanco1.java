/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package principalbanco1;  // Declaração do pacote principalbanco1

/**
 *
 * @author Yasmi
 */
public class PrincipalBanco1 { // Declaração da classe PrincipalBanco1


static public class ContaBancaria { // Declaração da classe ContaBancaria, que é uma classe interna estática da classe PrincipalBanco1
    private String numeroConta; // Declaração do atributo numeroConta do tipo String
    private String numeroAgencia; // Declaração do atributo numeroAgencia do tipo String
    private double saldo; // Declaração do atributo saldo do tipo double
    private Cliente correntista; // Declaração do atributo correntista do tipo Cliente

   public ContaBancaria(String numeroConta, String numeroAgencia, Cliente correntista) { // Declaração do construtor da classe ContaBancaria;
        this.numeroConta = numeroConta;
        this.numeroAgencia = numeroAgencia;
        this.correntista = correntista;
        this.saldo = 0.0;
   }

    public String getNumeroConta() { // Declaração do método getNumeroConta
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) { // Declaração do método setNumeroConta
        this.numeroConta = numeroConta;
    }

    public String getNumeroAgencia() { // Declaração do método getNumeroAgencia
        return numeroAgencia;
    }

    public void setNumeroAgencia(String numeroAgencia) { // Declaração do método setNumeroAgencia
        this.numeroAgencia = numeroAgencia;
    }

    public Cliente getCorrentista() { // Declaração do método getCorrentista
        return correntista;
    }

    public void setCorrentista(Cliente correntista) { // Declaração do método setCorrentista
        this.correntista = correntista;
    }

    public double getSaldo() { // Declaração do método getSaldo
        return saldo;
    }

    public void depositar(double valor) { // Declaração do método depositar
        saldo += valor;
    }

    public void sacar(double valor) { // Declaração do método sacar
        
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }
}



static public class Cliente { // Declaração da classe Cliente, que é uma classe interna estática da classe PrincipalBanco1
    private String nome; // Declaração do atributo nome do tipo String
    private String endereco; // Declaração do atributo endereco do tipo String
    private String telefone; // Declaração do atributo telefone do tipo String
    private String rg; // Declaração do atributo rg do tipo String
    private String cpf; // Declaração do atributo cpf do tipo String

    public Cliente(String nome, String endereco, String telefone, String rg, String cpf) { // Declaração do construtor da classe Cliente
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.rg = rg;
        this.cpf = cpf;
    }

    public String getNome() {  // Declaração do método getNome
        return nome;
    }

    public void setNome(String nome) { // Declaração do método setNome
        this.nome = nome;
    }

    public String getEndereco() { // Declaração do método getEndereco
        return endereco;
    }

    public void setEndereco(String endereco) { // Declaração do método setEndereco

        this.endereco = endereco;
    }

    public String getTelefone() { // Declaração do método getTelefone
        return telefone;
    }

    public void setTelefone(String telefone) { // Declaração do método setTelefone
        this.telefone = telefone;
    }

    public String getRg() { // Declaração do método getRg

        return rg;
    }

    public void setRg(String rg) { // Declaração do método setRg
        this.rg = rg;
    }

    public String getCpf() { // Declaração do método getCpf
        return cpf;
    }

    public void setCpf(String cpf) { // Declaração do método setCpf
        this.cpf = cpf;
    }

    public void imprimir() {  // Declaração do método imprimir
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("Telefone: " + telefone);
        System.out.println("RG: " + rg);
        System.out.println("CPF: " + cpf);
    }
}



//Neste exemplo, criamos duas classes: `ContaBancaria` e `Cliente`. A classe `ContaBancaria` possui atributos como o número da conta, número da agência e saldo, juntamente com o correntista associado, que é uma instância da classe `Cliente`. Os métodos `get` e `set` foram implementados para os atributos número da conta, número da agência e correntista.

//A classe `Cliente` contém os atributos nome, endereço, telefone, RG e CPF, juntamente com os respectivos métodos `get` e `set`. Além disso, foi adicionado o método `imprimir` para exibir todos os dados de um cliente.

//Na classe `PrincipalBanco`, no método `main`, são criados dois clientes (`cliente1` e `cliente2`) e três contas bancárias (`conta1`, `conta2` e `conta3`). Em seguida, são realizadas operações de depósito e saque nas contas bancárias. Por fim, é exibido o saldo de cada uma das contas criadas e os dados de cada cliente.

//Espero que isso ajude a entender como implementar essa aplicação em Java!

 
    
    
    public static void main(String[] args) { // Declaração do método principal (main)
        // TODO code application logic here
          Cliente cliente1 = new Cliente("João Silva", "Rua A, 123", "123456789", "12345678", "111.111.111-11"); // Criação de uma instância da classe Cliente (cliente1) e inicialização dos atributos
        Cliente cliente2 = new Cliente("Maria Santos", "Rua B, 456", "987654321", "87654321", "222.222.222-22");// Criação de uma instância da classe Cliente (cliente2) e inicialização dos atributos

        ContaBancaria conta1 = new ContaBancaria("123", "001", cliente1);  // Criação de uma instância da classe ContaBancaria (conta1) e inicialização dos atributos
        ContaBancaria conta2 = new ContaBancaria("456", "002", cliente2);  // Criação de uma instância da classe ContaBancaria (conta2) e inicialização dos atributos
        ContaBancaria conta3 = new ContaBancaria("789", "003", cliente1);  // Criação de uma instância da classe ContaBancaria (conta3) e inicialização dos atributos
    conta1.depositar(1000); // Chama o método depositar da conta1
    conta1.sacar(500); // Chama o método sacar da conta1

    conta2.depositar(2000); // Chama o método depositar da conta2
    conta2.sacar(100); // Chama o método sacar da conta2

    conta3.depositar(3000); // Chama o método depositar da conta3

    System.out.println("Saldo da conta 1: " + conta1.getSaldo()); // Imprime o saldo da conta1
    System.out.println("Saldo da conta 2: " + conta2.getSaldo()); // Imprime o saldo da conta2
    System.out.println("Saldo da conta 3: " + conta3.getSaldo()); // Imprime o saldo da conta3

    cliente1.imprimir(); // Chama o método imprimir do cliente1
    cliente2.imprimir(); // Chama o método imprimir do cliente2
    }
    
}


//é possível alterar atributos privados de uma classe?
