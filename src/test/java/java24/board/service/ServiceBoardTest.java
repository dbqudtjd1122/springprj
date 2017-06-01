package java24.board.service;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

import java24.board.model.ModelArticle;
import java24.board.model.ModelBoard;

import static org.junit.Assert.*;

public class ServiceBoardTest {
    private static ServiceBoard service = null;

    @BeforeClass
    public static void setUp() throws Exception {
        try {
            // classpath 를 이용한 설정 파일 로딩
            ApplicationContext context = new ClassPathXmlApplicationContext("classpath:java24/board/ApplicationContext.xml");

            // file 을 이용한 설정 파일 로딩
            // ApplicationContext context = new
            // ClassPathXmlApplicationContext("file:src/main/webapp/WEBINF/spring/appServlet/servlet-context.xml");

            // DI를 이용한 serviceboard 인스턴스 생성
            service = context.getBean("serviceboard", ServiceBoard.class);
        } catch (BeansException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void getBoardName() throws Exception {

    }

    @Test
    public void getBoardOne() throws Exception {

    }

    @Test
    public void getBoardList() throws Exception {

    }

    @Test
    public void getBoardListResultMap() throws Exception {

    }

    @Test
    public void bbsResultMap() throws Exception {

    }

    @Test
    public void insertBoard() throws Exception {

    }

    @Test
    public void updateBoard() throws Exception {

    }

    @Test
    public void deleteBoard() throws Exception {

    }

    @Test
    public void getBoardSearch() throws Exception {

    }

    @Test
    public void getBoardPaging() throws Exception {

    }

    @Test
    public void insertBoardList() throws Exception {

    }

    @Test
    public void getArticleTotalRecord() throws Exception {
        ModelArticle article=new ModelArticle();
        article.setTitle("01");
        article.setBoardcd("free");
        int result=service.getArticleTotalRecord(article);

        assertSame(result, 1);
    }

    @Test
    public void getArticleList() throws Exception {
        ModelArticle article=new ModelArticle();
        article.setTitle("01");
        article.setBoardcd("free");
        ModelArticle result=service.getArticleList(article);

        assertSame(result, 53);

    }

    @Test
    public void getArticle() throws Exception {
        ModelArticle article=new ModelArticle();
        article.setArticle(1);
        ModelArticle result=service.getArticle(article);

        assertSame(result, 1);
    }

    @Test
    public void insertArticle() throws Exception {

    }

    @Test
    public void updateArticle() throws Exception {

    }

    @Test
    public void deleteArticle() throws Exception {

    }

    @Test
    public void increaseHit() throws Exception {

    }

    @Test
    public void getNextArticle() throws Exception {

    }

    @Test
    public void getPrevArticle() throws Exception {

    }

    @Test
    public void getAttachFile() throws Exception {

    }

    @Test
    public void getAttachFileList() throws Exception {

    }

    @Test
    public void insertAttachFile() throws Exception {

    }

    @Test
    public void deleteAttachFile() throws Exception {

    }

    @Test
    public void getComment() throws Exception {

    }

    @Test
    public void getCommentList() throws Exception {

    }

    @Test
    public void insertComment() throws Exception {

    }

    @Test
    public void updateComment() throws Exception {

    }

    @Test
    public void deleteComment() throws Exception {

    }

}