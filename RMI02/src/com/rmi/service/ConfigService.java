package com.rmi.service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import com.rmi.model.Config;

public interface ConfigService extends Remote {
    public boolean createConfig(List<Config> configList) throws RemoteException;

    public boolean updateConfig(List<Config> configList) throws RemoteException;

    public boolean deleteConfig(List<String> nameList) throws RemoteException;

}
