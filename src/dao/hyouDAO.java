package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import dto.LoginDTO;
import util.DBConnector;;

/**
 * MySQLのデータを取得する為のクラス
 * @author S.Iiduka
 * @since 1.0
 * @version 1.0
 */
public class hyouDAO {

	/**
	 * ユーザー一覧情報を格納するリスト
	 */
	private ArrayList<LoginDTO> selectList = new ArrayList<>();

	/**
	 * MySQLのデータを取得する為のメソッド
	 * @return result 取得できたらリストに格納してtrue、できなかったらfalseを返します。
	 */
	public boolean selectMySQL() {
		boolean result = false;

		Connection connection = DBConnector.getConnection();
		String sql = "select*from ticket group by division order by item_id";
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				LoginDTO dto = new LoginDTO();
				dto.setDivision(rs.getString("division"));
				dto.setExplanation(rs.getString("explanation"));
				dto.setPrice(rs.getInt("price"));
				selectList.add(dto);
				result = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}

	/**
	 * ユーザーリストを取得する為のメソッド
	 * @return selectList ユーザーリスト
	 */
	public ArrayList<LoginDTO> getSelectList() {
		return selectList;
	}

	/**
	 * ユーザーリストを格納する為のメソッド
	 * @param selectList ユーザーリスト
	 */
	public void setSelectList(ArrayList<LoginDTO> selectList) {
		this.selectList = selectList;
	}
}