package April;

import java.util.Arrays;

public class _3rdApril {
    public static void main(String[] args) {
        int[] people = {3,5,3,4};
        System.out.println(Boatstosave(people,5));
    }

    private static int Boatstosave(int[] people, int limit) {
        Arrays.sort(people);
        int i =0,j = people.length-1,req=0;
        while(i<=j){
            if (people[i] + people[j] <= limit ){
                req++;
                i++;
                j--;
            }else{
                req++;
                j--;
            }
        }
        return req;
    }
}
