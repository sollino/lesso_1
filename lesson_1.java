public class lesson_1 {
    public static void main(String[] args) {

//        byte a = 1;
//        short b = 1;
//        int c = 1;
//        long d =1;
//        float  a1 = 1;
//        double b1 = 1;
//        char c1 = 1;
//        boolean d1;

        System.out.println(printSumm(3,5 ,6,2 ));
        serch(3, 4);

    }

    public static double printSumm ( double a, double b, double c, double d){
          return a * (b + (c / d));
    }

    public static boolean  serch  (double a, double b){
        double x = a+b;
        if ((x<=20)&&(x>=10)) {
            return true;
        }else {
            return false;
    }

    }

}

