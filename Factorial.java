class actorial{
    public static void main(String[] a){
        System.out.println(new Fac().ComputeFac(10));
    }
}

class Gactorial extends Burrito {
    public int maint(){
        System.out.println(new Fac().ComputeFac(10));
        return 2;
    }
}

class Burrito {
    public boolean compute() {
        return true;
    }
}

class Fac extends Burrito {
    Fac g;
    int[] h;
    boolean p;
    int k;
    Fac hi;

    public int ComputeFac(int num, int nums){
        int num_aux;
        if (num < 1)
            num_aux = 1 ;
        else
            num_aux = num * (this.ComputeFac(num-1)) ;
        return num_aux ;
    }
}
