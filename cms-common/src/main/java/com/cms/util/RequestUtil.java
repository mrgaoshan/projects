package com.cms.util;

import java.net.URL;
import java.net.URLEncoder;
import java.util.Enumeration;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

public class RequestUtil {

    /**
     * 从request中取得参数，装于Map中
     * @param request
     * @return
     */
    public static HashMap<String,Object> getRequestParam(HttpServletRequest request) {
        HashMap<String,Object> data = new HashMap<String,Object>();
        Enumeration<String> e = request.getParameterNames();
        while (e.hasMoreElements()) {
            String key = e.nextElement();
            data.put(key, request.getParameter(key));
        }
        return data;
    }

    /**
     * 将页面取得的字符串id转化成整型数组
     * @param idStr
     * @return
     */
    public static int[] pkeyStrToIntArray(String idStr){
        String[] str = {};
        if(!idStr.trim().equals("")){
            str = idStr.trim().split(",");
        }
        int[] ids = new int[str.length];
        for(int i=0;i<str.length;i++){
            ids[i] = Integer.parseInt(str[i]);
        }
        return ids;
    }

   /* *//**
     * 取得当前登录用户信息
     * @param request
     * @return
     * @deprecated Use {@link #getLoginUser()} instead
     *//*
    public static Object getLoginUser(HttpServletRequest request){
        return getLoginUser();
    }

    *//**
     * 取得当前登录用户信息
     * @return
     * @deprecated Use {@link #getLoginUser()} instead
     *//*
    public static LoginUser getUserRealName(){
        return getLoginUser();
    }

    *//**
     * 取得当前登录用户信息
     * @return
     *//*
    public static LoginUser getLoginUser(){
        LoginUser loginUser = (LoginUser)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return loginUser;
    }*/

    /**
     * 根据资源名称，计算当前资源的绝对路径.
     * @param _sResourceName : TcdApp.ini
     * @return 在服务器端的完整绝对物理路径
     * @throws Exception
     */
    public static String getResourcePath(String _sResourceName) throws Exception {
        URL url = Thread.currentThread().getContextClassLoader().getResource(_sResourceName);
        if (url == null) {
            throw new Exception("资源文件[" + _sResourceName + "]没有找到！");
        }
        // 匹配绝对路径
        String sAbsolutePath = null;
        try {
            sAbsolutePath = url.getFile();
            if (sAbsolutePath.indexOf("%") >= 0) {
                // 转换编码为GBK
                String sEncoding = System.getProperty("file.encoding", "GBK");
                sAbsolutePath = URLEncoder.encode(sAbsolutePath, sEncoding);
            }
        } catch (Exception ex) {
            throw new Exception("转换文件[" + url.getFile() + "]的编码失败！", ex);
        }
        return sAbsolutePath;
    }
}
