package cn.curry.cublog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.curry.cublog.pojo.Article;
import cn.curry.cublog.service.ArticleService;
import cn.curry.cublog.service.impl.ArticleServiceImpl;

@RestController
@RequestMapping("/article")
public class ArticleController {

	@Autowired
	private ArticleService articleService = new ArticleServiceImpl();

	public String saveArticle(Article article) {
		articleService.saveArticle(article);
		return "添加成功！";
	}
}
