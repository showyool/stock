package com.ies.vo.statistics;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @program: stock
 * @description:
 * @author: fuchen
 * @create: 2020-05-10 09:25
 **/
public class BreakageReportVo implements Serializable {

    private String month;
    private String itemName;
    private String dateS;
    private String dateE;
    private BigDecimal price;
    private Integer count;

    /**
     * 分页参数
     */
    private Integer page;
    private Integer limit;

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getDateS() {
        return dateS;
    }

    public void setDateS(String dateS) {
        this.dateS = dateS;
    }

    public String getDateE() {
        return dateE;
    }

    public void setDateE(String dateE) {
        this.dateE = dateE;
    }

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

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
