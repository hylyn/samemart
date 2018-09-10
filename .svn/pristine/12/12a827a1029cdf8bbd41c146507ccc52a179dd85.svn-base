package com.samemart.console.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.samemart.console.pojo.ItemCat;
import com.samemart.console.service.ItemCatService;

/**
 * 商品类目的controller
 * 对应common.js里的url
 * @author htan4
 *
 */
@Controller
@RequestMapping("item/cat")
public class ItemCatController {
	
	@Autowired
	private ItemCatService itemCatService;
	
	@RequestMapping(method=RequestMethod.GET)
	//返回的tree是数组，对应List, List的元素是ItemCat
	//EasyUI自动添加id，我们可以用@RequestParam接收参数
	public ResponseEntity<List<ItemCat>> queryItemCatListByParentId(
			@RequestParam(value="id",defaultValue="0") Long pid){	
		try {
			List<ItemCat> list = this.itemCatService.queryItemCatListByParentId(pid);
			if(null==list || list.isEmpty()) {
				//这里不能用build,因为返回的是空，而不是泛型T
				return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
			}
			return ResponseEntity.ok(list);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
	}

}
