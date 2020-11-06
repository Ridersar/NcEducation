package com.nc.autumn2020.solutions.lesson6;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Arrays;

public class URLHolder {
    private String protocol;
    private String host;
    private int port;
    private String path;
    private KeyValueParameter[] keyValueParameters;

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String domain) {
        this.host = domain;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public KeyValueParameter[] getKeyValueParameters() {
        return keyValueParameters;
    }

    public void setKeyValueParameters(KeyValueParameter[] keyValueParameters) {
        this.keyValueParameters = keyValueParameters;
    }

    public void info() {
        System.out.println("URLHolder:\n" +
                "protocol = '" + protocol + "\'\n" +
                "host = '" + host + "\'\n" +
                "port = " + port + "\n" +
                "path = '" + path + "\'\n" +
                "keyValueParameters:\n" +
                Arrays.toString(keyValueParameters) +
                '}');
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(protocol)
                .append("://")
                .append(host)
                .append(":")
                .append(port)
                .append("/")
                .append(path)
                .append("?");
        for (int i = 0; i < keyValueParameters.length; i++) {
            String key = keyValueParameters[i].getKey();
            String value = keyValueParameters[i].getValue();
            try {
                key = URLEncoder.encode(key, "UTF-8");
                value = URLEncoder.encode(value, "UTF-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            sb.append(key).append("=").append(value).append("&");
        }
        String sOut = sb.toString();
        return sOut.substring(0, sOut.length() - 1);
    }
}
