package cn.citasgoo.service.impl;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.citasgoo.dao.UserDao;
import cn.citasgoo.pojo.User;
import cn.citasgoo.service.UserService;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	public void insert(User user) {
		user.setKid(UUID.randomUUID().toString().replace("-", ""));
		userDao.insert(user);
	}

}
