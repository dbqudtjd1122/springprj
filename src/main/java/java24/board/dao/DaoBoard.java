package java24.board.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java24.board.infc.IBoard;
import java24.board.model.ModelArticle;
import java24.board.model.ModelAttachfile;
import java24.board.model.ModelBoard;
import java24.board.model.ModelComments;

@Repository("daoboard")
public class DaoBoard implements IBoard {
    @Autowired
    @Qualifier("sqlSession")
    private SqlSession session;

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
        int result=-1;
        Map<String, String> map=new HashMap<String, String>();
        map.put("searchWord", searchWord.getTitle());
        map.put("boardcd", searchWord.getBoardcd());
        result=session.selectOne("mapper.mysql.mapperBoard.getArticleTotalRecord", map);

        return result;
    }

    @Override
    public ModelArticle getArticleList(ModelArticle searchWord) {
        ModelArticle result=null;
        Map<String, Object> map=new HashMap<String, Object>();
        map.put("searchWord", searchWord.getTitle());
        map.put("boardcd", searchWord.getBoardcd());
        map.put("start", 1);
        map.put("end", 100);
        result=session.selectOne("mapper.mysql.mapperBoard.getArticleList", map);

        return result;
    }

    @Override
    public ModelArticle getArticle(int articleNo) {
        ModelArticle result=null;
        result=session.selectOne("mapper.mysql.mapperBoard.getArticle", articleNo);

        return result;
    }

    @Override
    public int insertArticle(ModelArticle article) {
        int result=-1;
        result=session.insert("mapper.mysql.mapperBoard.insertArticle", article);

        return result;
    }

    @Override
    public int updateArticle(ModelArticle updateValue, ModelArticle searchValue) {
        int result=-1;
        Map<String, ModelArticle> map=new HashMap<String, ModelArticle>();
        map.put("whereboard", searchValue);
        map.put("setboard", updateValue);

        result=session.update("mapper.mysql.mapperBoard.insertArticle", map);

        return result;
    }

    @Override
    public int deleteArticle(ModelArticle article) {
        int result=-1;
        result=session.delete("mapper.mysql.mapperBoard.deleteArticle", article);

        return result;
    }

    @Override
    public int increaseHit(int articleNo) {
        int result=-1;
        result=session.selectOne("mapper.mysql.mapperBoard.increaseHit", articleNo);

        return result;
    }

    @Override
    public List<ModelArticle> getNextArticle(ModelArticle article, ModelArticle search) {
        List<ModelArticle> result=null;
        Map<String, ModelArticle> map=new HashMap<String, ModelArticle>();
        map.put("whereboard", search);
        map.put("setboard", article);

        result=session.selectList("mapper.mysql.mapperBoard.getArticle", map);

        return result;
    }

    @Override
    public List<ModelArticle> getPrevArticle(ModelArticle searchWord) {
        List<ModelArticle> result=null;

        result=session.selectOne("mapper.mysql.mapperBoard.getArticle", searchWord);

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
