package seniorproject.article.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import seniorproject.article.entity.Article;

public interface ArticleDao {
    Integer getArticleSize();
    Page<Article> getArticles(Integer pageSize, Integer page);
    Article getArticle(Long id);
}
