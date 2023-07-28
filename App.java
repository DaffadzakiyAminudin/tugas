abstract class peminjaman{
    void denda(){}
    void pengembalian(){}
}

class pbo extends peminjaman{
    @Override
    void denda(){

    }
}

class ortu{
    public int x;

    void print(String tipeAnggota, int bayar){
        System.out.println("print ortu");
    }

    void print(String tipeAnggota){
        System.out.println("print ortu");
    }

    void print(){
        System.out.println("print ortu");
    }
}

class anak1 extends ortu{
    @Override
    void print(){
        System.out.println("print anak1");
    }
    void test(){
        print();
        x = 5;
    }
}

class anak2 extends anak1{
    void test2(){
        print();
    }
}

public class App extends ortu{
    public static void main(String[] args)throws Exception{
        //System.out.println("Hello, World!");
        ortu ORTU = new ortu();
        ORTU.print();
        ORTU.print("Mahasiswa");

        anak1 ANAK1 = new anak1();
        ANAK1.print();

        //peminjaman PEMINJAMAN = new peminjaman() {};
    }
}