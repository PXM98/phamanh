package shapes;
public class PhieuNhap {
    int ma_phieunhap;
    String ngaynhap;
    String ten_nhanvien;
    void nhapthongtin_phieunhap() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap thong tin phieu nhap la: \n");
        System.out.println("Nhap ma phieu nhap la: \n");
        ma_phieunhap = scan.nextInt();
        System.out.println("Nhap ngay nhap la: \n");
        ngaynhap = scan.nextLine();
        System.out.println("Nhap ten nhan vien la: \n");
        ten_nhanvien = scan.nextLine();
    }
    void xuatthongtin_phieunhap(){
        System.out.println("Xuat thong tin phieu nhap la: \n");
        System.out.println("Ma phieu nhap la: \n"+ma_phieunhap);
        System.out.println("Ngay nhap la: \n"+ngaynhap);
        System.out.println("Ten nhan vien la: \n"+ten_nhanvien);
}
