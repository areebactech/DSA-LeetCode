package src;

public class RichestCustomerWealth {
    public static int maximumWealth(int[][] accounts){
        int max = 0;

        for(int i = 0;i < accounts.length;i++){
            int sum = 0;

            for(int j = 0; j < accounts[i].length;j++){
                sum = sum + accounts[i][j];
            }
            if(sum > max){
                max = sum;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[][] array = {{1,2,5},{1,2,3},{5,5,5}};
        int result = maximumWealth(array);
        System.out.println(result);
    }
}
