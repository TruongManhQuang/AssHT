package com.example.demo.service.impl;

import com.example.demo.model.HoaDonChiTiet;
import com.example.demo.repository.IHoaDonChiTietRepository;
import com.example.demo.service.IHoaDonChiTietService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HoaDonChiTietImpl implements IHoaDonChiTietService {
    @Autowired
    private IHoaDonChiTietRepository repository;

    @Override
    public void saveHDCT(HoaDonChiTiet hoaDonChiTiet) {
        repository.save(hoaDonChiTiet);
    }
}
