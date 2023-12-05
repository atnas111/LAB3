package Characters;

import Enums.Gender;

import java.util.Objects;

public class Princess extends Character{
    private String name;
    public Princess(String name, Gender gender, double weight, double height){
        super(name, gender, weight, height);
    }

    public void beMarriaged(Uncle uncle){
        if (uncle.getHappinessLevel()>=6){
            System.out.print("Принцесса вышла замуж за Дядю Юлиуса.");
        }
    }

    public void beConquered(Uncle uncle){
        if (uncle.getHappinessLevel()>=5){
            System.out.print("Дядя Юлиус завоевал сердце сказочной принцессы. ");
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public boolean equals(Object object){
        if (this == object){
            return true;
        }
        if (this.getClass()!=object.getClass()){
            return false;
        }
        Princess princess = (Princess) object;
        return Objects.equals(name, princess.name);
    }

    @Override
    public String toString() {
        return name;
    }
}
