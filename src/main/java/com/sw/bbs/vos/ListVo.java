package com.sw.bbs.vos;

import com.sw.bbs.entity.ArticleEntity;
import com.sw.bbs.entity.BoardEntity;
import com.sw.bbs.enums.ListResult;

public class ListVo extends BoardEntity {
    private int page;
    private ListResult result;
    private ArticleEntity[] articles;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public ListResult getResult() {
        return result;
    }

    public void setResult(ListResult result) {
        this.result = result;
    }

    public ArticleEntity[] getArticles() {
        return articles;
    }

    public void setArticles(ArticleEntity[] articles) {
        this.articles = articles;
    }
}
