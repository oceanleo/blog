package com.oceanleo.blog.support.orm.query;

/**
 * @author haiyang.li
 */
public class PageQuery extends BaseQuery implements Pageable {

    private int pageNumber = 1;             //当前页数 (默认为1)

    private int pageSize = 10;              //分页大小 (默认15)

    @Override
    public int getPageNumber() {
        return pageNumber;
    }

    public void setPage(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    @Override
    public int getPageSize() {
        return pageSize;
    }

    public void setLimit(int pageSize) {
        this.pageSize = pageSize;
    }
}
