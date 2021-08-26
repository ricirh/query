package com.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Data
@Document(indexName = "data", type = "inform")
public class Article {
    @Id
    private Long id;
    private String title;
    private String desc;
}
