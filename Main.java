import Activity.Actions;
import Activity.Impressions;
import Characters.*;
import Characters.Character;
import Enums.Day;
import Enums.Gender;
import Enums.HappinessLevels;
import Worlds.AncestorsWorld;
import Worlds.FairyTaleWorld;

public class Main {
    public static void main(String args[]) {
        Uncle uncle = new Uncle("Дядя Юлиус", Gender.MALE, 70, 185, HappinessLevels.DEFAULT.getHappinessLevel());
        Carlson carlson = new Carlson("Карлсон", Gender.MALE, 50, 140, 0);
        Witch witch = new Witch("ведьма", Gender.FEMALE, 62, 167, 0);
        Princess princess = new Princess("", Gender.FEMALE, 57, 160);
        double[][] n = new double[20][20];
        for(double i=0; i<20; i++){
            for(double j=0; j<20; j++){
                n[(int) i][(int) j]=0;
            }
        }
        FairyTaleWorld fairyTaleWorld = new FairyTaleWorld(n, n);
        AncestorsWorld ancestorsWorld = new AncestorsWorld(n, n);
        System.out.print(uncle.getName()+" "+Actions.THANKS.getDescription((Character) uncle)+carlson.getName()+"а, но он "+
                Actions.BETOO.getDescription((Character) uncle)+Impressions.HAPPINESS.getDescription()+", что "+
                Actions.DONTNEED.getDescription((Character) uncle)+" для "+Impressions.MOODUP.getDescription()+". ");
        uncle.beHappy(Day.TODAY);
        System.out.print("А кроме того, ");
        fairyTaleWorld.beOpen();
        System.out.print("Правда, "+Impressions.AFRAID.getDescription()+", когда "+Actions.SAW.getDescription((Character) uncle)+
                ", что ");
        witch.flyPastTheWindow(5);
        System.out.print("Главное, ");
        ancestorsWorld.beOpen();
        uncle.beStubborn();
        System.out.print(", и это "+Impressions.UNSPEAKABLY.getDescription()+Actions.DOHAPPY.getDescription((Character) uncle)+". "+
                Impressions.EXCITING.getDescription()+Impressions.FAIRYTALING.getDescription()+" "+Actions.GOAWAY.getDescription((Character) uncle)+". ");
        princess.beConquered(uncle);
        princess.beMarriaged(uncle);
    }
}