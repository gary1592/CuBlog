package cn.curry.cublog.service;

import cn.curry.cublog.pojo.Article;

public interface ArticleService {

	public void saveArticle(Article articel);

	public void deleteArticle(Integer id);

	public void updateArticle(Article articel);

	public void getArticle(Integer id);

	public void getAllArticles();

}
