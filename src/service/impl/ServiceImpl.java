package service.impl;

import dao.UserDao;
import dao.impl.UserDaoImpl;
import enity.User;
import service.UserService;

public class ServiceImpl implements UserService {
	//ҵ���������ݷ��ʲ������
	UserDao dao = new UserDaoImpl();
	@Override
	public void save(User user) {
		// ʹ�����ݷ��ʲ��е��࣬�������ķ�����ʵ�����ݵ����
		dao.save(user);

	}

}
