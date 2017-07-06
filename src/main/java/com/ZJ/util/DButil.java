package com.ZJ.util;

import com.ZJ.entity.Book;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lenovo on 2017/3/15.
 */
public class DButil {
    private static Map<String, Book> books = new HashMap<String, Book>();

    static {
        books.put("1", new Book("1", "乌合之众", 20, "王瑞鑫"));
        books.put("2", new Book("2", "十年", 20, "杨成一"));
        books.put("3", new Book("3", "红与黑", 30, "陈光"));
        books.put("4", new Book("4", "java编程思想", 10, "陈之家"));

    }

    public static Map<String, Book> findAllBooks()
    {
        return books;
    }
    public static  Book findBookById(String id)
    {
        return books.get(id);
    }
}

