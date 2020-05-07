package com.ies.vo;

import com.ies.domain.Customer;

/**
 * @program: stock
 * @description:
 * @author: fuchen
 * @create: 2020-05-02 22:32
 **/
public class CustomerVo extends Customer {

    /**
     * 分页参数
     */
    private Integer page;
    private Integer limit;
    private Long [] ids;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Long[] getIds() {
        return ids;
    }

    public void setIds(Long[] ids) {
        this.ids = ids;
    }

}
