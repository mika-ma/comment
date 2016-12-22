package com.controller;


import com.factory.ServiceFactory;
import com.vo.Comment;
import com.season.core.ActionKey;
import com.season.core.Controller;
import com.season.core.ControllerKey;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by mwkang on 2016/12/19.
 * 控制层
 */
@ControllerKey("product")
public class CommentController extends Controller {

    //查询显示所有评论
    @ActionKey("findAllComments")
    public void findAllComments(){
        List<Comment> all = ServiceFactory.getCommentServiceInstance().findAll();
        renderJson("comments",all);
    }

    //新增
    @ActionKey("saveComment")
    public void saveComment(){
        String content = getPara("comment");
        Comment vo = new Comment();
        vo.setCommentContent(content);
        vo.setProductName("computer");
        vo.setCreateDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date().getTime()));
                //new java.sql.Date(System.currentTimeMillis()));
        ServiceFactory.getCommentServiceInstance().insert(vo);
        renderJson();
    }

    //删除
    @ActionKey("delete")
    public void delete(){
        int id=getParaToInt("id");
        ServiceFactory.getCommentServiceInstance().delete(id);
    }

    //修改
    @ActionKey("update")
    public void update(){
        String changecontent = getPara("comment");
        Comment vo = new Comment();
        vo.setCommentId(getParaToInt("id"));
        vo.setCommentContent(changecontent);
        vo.setProductName("computer");
        vo.setCreateDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date().getTime()));
        ServiceFactory.getCommentServiceInstance().update(vo);
        renderJson();
    }


}