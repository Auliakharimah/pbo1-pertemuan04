package tugas;

public class Array2 {
    public static void main(String[] args) {
        String nama[] = {{"Sinta","Ana"},{"Dina","Eka"},{"Hilmi","Rio"},{"Angga","Doni"}};

        for(int i = 0; i < nama.length; i++){
            System.out.print((i+1)+".");
            for (int j = 0; j < 2; j++){
                System.out.print(nama[i][i]+"");
            }
            System.out.println("");
        }
    }
}

