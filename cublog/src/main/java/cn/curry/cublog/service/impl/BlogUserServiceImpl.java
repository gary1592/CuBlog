package cn.curry.cublog.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.curry.cublog.pojo.BlogUser;
import cn.curry.cublog.repository.BlogUserRepository;
import cn.curry.cublog.service.BlogUserService;

@Service
@Transactional
public class BlogUserServiceImpl implements BlogUserService {

	@Autowired
	private BlogUserRepository userRepo;

	@Override
	public void createUser(BlogUser user) {
		// TODO Auto-generated method stub
		userRepo.save(user);
	}

	@Override
	public void deleteUser(Integer id) {
		// TODO Auto-generated method stub
		userRepo.deleteById(id);
	}

	@Override
	public void updateUser(BlogUser user) {
		// TODO Auto-generated method stub
		userRepo.save(user);
	}

	@Override
	public BlogUser getUser(Integer id) {
		// TODO Auto-generated method stub
		return userRepo.findById(id).get();
	}

	@Override
	public Iterable<BlogUser> getAllUsers() {
		// TODO Auto-generated method stub
		return userRepo.findAll();
	}

}
