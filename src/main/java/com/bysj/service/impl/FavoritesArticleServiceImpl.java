package com.bysj.service.impl;


import com.bysj.common.request.BaseConverter;
import com.bysj.common.request.BaseServiceImpl;
import com.bysj.common.request.PageResult;
import com.bysj.dao.FavoritesArticleDao;
import com.bysj.entity.FavoritesArticle;
import com.bysj.entity.vo.query.FavoritesArticleQuery;
import com.bysj.entity.vo.request.FavoritesArticleRequest;
import com.bysj.entity.vo.response.FavoritesArticleResponse;
import com.bysj.service.IFavoritesArticleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 喜欢的文章表 服务实现类
 * </p>
 *
 * @author lc
 * @since 2019-01-10
 */
@Service
public class FavoritesArticleServiceImpl extends BaseServiceImpl<FavoritesArticle> implements IFavoritesArticleService {



        @Resource
        private FavoritesArticleDao favoritesArticleDao;
        @Resource
        private BaseConverter<FavoritesArticleRequest, FavoritesArticle> requestConverter;
        @Resource
        private BaseConverter<FavoritesArticle, FavoritesArticleResponse> responseConverter;

        @Override
        public Integer saveFavoritesArticle(FavoritesArticleRequest request) throws Exception {
            FavoritesArticle favoritesArticle = requestConverter.convert(request, FavoritesArticle.class);
            return favoritesArticleDao.insert(favoritesArticle);
        }

        @Override
        public Integer updateFavoritesArticle(FavoritesArticleRequest request) throws Exception {
            FavoritesArticle favoritesArticle = requestConverter.convert(request, FavoritesArticle.class);
            return favoritesArticleDao.update(favoritesArticle);
        }

        @Override
        public List<FavoritesArticleResponse> findListFavoritesArticle(FavoritesArticleQuery query) throws Exception {
            List<FavoritesArticle> favoritesArticleList = favoritesArticleDao.findQuery(query);
            //TODO
            List<FavoritesArticleResponse> favoritesArticleResponse = responseConverter.convert(favoritesArticleList,FavoritesArticleResponse.class );
            return favoritesArticleResponse;
        }

        @Override
        public PageResult<FavoritesArticleResponse> findPageFavoritesArticle(FavoritesArticleQuery query) throws Exception {
            return new PageResult<>(query.getPageSize(), this.findCount(query),query.getCurrentPage(), this.findListFavoritesArticle(query));
        }
}
