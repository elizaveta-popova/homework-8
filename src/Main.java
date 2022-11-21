public class Main {
    public static void main(String[] args) {
        //1 задача
        int [] m1 = new int [3];
        m1 [0] = 1;
        m1 [1] = 2;
        m1 [2] = 3;

        double [] m2 = {1.57, 7.654, 9.986};

        int [] m3 = {14, 21, 28};
        //2 задача
        System.out.print(m1 [0] + ", ");
        System.out.print(m1 [1] + ", ");
        System.out.println(m1 [2] + " ");
        System.out.print(m2 [0] + ", ");
        System.out.print(m2 [1] + ", ");
        System.out.println(m2 [2] + " ");
        System.out.print(m3 [0] + ", ");
        System.out.print(m3 [1] + ", ");
        System.out.println(m3 [2] + " ");
        //3 задача
        for (int i = m1.length - 1; i >= 0 ; i--) {
            System.out.println(m1[i]);
        }
        //или
        System.out.print(m1 [2] + ", ");
        System.out.print(m1 [1] + ", ");
        System.out.println(m1 [0] + " ");

        for (int i = m2.length - 1; i >= 0 ; i--) {
            System.out.println(m2[i]);
        }
        //или
        System.out.print(m2 [2] + ", ");
        System.out.print(m2 [1] + ", ");
        System.out.println(m2 [0] + " ");

        for (int i = m3.length - 1; i >= 0 ; i--) {
            System.out.println(m3[i]);
        }
        //или
        System.out.print(m3 [2] + ", ");
        System.out.print(m3 [1] + ", ");
        System.out.println(m3 [0] + " ");
        //4 задача
        for (int i = 0; i < m1.length; i++) {
            m1 [i] = (i+1)*2;
            System.out.println(m1 [i]);
        }
    }
}