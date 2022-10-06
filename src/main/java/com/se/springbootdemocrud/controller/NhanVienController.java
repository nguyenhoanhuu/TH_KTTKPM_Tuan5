package com.se.springbootdemocrud.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.se.springbootdemocrud.dao.ChuyenBayDao;
import com.se.springbootdemocrud.dao.NhanVienService;
import com.se.springbootdemocrud.entity.ChuyenBay;
import com.se.springbootdemocrud.entity.NhanVien;

@RestController
@RequestMapping("/nhanvien")
public class NhanVienController {
	@Autowired
	private NhanVienService nhanVienService;

	@GetMapping("/findByLuong")
	public List<NhanVien> findAll() {
		return nhanVienService.findByLuongNhoHon10000();
	}

	@GetMapping("/findByLuong1")
	public List<String> find() {
		return nhanVienService.findMaByNVLaiBoeingVaAirbus();
	}

	@GetMapping("/findByLuong2")
	public List<NhanVien> find1() {
		return nhanVienService.findBymaMB747();
	}

	@GetMapping("/findByLuong3")
	public List<String> find2() {
		return nhanVienService.findTenByNVLaiBoeing();
	}

	@GetMapping("/findByLuong4")
	public List<String> findNVMaxLuong() {
		return nhanVienService.findNVMaxLuong();
	}

	@GetMapping("/findByLuong5")
	public int tongSoLuongPhaiTra() {
		return nhanVienService.tongSoLuongPhaiTra();
	}

	@GetMapping("/findByLuong6")
	public List<String> findMaNVChiLaiDuoc3LoaiMayBay() {
		return nhanVienService.findMaNVChiLaiDuoc3LoaiMayBay();
	}

//	List<String> findNVMaxLuong();

//
}
