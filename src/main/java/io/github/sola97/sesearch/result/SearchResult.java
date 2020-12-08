package io.github.sola97.sesearch.result;


import io.github.sola97.sesearch.dataobject.social_engineering.tables.pojos.QqPO;
import io.github.sola97.sesearch.dataobject.social_engineering.tables.pojos.WeiboPO;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;


public class SearchResult {
    private List<QQResult> qq;
    private List<WeiboResult> weibo;

    public SearchResult() {
        qq = new ArrayList<>();
        weibo = new ArrayList<>();
    }

    public List<QQResult> getQq() {
        return qq;
    }

    public void setQq(List<QQResult> qq) {
        this.qq = qq;
    }

    public List<WeiboResult> getWeibo() {
        return weibo;
    }

    public void setWeibo(List<WeiboResult> weibo) {
        this.weibo = weibo;
    }
}
