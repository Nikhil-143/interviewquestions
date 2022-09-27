import java.util.Arrays;
import java.util.Scanner;

public class Array{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter size of array : ");
        int n = scan.nextInt();   // Takes array size// 

        int[] pies = new int[n];
        System.out.println("Enter Sweetness value of pies : ");

        for(int i = 0; i<pies.length;i++){  
            pies[i] = scan.nextInt();  // Sweetness value of each pie//
        }

        System.out.println("Enter sweetness :");
        int sweetness = scan.nextInt();   // Sweetness desired//
        int[] indices = findPies(pies, sweetness);
        System.out.println(Arrays.toString(indices));
        scan.close();

    }

    public static int[] findPies(int[] pies,int sweetness) {
        for (int i = 0; i < pies.length; i++) {
            if(pies[i] == sweetness){
                return new int[]{i};
            }
    
            for (int j = i+1; j < pies.length; j++) {
                if(pies[i] + pies[j]==sweetness){
                    return new int[]{i,j};
                }
            }          
        }
        return new int[]{};
    }
}