package br.edu.iftm.strategy;

import br.edu.iftm.strategy.classes.PatoBorracha;
import br.edu.iftm.strategy.classes.PatoCabecaVermelha;
import br.edu.iftm.strategy.classes.PatoMadeira;
import br.edu.iftm.strategy.classes.PatoSelvagem;

public class Principal {
    public static void main(String[] args) throws Exception {

        PatoSelvagem selvagem = new PatoSelvagem();
        PatoCabecaVermelha vermelho = new PatoCabecaVermelha();
        PatoBorracha borracha = new PatoBorracha();
        PatoMadeira madeira = new PatoMadeira();

        selvagem.exibir();
        selvagem.performaceFly();
        selvagem.performaceQuack();
        selvagem.nadar();
        System.out.println();
        System.out.println();

        vermelho.exibir();
        vermelho.performaceFly();
        vermelho.performaceQuack();
        vermelho.nadar();
        System.out.println();
        System.out.println();

        borracha.exibir();
        borracha.performaceFly();
        borracha.performaceQuack();
        borracha.nadar();
        System.out.println();
        System.out.println();

        madeira.exibir();
        madeira.performaceFly();
        madeira.performaceQuack();
        madeira.nadar();
        System.out.println();
        System.out.println();

    }
}
