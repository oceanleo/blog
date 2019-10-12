package com.oceanleo.blog.support.orm.query;

/**
 * @author haiyang.li
 */
public class BaseQuery {

    private String id;                      //数据 id

    private String keyword;                 //关键字

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }
}
