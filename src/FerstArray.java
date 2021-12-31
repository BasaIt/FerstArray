public class FerstArray {
    public static void main(String[] args) {

        int[] mNums = new int[900];
        for (int i = 0; i < mNums.length; i++){
            mNums[i] = i + 100;
        }
        int[] mNumsTwo = new int[mNums.length];

        for (int i = 0, j = mNums.length-1; i < mNumsTwo.length; i++, j--){
            mNumsTwo[j] = mNums[i];
        }
        for (int i  : mNumsTwo){
            System.out.println(i);

        }

        int[] Mar = new int[45];
        for (int i = 0; i < Mar.length; i++) {
            Mar[i] = i + 5;
        }
        int[] MarTwo = new int[Mar.length];
        for (int i = 0, j = Mar.length-1; i < MarTwo.length; i++, j--) {
            MarTwo[i] = Mar[j];
        }
        for (int i : MarTwo){
            System.out.println(i);
        }

        String[] mSTRCity = new String[5];
        mSTRCity[0] = "Москва";
        mSTRCity[1] = "Санкт-Петербург";
        mSTRCity[2] = "Екатеринбург";
        mSTRCity[3] = "Орел";
        mSTRCity[4] = "Шымкент";
        for (int i = 0; i < mSTRCity.length - 1; i++){
        }
        for(String i : mSTRCity){
            System.out.println(i);
        }

    }

}
