package io.github.sola97.sesearch.service.impl;

import io.github.sola97.sesearch.action.QQAction;
import io.github.sola97.sesearch.action.WeiboAction;
import io.github.sola97.sesearch.dataobject.social_engineering.tables.pojos.QqPO;
import io.github.sola97.sesearch.dataobject.social_engineering.tables.pojos.WeiboPO;
import io.github.sola97.sesearch.result.SearchResult;
import io.github.sola97.sesearch.result.WeiboResult;
import io.github.sola97.sesearch.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchServiceImpl implements SearchService {
    @Autowired
    QQAction qqAction;
    @Autowired
    WeiboAction weiboAction;

    @Override
    public SearchResult queryByQQ(String qq) {
        SearchResult searchResult = new SearchResult();
        searchResult.getQq().addAll(qqAction.selectByQQ(qq));
        for (QqPO qqPO : searchResult.getQq()) {
            searchResult.getWeibo().addAll(weiboAction.selectByPhone(qqPO.getPhone()));
        }
        return searchResult;
    }

    @Override
    public SearchResult queryByUid(String uid) {
        SearchResult searchResult = new SearchResult();
        searchResult.getWeibo().addAll(weiboAction.selectByUid(uid));
        for (WeiboPO weiboPO : searchResult.getWeibo()) {
            searchResult.getQq().addAll(qqAction.selectByPhone(weiboPO.getPhone()));
        }
        return searchResult;
    }

    @Override
    public SearchResult queryByPhone(String phone) {
        SearchResult searchResult = new SearchResult();
        searchResult.getQq().addAll(qqAction.selectByPhone(phone));
        searchResult.getWeibo().addAll(weiboAction.selectByPhone(phone));
        return searchResult;
    }
}
