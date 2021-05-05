package shapes;

public class NhaCungCap {
        int ma_nhacungcap;
        String ten_nhacungcap;
        String diachi;
    public void nhapthongtin_nhacungcap(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap thong tin nha cung cap la: \n");
        System.out.println("Nhap ma nha cung cap la: \n");
        ma_nhacungcap = scan.nextInt();
        System.out.println("Nhap ten nha cung cap la: \n");
        ten_nhacungcap = scan.nextLine();
        System.out.println("Nhap dia chi la: \n");
        diachi = scan.nextLine();
}
    public void xuatthongtin_nhacungcap() {
        System.out.println("Thong tin nha cung cap la: \n");
        System.out.println("Ma nha cung cap la: " + ma_nhacungcap);
        System.out.println("Ten nha cung cap la: " + ten_nhacungcap);
        System.out.println("Dia chi nha cung cap la " + diachi);

    }