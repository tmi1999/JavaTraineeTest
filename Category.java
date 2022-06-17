package Acazia_JavaTest;

import java.util.HashMap;

/**
 * Loại sản phẩm.
 * 
 * @author Trần Vinh Quang
 *
 */
public class Category {
	private static HashMap<String, Category> tagMap = new HashMap<String, Category>();
	private String name, tag;

	/**
	 * Tạo một đối tượng Product.
	 * 
	 * @param name tên phân loại.
	 * @param tag  mã phân loại.
	 */
	private Category(String name, String tag) {
		this.name = name;
		this.tag = tag;
	}

	/**
	 * Lấy về đối tượng có tag tương ứng hoặc khởi tạo một đống tượng mới với tag và
	 * tên tương ứng nếu không có sẵn
	 * 
	 * @param name tên phân loại.
	 * @param tag  mã phân loại.
	 * @return đối tượng Category có tag tương ứng.
	 */
	public static Category getUniqueInstance(String name, String tag) {
		Category instance;
		if (tagMap.containsKey(tag)) {
			instance = tagMap.get(tag);
		} else {
			instance = new Category(name, tag);
			tagMap.put(tag, instance);
		}
		return instance;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public static HashMap<String, Category> getTagMap() {
		return tagMap;
	}

	
}
