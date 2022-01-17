/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.mr.bbot;

import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author MR
 */
public class TimerX {
    Timer timer;
    TimerTask task;
    public TimerX(TimerTask task){
        this.task = task;
    }
    
    public void Play(){
        System.out.println("Play() Init");
        CreateTimer();
        timer.schedule(task, 0, 2000);
        System.out.println("Play() End");
    }
    
    public void Pause(){
        timer.cancel();
        timer.purge();
        this.task = new ResetPage();
        
    }
    
    public void CreateTimer(){
        System.out.println("CreateTimer() Init");
        timer = new Timer();
        System.out.println("CreateTimer() End");
    }
}
