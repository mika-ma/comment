package com.vo;

import com.season.core.db.Pojo;
import com.season.core.db.annotation.Column;
import com.season.core.db.annotation.TableInfo;
import com.season.core.db.annotation.Transient;

import java.util.Date;

/**
 * Created by mwkang on 2016/12/19.
 * 实体类
 */
@TableInfo(tableName = Comment.tableName,pkName = "comment_id")
public class Comment extends Pojo<Comment>{
    public static final String tableName = "comment";

    @Column(name = "comment_id")
    private int commentId;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "comment_content")
    private String commentContent;

    @Column(name = "create_date")
    private String createDate;


    @Transient
    private String remark;

    public Comment(){}

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }



    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public Comment(int commentId, String productName, String commentContent, String createDate) {
        this.commentId = commentId;
        this.productName = productName;
        this.commentContent = commentContent;
        this.createDate = createDate;
    }

}
