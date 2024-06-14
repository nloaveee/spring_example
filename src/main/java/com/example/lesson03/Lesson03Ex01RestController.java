package com.example.lesson03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.lesson03.bo.ReviewBO;
import com.example.lesson03.domain.Review;

@RestController
public class Lesson03Ex01RestController {

	@Autowired
	private ReviewBO reviewBO;

	// http://localhost/lesson03/ex01?id=7
	@RequestMapping("lesson03/ex01")
	public Review ex01(@RequestParam(value = "id") int id // 필수 파라미터 value= 받아올 변수명을 작성, 받아온 변수명도 작성
	) {
		return reviewBO.getReview(); // response JSON String
	}
}
