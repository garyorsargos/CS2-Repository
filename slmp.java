public class slmp {
    public static void main(String[] args) {
        //example arrays, Please play with different numbers in the array to do more experiments
        int[] l1 = {10, 20, 30, 35, 40, 45, 50, 55, 60, 65 };

        int[] l2 = {12, 15, 20, 25, 40, 50, 52, 60, 62, 70};

        twoPointerMatch(l1, l2);
        System.out.println("Done!");
    }

    public static void twoPointerMatch(int[] l1, int[] l2){
        int i = 0, j = 0;

        //While Both Lists Have Elements
        while(i < l1.length && j < l2.length){
            //If numbers are matching... Print
            if(l1[i] == l2[j]){
                System.out.println(l1[i]);
                i++;
                j++;
            }
            //If one list has a lower int... Push that pointer!
            else if (l1[i] < l2[j]) i++;
            else j++;
        }
    }
}
