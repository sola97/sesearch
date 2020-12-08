package io.github.sola97.sesearch.service;

import io.github.sola97.sesearch.result.SearchResult;

public interface SearchService {
    public SearchResult queryByQQ(String qq);

    public SearchResult queryByUid(String uid);

    public SearchResult queryByPhone(String phone);
}
