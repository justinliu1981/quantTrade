package com.grace.quant;

import com.grace.quant.entity.Account;
import com.grace.quant.repository.AccountRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Random;


@SpringBootTest
class QuantApplicationTests {

	@Autowired
	private AccountRepository repository;

	@Test
	void save_account() {
		Account account = new Account();
		String str="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		String name = "Peter Li";
		Random random = new Random();
		StringBuffer sb=new StringBuffer();
		sb.append(name);

		int number = random.nextInt(62);
		sb.append(str.charAt(number));

		account.setUsername(sb.toString());
		account.setPassword("password123");

		int age = random.nextInt(100);
		account.setAge(age);

		// create an account in DB
		repository.save(account);

	}

	@Test
	void query_account(){

		// query all
		List<Account> accountList = repository.findAll();
		Assertions.assertEquals(accountList.get(0).getUsername(), "Peter Li");
//		accountList.forEach( user -> {
//			Assertions.assertEquals(user.getUsername(), "Peter Li");
//		});

		// query single account
		Account user = repository.findById(1);
		Assertions.assertEquals(user.getUsername(), "Peter Li");

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
