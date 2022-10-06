package com.se.springbootdemocrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.se.springbootdemocrud.dao.MayBayService;

@RestController
@RequestMapping("")
public class MayBayController {
	@Autowired
	private MayBayService mayBayService;

	@GetMapping("/maybay")
	public List<String> findByTamBayLonHon10000() {
		return mayBayService.findByTamBayLonHon10000();
	}

	@GetMapping("/maybay1")
	public List<String> findMaByNameNguyen() {
		return mayBayService.findMaByNameNguyen();
	}

	@GetMapping("/maybay2")
	public List<String> findLoaiByCBVN280() {
		return mayBayService.findLoaiByCBVN280();
	}

	@GetMapping("/maybay3")
	public List<Object[]> findMaLoaiVaTongPhiCong() {
		return mayBayService.findMaLoaiVaTongPhiCong();
	}
	@GetMapping("/maybay4")
	public int sumMayBayBoeing() {
		return mayBayService.sumMayBayBoeing();
	}


}
