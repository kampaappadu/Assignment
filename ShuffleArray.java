import java.util.*;
public class ShuffleArray {
    public static void main(String[] args) {
        //Create an arrayList with the values (1,2,3,4,5,6,7)
        List<Integer> list =  new ArrayList<>();

        for (int i =1 ;i<8;i++){
            list.add(i);
        }

        //Shuffile the list
        Collections.shuffle(list);

        //Convert the shuffled list back to an array if needed
        Integer[] shuffledArray = list.toArray(new Integer[0]);

        //Print Shuffle Array
        for (int i=0;i<shuffledArray.length;i++){
            System.out.print(shuffledArray[i]);
            if (i<shuffledArray.length-1){
                System.out.print(", ");
            }
        }
    }
}
