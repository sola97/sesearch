package io.github.sola97.sesearch.controller;

import io.github.sola97.sesearch.result.SearchResult;
import io.github.sola97.sesearch.service.SearchService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SearchController {

    @Autowired
    SearchService searchService;

    @GetMapping(value = "/")
    public String hello() {
        return "It works";
    }

    @GetMapping(value = "/query")
    public SearchResult queryByQQ(@RequestParam(required = false) String qq,
                                  @RequestParam(required = false) String uid,
                                  @RequestParam(required = false) String phone) {
        if (StringUtils.isNotBlank(qq)) {
            return searchService.queryByQQ(qq);
        }
        if (StringUtils.isNotBlank(uid)) {
            return searchService.queryByUid(uid);
        }
        if (StringUtils.isNotBlank(phone)) {
            return searchService.queryByPhone(phone);
        }
        return new SearchResult();
    }
}
