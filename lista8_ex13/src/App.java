public class App {
    public static void main(String[] args) throws Exception {
        Funcionario funcionario1 = new Funcionario("Fatima",4500);

        System.out.printf("O nome do novo funcionario é %s",funcionario1.mostrarNome());
        System.out.println("");
        System.out.printf("O seu salário vai ser no valor de R$ %2.2f",funcionario1.mostrarSalario());
        funcionario1.aumentarSalario(10);
        System.out.println("");
        System.out.printf("Depois do aumento o seu salário vai ser no valor de R$ %2.2f",funcionario1.mostrarSalario());

    }
}
