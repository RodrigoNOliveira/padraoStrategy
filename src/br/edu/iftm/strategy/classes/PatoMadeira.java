package br.edu.iftm.strategy.classes;

public class PatoMadeira extends Pato {


    public PatoMadeira(){
        setComportamentoFly(new NaoFlyDeJeitoNenhum());
        setComportamentoQuack(new DontQuack());
    }


    @Override
    public void exibir() {
        System.out.println("Eu sou o pato de madeira");
        
    }

    
    
}
