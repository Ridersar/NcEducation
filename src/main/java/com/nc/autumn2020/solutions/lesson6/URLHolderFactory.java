package com.nc.autumn2020.solutions.lesson6;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class URLHolderFactory {
    public URLHolderFactory() {
    }

    public URLHolder createInstance(String url) {
        URLHolder urlHolder = new URLHolder();
        parse(url, urlHolder);
        return urlHolder;
    }

    private void parse(String url, URLHolder urlHolder) {
        String[] split = url.split("\\?", 2);
        String[] splitProtHostPortPath = split[0].split("://", 2);
        urlHolder.setProtocol(splitProtHostPortPath[0]);

        String[] splitHostPortPath = splitProtHostPortPath[1].split("/", 2);
        urlHolder.setPath(splitHostPortPath[1]);

        String[] splitHostPort = splitHostPortPath[0].split(":", 2);
        if (splitHostPort.length > 1) {
            urlHolder.setHost(splitHostPort[0]);
            urlHolder.setPort(Integer.parseInt(splitHostPort[1]));
        } else
            urlHolder.setHost(splitHostPort[0]);

        try {
            split[1] = URLDecoder.decode(split[1], "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        String[] s = split[1].split("&");
        KeyValueParameter[] params = new KeyValueParameter[s.length];
        for (int i = 0; i < s.length; i++) {
            String[] q = s[i].split("=", 2);
            KeyValueParameter param = new KeyValueParameter(q[0], q[1]);
            params[i] = param;
        }
        urlHolder.setKeyValueParameters(params);

        urlHolder.info();
        /*
        System.out.println(urlHolder.getProtocol());
        System.out.println(urlHolder.getHost());
        System.out.println(urlHolder.getPort());
        System.out.println(urlHolder.getPath());
        KeyValueParameter[] pr = urlHolder.getKeyValueParameters();
        for (int i = 0; i < pr.length; i++) {
            System.out.println(pr[i].getKey() + " " + pr[i].getValue());
        }
        */

        System.out.println("=================");
        System.out.println("Изначальный вариант:");
        System.out.println(url);
        System.out.println("Закодированный и раскодированный вариант:");
        System.out.println(urlHolder);
        System.out.println(url.equals(urlHolder.toString()));
    }
}
