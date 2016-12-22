package com.factory;

import com.service.CommentService;

/**
 * Created by DELL on 2016/12/19.
 * 工厂类
 */
public class ServiceFactory {
    public static CommentService getCommentServiceInstance(){
        return new CommentService();
    }
}
