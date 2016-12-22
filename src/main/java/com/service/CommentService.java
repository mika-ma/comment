package com.service;

import com.factory.DaoFactory;

import com.vo.Comment;
import java.util.List;

/**
 * Created by mwkang on 2016/12/19.
 * 服务层
 */
public class CommentService {
    public List<Comment> findAll(){
        return DaoFactory.getCommentDAOInstance().findAll();
    }

    public void insert(Comment vo){
        DaoFactory.getCommentDAOInstance().save(vo);
    }

    public void delete(int commentId){
        DaoFactory.getCommentDAOInstance().delete(commentId);
    }

    public void update(Comment vo){
        DaoFactory.getCommentDAOInstance().update(vo);
    }


}
