package io.github.sola97.sesearch.action;


import io.github.sola97.sesearch.dataobject.social_engineering.Tables;
import io.github.sola97.sesearch.dataobject.social_engineering.tables.QqT;
import io.github.sola97.sesearch.dataobject.social_engineering.tables.WeiboT;
import io.github.sola97.sesearch.dataobject.social_engineering.tables.pojos.QqPO;
import io.github.sola97.sesearch.dataobject.social_engineering.tables.pojos.WeiboPO;
import io.github.sola97.sesearch.result.WeiboResult;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class WeiboAction extends BaseAction {
    WeiboT t = Tables.WEIBO;

    public List<WeiboResult> selectByUid(String uid) {
        return dsl.select(t.UID, t.PHONE)
                .from(t)
                .where(t.UID.equal(uid))
                .fetchStreamInto(WeiboResult.class)
                .collect(Collectors.toList());
    }

    public List<WeiboResult> selectByPhone(String phone) {
        return dsl.select(t.UID, t.PHONE)
                .from(t)
                .where(t.PHONE.equal(phone))
                .fetchStreamInto(WeiboResult.class)
                .collect(Collectors.toList());
    }
}