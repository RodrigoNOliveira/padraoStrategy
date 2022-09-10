package br.edu.iftm.strategy.classes;

import br.edu.iftm.strategy.interfaces.ComportamentoVoo;

public class FlyComAsas implements ComportamentoVoo {

    @Override
    public void fly() {
        System.out.println("Eu estou voando!");
        
    }
    
}
