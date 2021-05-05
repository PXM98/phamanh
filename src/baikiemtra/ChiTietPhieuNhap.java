public class ChiTietPhieuNhap extends PhieuNhap {
    int ma_sanpham;
    String ten_sanpham;
    int soluong;
    String hansudung;
    void nhapthongtin_sanpham(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap thong tin san pham la: \n");
        System.out.println("Nhap ma san pham la: \n");
        ma_sanpham = scan.nextInt();
        System.out.println("Nhap ten san pham la: \n");
        ten_sanpham = scan.nextLine();
        System.out.println("Nhap so luong la: \n");
        soluong = scan.nextInt();
        System.out.println("Nhap han su dung la: \n");
        hansudung = scan.nextLine();
    }
    //Phương thwucs xuất tt
    void xuatthongtin_sanpham(){
        System.out.println("Xuat thong tin san pham la: \n");
        System.out.println("Ma san pham la: \n"+ma_sanpham);
        System.out.println("Ten san pham la: \n"+ten_sanpham);
        System.out.println("So luong la: \n"+soluong);
        System.out.println("Han su dung la: \n"+hansudung);
    }
}
