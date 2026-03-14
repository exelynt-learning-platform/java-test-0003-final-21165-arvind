public class Main {

        public static void main(String[] args) {
            int a=0;
            int n=7;
            for(int i = 0; i < n;i++){
                for(int j = 0 ; j < i;j++){
                    a=a==1?0:1;
                    System.out.print(a);
                }
                System.out.println();
            }
        }

}