package com.jxy.article_project.service.impl;

import com.jxy.article_project.entity.Article;
import com.jxy.article_project.service.ArticleShowService;
import org.springframework.stereotype.Service;
import sun.nio.cs.ext.GBK;

import java.io.*;
import java.util.zip.InflaterInputStream;

@Service
public class ArticleShowServiceImpl implements ArticleShowService {

    @Override
    public Article readArticle() {
        String str = null;
        String title = null;
        try(InputStream in = new BufferedInputStream(new FileInputStream("C:\\1.txt"));
            ByteArrayOutputStream out = new ByteArrayOutputStream()) {
            byte[] bytes = new byte[1024];
            int len = 0;
            while ((len = in.read(bytes))!=-1){
                out.write(bytes,0,len);
            }
            str = out.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        //标题
        try(BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\1.txt")))){
            title = br.readLine();
        }catch (Exception e){
            e.printStackTrace();
        }
        String strContent = str.replaceAll("\n", "<br>");
        String content = strContent.substring(strContent.indexOf("<br>")+4, strContent.length());
        Article article = new Article(title,content);
        return article;
    }
}
