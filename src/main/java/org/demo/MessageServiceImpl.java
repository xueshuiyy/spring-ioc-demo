package org.demo;

/**
 * Created by Administrator on 2019/3/20.
 */
public class MessageServiceImpl implements MessageService, MessageNameInit {
    String name = "";

    public String getMessage() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
