package com.study.entity;

/**
 * @ClassName Greeting
 * @Description TODO
 * @Auther 靓仔
 * @Date 2019/2/28 23:43
 **/
public class Greeting {

    private final long id;
    private final String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
