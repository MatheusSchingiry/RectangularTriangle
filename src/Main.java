public class Main {
    public static void main(String[] args) {
        int base = 20;

        for(int i = 1; i <= base; i++){
            //profundidade
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    public void geradorTriangulo(int base){
        //altura
        for(int i = 1; i <= base; i++){
            //profundidade
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println("\n");
        }
    }
}