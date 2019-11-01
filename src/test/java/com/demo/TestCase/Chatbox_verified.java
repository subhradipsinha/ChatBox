package com.demo.TestCase;

import com.demo.PageObject.ChatBox;
import com.demo.PageObject.Hooks;
import com.demo.PageObject.Quite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Chatbox_verified {
    Hooks hooks =new Hooks();
    ChatBox chatBox =new ChatBox();
    Quite quite = new Quite();

    @BeforeTest
    public void login_Url() throws Exception {
        hooks.initilize();
    }
    @Test
    public void Chat() throws Exception {
        chatBox.Chat_box();
    }
    @AfterTest
    public void driver_quite(){
        quite.driver_close();
    }
}
