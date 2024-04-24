public class Sample1 {
    public static void main(String[] args) {
        // Converting int into Integer
        int a = 20;
        Integer i = Integer.valueOf(a);
        Integer j = a;// autoboxing, now compiler will
        int c = i.intValue();
        int d = j;
        System.out.println(a + " " + i + " " + j);

    }
}

/*
 * output::
 * 20 20 20
 */
