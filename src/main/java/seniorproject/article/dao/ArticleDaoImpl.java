package seniorproject.article.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Repository;
import seniorproject.article.entity.Article;
import seniorproject.article.repository.ArticleRepository;

@Profile("db")
@Repository
public class ArticleDaoImpl implements ArticleDao{
    @Autowired
    ArticleRepository articleRepository;

    @Override
    public Integer getArticleSize() {
        return Math.toIntExact(articleRepository.count());
    }

    @Override
    public Page<Article> getArticles(Integer pageSize, Integer page) {
        return articleRepository.findAll(PageRequest.of(page-1,pageSize));
    }

    @Override
    public Article getArticle(Long id) {
        return articleRepository.findById(id).orElse(null);
    }
}
