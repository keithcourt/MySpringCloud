package com.my.cloud;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;


/**
 * @Author: liuxw
 * @Description:
 * @Date: Created in 15:45 2018/4/27
 * @Modified By:
 */

public class TestHttpClient {

    public static void main(String[] args) throws IOException {
        CloseableHttpClient httpclient = HttpClients.createDefault();
        // 调用6 次服务并输出结果
        for(int i = 0; i < 6; i++) {
            // 调用GET 方法请求服务
            HttpGet httpget = new HttpGet("http://localhost:9000/router");
            // 获取响应
            HttpResponse response = httpclient.execute(httpget);
            // 根据响应解析出字符串
            System.out.println(EntityUtils.toString(response.getEntity()));
        }
    }
}
