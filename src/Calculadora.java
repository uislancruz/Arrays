public class Calculadora {
    static double calculaMedia(int[] numeros){
        int total = 0;

        //aqui voce deixa mais inteirado caso for até o final do indice.
        for (int numero : numeros) {
            total += numero;
        }

        //caso queira para sem ir ao final do indice
//        for (int i = 0; i < numeros.length; i++){
//            total += numeros[i];
//        }
        return (double) total / numeros.length;
    }
}
