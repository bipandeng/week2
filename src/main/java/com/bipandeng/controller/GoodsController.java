package com.bipandeng.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bipandeng.bean.Goods;

import com.bipandeng.service.GoodsService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
public class GoodsController {

	@Resource
	private GoodsService goodsService;
	@RequestMapping("list")
	public String queryGoods(Model mod, @RequestParam(defaultValue = "1") int pageNum) {
		PageHelper.startPage(pageNum,2);
		Map<String, Object> map = new HashMap<String, Object>();
		List<Goods> list = goodsService.queryList(map);
		PageInfo<Goods> pp = new PageInfo<Goods>(list);
		mod.addAttribute("pp", pp);
		
		return "list";
	}
}
