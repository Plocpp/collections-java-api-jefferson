package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;
public class CarrinhoDeCompras {
    private List<Item> itemList;

    public CarrinhoDeCompras(){
        this.itemList =  new ArrayList<>();
    }
    public void adiconarItem(String nome, double preco, int quantidade){
        Item item = new Item(nome, preco, quantidade);
        this.itemList.add(item);
    }

    public void removerItem(String nome){
        List <Item> itemParaRemover = new ArrayList<>();
        if(!itemList.isEmpty()){
            for(Item i : itemList){
                if(i.getNome().equalsIgnoreCase(nome)){
                    itemParaRemover.add(i);
                }
            }
            itemList.removeAll(itemParaRemover);
        }else{
            System.out.println("Lista está vazia");
        }
    }

    public double calcularValorTotal(){
        double valorTotal = 0d;
        if(!itemList.isEmpty()){
            for(Item item : itemList){
                double valorItem =item.getPreco() * item.getQuant();
                valorTotal += valorItem;
             }
            return valorTotal;
        }else{
            throw new RuntimeException("A lista está vazia");
        }
    }
    public void exebirItens(){
        if(!itemList.isEmpty()){
            System.out.println(this.itemList);
        }else {
            System.out.println("A lista está vazia");
        }
    }

    public String toString(){
        return "!!!!!!!Carrinho De Compras!!!!!!!{"+
                "Item ="+itemList+
                "}";
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adiconarItem("lapis",2d,3);
        carrinhoDeCompras.adiconarItem("caneta",3d,2);
        carrinhoDeCompras.adiconarItem("caderno",35d,1);
        carrinhoDeCompras.adiconarItem("Borracha",2d,2);

        carrinhoDeCompras.exebirItens();

        carrinhoDeCompras.removerItem("lapis");

        carrinhoDeCompras.exebirItens();

        System.out.println("O valor total da compra é de "+carrinhoDeCompras.calcularValorTotal());

    }
}
