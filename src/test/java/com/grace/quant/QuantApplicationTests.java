package com.grace.quant;

import com.grace.quant.entity.Account;
import com.grace.quant.repository.AccountRepository;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;


@SpringBootTest
class QuantApplicationTests {

	@Autowired
	private AccountRepository repository;

	@Test
	void save_account() {
		Account account = new Account();
		account.setUsername("Peter Li");
		account.setPassword("password123");
		account.setAge(40);

		//call mybatis to create an account in DB
		repository.save(account);
	}

//	@Autowired
//	private DataSource dataSource;
//
//	@Test
//	public void datasourceTest() throws SQLException {
//		// 获取数据源类型
//		System.out.println("默认数据源为：" + dataSource.getClass());
//		// 获取数据库连接对象
//		Connection connection = dataSource.getConnection();
//		// 判断连接对象是否为空
//		System.out.println(connection != null);
//		connection.close();
//	}


}
