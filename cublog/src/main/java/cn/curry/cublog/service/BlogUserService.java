package cn.curry.cublog.service;

import cn.curry.cublog.pojo.BlogUser;

public interface BlogUserService {

	public void createUser(BlogUser user);

	public void deleteUser(Integer id);

	public void updateUser(BlogUser user);

	public BlogUser getUser(Integer id);

	public Iterable<BlogUser> getAllUsers();
}
