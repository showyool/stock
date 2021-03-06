package com.ies.mapper;

import com.ies.domain.Stock;
import com.ies.domain.StockCriteria;

import java.math.BigDecimal;
import java.util.List;

import com.ies.vo.StockVo;
import com.ies.vo.statistics.StockReportVo;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface StockMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock
     *
     * @mbggenerated Wed May 06 21:23:49 CST 2020
     */
    int countByExample(StockCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock
     *
     * @mbggenerated Wed May 06 21:23:49 CST 2020
     */
    int deleteByExample(StockCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock
     *
     * @mbggenerated Wed May 06 21:23:49 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock
     *
     * @mbggenerated Wed May 06 21:23:49 CST 2020
     */
    int insert(Stock record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock
     *
     * @mbggenerated Wed May 06 21:23:49 CST 2020
     */
    int insertSelective(Stock record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock
     *
     * @mbggenerated Wed May 06 21:23:49 CST 2020
     */
    List<Stock> selectByExampleWithRowbounds(StockCriteria example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock
     *
     * @mbggenerated Wed May 06 21:23:49 CST 2020
     */
    List<Stock> selectByExample(StockCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock
     *
     * @mbggenerated Wed May 06 21:23:49 CST 2020
     */
    Stock selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock
     *
     * @mbggenerated Wed May 06 21:23:49 CST 2020
     */
    int updateByExampleSelective(@Param("record") Stock record, @Param("example") StockCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock
     *
     * @mbggenerated Wed May 06 21:23:49 CST 2020
     */
    int updateByExample(@Param("record") Stock record, @Param("example") StockCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock
     *
     * @mbggenerated Wed May 06 21:23:49 CST 2020
     */
    int updateByPrimaryKeySelective(Stock record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock
     *
     * @mbggenerated Wed May 06 21:23:49 CST 2020
     */
    int updateByPrimaryKey(Stock record);

    List<Stock> loadAllItemYear(StockVo stockVo);

    List<StockReportVo> stockReport(StockReportVo stockReportVo);

    BigDecimal stockTotalPriceReport(StockReportVo stockReportVo);
}