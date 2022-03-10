package com.example.sdkTest;

import com.alibaba.fastjson.JSON;
import com.szzj.dfh.sdk.basic.client.DfhHttpClient;
import com.szzj.dfh.sdk.basic.client.DfhOpClient;
import com.szzj.dfh.sdk.basic.domain.response.DfhOpResponse;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

/**
 * @version v1.0
 * @ClassName: JinhuaTest
 * @Description:
 * @Author: djl
 * @Date: 2021/8/18 13:13
 */
public class JinhuaTest {

    //出口api和应用关系的配置
    private static String hostUrl = "https://kfy.idw.jinhua.gov.cn";      //出口api - 请求地址 （ip+端口） 金华项目固定用https://kfy.idw.jinhua.gov.cn
    private static String appCode = "xianliu4";          // 应用关系 - 应用代码 （出口api配置的 对应的 应用关系）
    private static String appKey = "yaUhjLVCPhMJ";      // 应用关系 - AppKey （出口api 配置的对应的 应用关系）
    private static String appSecret = "PPHqY4pCiSx69DzmoJByFw7fv6ar91XJ";   // 应用关系 - AppSecret （出口api配置的对应的 应用关系）


    private static DfhOpClient dfhOpClient = DfhOpClient.getInstance(hostUrl, appCode, appKey, appSecret);
    private static DfhHttpClient dfhHttpClient = new DfhHttpClient();

    public static void main(String[] args) {
        try {
            数据授权();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }


    private static void 数据授权() throws UnsupportedEncodingException {
        Map<String, String> headerParamMap = new HashMap<String, String>();
        Map<String, String> bodyParamMap = new HashMap<String, String>();
        Map<String, Object> paramsMap = new HashMap<String, Object>();  //接口请求中requestParams入参 实例化

//接口body请求参数配置
        bodyParamMap.put("appId", "67");    // API数据服务 - 应用服务id (出口api对应的‘api数据服务’)
        bodyParamMap.put("apiCode", "4f7e0521-e805-49dc-8502-9448d110da0d");    //API数据服务 - API Hash Code (出口api对应的‘api数据服务’)

        //requestParams 参数配置 （paramsMap 中涵盖的参数传递）
        paramsMap.put("id", "136");
        //paramsMap.put("name","stockholm783@163.com");

        bodyParamMap.put("requestParams", JSON.toJSONString(paramsMap));    //requestParams入参，转换成json格式

        //jinrong 是出口api - 请求地址 后面的path 金华项目是需要在前面加上/gateway/
        DfhOpResponse<String> result = null;
        Map<String, String> urlPara = new HashMap<String, String>();
        String str = "我的大学";
//        urlPara.put("name", URLEncoder.encode(URLEncoder.encode(str,"UTF-8"),"UTF-8"));
//        urlPara.put("code","ew%2B4321%2F4321");
//        urlPara.put("payload","W5s+a0i+S6uuWvv+S/n");

        for (int i = 0; i < 1; i++) {  //循环调用次数
            result = dfhOpClient.executePostJson("/gateway/hhhh", headerParamMap, urlPara, bodyParamMap);
            //post请求，参数必须放在body中，不能放url中（大数据局） get请求，参数方url中

            //result = dfhOpClient.executePostJsonToForm("/gateway/hhhh", headerParamMap, null, bodyParamMap);
            System.out.println(result);
        }
    }


    private static void testPara() throws UnsupportedEncodingException {
        Map<String, String> headerParamMap = new HashMap<String, String>();
        headerParamMap.put("appKey","yaUhjLVCPhMJ");
        headerParamMap.put("nonce","nonce");
        Map<String, String> bodyParamMap = new HashMap<String, String>();

        bodyParamMap.put("bodySchool", "我的body");    // API数据服务 - 应用服务id (出口api对应的‘api数据服务’)
        bodyParamMap.put("bodyPayload", "我的payload W5s+a0i+S6uuWvv+S/nem");    //API数据服务 - API Hash Code (出口api对应的‘api数据服务’)


        DfhOpResponse<String> result = null;
        Map<String, String> urlPara = new HashMap<String, String>();
        String str = "我的大学";
        urlPara.put("paraSchool", "我的paraSchool");
        urlPara.put("paraPayload","我的paraPayload W5s+a0i+S6uuWvv+S/nem");


        for (int i = 0; i < 10; i++) {  //循环调用次数
            result = dfhOpClient.executePostJson("/gateway/test/testReceivePara", headerParamMap, urlPara, bodyParamMap);
            //post请求，参数必须放在body中，不能放url中（大数据局） get请求，参数方url中

            //result = dfhOpClient.executePostJsonToForm("/gateway/hhhh", headerParamMap, null, bodyParamMap);
            System.out.println(result);
        }
    }




}
