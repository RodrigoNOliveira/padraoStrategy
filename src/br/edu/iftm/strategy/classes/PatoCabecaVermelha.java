package br.edu.iftm.strategy.classes;

public class PatoCabecaVermelha extends Pato {


    public PatoCabecaVermelha(){
        setComportamentoFly(new FlyComAsas());
        setComportamentoQuack(new Quack());
    }


    @Override
    public void exibir() {
        System.out.println("Eu sou o verdadeiro pato da cabeça vermelha");
        
    }

   
    
}
