package com.server;

import com.entity.Article;

import java.util.List;
import java.util.Map;

public interface ArticleSearchServer {
    Map search(String keyword);
    Iterable<Article> insert(List<Article> articles);
}
