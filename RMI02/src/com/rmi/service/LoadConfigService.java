package com.rmi.service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import com.rmi.model.Config;

public interface LoadConfigService extends Remote {

    public List<Config> getConfigFiles() throws RemoteException;

}
