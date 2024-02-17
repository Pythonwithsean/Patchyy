package org.utils;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.List;

public class Finder  {



    public static boolean validDir(String arg){

        
        if((arg.split("\\.").length != 2)){
            String exe = arg.split("\\.")[1];            
            if(exe.split("").length > 5) return false;
            else return true;
        }
        
        return false; 
        
    }
    

    public static void findFile(String filename) {
        boolean v = validDir(filename);
        List<Path> result; 
        if(v == true){
    
        Path p = Paths.get(System.getProperty("user.dir"));
        try {
            Stream<Path> found = Files.find(p, 10, (c,basicFileAttributes) ->  c.getFileName().toString().equalsIgnoreCase(filename));
            result = found.collect(Collectors.toList());
        } catch (IOException e) {
           
            e.printStackTrace();
        }

        }
        else if(v == false){
            System.out.println("Invalid File");
        }

        

        

        
    }

    
    
}
