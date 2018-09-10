package com.samemart.console.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samemart.console.mapper.ItemCatMapper;
import com.samemart.console.pojo.ItemCat;

/**
 * ItemCat商品类目的处理service
 * @author htan4
 *
 */
@Service
public class ItemCatService {

	@Autowired
	private ItemCatMapper itemCatMapper;

	//查询商品类目列表
	public List<ItemCat> queryItemCatListByParentId(Long pid) {
		
		//根据一个条件查询where parentId=0只能用record, select(null)代表没有参数，而这里的pid是有参数
		//return this.itemCatMapper.selectByExample(pid);
		
		//下面这段逻辑不要写到controller
		//设置查询参数
		ItemCat record = new ItemCat();
		record.setParentId(pid);
		return this.itemCatMapper.select(record);
	}
}
