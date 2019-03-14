public class teste{
    public static void main(String[] args){
        int x = 10;
        int y = x+1;

        int[] seq = new int[y];

        seq[0] = 0;
        seq[1] = 1;

        System.out.print("Algoritmo de sequencia Fibonacci\n");
        System.out.print("{ " + seq[1] + ",");

        for(int i = 2; i < seq.length; i++){
            seq[i] = seq[i - 1] + seq[ i - 2];
            
            if(i == (seq.length-1)){
                System.out.print(" " + seq[i]);
            }

            else{
                System.out.print(" " + seq[i] + "," );
            }
        }

        System.out.print("... }");
    }
}