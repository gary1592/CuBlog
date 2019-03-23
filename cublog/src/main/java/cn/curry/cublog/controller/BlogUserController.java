package cn.curry.cublog.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.curry.cublog.pojo.BlogUser;
import cn.curry.cublog.service.impl.BlogUserServiceImpl;

@RestController
@RequestMapping("/blog_user")
public class BlogUserController {

	private Logger log = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private BlogUserServiceImpl userService = new BlogUserServiceImpl();

	@PostMapping("/save")
	public String saveUser(@RequestBody BlogUser user) {
		// BlogUser user = new BlogUser();
		// user.setId(111);
		// user.setUserName("Jack");
		userService.createUser(user);
		log.info("Save user successfully!");
		return "创建成功！";
	}

	@DeleteMapping("/delete")
	public String deleteUser(@PathVariable Integer id) {
		userService.deleteUser(id);
		log.info("Delete user successfully!");
		return "删除成功！";
	}

	@PutMapping("/update")
	public String updateUser(BlogUser user) {
		userService.updateUser(user);
		log.info("Update user successfully!");
		return "更新成功！";
	}

	@GetMapping("/get")
	public BlogUser getUser(@PathVariable Integer id) {
		log.info("Get user successfully!");
		return userService.getUser(id);
	}

	@GetMapping("/getAll")
	public Iterable<BlogUser> getAll() {
		log.info("Get all users successfully!");
		return userService.getAllUsers();
	}
}
