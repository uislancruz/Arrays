import java.lang.reflect.Array;
import java.util.Arrays;

public class Principal {

    public static void main(String[] args) {
       //int[] notas = new int[5];
        //Posso utilizar assim
        int[] notas = new int[]{8, 5 , 4, 10,};

        //ou assim
        //int[] notas = {8, 5 , 4, 10,};

       String notasEmString = Arrays.toString(notas);

        System.out.println(notasEmString);


    }
}
