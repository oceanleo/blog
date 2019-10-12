package com.oceanleo.blog.support.orm.query;

/**
 * @author haiyang.li
 */
public interface Pageable {

    int getPageNumber();            //当前页

    int getPageSize();              //分页大小
}
