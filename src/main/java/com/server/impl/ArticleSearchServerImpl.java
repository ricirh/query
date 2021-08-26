package com.server.impl;

import com.entity.Article;
import com.server.ArticleSearchServer;
import org.springframework.beans.factory.annotation.Autowired;
import com.dao.ArticleSearchRepository;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ArticleSearchServerImpl implements ArticleSearchServer {

    @Autowired
    ArticleSearchRepository articleSearchRepository;


    @Override
    public Map search(String keyword) {
        List<Article> likeTitles =  articleSearchRepository.findByTitleLike(keyword);
        List<Article> likeDesces = articleSearchRepository.findByDescLike(keyword);
        Map mp = new HashMap();
        mp.put("likeTitles", likeTitles);
        mp.put("likeDesces", likeDesces);
        return mp;
    }

    @Override
    public Iterable<Article> insert(List<Article> articles) {
        return articleSearchRepository.saveAll(articles);
    }
}
