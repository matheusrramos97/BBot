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

public class PutToWork extends TimerTask {

    public static int i = 0;
    static Screen screen = new Screen();
    ResourcesLoader resourcesLoader = new ResourcesLoader();

    public void run() {
        System.out.println("PutToWork: " + i++);
        putToWork();
    }

    public void putToWork() {
        if ((screen.exists(resourcesLoader.GetPattern("CheckInGame").similar(0.60)) != null)
                && (screen.exists(resourcesLoader.GetPattern("Error")) == null)) {
            System.out.println("inGame, putting to work...");
            try {
                putToWork(screen);
            } catch (FindFailed | InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void putToWork(Screen screen) throws FindFailed, InterruptedException {
        screen.wait(resourcesLoader.GetPattern("Bcoin").similar(0.90), 60).click();
        sleep(100);
        screen.wait(resourcesLoader.GetPattern("Menu"), 60).click();
        sleep(100);
        screen.wait(resourcesLoader.GetPattern("MenuHeroes"), 60).click();
        sleep(100);
        if (screen.exists(resourcesLoader.GetPattern("AllToWork")) != null) {
            screen.wait(resourcesLoader.GetPattern("AllToWork"), 60).click();
            sleep(100);
        }
        screen.wait(resourcesLoader.GetPattern("CloseMenuHeroes"), 60).click();
        sleep(1000);
        screen.wait(resourcesLoader.GetPattern("Bcoin").similar(0.90), 60).click();
    }
}
