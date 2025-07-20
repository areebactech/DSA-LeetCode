package src;

public class HighestAltitude {
    public static int largestAltitude(int[] gain) {

        int currentAltitude = 0;
        int maxAltitude = 0;

        for(int g : gain){
            currentAltitude += g;
            if(currentAltitude >= maxAltitude){
                maxAltitude = currentAltitude;
            }
        }

        return maxAltitude;
    }

    public static void main(String[] args) {
        int[] gain = {-4,-3,-2,-1,4,3,2};
        int result = largestAltitude(gain);
        System.out.println(result);
    }
}
