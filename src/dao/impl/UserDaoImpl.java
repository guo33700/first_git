package dao.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import dao.UserDao;
import enity.User;
/**
 * 实现dao接口中方法的一个操作类
 * @author 果
 *
 */
public class UserDaoImpl implements UserDao {
	List<User> list = new ArrayList<User>();
	@Override
	public void save(User user) {
		// 创建一个集合来保存用户信息
		list.add(user);
		for(User user2 : list) {
			System.out.println(user2.getName()+","
					+ ""+user2.getAge());
		}

	}

	@Override
	public void update(User user) {
		System.out.println("执行修改用户的操作");
		for(User user1 : list) {
			System.out.println(user1.getName()+","
					+ ""+user1.getAge());
		}
		System.out.println("测试");
		System.out.println("测试2");
		System.out.println("9999");
		
	}

}
