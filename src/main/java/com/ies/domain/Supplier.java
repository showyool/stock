package com.ies.domain;

import java.io.Serializable;

public class Supplier implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column supplier.id
     *
     * @mbggenerated Sat May 02 11:25:47 CST 2020
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column supplier.username
     *
     * @mbggenerated Sat May 02 11:25:47 CST 2020
     */
    private String username;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column supplier.address
     *
     * @mbggenerated Sat May 02 11:25:47 CST 2020
     */
    private String address;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column supplier.phone
     *
     * @mbggenerated Sat May 02 11:25:47 CST 2020
     */
    private String phone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column supplier.status
     *
     * @mbggenerated Sat May 02 11:25:47 CST 2020
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table supplier
     *
     * @mbggenerated Sat May 02 11:25:47 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column supplier.id
     *
     * @return the value of supplier.id
     *
     * @mbggenerated Sat May 02 11:25:47 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column supplier.id
     *
     * @param id the value for supplier.id
     *
     * @mbggenerated Sat May 02 11:25:47 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column supplier.username
     *
     * @return the value of supplier.username
     *
     * @mbggenerated Sat May 02 11:25:47 CST 2020
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column supplier.username
     *
     * @param username the value for supplier.username
     *
     * @mbggenerated Sat May 02 11:25:47 CST 2020
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column supplier.address
     *
     * @return the value of supplier.address
     *
     * @mbggenerated Sat May 02 11:25:47 CST 2020
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column supplier.address
     *
     * @param address the value for supplier.address
     *
     * @mbggenerated Sat May 02 11:25:47 CST 2020
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column supplier.phone
     *
     * @return the value of supplier.phone
     *
     * @mbggenerated Sat May 02 11:25:47 CST 2020
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column supplier.phone
     *
     * @param phone the value for supplier.phone
     *
     * @mbggenerated Sat May 02 11:25:47 CST 2020
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column supplier.status
     *
     * @return the value of supplier.status
     *
     * @mbggenerated Sat May 02 11:25:47 CST 2020
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column supplier.status
     *
     * @param status the value for supplier.status
     *
     * @mbggenerated Sat May 02 11:25:47 CST 2020
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table supplier
     *
     * @mbggenerated Sat May 02 11:25:47 CST 2020
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", username=").append(username);
        sb.append(", address=").append(address);
        sb.append(", phone=").append(phone);
        sb.append(", status=").append(status);
        sb.append("]");
        return sb.toString();
    }
}