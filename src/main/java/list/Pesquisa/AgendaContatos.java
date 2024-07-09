package main.java.list.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato>contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));

    }

    public void exibirContato(){
        System.out.println(contatoSet);

    }


    public Set<Contato> pesquisarContatos(String nome){
        Set<Contato>contatosPorNome= new HashSet<>();
        for(Contato c : contatoSet){
            if(c.getNome().startsWith(nome)){
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }
    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for(Contato c: contatoSet){
            if (c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtualizado =c;
                break;
            }
        }
        return contatoAtualizado;
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

       System.out.println(agendacontatos.pesquisarContatos( "Neia"));

       System.out.println("Contato Atualizado : "+agendacontatos.atualizarNumeroContato("Neia",987654312));

       agendacontatos.exibirContato();
    }
}
