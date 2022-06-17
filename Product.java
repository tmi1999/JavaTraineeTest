package Acazia_JavaTest;

/**
 * Sản phẩm.
 * 
 * @author Trần Vinh Quang
 *
 */
public class Product implements Comparable<Product> {
	private String name, categoryTag;
	private double price;

	/**
	 * Khởi tạo đối tượng Category.
	 * 
	 * @param name        tên của sản phẩm.
	 * @param categoryTag mã phân loại sản phẩm.
	 * @param price       giá sản phẩm.
	 */
	public Product(String name, String categoryTag, double price) {
		this.name = name;
		this.categoryTag = categoryTag;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategoryTag() {
		return categoryTag;
	}

	public void setCategoryTag(String categoryTag) {
		this.categoryTag = categoryTag;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public int compareTo(Product o) {
		// So sánh tăng giá của hai sản phẩm.
		int result = Double.compare(this.price, o.price);

		// Nếu giá của hai sản phẩm bằng nhau, so sánh giảm tên của hai sản phẩm (không
		// phân biệt viết hoa, viết thường).
		if (result == 0) {
			result = -this.name.compareToIgnoreCase(o.name);
		}

		// Trả về kết quả so sánh.
		return result;
	}
}
