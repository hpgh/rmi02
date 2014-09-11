package com.rmi.client;

import java.rmi.Naming;
import java.util.List;
import com.rmi.model.Config;
import com.rmi.service.ConfigService;
import com.rmi.service.LoadConfigService;
import com.rmi.service.impl.LoadConfigServiceImpl;

public class ConfigClient {
    public static void main(String[] args) {
        try {
            // 调用远程对象，注意RMI路径与接口必须与服务器配置一致
            ConfigService configService = (ConfigService) Naming.lookup("rmi://127.0.0.1:6600/ConfigService");
            LoadConfigService loadConfigService = new LoadConfigServiceImpl();
            List<Config> configList = loadConfigService.getConfigFiles();
            
            boolean success = configService.createConfig(configList);
            if(success){
                System.out.println("success");
            }else{
                System.out.println("fail");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
