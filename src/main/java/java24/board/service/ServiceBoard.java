package java24.board.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java24.board.infc.IBoard;
import java24.board.model.ModelArticle;
import java24.board.model.ModelAttachfile;
import java24.board.model.ModelBoard;
import java24.board.model.ModelComments;
@Service("serviceboard")
public class ServiceBoard implements IBoard{
    private static Logger log= LoggerFactory.getLogger(ServiceBoard.class);
    @Autowired
    @Qualifier("daoboard")
    private IBoard board;

    @Override
    public String getBoardName(String boardcd) {
        return null;
    }

    @Override
    public ModelBoard getBoardOne(String boardcd) {
        return null;
    }

    @Override
    public List<ModelBoard> getBoardList() {
        return null;
    }

    @Override
    public List<ModelBoard> getBoardListResultMap() {
        return null;
    }

    @Override
    public int bbsResultMap(HashMap map) {
        return 0;
    }

    @Override
    public int insertBoard(ModelBoard board) {
        return 0;
    }

    @Override
    public int updateBoard(ModelBoard updateValue, ModelBoard searchValue) {
        return 0;
    }

    @Override
    public int deleteBoard(ModelBoard board) {
        return 0;
    }

    @Override
    public List<ModelBoard> getBoardSearch(ModelBoard board) {
        return null;
    }

    @Override
    public List<ModelBoard> getBoardPaging(ModelBoard board) {
        return null;
    }

    @Override
    public int insertBoardList(List a) {
        return 0;
    }

    @Override
    public int getArticleTotalRecord(ModelArticle searchWord) {
        int result = -1;
        try {
            result=board.getArticleTotalRecord(searchWord);
        } catch (Exception e) {
            log.error("getArticleTotalRecord" + e.getMessage() );
        }

        return result;
    }

    @Override
    public ModelArticle getArticleList(ModelArticle searchWord) {
         ModelArticle result = null;
        try {
            result=board.getArticleList(searchWord);
        } catch (Exception e) {
            log.error("getArticleList" + e.getMessage() );
        }

        return result;
    }

    @Override
    public ModelArticle getArticle(int articleNo) {
        ModelArticle result = null;
        try {
            result=board.getArticle(articleNo);
        } catch (Exception e) {
            log.error("getArticle" + e.getMessage() );
        }

        return result;
    }

    @Override
    public int insertArticle(ModelArticle article) {
        int result = -1;
        try {
            result=board.insertArticle(article);
        } catch (Exception e) {
            log.error("insertArticle" + e.getMessage() );
        }

        return result;
    }

    @Override
    public int updateArticle(ModelArticle updateValue, ModelArticle searchValue) {
        int result=-1;
        try {
            result=board.updateArticle(updateValue, searchValue);
        } catch (Exception e) {

            log.error("updateArticle" + e.getMessage() );
        }
        return result;
    }

    @Override
    public int deleteArticle(ModelArticle article) {
        int result = -1;
        try {
            result=board.deleteArticle(article);
        } catch (Exception e) {
            log.error("deleteArticle" + e.getMessage() );
        }

        return result;
    }

    @Override
    public int increaseHit(int articleNo) {
        int result = -1;
        try {
            result=board.increaseHit(articleNo);
        } catch (Exception e) {
            log.error("increaseHit" + e.getMessage() );
        }

        return result;
    }

    @Override
    public List<ModelArticle> getNextArticle(ModelArticle article, ModelArticle search) {
        List<ModelArticle> result = null;
        try {
            result=board.getNextArticle(article, search);
        } catch (Exception e) {
            log.error("getNextArticle" + e.getMessage() );
        }

        return result;
    }

    @Override
    public List<ModelArticle> getPrevArticle(ModelArticle searchWord) {
        List<ModelArticle> result = null;
        try {
            result=board.getPrevArticle(searchWord);
        } catch (Exception e) {
            log.error("getPrevArticle" + e.getMessage() );
        }

        return result;
    }

    @Override
    public ModelAttachfile getAttachFile(int attachFileNo) {

        return null;
    }

    @Override
    public List<ModelAttachfile> getAttachFileList(int articleNo) {
        return null;
    }

    @Override
    public int insertAttachFile(ModelAttachfile attach) {
        return 0;
    }

    @Override
    public int deleteAttachFile(ModelAttachfile attach) {
        return 0;
    }

    @Override
    public ModelComments getComment(int commentNo) throws Exception {
        return null;
    }

    @Override
    public ModelComments getCommentList(int articleNo) throws Exception {
        return null;
    }

    @Override
    public int insertComment(ModelComments comm) throws Exception {
        return 0;
    }

    @Override
    public int updateComment(ModelComments updateValue, ModelComments searchValue) throws Exception {
        return 0;
    }

    @Override
    public int deleteComment(ModelComments comm) throws Exception {
        return 0;
    }
}
