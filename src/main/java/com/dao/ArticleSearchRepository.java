package com.dao;

import com.entity.Article;
import jdk.internal.dynalink.linker.LinkerServices;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticleSearchRepository extends ElasticsearchRepository<Article,Integer> {
    List<Article> findByTitleLike(String keyword);
    List<Article> findByDescLike(String keyword);
}
