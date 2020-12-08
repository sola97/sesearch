/*
 * This file is generated by jOOQ.
 */
package io.github.sola97.sesearch.dataobject.social_engineering.tables.pojos;


import org.apache.commons.lang3.StringUtils;

import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class QqPO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String qq;
    private String phone;

    public QqPO() {
    }

    public QqPO(QqPO value) {
        this.qq = value.qq;
        this.phone = value.phone;
    }

    public QqPO(
            String qq,
            String phone
    ) {
        this.qq = qq;
        this.phone = phone;
    }

    /**
     * Getter for <code>social_engineering.qq.qq</code>.
     */
    public String getQq() {
        return this.qq;
    }

    /**
     * Setter for <code>social_engineering.qq.qq</code>.
     */
    public void setQq(String qq) {
        this.qq = qq;
    }

    /**
     * Getter for <code>social_engineering.qq.phone</code>.
     */
    public String getPhone() {
        return this.phone;
    }

    /**
     * Setter for <code>social_engineering.qq.phone</code>.
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("QqPO (");

        sb.append(qq);
        sb.append(", ").append(phone);

        sb.append(")");
        return sb.toString();
    }
}
