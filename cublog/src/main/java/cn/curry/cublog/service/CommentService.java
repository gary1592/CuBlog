package cn.curry.cublog.service;

import cn.curry.cublog.pojo.CommentRecord;

public interface CommentService {

	public Iterable<CommentRecord> getAllComments();
}
