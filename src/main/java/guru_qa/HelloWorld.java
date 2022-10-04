package guru_qa;

public class HelloWorld {

    public static void main(String[] args) {

        // Операторы математические + - * / %
        // Операторы условные > < >= <= == != !
        // Операторы логические && - И" || - "ИЛИ"

        int q = 15;
        int w = 13;
        double e = -7.5;
        double r = 10.13;
        int t = 15;

        System.out.println("q + w = " + (q + w));
        System.out.println("q - r = " + (q - r));
        System.out.println("e / q = " + (e / q));
        System.out.println("r * e = " + (r * e));

        if (q > t) {
            System.out.println(q + " > " + t);
        } else if (q < t) {
            System.out.println(q + " < " + t);
        } else {
            System.out.println(q + " = " + t);
        }

        byte byte0 = 126;
        byte byte1 = 3;
        System.out.println("byte0 + byte1 = " + (byte0 + byte1));

        byte b0 = (byte) (Byte.MAX_VALUE + 1);
        System.out.println(b0 + " = Max_byte + 1");
        short s0 = (short) (Short.MIN_VALUE - 1);
        System.out.println(s0 + " = Min_short - 1");

    }
}

//            int x =  (999999999 * 999999999);
//            int y =  (333333333 * 333333333);
//
//            System.out.println(x+y);
//            System.out.println(x*y);


//        Приметивные типы данных
//
//        boolean flag = true;  // boolean flag0 = false;
//        if (3 > 2) {}
//
//        byte aByte;  // 8 бит, хранит диапазон значений (-128 / 127) считается -(2^7) / (2^7)-1
//        short aShort; // 16 бит, у остальных аналогично
//        int aInt; // 32 бит
//        long aLong; // 64 бит
//
//        float aFloat; // 32 бит (3.4e-38 ; 3.4e+38)
//        double aDouble = 1.5; // 64 бит - болеше распространено (1.7e-308 ; 1.7e+308)
//        char aChar = '1'; // не более 1 символа

//        Объектныйх тип данный - Class
//        Есть 8 типов данных
