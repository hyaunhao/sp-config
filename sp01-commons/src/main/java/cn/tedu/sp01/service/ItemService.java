package cn.tedu.sp01.service;

import java.util.List;

import cn.tedu.sp01.pojo.Item;

public interface ItemService {
	/**
	 * 
	 * @param orderId
	 * @return
	 */
	List<Item> getItems(String orderId);
	/**
	 * 
	 * @param list
	 */
	void decreaseNumbers(List<Item> list);
}
