package com.example.lesson02;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.lesson02.bo.UsedGoodsBO;
import com.example.lesson02.domain.UsedGoods;

@RestController // @Controller + @ResponseBody (JSON)
public class Lesson02Ex01RestController {

	@Autowired
	private UsedGoodsBO usedGoodsBO; // Dependency inject

	// http://localhost/lesson02/ex01
	@RequestMapping("/lesson02/ex01")
	public List<UsedGoods> ex01() {
//		List<UsedGoods> usedGoodsList = usedGoodsBO.getUsedGoodsList();
//		return usedGoodsList; // list => JSON String

		return usedGoodsBO.getUsedGoodsList();
	}

}
