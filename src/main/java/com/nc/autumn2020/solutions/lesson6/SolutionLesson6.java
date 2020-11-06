package com.nc.autumn2020.solutions.lesson6;

import com.nc.autumn2020.LessonApi;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class SolutionLesson6 implements LessonApi {
    @Override
    public void executeSolution(String[] args) {

        String url = "http://localhost.netcracker.com:6810/product.plain_taskc.nc?tab=_Task&object=909036315101" +
                "3783084&container=9158610804913819337&task=9158610813113819418&state=update&retu" +
                "rn=%2Fcommon%2Fuobject.jsp%3Fobject%3D9158610804913819337&object=9090363151013783084";

        URLHolder instance = new URLHolderFactory().createInstance(url);
    }
}
