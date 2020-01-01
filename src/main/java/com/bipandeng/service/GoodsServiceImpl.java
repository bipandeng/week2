package com.bipandeng.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bipandeng.bean.Goods;
import com.bipandeng.mapper.GoodsMapper;

@Service
public class GoodsServiceImpl implements GoodsService{

	@Resource
	private GoodsMapper goodsMapper;
	public List<Goods> queryList(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return goodsMapper.queryList(map);
	}

}
