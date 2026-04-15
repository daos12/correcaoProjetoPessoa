package correcaoprojetopessoa;

public class Pessoa {
    //Atributos
    private String nome;
    private int idade;
    private String cpf;
    
    public void exibir(){
        System.out.println("Nome: "+getNome()+ 
                "- Idade: "+getIdade()+
                "- CPF: "+getCpf());
    }
    
    
    
    //Construtores
    public Pessoa() {
    }

    public Pessoa(String nome, int idade, String cpf) {
        this.nome = nome;
        setIdade(idade);
//        this.idade = idade;
        this.cpf = cpf;
    }
    
    //Métodos Acessores 

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(idade < 0){
            System.out.println("Idade invalida!");
        }else{
            this.nome = nome;
        }       
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    
    
    
    
}
