package ProjetosAlura;

import java.util.ArrayList;
import java.util.List;

public class MainProduto {

    public static void main(String[] args) {

        List<Produto> listaDeProsutos =  new ArrayList<>();

        Produto produto = new Produto(20, "RedBulls", 2);
        Produto produto2 = new Produto(22, "Monster", 3);
        Produto produto3 = new Produto(40, "Vibe", 4);
        listaDeProsutos.add(produto);
        listaDeProsutos.add(produto2);
        listaDeProsutos.add(produto3);

        System.out.println(listaDeProsutos.size());
        System.out.println(listaDeProsutos.get(0).getNome());
        System.out.println(listaDeProsutos);

    }
}
