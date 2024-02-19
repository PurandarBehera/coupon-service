package com.puru.learnings.springsecurity.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.puru.learnings.springsecurity.models.Coupon;

@Repository
public interface CouponRepository extends JpaRepository<Coupon, Integer> {

	Coupon findByCouponCode(String code);

}
