package model;

import NV.Configs;

public class NhanVienFullTime extends NhanVien {
    private int ngayLamThem;
    private int loaiChucVu;
    public NhanVienFullTime(String ten) {
        this.ten = ten;
    }
    public NhanVienFullTime(String ten, int ngayLamThem) {
        this.ten = ten;
        this.ngayLamThem = ngayLamThem;
    }
    public int getLoaiChucVu() {
        return loaiChucVu;
    }
    public void setLoaiChucVu(int loaiChucVu) {
        this.loaiChucVu = loaiChucVu;
    }
    public String loaiNhanVien() {
        return "Nhan vien full time";
    }
    public void tinhLuong() {
        luong = Configs.LUONG_NHAN_VIEN_FULL_TIME_LINH + this.ngayLamThem * Configs.LUONG_LAM_THEM_MOI_NGAY;
        luong = Configs.LUONG_NHAN_VIEN_FULL_TIME_SEP + this.ngayLamThem + Configs.LUONG_LAM_THEM_MOI_NGAY;
    }
}