/*
 * This file is generated by jOOQ.
 */
package io.github.sola97.sesearch.dataobject.social_engineering.tables.records;


import io.github.sola97.sesearch.dataobject.social_engineering.tables.WeiboT;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class WeiboRecord extends TableRecordImpl<WeiboRecord> implements Record2<String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>social_engineering.weibo.phone</code>.
     */
    public void setPhone(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>social_engineering.weibo.phone</code>.
     */
    public String getPhone() {
        return (String) get(0);
    }

    /**
     * Setter for <code>social_engineering.weibo.uid</code>.
     */
    public void setUid(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>social_engineering.weibo.uid</code>.
     */
    public String getUid() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row2<String, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    @Override
    public Row2<String, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return WeiboT.WEIBO.PHONE;
    }

    @Override
    public Field<String> field2() {
        return WeiboT.WEIBO.UID;
    }

    @Override
    public String component1() {
        return getPhone();
    }

    @Override
    public String component2() {
        return getUid();
    }

    @Override
    public String value1() {
        return getPhone();
    }

    @Override
    public String value2() {
        return getUid();
    }

    @Override
    public WeiboRecord value1(String value) {
        setPhone(value);
        return this;
    }

    @Override
    public WeiboRecord value2(String value) {
        setUid(value);
        return this;
    }

    @Override
    public WeiboRecord values(String value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached WeiboRecord
     */
    public WeiboRecord() {
        super(WeiboT.WEIBO);
    }

    /**
     * Create a detached, initialised WeiboRecord
     */
    public WeiboRecord(String phone, String uid) {
        super(WeiboT.WEIBO);

        setPhone(phone);
        setUid(uid);
    }
}