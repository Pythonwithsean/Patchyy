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

        if(arg.contains(".")){
  
            if((arg.split("\\.").length == 2)){
                String exe = arg.split("\\.")[1];            
                if(exe.split("").length < 5) return true;
                else{
                    System.out.println("File Exe is longder than 4");
                    return false;
                }
            }
        }
        return false; 
        
    }
    

    public static void findFile(String filename) {
        boolean v = validDir(filename);
        List<Path> result; 
        if(v == true){
    
        Path p = Paths.get(System.getProperty("user.dir"));
    
        try {
        result = Files.find(p, 10, (f,a) ->  f.getFileName().toString().equals(filename)).toList();
        
            System.out.println(result);
        } catch (IOException e) {
           
            e.printStackTrace();
        }

        }
        else if(v == false){
            System.out.println("Invalid File");
        }

      

        

        
    }

    
    
}
