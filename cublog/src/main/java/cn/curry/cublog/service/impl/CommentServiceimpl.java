package cn.curry.cublog.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.curry.cublog.pojo.CommentRecord;
import cn.curry.cublog.service.CommentService;

@Service
@Transactional
public class CommentServiceimpl implements CommentService {

	@Override
	public Iterable<CommentRecord> getAllComments() {
		// TODO Auto-generated method stub
		return null;
	}

}
