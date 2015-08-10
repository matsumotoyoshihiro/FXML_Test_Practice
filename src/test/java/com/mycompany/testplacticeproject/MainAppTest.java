/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testplacticeproject;


import java.io.IOException;
import java.io.UncheckedIOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import static org.hamcrest.CoreMatchers.not;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.loadui.testfx.GuiTest;
import static org.loadui.testfx.controls.Commons.hasText;


/**
 *
 * @author User
 */
public class MainAppTest extends GuiTest {
/*    
    public MainAppTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of initialize method, of class FXMLController.
     */
    
    //テスト時にGUIを表示させるためのオーバーライド
    @Override
    protected Parent getRootNode(){
        MainApp test = new MainApp();
        try {
             return test.getRoot();
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
        
    }
    
    
    @Test   //クリック後のラベルとテキストボックス入力後の値が等しければ成功
    public void testTextFilde() {
        
        click("#button");
        assertThat("#label", hasText("Hello World!"));
        
        TextField testText = find("#txt");
        testText.setText("Hello World!");
        assertThat("#label", hasText(testText.getText()));
    }
    
    @Test   //表示されているラベルとテキストボックス内の文字が異なれば成功
    public void testTextNotEqlese() {
        TextField testText = find("#txt");
        Label labe = find("#label");
        
        labe.setText("");
        assertThat(hasText(testText.getText()),not(hasText(labe.getText())));
    }
    
/*
 *  エラーが出ているテスト  
 */    
    
/*    
    //アノテーションの@Testは並列に走ってる？？
    @Test
    public void shouldClickButton(){
        Button btn = find ("#button");
        Label callLabe = find ("#callback");
        TextField input = find("#txt");
        
        //入力後、クリックしてCallback用ラベルに表示
        input.setText("日本語つかえるかな？？？");
        callLabe.setText( input.getText());
        click(btn);
        
        //表示されないエラーが出る
        assertThat(hasText(callLabe.getText()) , hasText(input.getText()));
        assertNotSame(input , callLabe);
    }
*/    
}
