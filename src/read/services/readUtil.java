package read.services;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class readUtil {

    public BufferedReader creatReader(String path){
        try {
            File archivo = new File(path);
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            return br;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;    
    }
}
