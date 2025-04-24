package app;

import java.util.Scanner;

import util.MessageConstants;

/**
 * InventoryManagementSystemのメインクラス（エントリーポイント）
 * 
 * <pre>
 * ハンズオン内容：
 *   シンプルな在庫管理システムの作成
 * 目的：
 *   初学者が基本的な制御構文、クラス設計、配列操作、定数の利用を学べる。
 *   在庫管理を通じて、Javaの基本的なプログラム構造を理解する。
 * </pre>
 * 
 * [課題]<br>
 * ・制限時間は40分です
 * ・問題を解く為にネット検索・chatGPT検索しても構いません 
 * ・ChatGPTに問題分丸投げはNG（現場での実装時、コードを丸投げするとコンプラ違反になります。）
 * ・TODOの部分をすべて実装して下さい
 * ・100点満点中80点以上で合格です
 * 　※↑ここまでで40分
 * ・実装後はコーディングした部分がどのような処理をしているか解説してもらいます
 * ・最後に実行ボタンを押して動作確認を行います<br>
 * 
 * @author 教育PJ
 * @since 2024/8/13(2025/4月修正版) 
 */
public class Main {
	public static void main(String[] args) {
		// scannerクラスを定義してインスタンス化する
		// 補足: Scannerクラスとは外部からデータを読み取るためのクラスです
		// 補足: 引数System.in は、Javaでキーボードからの標準入力を取得するためのオブジェクトです
		Scanner scanner = new Scanner(System.in);

		// TODO: Q13:Inventoryクラスのインスタンスを作成してください。インスタンス名はinventoryとしてください。【４点】
        InventoryService inventory = new InventoryService();
		/*
		 * 入力内容判定ロジック
		 */
		while (true) {
			System.out.print(MessageConstants.MENU_OPTIONS);
			int choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
			case 1:
				/*
				 * 在庫に商品を追加
				 */
				System.out.print(MessageConstants.PRODUCT_NAME_PROMPT);
				String name = scanner.nextLine();
				System.out.print(MessageConstants.PRODUCT_QUANTITY_PROMPT);
				int quantity = scanner.nextInt();
				scanner.nextLine();

				// TODO: Q14:上記で取得したnameとquantityを使ってProductクラスのインスタンスを作成し、Inventoryクラスのproductsリストに追加してください。インスタンス名はproductとしてください。【５点】
				Product product = new product;
				break;
			case 2:
				/*
				 * 現在の在庫を表示
				 */
				// TODO: Q15:在庫を表示するメソッドを呼び出してください。【４点】

				break;
			case 3:
				/*
				 * 在庫から商品の検索 
				 */
				System.out.print(MessageConstants.PRODUCT_NAME_PROMPT);
				String searchName = scanner.nextLine();
				// TODO: Q16:Inventoryクラスの検索メソッドを呼び出して、商品を検索し、結果を表示してください。【８点】
				//補足:　結果は商品名と数量を並べて表示すること（例： 商品：　, 数量：　）
				// TODO: Q17:nullの場合、「商品が見つかりません。」を表示してください。【６点】
				// 補足:メッセージは定数を利用すること

				break;
			case 4:
				/*
				 * 終了処理
				 */
				System.out.println(MessageConstants.EXIT_MESSAGE);
				scanner.close();
				return; // プログラム終了
			default:
				/*
				 * 無効な入力
				 */
				System.out.println(MessageConstants.INVALID_NUMBER);
			}
		}
	}
}
