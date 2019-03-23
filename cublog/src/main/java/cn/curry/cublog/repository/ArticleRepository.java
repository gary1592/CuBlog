package cn.curry.cublog.repository;

import org.springframework.data.repository.CrudRepository;

import cn.curry.cublog.pojo.Article;

public interface ArticleRepository extends CrudRepository<Article, Integer> {

}
