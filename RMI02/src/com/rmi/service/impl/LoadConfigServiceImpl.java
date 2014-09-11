package com.rmi.service.impl;

import java.io.File;
import java.io.IOException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

import com.rmi.model.Config;
import com.rmi.service.ConfigService;
import com.rmi.service.LoadConfigService;
import com.rmi.util.FileUtil;

public class LoadConfigServiceImpl extends UnicastRemoteObject implements LoadConfigService {
    
    public LoadConfigServiceImpl() throws RemoteException {
        super();
    }

    private static final long serialVersionUID = 6141595826055904286L;
    
    public static final String CONFIG_FOLDER = "/home/yuedu/RMI/config/from/";

    public List<Config> getConfigFiles() {
        String fileName = "jianshu.io.properties";
        Config config = new Config();
        config.setName(fileName);
        
        String content = FileUtil.getContentFromFile(CONFIG_FOLDER + fileName, "UTF-8");
        config.setBytes(content.getBytes());
        
        List<Config> configList = new ArrayList<Config>();
        configList.add(config);
        
        return configList;
    }

}
