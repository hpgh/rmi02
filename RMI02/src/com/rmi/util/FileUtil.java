package com.rmi.util;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import org.apache.commons.lang.StringUtils;

public class FileUtil {
    
    public static String getContentFromFile(String filePath, String charSet){
        BufferedReader buf = null;
        String content = null;
        
        if(StringUtils.isBlank(filePath)){
            return null;
        }
        
        try{
            buf = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), charSet));
            StringBuilder str = new StringBuilder();
            String tempStr = "";
            while((tempStr = buf.readLine()) != null){
                str.append(tempStr);
            }
            content = str.toString();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            try {
                buf.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        
        return content;
    }

}
