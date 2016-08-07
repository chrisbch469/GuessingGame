import java.util.Random;


public class Jar {

    //attributes for jar
    public int jarCapacity;
    public String jarItem;
    public int numberInJar;

    //random number
    Random random = new Random();



    public Jar(int capacity, String item){
        jarCapacity = capacity;
        jarItem = item;
        numberInJar = random.nextInt(((jarCapacity - 1) + 1) + 1);
    }


    //getters and setters
    public void setJarCapacity(int capacity){
        this.jarCapacity = capacity;
    }
    public int getJarCapacity(){
        return jarCapacity;
    }
    public void setJarItem(String item){
        this.jarItem = item;
    }
    public String getJarItem(){
        return jarItem;
    }
    public void setNumberInJar(int numInJar){
        this.numberInJar = numInJar;
    }
    public int getNumberInJar(){
        return numberInJar;
    }
    
}