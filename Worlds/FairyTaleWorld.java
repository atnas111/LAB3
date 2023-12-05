package Worlds;

import Characters.Uncle;


public class FairyTaleWorld extends World{
    public FairyTaleWorld (double[][] ground, double[][] sky){
        super(ground, sky);
    }

    public void beOpen(){
        System.out.println("ему открылся замечательный мир сказок. ");
    }

}
