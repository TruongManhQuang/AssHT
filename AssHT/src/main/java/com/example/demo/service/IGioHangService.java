package com.example.demo.service;

import java.util.Map;

public interface IGioHangService {

    void themSanPhamVaoGioHang(Integer maSanPham,Integer soLuongChoVao);

    Map<Integer, Integer> laySanPhamTrongGio() ;
}
