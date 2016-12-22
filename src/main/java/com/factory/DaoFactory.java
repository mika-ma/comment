package com.factory;

import com.dao.CommentDao;

/**
 * Created by mwkang on 2016/12/19.
 * 工厂类
 */
public class DaoFactory {
    public static CommentDao getCommentDAOInstance(){
        return new CommentDao();
    }

}
