package projetoloja;

/**
 *
 * @author aluno
 */
public class ItemPedido {
    private float precoUnitario;
    private int quantidade;
    private float precoTotal;
    private Produto produto;
    private Pedido pedido;

    public ItemPedido(int quantidade, Produto produto) {
        this.quantidade = quantidade;
        this.produto = produto;
        this.precoUnitario = produto.getPreco();
        this.precoTotal = this.precoUnitario * this.quantidade;
    }

    public float getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(float precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
