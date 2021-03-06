/*
 * This file is generated by jOOQ.
 */
package io.github.sola97.sesearch.dataobject.social_engineering;


import io.github.sola97.sesearch.dataobject.DefaultCatalog;
import io.github.sola97.sesearch.dataobject.social_engineering.tables.QqT;
import io.github.sola97.sesearch.dataobject.social_engineering.tables.WeiboT;

import java.util.Arrays;
import java.util.List;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class SocialEngineeringT extends SchemaImpl {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>social_engineering</code>
     */
    public static final SocialEngineeringT SOCIAL_ENGINEERING = new SocialEngineeringT();

    /**
     * The table <code>social_engineering.qq</code>.
     */
    public final QqT QQ = QqT.QQ;

    /**
     * The table <code>social_engineering.weibo</code>.
     */
    public final WeiboT WEIBO = WeiboT.WEIBO;

    /**
     * No further instances allowed
     */
    private SocialEngineeringT() {
        super("social_engineering", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.<Table<?>>asList(
                QqT.QQ,
                WeiboT.WEIBO);
    }
}
