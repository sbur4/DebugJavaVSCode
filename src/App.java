public class App {
    public static void main(String[] args) throws Exception {

        // Automatic casting
        byte myByte = 5;// first point
        short myShort = myByte;
        int myInt = ++myShort;
        long myLong = myInt++;
        float myFloat = --myLong;
        double myDouble = myFloat--;
        System.out.println(myDouble);// second point

    }
}
