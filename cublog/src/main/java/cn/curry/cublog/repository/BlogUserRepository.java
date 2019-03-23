package cn.curry.cublog.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cn.curry.cublog.pojo.BlogUser;

@Repository
public interface BlogUserRepository extends CrudRepository<BlogUser, Integer> {

}
