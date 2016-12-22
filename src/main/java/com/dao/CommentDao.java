package com.dao;

import com.vo.Comment;
import com.season.core.db.Dao;
import org.springframework.stereotype.Repository;
import java.util.List;

/**
 * Created by DELL on 2016/12/19.
 * 数据层
 */
@Repository
public class CommentDao {
    //查询全部评论
    public List<Comment> findAll(){
        return Dao.findAll(Comment.class);
    }

    //增加评论数据
    public void save(Comment vo){
        Dao.save(vo);
    }

    //删除评论数据
    public void delete(int commentId){
        Dao.deleteById(Comment.class,commentId);
    }

    //修改评论数据
    public void update(Comment vo){
        Dao.update(vo);
    }

}
