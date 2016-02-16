/**
 *
 */
package action;

import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;

import dao.hyouDAO;
import dto.LoginDTO;

/**
 * MySQLのデータを取得する為のクラス
 * @author S.Iiduka
 * @since 1.0
 * @version 1.0
 */
public class LoginAction extends ActionSupport{



	/**
	 * ユーザー一覧のリスト
	 */
	private ArrayList<LoginDTO> selectList = new ArrayList<>();

	/**
	 * MySQLのデータを取得する為のメソッド
	 * @return result データを取得できたら、リストに格納をしてSUCCESS、できなかったらERRORを返します。
	 */
	public String execute(){
		System.out.println("aaa");
		String result = ERROR;
		hyouDAO dao = new hyouDAO();
		if(dao.selectMySQL()){
			selectList = dao.getSelectList();
			result = SUCCESS;
		}
		System.out.println("aaa");
		return result;
	}

	/**
	 * ユーザー一覧のリストを取得する為のメソッド
	 * @return selectList ユーザー一覧のリスト
	 */
	public ArrayList<LoginDTO> getSelectList() {
		return selectList;
	}

	/**
	 * ユーザー一覧のリストを格納する為のメソッド
	 * @param selectList ユーザー一覧のリスト
	 */
	public void setSelectList(ArrayList<LoginDTO> selectList) {
		this.selectList = selectList;
	}
}