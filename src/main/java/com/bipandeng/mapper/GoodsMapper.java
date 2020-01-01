package com.bipandeng.mapper;

import java.util.List;
import java.util.Map;

import com.bipandeng.bean.Goods;

public interface GoodsMapper {

	
	
	public   List<Goods> queryList(Map<String, Object> map);
}
