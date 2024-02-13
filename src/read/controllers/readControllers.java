package read.controllers;

import java.io.BufferedReader;
import java.io.IOException;

import read.services.readUtil;

public class readControllers {

    public void showText(String path){
        readUtil readUtil = new readUtil();
        BufferedReader br = readUtil.creatReader(path);
        String linea;
        try {
            while ((linea = br.readLine()) != null) {
                linea = linea.replace(",", "     ");
                System.out.println(linea);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}