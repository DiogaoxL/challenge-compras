import classes.CartaoDeCredito;
import classes.Compra;

import java.util.*;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o limite do cartão");
        double limite = sc.nextDouble();
        CartaoDeCredito cartao = new CartaoDeCredito(limite);
        List<Compra> compras = new ArrayList<>();



        int sair = 1;
        while (sair != 0){
            System.out.println("Digite a descrição da compra: ");
            String descricao = sc.next();
            System.out.println("Digite o valor da compra: ");
            double valor = sc.nextDouble();

            if(cartao.lancarCompra(valor) ){
                compras.add(new Compra(descricao,valor));
                System.out.println("COMPRA REALIZADA COM SUCESSO!");

                if (cartao.getSaldo() == 0){
                    System.out.println("SALDO ZERADO! Encerrando o programa.");
                    break;
                }

                    System.out.println("Deseja continuar? [1] Continuar [0] sair ");
                    sair = sc.nextInt();


            } else{
                sair = 0;
                System.out.println("SALDO INSUFICIENTE!");
            }



        }
        System.out.println("------------------------------ ");
        System.out.println("COMPRAS FINALIZADAS");

        Collections.sort(cartao.getCompras());

        for (Compra c : compras){
            System.out.println(c);
        }

        System.out.println("------------------------------ ");

        System.out.println("Seu saldo é: " + cartao.getSaldo());














    }

}
