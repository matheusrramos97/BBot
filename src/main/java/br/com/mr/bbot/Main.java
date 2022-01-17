package br.com.mr.bbot;
 
import br.com.mr.gui.UIMain;

public class Main
{
    static UIMain uiMain = new UIMain();
    public static void main(String[] args)
    {
        uiMain.setVisible(true);     
    }
    
    public void UIMainSetVisible(Boolean visible){
        uiMain.setVisible(visible); 
    }
    
    public void UIConfigSetVisible(Boolean visible){
        uiMain.setVisible(visible); 
    }
}