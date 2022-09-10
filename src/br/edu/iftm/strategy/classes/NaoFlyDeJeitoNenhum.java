package br.edu.iftm.strategy.classes;


import br.edu.iftm.strategy.interfaces.ComportamentoVoo;

public class NaoFlyDeJeitoNenhum implements ComportamentoVoo{

    @Override
    public void fly() {
        System.out.println("Eu não posso voaaaaaarrrrrr ... tuum ploft");
        
    }
    
}
