package classes;

import java.util.ArrayList;
import java.util.List;

public class CartaoDeCredito {
    private double limite;
    private double saldo;

    List<Compra> compras;

    public CartaoDeCredito(double limite){
        this.limite = limite;
        this.saldo = limite;
        this.compras = new ArrayList<>();
    }

    public boolean lancarCompra(double valor){
        if (valor <= this.saldo){
            saldo -= valor;
            return true;
        } else{
            return false;
        }
    }

    public double getSaldo(){
        return saldo;
}

    public List<Compra> getCompras() {
        return compras;
    }
}
