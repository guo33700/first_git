package dao.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import dao.UserDao;
import enity.User;
/**
 * ʵ��dao�ӿ��з�����һ��������
 * @author ��
 *
 */
public class UserDaoImpl implements UserDao {
	List<User> list = new ArrayList<User>();
	@Override
	public void save(User user) {
		// ����һ�������������û���Ϣ
		list.add(user);
		for(User user2 : list) {
			System.out.println(user2.getName()+","
					+ ""+user2.getAge());
		}

	}

	@Override
	public void update(User user) {
		System.out.println("ִ���޸��û��Ĳ���");
		for(User user1 : list) {
			System.out.println(user1.getName()+","
					+ ""+user1.getAge());
		}
		System.out.println("����");
		System.out.println("����2");
		System.out.println("9999");
		
	}

}
