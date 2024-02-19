package com.puru.learnings.springsecurity.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.puru.learnings.springsecurity.models.Coupon;
import com.puru.learnings.springsecurity.repos.CouponRepository;

@RestController
@RequestMapping("/coupon-api")
public class CouponControllers {

	@Autowired
	private CouponRepository couponRepository;

	@PostMapping("/coupons")
	public Coupon createCoupon(@RequestBody Coupon coupon) {
		return couponRepository.save(coupon);
	}

	@GetMapping("/coupons/{code}")
	public Coupon retrieveCoupon(@PathVariable String code) {
		return couponRepository.findByCouponCode(code);
	}

}
