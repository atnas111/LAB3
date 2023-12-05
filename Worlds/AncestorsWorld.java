package Worlds;

import Characters.Uncle;

public class AncestorsWorld extends World{
    public AncestorsWorld (double[][] ground, double[][] sky){
        super(ground, sky);
    }

    public void beOpen(){
        System.out.println("он снова окунулся в мир своих предков");
    }
}
