package main.java.Map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer >agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();

    }

    public void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome , telefone);
    }
    public void removerContato(String nome){
        if(agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }
    public void exibirContato(){
        System.out.println(agendaContatoMap+"\n");
    }
    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if(agendaContatoMap.isEmpty()){
            agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }



    public static void main(String[] args) {
        AgendaContatos agendacontatos = new AgendaContatos();

        agendacontatos.adicionarContato("jefferson jé", 123456);
        agendacontatos.adicionarContato("jefferson jé", 123456);
        agendacontatos.adicionarContato("jefferson jefin", 1234567);
        agendacontatos.adicionarContato("jefferson jéguin", 1234568);
        agendacontatos.adicionarContato("jefferson jéfso", 1234569);
        agendacontatos.adicionarContato("jefferson jafinha", 1234560);
        agendacontatos.adicionarContato("Neia",987654321);

        agendacontatos.exibirContato();
        agendacontatos.removerContato("Jé");
        agendacontatos.exibirContato();

    }
}

