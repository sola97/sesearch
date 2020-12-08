package io.github.sola97.sesearch.action;

import io.github.sola97.sesearch.dataobject.social_engineering.SocialEngineeringT;
import io.github.sola97.sesearch.dataobject.social_engineering.Tables;
import io.github.sola97.sesearch.dataobject.social_engineering.tables.QqT;
import io.github.sola97.sesearch.dataobject.social_engineering.tables.pojos.QqPO;
import io.github.sola97.sesearch.result.QQResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Component
public class QQAction extends BaseAction {
    QqT t = Tables.QQ;

    public List<QQResult> selectByQQ(String qq) {
        return dsl.select(t.QQ_, t.PHONE)
                .from(t)
                .where(t.QQ_.equal(qq))
                .fetchStreamInto(QQResult.class)
                .collect(Collectors.toList());
    }

    public List<QQResult> selectByPhone(String phone) {
        return dsl.select(t.QQ_, t.PHONE)
                .from(t)
                .where(t.PHONE.equal(phone))
                .fetchStreamInto(QQResult.class)
                .collect(Collectors.toList());
    }
}
