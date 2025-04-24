package app;

/**
 * 商品情報を保持するクラスで、商品名と数量を指定して利用する
 * 
 * @author 教育PJ 
 * @since 2024/8/13(2025/4月修正版) 
 */
public class ProductBean {

	private String name;
	private int quantity;

	/**
	 * 商品名と数量を初期化するコンストラクタ
	 * @param name 商品名
	 * @param quantity 商品の数量
	 */

	//THINK: このメソッドがゲッター、セッター、コンストラクタのどれに当たるか考えてください。
	public ProductBean(String name, int quantity) {
		// TODO: Q1:引数で受け取ったnameとquantityをそれぞれフィールドに代入してください。【８点】
		this.quantity = quantity;
		this.name = name;
		
	}

	/**
	 * 商品名を返すメソッド
	 * @return 商品名
	 */
	
	//THINK: このメソッドがゲッター、セッター、コンストラクタのどれに当たるか考えてください。
	public String getName() {
		// TODO: Q2:商品名を返してください。【５点】
		return this.name;
	}

	/**
	 * 商品の数量を返すメソッド
	 * @return 商品の数量
	 */

	//THINK: このメソッドがゲッター、セッター、コンストラクタのどれに当たるか考えてください。
	public int getQuantity() {
		// TODO: Q3:商品の数量を返してください。【５点】
		return this.quantity;
		
	}

	/**
	 * 商品の数量を設定するメソッド
	 * @param quantity 新しい数量
	 */

	//THINK: このメソッドがゲッター、セッター、コンストラクタのどれに当たるか考えてください。
	public void setQuantity(int quantity) {
		// TODO: Q4:引数で受け取ったquantityをフィールドに代入してください。【５点】
	    // コンストラクタで受け取って代入
	        this.quantity = quantity;
				
	}
}
