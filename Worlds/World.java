package Worlds;

import Characters.Uncle;

import java.util.Objects;
import java.util.Random;

public class World {
    private double[][] ground;
    private double[][] sky;

    public World (double[][] ground, double[][] sky){
        this.ground = ground;
        this.sky = sky;
    }

    public void addCharacter(Character character, int i, int j){
        Random random = new Random();
        i= random.nextInt();
        j= random.nextInt();
        ground[i][j]=1;
    }

    public void moveCharacter(Character character, int i, int j, int i1, int j1){
        Random random = new Random();
        i1= random.nextInt();
        j1= random.nextInt();
        ground[i+i1][j+j1]=1;
        ground[i][j]=0;
    }
}
