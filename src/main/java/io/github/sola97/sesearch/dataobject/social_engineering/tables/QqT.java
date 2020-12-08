/*
 * This file is generated by jOOQ.
 */
package io.github.sola97.sesearch.dataobject.social_engineering.tables;


import io.github.sola97.sesearch.dataobject.social_engineering.Indexes;
import io.github.sola97.sesearch.dataobject.social_engineering.SocialEngineeringT;
import io.github.sola97.sesearch.dataobject.social_engineering.tables.records.QqRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row2;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class QqT extends TableImpl<QqRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>social_engineering.qq</code>
     */
    public static final QqT QQ = new QqT();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<QqRecord> getRecordType() {
        return QqRecord.class;
    }

    /**
     * The column <code>social_engineering.qq.qq</code>.
     */
    public final TableField<QqRecord, String> QQ_ = createField(DSL.name("qq"), SQLDataType.VARCHAR(13), this, "");

    /**
     * The column <code>social_engineering.qq.phone</code>.
     */
    public final TableField<QqRecord, String> PHONE = createField(DSL.name("phone"), SQLDataType.VARCHAR(30), this, "");

    private QqT(Name alias, Table<QqRecord> aliased) {
        this(alias, aliased, null);
    }

    private QqT(Name alias, Table<QqRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>social_engineering.qq</code> table reference
     */
    public QqT(String alias) {
        this(DSL.name(alias), QQ);
    }

    /**
     * Create an aliased <code>social_engineering.qq</code> table reference
     */
    public QqT(Name alias) {
        this(alias, QQ);
    }

    /**
     * Create a <code>social_engineering.qq</code> table reference
     */
    public QqT() {
        this(DSL.name("qq"), null);
    }

    public <O extends Record> QqT(Table<O> child, ForeignKey<O, QqRecord> key) {
        super(child, key, QQ);
    }

    @Override
    public Schema getSchema() {
        return SocialEngineeringT.SOCIAL_ENGINEERING;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.QQ_PHONE, Indexes.QQ_QQ);
    }

    @Override
    public QqT as(String alias) {
        return new QqT(DSL.name(alias), this);
    }

    @Override
    public QqT as(Name alias) {
        return new QqT(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public QqT rename(String name) {
        return new QqT(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public QqT rename(Name name) {
        return new QqT(name, null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<String, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }
}