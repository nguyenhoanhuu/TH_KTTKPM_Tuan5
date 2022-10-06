package com.se.springbootdemocrud.controller;

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
import com.se.springbootdemocrud.entity.ChuyenBay;

@RestController
@RequestMapping("")
public class ChuyenBayController {
	@Autowired
	private ChuyenBayDao chuyenBayDao;

	@GetMapping("/chuyenbay")
	public List<ChuyenBay> findAll() {
		return chuyenBayDao.getDsChuyenBay();
	}

	@GetMapping("/chuyenbay/{ChuyenBayId}")
	public Optional<ChuyenBay> findById(@PathVariable String ChuyenBayId) {
		return chuyenBayDao.getChuyenBayById(ChuyenBayId);
	}

	@GetMapping("/chuyenbay/gaden/{GaDenId}")
	public List<ChuyenBay> findByGaDen(@PathVariable String GaDenId) {
		return chuyenBayDao.findByGaDen(GaDenId);
	}

	/**
	 * @param chuyenBay
	 * @return
	 */
	@PostMapping("/chuyenbay")
	public ChuyenBay createChuyenBay(@RequestBody ChuyenBay chuyenBay) {

		System.out.println(chuyenBay);

		return chuyenBayDao.createChuyenBay(chuyenBay);
	}

	@DeleteMapping("/chuyenbay/{ChuyenBayId}")
	public String deleteChuyenBay(@PathVariable String ChuyenBayId) {
		return chuyenBayDao.deleteChuyenBay(ChuyenBayId);
	}
}
