package com.controller;

import com.entity.Article;
import com.server.ArticleSearchServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class ArticleSearchController {

    @Autowired
    ArticleSearchServer articleSearchServer;

    @GetMapping("/search")
    public Object search(String keyword){
        Map map = new HashMap();
        map.put("articles", articleSearchServer.search(keyword));
        return map;
    }

    @PostMapping("/insert")
    public Object isnert(List<Article> articles){
        return articleSearchServer.insert(articles);
    }
}
