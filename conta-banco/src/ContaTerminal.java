import java.util.Scanner;
public class ContaTerminal {

    
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        //TODO: conhecer e importar a classe scanner;
        Scanner scanner = new Scanner(System.in);
        
        int numero;
        String agencia;
        String nome;
        Float saldo;

        System.out.println("Digite o nome do Cliente:");
        nome = scanner.next(); //TODO: Obter pela classe Scanner os valores digitada no terminal;
        
        //TODO: pedir ao usuário que digite a informação desejada;
        System.out.println("Digite o numero da sua conta:");
        numero = scanner.nextInt(); //TODO: Obter pela classe Scanner os valores digitads no terminal;
        
        System.out.println("Digite o numero da sua agencia:");
        agencia = scanner.next(); //TODO: Obter pela classe Scanner os valores digitads no terminal;

        System.out.println("Digite o valor a ser depositado:");
        saldo = scanner.nextFloat(); //TODO: Obter pela classe Scanner os valores digitads no terminal;
        System.out.println("Obrigado pelas informações!");

        //TODO: exibir a mensagem da conta criada
        System.out.println("Olá "+ nome +", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia +", conta "+ numero +" e seu saldo de " + saldo + " reais já está disponível para saque");
    }
}
