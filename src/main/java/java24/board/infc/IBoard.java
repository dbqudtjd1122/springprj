package java24.board.infc;

import java.util.HashMap;
import java.util.List;

import java24.board.model.ModelArticle;
import java24.board.model.ModelAttachfile;
import java24.board.model.ModelBoard;
import java24.board.model.ModelComments;

public interface IBoard {
    
    // Board
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
    
    
    // Article
     int getArticleTotalRecord ( ModelArticle searchWord );
     ModelArticle getArticleList( ModelArticle searchWord );
     ModelArticle getArticle ( int articleNo );
     int insertArticle ( ModelArticle article );
     int updateArticle ( ModelArticle updateValue, ModelArticle searchValue);
     int deleteArticle ( ModelArticle article );
     int increaseHit ( int articleNo );
     List <ModelArticle> getNextArticle ( ModelArticle article, ModelArticle search);
     List <ModelArticle> getPrevArticle ( ModelArticle searchWord);
     
    // AttachFile
     ModelAttachfile getAttachFile ( int attachFileNo );
     List <ModelAttachfile> getAttachFileList ( int articleNo );
     int insertAttachFile ( ModelAttachfile attach );
     int deleteAttachFile ( ModelAttachfile attach );
     
     // Comments     
     ModelComments getComment(int commentNo) throws Exception;
     ModelComments getCommentList (int articleNo) throws Exception;
     int insertComment (ModelComments comm) throws Exception;
     int updateComment(ModelComments updateValue, ModelComments searchValue) throws Exception;
     int deleteComment (ModelComments comm) throws Exception;
     
     
}
