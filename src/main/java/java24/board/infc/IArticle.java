package java24.board.infc;

import java.util.HashMap;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java24.board.model.ModelArticle;
import java24.board.model.ModelAttachfile;
import java24.board.model.ModelBoard;
import java24.board.model.ModelComments;

public interface IArticle {
    
    //board
    
    String getBoardName(String boardcd);
    ModelBoard getBoardOne(String boardcd);
    List<ModelBoard> getBoardList ();
    List<ModelBoard> getBoardListResultMap();
    int bbsResultMap(HashMap map) ;
    // List<bbsResultMap> getBoardCustomMap();
    int insertBoard(ModelBoard board);
    int updateBoard(ModelBoard updateValue, ModelBoard searchValue);
    int deleteBoard(ModelBoard board);
    List<ModelBoard> getBoardSearch(ModelBoard board);
    List<ModelBoard> getBoardPaging(ModelBoard board);
    int insertBoardList ( List a );
    
    
    // article
     int getArticleTotalRecord ( ModelArticle searchWord );
     int getArticleList( ModelArticle searchWord );
     ModelArticle getArticle ( int articleNo );
     int insertArticle ( ModelArticle article );
     int updateArticle ( ModelArticle updateValue, ModelArticle searchValue);
     int deleteArticle ( ModelArticle article );
     int increaseHit ( int articleNo );
     List <ModelArticle> getNextArticle ( ModelArticle article, String searchWord);
     List <ModelArticle> getPrevArticle ( ModelArticle article, String searchWord);
     
    //AttachFile
     
     ModelAttachfile getAttachFile ( int attachFileNo );
     List <ModelAttachfile> getAttachFileList ( int articleNo );
     int insertAttachFile ( ModelAttachfile attach );
     int deleteAttachFile ( ModelAttachfile attach );
     
    //comment
     
     ModelComments getComment(int commentNo); 
     List<ModelComments> getCommentList (int articleNo); 
     int insertComment (ModelComments comm);
     int updateComment(ModelComments updateValue, ModelComments searchValue);
     int deleteComment (ModelComments comm);
     
     
}
