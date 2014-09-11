package com.rmi.model;

import java.io.Serializable;

public class Config  implements Serializable {

    private static final long serialVersionUID = -7543191425619709995L;

    private String name;

    private byte[] bytes;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte[] getBytes() {
        return bytes;
    }

    public void setBytes(byte[] bytes) {
        this.bytes = bytes;
    }

}
