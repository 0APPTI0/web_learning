package com.WebLearning.fuckJdbc;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

import java.sql.DriverManager;
import java.sql.SQLException;

public class MysqlJDBC {
	private final String URL = "jdbc:mysql://localhost:3306/FUCKJDBC";
	//数据库用户名
	private final String USERNAME = "root";
	//数据库密码
	private final String PWD = "zsy999666.";
	java.sql.Connection connection =  null;
	java.sql.Statement stmt = null;
	
	
	public void update() {
		try {
			//导入驱动，加载具体的驱动类
			Class.forName("com.mysql.jdbc.Driver");
			//与数据库建立链接
			connection =  DriverManager.getConnection(URL,USERNAME,PWD);
			//发送sQl，执行（增删改查）
			stmt = connection.createStatement();
			String sql = "DELETE FROM TKDstudents WHERE studentid=171250525;";
			int count = stmt.executeUpdate(sql);//返回值表示增删改了多少条数据
			if(count >0) {
				System.out.print("数据库操作成功");
			}
		}catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (SQLException e1) {
			// TODO: handle exception
			e1.printStackTrace();
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			if(stmt!=null)
				try {
					stmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			if(connection != null)
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	
	}

    public static void main(String[] args) {
        MysqlJDBC m1 = new MysqlJDBC();
        m1.update();
    }
}