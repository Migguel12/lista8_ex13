public class Funcionario {
    String nome;
    double salario;

    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public String mostrarNome(){
        return nome;
    }

    public double mostrarSalario(){
        return salario;
    }

    // Exercicio 14:
    public void aumentarSalario(double porcentagemDeAumento){
        porcentagemDeAumento = porcentagemDeAumento / 100;
        salario = salario + (porcentagemDeAumento * salario);
    }
}
