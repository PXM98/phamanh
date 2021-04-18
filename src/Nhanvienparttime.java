package model;

import NV.Configs;

public class NhanVienPartTime extends NhanVien {
    private int giolamviec;
    public NhanVienPartTime(String ten, int giolamviec) {
        this.ten = ten;
        this.giolamviec = giolamviec;
    }
    public String LoaiNhanVien() {
        return "Nhan vien thoi vu";
    }
    public void tinhLuong() {
        luong = Configs.LUONG_NHAN_VIEN_PART_TIME_MOI_GIO * giolamviec;
    }
}