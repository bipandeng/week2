package com.bipandeng.service;

import java.util.List;
import java.util.Map;

import com.bipandeng.bean.Goods;

public interface GoodsService {
	public List<Goods> queryList(Map<String, Object> map);
}
