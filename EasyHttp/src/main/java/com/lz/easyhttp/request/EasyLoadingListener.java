package com.lz.easyhttp.request;

import java.util.List;
import java.util.Map;

/**
 * Created by liu_yu on 2014/4/16.
 * 请求回调方法
 */
public abstract class EasyLoadingListener<T> {
    /**
     * 网络错误
     */
    public abstract void netError();

    /**
     * 返回数据
     *
     * @param local  是否为本地数据
     * @param result 返回JSON数据
     */
    public abstract void success(boolean local, T result, Map<String, List<String>> headerMap);

    /**
     * 请求错误
     *
     * @param e
     * @param code
     * @param result
     */
    public abstract void error(Throwable e, int code, String result, Map<String, List<String>> headerMap);

    /**
     * 请求返回header信息
     */
    public void onHeaders(Map<String, List<String>> headerMap) {

    }
}
