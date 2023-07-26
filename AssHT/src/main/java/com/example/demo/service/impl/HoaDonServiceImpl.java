package com.example.demo.service.impl;

import com.example.demo.model.HoaDon;
import com.example.demo.repository.IHoaDonRepository;
import com.example.demo.service.IHoaDonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HoaDonServiceImpl implements IHoaDonService {
    @Autowired
    private IHoaDonRepository repository;

    @Override
    public void saveHoaDon(HoaDon hoaDon) {
        repository.save(hoaDon);
    }
}
