/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.mr.bbot;

import static java.lang.Thread.sleep;
import java.util.TimerTask;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Key;
import org.sikuli.script.Screen;

public class ResetPage extends TimerTask {

    public static int i = 0;
    static Screen screen = new Screen();
    ResourcesLoader resourcesLoader = new ResourcesLoader();

    public void run() {
        System.out.println("Test " + i++);
        resetPage();
    }

    public void resetPage() {
        if ((screen.exists(resourcesLoader.GetPattern("CheckInGame").similar(0.60)) != null)
                && (screen.exists(resourcesLoader.GetPattern("Error")) == null)) {
            //If error not detected
        } else {
            System.out.println("Error, resetting the page...");
            try {
                ResetPageNow(screen);
            } catch (FindFailed | InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void ResetPageNow(Screen screen) throws FindFailed, InterruptedException {
        System.out.println("ResetPageNow");
        sleep(100);
        screen.type(Key.F5);
        sleep(1000);
        screen.wait(resourcesLoader.GetPattern("ConnectWallet"), 60).click();
        sleep(100);
        screen.wait(resourcesLoader.GetPattern("Sign"), 60).click();
        sleep(100);
        screen.wait(resourcesLoader.GetPattern("TreasureHunt"), 60).click();
    }
}
