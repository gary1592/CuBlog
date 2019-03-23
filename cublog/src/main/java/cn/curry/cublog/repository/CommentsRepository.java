package cn.curry.cublog.repository;

import org.springframework.data.repository.CrudRepository;

import cn.curry.cublog.pojo.BlogUser;

public interface CommentsRepository extends CrudRepository<BlogUser, Integer> {

}
