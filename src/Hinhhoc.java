package shapes;
public class Hinhhoc {
    public final float PI = 3.14f;

    public String ten;
    public float chuvi;
    public float dientich;
    public float thetich;

    public void xuatten(){
        System.out.println("\n\n====" + ten + " ====");
    }
    public void inchuvi(){
        System.out.println("chu vi = " + chuvi);c
    }
    public void indientich(){
        System.out.println("dien tich = " + dientich);
    }
    public void inthetich(){
        System.out.println("the tich = " + thetich);
    }
}
public class Hinhtron extends Hinhhoc {
    public float bankinh;
    // Constructor
    public Hinhtron(){
        ten = "hinh tron";
    }
    public void nhapbankinh(){
        Stystem.out.println("ban kinh = ");
        Scanner scanner = new Scanner(System.in);
        bankinh = scanner.nextFloat();
    }
    public void tinhchuvi(){
        chuvi = 2*PI*bankinh;
    }
    public void tinhthetich(){
        dientich = PT*bankinh*bankinh;
    }
}
public class Hinhtru extends Hinhtron{
    public float chieucao;
    //Constructor
    public Hinhtru(){
        ten = " hinh tru";
    }
    public void nhapchieucao(){
        nhapbankinh();

        System.out.println("chieu cao = ");
        Scanner scanner = new Scanner(System.in);
        chieucao = scanner.nextfloat();
    }
    public void tinhthetich(){
        tinhthetich();
        thetich = dientich*chieucao;
    }
}
public class Hinhchunhat extends Hinhhoc {
    public float dai;
    public float rong;

    public Hinhchunhat() {
        ten = "hinh chu nhat";
    }
    public void nhapchieudai(){
        System.out.println("chieu dai = ");
        Scanner scanner = new Scanner(System.in);
        dai = scanner.nextfloat();
    }
    public void nhapchieurong(){
        System.out.println("chieu rong = ");
        Scanner scanner = new Scanner(System.in);
        rong = scanner.nextfloat();
    }
    public void tinhchuvi(){
        chuvi = 2*(dai * rong);
    }
    public void tinhdientich(){
        dientich = dai * rong;
    }
}
public class Hinhvuong extends Hinhchunhat{
    public Hinhvuong(){
        ten = "hinh vuong";
    }
    public void nhapcanh(){
        System.out.println("canh = ");
        Scanner scanner = new Scanner(System.in);
        dai = rong = scanner.nextfloat();
    }
}
public class Mainclass{
    public static void main(String[] args){
        //thu nghiem voi hinh tron
        Hinhtron hinhtron = new Hinhtron();
        hinhtron.xuatten();
        hinhtron.nhapbankinh();
        hinhtron.tinhchuvi();
        hinhtron.tinhthetich();
        hinhtron.inchuvi();
        hinhtron.inthetich();

        //thu nghiem voi hinh tru
        Hinhtru hinhtru = new Hinhtru();
        hinhtru.xuatten();
        hinhtru.nhapchieucao();
        hinhtru.tinhthetich();
        hinhtru.inthetich();

        //thu nguem voi hinh chu nhat
        Hinhchunhat hinhchunhat = new Hinhchunhat();
        hinhchunhat.xuatten();
        hinhchunhat.nhapchieudai();
        hinhchunhat.nhapchieurong();
        hinhchunhat.tinhchuvi();
        hinhchunhat.tinhdientich();
        hinhchunhat.inchuvi();
        hinhchunhat.indientich();

        //thu nghiem voi lop hinh vuong
        Hinhvuong hinhvuong = new Hinhvuong();
        hinhvuong.xuatten();
        hinhvuong.nhapcanh();
        hinhvuong.tinhchuvi();
        hinhvuong.tinhdientich();
        hinhvuong.inchuvi();
        hinhvuong.indientich();
    }
}

