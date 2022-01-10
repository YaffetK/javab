package se.yaffet;

public class Squirrel {
    private int age;
    private boolean isHungry;
    private int numOfConesInNest;
    private int weight;

    public Squirrel(int age,int numOfConesInNest,boolean isHungry,int weight){
        this.age = age;
        this.isHungry = isHungry;
        this.numOfConesInNest = numOfConesInNest;
        this.weight = weight;
        }

    

        public int eat(int numToEat) {
            int numOfConesEaten = 0;
            int numOfConesToEat = numToEat;  

            while (numOfConesToEat > 0 && numOfConesInNest > 0) {
                numOfConesEaten++;
                numOfConesToEat--;
                numOfConesInNest--;
            }


            if(numOfConesEaten == numToEat) {
                this.isHungry = false;
            } else this.isHungry = true;
 
            return numOfConesInNest;
            
        }

        public boolean getIsHungry() {
            return this.isHungry;
        }

    
}
