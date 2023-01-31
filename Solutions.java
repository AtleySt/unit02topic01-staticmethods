public class Solutions {

    public static int max3(int a, int b, int c){
        if (a > b && a > c) {
            return a;
        } else if (b > a && b > c) {
            return b;
        } else {
            return c;
        }
    }

    public static boolean odd(boolean a, boolean b, boolean c) {
        int count = 0;
        if (a) {
            count += 1;
        }
        if (b) {
            count += 1;
        }
        if (c) {
            count+= 1;
        }
        if (count == 1 || count == 3) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean majority(boolean a, boolean b, boolean c) {
        int tcount = 0;
        int fcount = 0;
        if (a) {
            tcount += 1;
        } else {
            fcount += 1;
        }
        if (b) {
            tcount += 1;
        } else {
            fcount += 1;
        }
        if (c) {
            tcount += 1;
        } else {
            fcount += 1;
        }
        if (tcount > fcount) {
            return true;
        } else {
            return false;
        }
    }

    public static double trigIdentity(double x){
        x = (Math.sin(x)*Math.sin(x))+(Math.cos(x)*Math.cos(x));
        return x;
    }

    public static void main(String[] args) {
        System.out.println(max3(1,4,1));
        System.out.println(odd(true, true, false));
        System.out.println(majority(true, false, false));
        System.out.println(trigIdentity(5321));
    }
    }

    
