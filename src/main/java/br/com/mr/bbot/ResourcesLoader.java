package br.com.mr.bbot;

import java.io.File;
import org.sikuli.script.Pattern;

public class ResourcesLoader {

    public String loadImage(String name){
        try {
            String Path = new File("src\\main\\java\\resources\\" + name + ".png").getAbsolutePath();
            return Path;
        } catch (Exception e) {
            System.out.println("Could not load " + name);
            e.printStackTrace();
            return "false";
        }
    }
    public Pattern GetPattern(String patternName){
        Pattern pattern = new Pattern(loadImage(patternName));
        return pattern;
    }
}
