package exercises;

public class BloodData {
    private int bloodType;
    private int age;
    private int negative;

    public BloodData(int type, int positive, int negative){
        bloodType = type;
        positive = positive;
        negative = negative;
        //this(type, positive, negative);
    }
    public BloodData(int type, int positive){

        //this(type, positive, negative);
    }
    public BloodData(int type){

        //this(type, positive, negative);
    }
}
