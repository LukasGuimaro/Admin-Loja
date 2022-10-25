package projetoloja;

import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class Pedido {
    private float id;
    private String data;
    private float valorTotal;
    private Cliente cliente;
    private ArrayList<ItemPedido> itens;

    public Pedido(float id, String data, Cliente cliente) {
        this.id = id;
        this.data = data;
        this.cliente = cliente;
    }
    
    public float getId() {
        return id;
    }

    public void setId(float id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }
    
    public void adicionaItem(ItemPedido ip){
        itens.add(ip);
    }
}
