package top.mowangblog.controller;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import top.mowangblog.pojo.Book;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;


/**
 * JavaWeb-MainPoints
 * xml demo
 *
 * @author : Xuan Li
 * @website : https://mowangblog.top
 * @date : 2021-10-02 22:37
 **/
public class XmlDemo {
    public static void main(String[] args) throws Exception {
        SAXReader saxReader = new SAXReader();
        Document document = saxReader.read("JavaWeb-xml/src/books.xml");
        System.out.println(document);
        //读取books.xml文件，获取根元素
        //通过根元素获得book标签对象
        //遍历处理每个book标签转化为book类
        Element rootElement = document.getRootElement();
        System.out.println(rootElement);
        //通过标签名查找子元素
        List<Element> books = rootElement.elements("book");
        for (Element book : books) {
            Element name = book.element("name");
            String price = book.elementText("price");
            String author = book.elementText("author");
            String id = book.attributeValue("id");
            Book book1 = new Book(id,name.getText(), author,Double.parseDouble(price));
            System.out.println(book1);
        }
    }
}
