public class ContaTerminal  {
    public static void main(String[] args){

        int numeroDaConta;
        String agencia,nomeCliente;
        double saldoParaSaque;

        System.out.println("Por favor, digite a agência ! ");
        agencia = args[0];
        System.out.println("Por favor, digite o número da conta ! ");
        numeroDaConta = Integer.valueOf(args[1]);
        System.out.println("Por favor, digite o seu nome ! ");
        nomeCliente = args [2];
        System.out.print("Por favor, digite o saldo que deseja sacar ! ");
        saldoParaSaque = Double.valueOf(args[3]);

        System.out.println("Olá "
                + nomeCliente
                + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia
                + ", conta "
                + numeroDaConta
                + " e seu saldo "
                + saldoParaSaque
                + " já está disponível para saque.");



    }
}
