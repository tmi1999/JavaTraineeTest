package Acazia_JavaTest;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * Chứa hàm main để chạy chương trình.
 * 
 * @author Trần Vinh Quang
 *
 */
public class Main {
	/**
	 * Chạy chương trình.
	 * 
	 * @param args chứa các đối số dòng lệnh.
	 */
	public static void main(String[] args) {
		// Khởi tạo các phân loại và các sản phẩm.
		Category category1 = Category.getUniqueInstance("may tinh", "mt");
		Category category2 = Category.getUniqueInstance("dien lanh", "dl");
		Product product1 = new Product("may tinh xach tay A", "mt", 12.0);
		Product product2 = new Product("laptop X", "mt", 13.0);
		Product product3 = new Product("pc 2", "mt", 13.0);
		Product product4 = new Product("ultrabook EZ", "mt", 16.0);
		Product product5 = new Product("tu lanh e", "dl", 11.5);
		Product product6 = new Product("dieu hoa nhiet do b", "dl", 12.0);

		// Nhóm các sản phẩm vào một mảng.
		Product[] products = { product1, product2, product3, product4, product5, product6 };
		// Sắp xếp các sản phẩm trong mảng theo: `price` giảm dần, nếu giá bằng nhau thì
		// sắp xếp theo `name` tăng dần (không phân biệt hoa thường).
		Arrays.sort(products, Collections.reverseOrder());

		// Nhập đầu vào là loại sản phẩm
		Scanner scan = new Scanner(System.in);
		System.out.print("Hãy nhập loại sản phẩm: ");
		String categoryTag = scan.nextLine();
		scan.close();

		// Kiểm tra loại sản phẩm vừa nhập có tồn tại hay không.
		if (Category.getTagMap().containsKey(categoryTag)) {
			// In ra màn hình tất cả các product có categoryTag đã nhập và theo thứ tự đã
			// được sắp xếp trước đó
			for (Product product : products) {
				if (product.getCategoryTag().equals(categoryTag)) {
					System.out.println(product.getPrice() + ", " + product.getName());
				}
			}
		}
	}
}
