package com.example.sdkTest;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.szzj.dfh.sdk.basic.client.DfhHttpClient;
import com.szzj.dfh.sdk.basic.client.DfhOpClient;
import com.szzj.dfh.sdk.basic.domain.response.DfhOpResponse;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SDKTest {
//    private static String hostUrl = "http://10.145.10.113:30080";     //    省 - dev
//    private static String appCode = "szzj";
//    private static String appKey = "WdBufAAXNLYU";
//    private static String appSecret = "Nj7N6zX7URmHwtPZ8FkFMEEIRikoUwTN";

//    private static String appCode = "anycall";
//    private static String appKey = "bFFKvnyoIgeS";
//    private static String appSecret = "QpiWUYQlProMf9rq1pjd2PzrTL2eu9IC";

//    private static String appCode = "moto";
//    private static String appKey = "vTxLvlfxRcbC";
//    private static String appSecret = "FSsUdQ4PrviRmNFJzolP6UXHTYCODS83";

//    private static String hostUrl = "http://10.145.11.63:30080";       //    省 - pre
//    省 - pre
//    private static String appCode = "baishe";
//    private static String appKey = "ojVJLKatbmlK";
//    private static String appSecret = "WnMxZYzDPfJlwcarygaDmvqEwB0rKObZ";

//        private static String hostUrl = "http://10.145.11.65:30080";       //    省 - prod
//        private static String appCode = "sssss";
//        private static String appKey = "JjuWpgQcxctD";
//        private static String appSecret = "iGQvin42E0mnW9TbMJvdaEgQFE0B7DZ1";

////    衢州 - Dev
//    private static String hostUrl = "http://10.27.169.110:30080";      // 衢州dev
//    private static String appCode = "szzj";
//    private static String appKey = "EFxdSjqnKgsg";
//    private static String appSecret = "cuPcoFzVmoUHZY2WQhNgJdeGwxMOoj55";

//    衢州 - Prod
//    private static String hostUrl = "http://gw.qz.gov.cn:82";         // 衢州prod ECS
//    private static String appCode = "szzj";
//    private static String appKey = "NRrYFJeREbbz";
//    private static String appSecret = "LcUZaMeGQO0Hp1useTPHGt4UdbgCGYu4";

    //  银保监测试
//    private static String appKey = "NRrYFJeREbbz";
//    private static String appCode = "szzj";
//    private static String appSecret = "LcUZaMeGQO0Hp1useTPHGt4UdbgCGYu4";

//    宁波
//    private static String hostUrl = "http://10.74.226.214:30080";
//    private static String appKey = "CqEBIWuHapZk";
//    private static String appCode = "yixindai";
//    private static String appSecret = "Xs7zCS4Dp0UydtESloLLe7IyoD2OJxxI";

//    private static String appKey = "EFxdSjqnKgsg";
//    private static String appCode = "szzj2";
//    private static String appSecret = "cuPcoFzVmoUHZY2WQhNgJdeGwxMOoj55";

//    基线线上
//    private static String hostUrl = "https://gd.0570w.net/api";
//    private static String appCode = "szzj";
//    private static String appKey = "EFxdSjqnKgsg";
//    private static String appSecret = "cuPcoFzVmoUHZY2WQhNgJdeGwxMOoj55";

//    基线 - TEST
//    private static String hostUrl = "http://10.145.11.63:30080";
//    private static String appCode = "b88489eaa4184a4c88e7cadba0964fb4";//关联应用appCode
//    private static String appKey = "CUUwpk4z9qGB";                     //关联应用appKey
//    private static String appSecret = "yZHTa4c6YfugwHHtp7hhWFsXxThGTt5s";//关联应用appSecret

//    台州开放域 - TEST
    //private static String hostUrl = "http://dfh-gateway-portal.tz-dev.kfy.xip.io";
//    private static String hostUrl = "http://kfy-api.etz.gov.cn";
//    private static String appCode = "999";//关联应用appCode
//    private static String appKey = "DBbuNthwJTFp";                     //关联应用appKey
//    private static String appSecret = "vNBGEHNDwMmzHifY3S2sveJpOTlMQ74X";//关联应用appSecret
//  金华开放域-test
    private static String hostUrl = "https://kfy.idw.jinhua.gov.cn";      //出口api - 请求地址 （ip+端口） 金华项目固定用https://kfy.idw.jinhua.gov.cn
    private static String appCode = "dddddd";          // 应用关系 - 应用代码 （出口api配置的 对应的 应用关系）
    private static String appKey = "aCuDlwWIEuRq";      // 应用关系 - AppKey （出口api 配置的对应的 应用关系）
    private static String appSecret = "ibMXDJID0sDeLkqsmbLyb4hKDm9vTvyY";

//    private static String appCode = "ddd";
//    private static String appKey = "kdIldDYNZpCj";
//    private static String appSecret = "ApG97O5QQ4Ky1xpeD6p3mSG8t4DtS38v";



    private static DfhOpClient dfhOpClient = DfhOpClient.getInstance(hostUrl, appCode, appKey, appSecret);
    private static DfhHttpClient dfhHttpClient = new DfhHttpClient();

    public static void main(String[] args) throws Exception {
        for (int i=0;i<8;i++) {
            //测试环境_企业数据在线导入测试();
            //数据服务测试();
            数据服务测试金华();
        }
    }
    public static void 测试环境_企业数据在线导入测试() {
        String hostUrl = "http://10.145.11.63:30080";
        String appKey = "fDNv7xs34ZEh";   //自有数据appKey
        String appSecret = "Up83M2879NnwKB4cu6AXWL98iAfR4czL"; //自有数据appSecret
        String appCode = "9"; //随便填写

        DfhOpClient dfhOpClient = DfhOpClient.getInstance(hostUrl, appCode, appKey, appSecret);
        Map<String, String> headerParamMap = new HashMap<>();
        Map<String, String> bodyParamMap = new HashMap<String, String>();
        List<Map<String, String>> rows = new ArrayList<>();
        Map<String, String> row1 = new HashMap<>();
        row1.put("id", "1");
        row1.put("name", "Andy112");
        Map<String, String> row2 = new HashMap<>();
        row2.put("id", "2");
        row2.put("name", "white132");
        rows.add(row1);
        rows.add(row2);
        bodyParamMap.put("applyId", "127");
        bodyParamMap.put("tableName", "fa_table001");
        bodyParamMap.put("rows", JSONArray.toJSONString(rows));

        DfhOpResponse<String> result = dfhOpClient.executePostJson(
                "/x-lab/data/import", headerParamMap, null, bodyParamMap);
    }

    private static void 数据授权1() throws UnsupportedEncodingException {
        Map<String, String> headerParamMap = new HashMap<String, String>();
        Map<String, String> bodyParamMap = new HashMap<String, String>();
        Map<String, Object> paramsMap = new HashMap<String, Object>();  //接口请求中requestParams入参 实例化

//接口body请求参数配置
        bodyParamMap.put("appId", "265");    // API数据服务 - 应用服务id (出口api对应的‘api数据服务’)
        bodyParamMap.put("apiCode", "c8576dd1-2299-46b0-a6df-05b728dc0b3c");    //API数据服务 - API Hash Code (出口api对应的‘api数据服务’)

        //requestParams 参数配置 （paramsMap 中涵盖的参数传递）
        paramsMap.put("id", "13");
        //paramsMap.put("name","stockholm783@163.com");

        bodyParamMap.put("requestParams", JSON.toJSONString(paramsMap));    //requestParams入参，转换成json格式

        //jinrong 是出口api - 请求地址 后面的path 金华项目是需要在前面加上/gateway/
        DfhOpResponse<String> result = null;
        Map<String, String> urlPara = new HashMap<String, String>();
        String str = "我的大学";
//        urlPara.put("name", URLEncoder.encode(URLEncoder.encode(str,"UTF-8"),"UTF-8"));
        urlPara.put("code","ew%2B4321%2F4321");
        urlPara.put("payload","W5s+a0i+S6uuWvv+S/n");

        for (int i = 0; i < 1; i++) {  //循环调用次数
            result = dfhOpClient.executePostJson("/gateway/szzj/93da8bb0-16c8-418d-8641-2e6f74cedbb5", headerParamMap, urlPara, bodyParamMap);
            //post请求，参数必须放在body中，不能放url中（大数据局） get请求，参数方url中

            //result = dfhOpClient.executePostJsonToForm("/gateway/hhhh", headerParamMap, null, bodyParamMap);
            System.out.println(result);
        }
    }


    private static void 衢州dev() {
        Map<String, String> headerParamMap = new HashMap<>();
        Map<String, String> urlParamMap = new HashMap<>();
        urlParamMap.put("sfzjhm", "330821197002122671");
//        urlParamMap.put("xm", "徐余芳");
        DfhOpResponse<String> result = dfhOpClient.executePostJson(
                "/gateway/api/001008013008001/dataSharing/Ibc85ja4Aa3Aoba9.htm",
                headerParamMap, urlParamMap,null);
        System.out.println(result);
    }

    private static void 省开放域() {
        Map<String, String> headerParamMap = new HashMap<>();
        Map<String, String> urlParamMap = new HashMap<>();

        urlParamMap.put("sfzjhm", "11010519690211813X");
//        urlParamMap.put("cardId", "33088119961201004X");
//        urlParamMap.put("xm", "卢燕萍");
        DfhOpResponse<String> result = dfhOpClient.executePostJson(
                "/gateway/api/001008013008001/dataSharing/Hcc1eq1wdf585y4f.htm",
                headerParamMap, urlParamMap,null);
        System.out.println(result);
    }

    private static void 数据服务测试金华() {
        Map<String, String> headerParamMap = new HashMap<>();
        Map<String, String> bodyParamMap = new HashMap<String, String>();
        Map<String, Object> paramsMap = new HashMap<String, Object>();

        bodyParamMap.put("appId", "288");
        bodyParamMap.put("apiCode", "a34c2101-89b6-4dd2-810b-5d711d2ec8ce");

        paramsMap.put("id", "13");
//        paramsMap.put("code", "sjff");
//        paramsMap.put("name", "数据服务接口");
        bodyParamMap.put("requestParams", JSON.toJSONString(paramsMap));

        DfhOpResponse<String> result = dfhOpClient.executePostJson(
                "/gateway/szzj/7f60e334-03df-42e5-adf0-c11b4293dc60", null, null, bodyParamMap);
        System.out.println(result);
        System.out.println("接口发送请求成功！！！");
    }

    private static void 普通HTTP() {
        Map<String, String> urlParamMap = new HashMap<>();
        urlParamMap.put("dataAuthRecordId", "1200109");
        urlParamMap.put("userConfirm", "true");
        String result = dfhHttpClient.get("http://59.202.49.19:18083/data/auth/apply/confirm", null, urlParamMap);
        System.out.println(result);
    }


    private static void hash16() {
        Map<String, String> headerParamMap = new HashMap<>();
        Map<String, String> bodyParamMap = new HashMap<String, String>();
        Map<String, Object> paramsMap = new HashMap<String, Object>();

        bodyParamMap.put("appId", "3903");
        bodyParamMap.put("apiCode", "2b218662-2851-4bbf-9c0c-cafbd7c5e20b");

        paramsMap.put("abc", "哈希十六");
        bodyParamMap.put("requestParams", JSON.toJSONString(paramsMap));

        DfhOpResponse<String> result = dfhOpClient.executePostJson("/hashsl", headerParamMap, null, bodyParamMap);
        System.out.println(result);
    }

    private static void hash32() {
        Map<String, String> headerParamMap = new HashMap<>();
        Map<String, String> bodyParamMap = new HashMap<String, String>();
        Map<String, Object> paramsMap = new HashMap<String, Object>();
        Map<String, String> urlPara = new HashMap<String, String>();


        bodyParamMap.put("appId", "3903");
        bodyParamMap.put("apiCode", "2377deea-b236-4de8-9214-fb61a42850b1");

        paramsMap.put("abc", "哈希三十二");
        bodyParamMap.put("requestParams", JSON.toJSONString(paramsMap));

//        urlPara.put("payload", "W5s+a0i+S6uuWvv+S/n");

        DfhOpResponse<String> result = dfhOpClient.executePostJson("/hashse", headerParamMap, null, bodyParamMap);
        System.out.println(result);
    }

    private static void 全遮盖() {
        Map<String, String> headerParamMap = new HashMap<>();
        Map<String, String> bodyParamMap = new HashMap<String, String>();
        Map<String, Object> paramsMap = new HashMap<String, Object>();

        bodyParamMap.put("appId", "3903");
        bodyParamMap.put("apiCode", "28247821-26cc-417b-a02c-6ab830534838");

        paramsMap.put("abc", "全遮盖");
        bodyParamMap.put("requestParams", JSON.toJSONString(paramsMap));

        DfhOpResponse<String> result = dfhOpClient.executePostJson("/qzg", headerParamMap, null, bodyParamMap);
        System.out.println(result);
    }

    private static void 标准车牌号() {
        Map<String, String> headerParamMap = new HashMap<>();
        Map<String, String> bodyParamMap = new HashMap<String, String>();
        Map<String, Object> paramsMap = new HashMap<String, Object>();

        bodyParamMap.put("appId", "3903");
        bodyParamMap.put("apiCode", "1bbd584c-86d0-4ec8-aec2-dc1efc84b276");

        paramsMap.put("abc", "标准车牌号遮盖");
        bodyParamMap.put("requestParams", JSON.toJSONString(paramsMap));

        DfhOpResponse<String> result = dfhOpClient.executePostJson("/bzcphzg", headerParamMap, null, bodyParamMap);
        System.out.println(result);
    }

    private static void 非标准车牌号() {
        Map<String, String> headerParamMap = new HashMap<>();
        Map<String, String> bodyParamMap = new HashMap<String, String>();
        Map<String, Object> paramsMap = new HashMap<String, Object>();

        bodyParamMap.put("appId", "3903");
        bodyParamMap.put("apiCode", "020666ab-fe6f-432b-bc6b-eca442884134");

        paramsMap.put("abc", "非标准车牌号遮盖");
        bodyParamMap.put("requestParams", JSON.toJSONString(paramsMap));

        DfhOpResponse<String> result = dfhOpClient.executePostJson("/fbzcph", headerParamMap, null, bodyParamMap);
        System.out.println(result);
    }

    private static void 前二后二遮盖() {
        Map<String, String> headerParamMap = new HashMap<>();
        Map<String, String> bodyParamMap = new HashMap<String, String>();
        Map<String, Object> paramsMap = new HashMap<String, Object>();

        bodyParamMap.put("appId", "3903");
        bodyParamMap.put("apiCode", "39fe425c-3834-4959-b25d-9515e5cb591f");

        paramsMap.put("abc", "前二后二遮盖");
        bodyParamMap.put("requestParams", JSON.toJSONString(paramsMap));

        DfhOpResponse<String> result = dfhOpClient.executePostJson("/qehezg", headerParamMap, null, bodyParamMap);
        System.out.println(result);
    }

    private static void 前二后零遮盖() {
        Map<String, String> headerParamMap = new HashMap<>();
        Map<String, String> bodyParamMap = new HashMap<String, String>();
        Map<String, Object> paramsMap = new HashMap<String, Object>();

        bodyParamMap.put("appId", "3903");
        bodyParamMap.put("apiCode", "3b2c616d-eeca-489c-9d18-6c7d9123b579");

        paramsMap.put("abc", "前二后零遮盖");
        bodyParamMap.put("requestParams", JSON.toJSONString(paramsMap));

        DfhOpResponse<String> result = dfhOpClient.executePostJson("/qehlzg", headerParamMap, null, bodyParamMap);
        System.out.println(result);
    }

    private static void 前二后二保留() {
        Map<String, String> headerParamMap = new HashMap<>();
        Map<String, String> bodyParamMap = new HashMap<String, String>();
        Map<String, Object> paramsMap = new HashMap<String, Object>();

        bodyParamMap.put("appId", "3903");
        bodyParamMap.put("apiCode", "cf1d5da1-5ff4-47ad-981a-65b23eced5b5");

        paramsMap.put("abc", "前二后二保留");
        bodyParamMap.put("requestParams", JSON.toJSONString(paramsMap));

        DfhOpResponse<String> result = dfhOpClient.executePostJson("/qehebl", headerParamMap, null, bodyParamMap);
        System.out.println(result);
    }

    private static void 前二后零保留() {
        Map<String, String> headerParamMap = new HashMap<>();
        Map<String, String> bodyParamMap = new HashMap<String, String>();
        Map<String, Object> paramsMap = new HashMap<String, Object>();

        bodyParamMap.put("appId", "3903");
        bodyParamMap.put("apiCode", "d976ca40-a378-4c6a-a97d-4ad243262f8d");

        paramsMap.put("abc", "前二后零保留");
        bodyParamMap.put("requestParams", JSON.toJSONString(paramsMap));

        DfhOpResponse<String> result = dfhOpClient.executePostJson("/qehlbl", headerParamMap, null, bodyParamMap);
        System.out.println(result);
    }

    private static void 自二至四遮盖() {
        Map<String, String> headerParamMap = new HashMap<>();
        Map<String, String> bodyParamMap = new HashMap<String, String>();
        Map<String, Object> paramsMap = new HashMap<String, Object>();

        bodyParamMap.put("appId", "3903");
        bodyParamMap.put("apiCode", "24af864d-3898-41ae-abf7-2bec2daa45c2");

        paramsMap.put("abc", "自二至四遮盖");
        bodyParamMap.put("requestParams", JSON.toJSONString(paramsMap));

        DfhOpResponse<String> result = dfhOpClient.executePostJson("/zezszg", headerParamMap, null, bodyParamMap);
        System.out.println(result);
    }

    private static void 自一至四遮盖() {
        Map<String, String> headerParamMap = new HashMap<>();
        Map<String, String> bodyParamMap = new HashMap<String, String>();
        Map<String, Object> paramsMap = new HashMap<String, Object>();

        bodyParamMap.put("appId", "3903");
        bodyParamMap.put("apiCode", "3aa6c74c-594c-4001-9767-f00da3703b21");

        paramsMap.put("abc", "自一至四遮盖");
        bodyParamMap.put("requestParams", JSON.toJSONString(paramsMap));

        DfhOpResponse<String> result = dfhOpClient.executePostJson("/zyzszg", headerParamMap, null, bodyParamMap);
        System.out.println(result);
    }

    private static void 自二至四保留() {
        Map<String, String> headerParamMap = new HashMap<>();
        Map<String, String> bodyParamMap = new HashMap<String, String>();
        Map<String, Object> paramsMap = new HashMap<String, Object>();

        bodyParamMap.put("appId", "3903");
        bodyParamMap.put("apiCode", "4f5c8c54-1e98-4162-a236-180003f65c87");

        paramsMap.put("abc", "自二至四保留");
        bodyParamMap.put("requestParams", JSON.toJSONString(paramsMap));

        DfhOpResponse<String> result = dfhOpClient.executePostJson("/zezsbl", headerParamMap, null, bodyParamMap);
        System.out.println(result);
    }

    private static void 自一至四保留() {
        Map<String, String> headerParamMap = new HashMap<>();
        Map<String, String> bodyParamMap = new HashMap<String, String>();
        Map<String, Object> paramsMap = new HashMap<String, Object>();

        bodyParamMap.put("appId", "3903");
        bodyParamMap.put("apiCode", "e61836cb-9b81-4413-ac29-c4a2cf02896d");

        paramsMap.put("abc", "自一至四保留");
        bodyParamMap.put("requestParams", JSON.toJSONString(paramsMap));

        DfhOpResponse<String> result = dfhOpClient.executePostJson("/zyzsbl", headerParamMap, null, bodyParamMap);
        System.out.println(result);
    }

    private static void 老之后遮盖() {
        Map<String, String> headerParamMap = new HashMap<>();
        Map<String, String> bodyParamMap = new HashMap<String, String>();
        Map<String, Object> paramsMap = new HashMap<String, Object>();

        bodyParamMap.put("appId", "3903");
        bodyParamMap.put("apiCode", "687b5009-648d-4d69-a4d0-c3a98a4bfdc4");

        paramsMap.put("abc", "老之后遮盖");
        bodyParamMap.put("requestParams", JSON.toJSONString(paramsMap));

        DfhOpResponse<String> result = dfhOpClient.executePostJson("/lzhzg", headerParamMap, null, bodyParamMap);
        System.out.println(result);
    }

    private static void 师之前遮盖() {
        Map<String, String> headerParamMap = new HashMap<>();
        Map<String, String> bodyParamMap = new HashMap<String, String>();
        Map<String, Object> paramsMap = new HashMap<String, Object>();

        bodyParamMap.put("appId", "3903");
        bodyParamMap.put("apiCode", "ea438752-87ad-4cf9-9962-1cf7238a347a");

        paramsMap.put("abc", "师之前遮盖");
        bodyParamMap.put("requestParams", JSON.toJSONString(paramsMap));

        DfhOpResponse<String> result = dfhOpClient.executePostJson("/szqzg", headerParamMap, null, bodyParamMap);
        System.out.println(result);
    }

    private static void 邮箱遮盖() {
        Map<String, String> headerParamMap = new HashMap<>();
        Map<String, String> bodyParamMap = new HashMap<String, String>();
        Map<String, Object> paramsMap = new HashMap<String, Object>();

        bodyParamMap.put("appId", "3903");
        bodyParamMap.put("apiCode", "82008c7a-9625-4cc1-8cfe-3cd23265d166");

        paramsMap.put("abc", "邮箱遮盖");
        bodyParamMap.put("requestParams", JSON.toJSONString(paramsMap));

        DfhOpResponse<String> result = dfhOpClient.executePostJson("/yxzg", headerParamMap, null, bodyParamMap);
        System.out.println(result);
    }

    private static void 通用证件遮盖() {
        Map<String, String> headerParamMap = new HashMap<>();
        Map<String, String> bodyParamMap = new HashMap<String, String>();
        Map<String, Object> paramsMap = new HashMap<String, Object>();

        bodyParamMap.put("appId", "3903");
        bodyParamMap.put("apiCode", "ccc5c806-299a-41f0-a2bb-917c54508701");

        paramsMap.put("abc", "通用证件遮盖");
        bodyParamMap.put("requestParams", JSON.toJSONString(paramsMap));

        DfhOpResponse<String> result = dfhOpClient.executePostJson("/tyzjzg", headerParamMap, null, bodyParamMap);
        System.out.println(result);
    }

    private static void 中文姓名() {
        Map<String, String> headerParamMap = new HashMap<>();
        Map<String, String> bodyParamMap = new HashMap<String, String>();
        Map<String, Object> paramsMap = new HashMap<String, Object>();

        bodyParamMap.put("appId", "3903");
        bodyParamMap.put("apiCode", "2d28ec91-a774-4b67-a8bd-07d71c424aae");

        paramsMap.put("abc", "中文姓名");
        bodyParamMap.put("requestParams", JSON.toJSONString(paramsMap));

        DfhOpResponse<String> result = dfhOpClient.executePostJson("/zwxm", headerParamMap, null, bodyParamMap);
        System.out.println(result);
    }

    private static void 英文姓名() {
        Map<String, String> headerParamMap = new HashMap<>();
        Map<String, String> bodyParamMap = new HashMap<String, String>();
        Map<String, Object> paramsMap = new HashMap<String, Object>();

        bodyParamMap.put("appId", "3903");
        bodyParamMap.put("apiCode", "86b83f7b-6b26-4db1-9ae1-e363303a411c");

        paramsMap.put("abc", "英文姓名");
        bodyParamMap.put("requestParams", JSON.toJSONString(paramsMap));

        DfhOpResponse<String> result = dfhOpClient.executePostJson("/ywxm", headerParamMap, null, bodyParamMap);
        System.out.println(result);
    }

    private static void 企业中文() {
        Map<String, String> headerParamMap = new HashMap<>();
        Map<String, String> bodyParamMap = new HashMap<String, String>();
        Map<String, Object> paramsMap = new HashMap<String, Object>();

        bodyParamMap.put("appId", "3903");
        bodyParamMap.put("apiCode", "ef3c2119-2786-4437-a121-61b8d3143cc4");

        paramsMap.put("abc", "企业中文");
        bodyParamMap.put("requestParams", JSON.toJSONString(paramsMap));

        DfhOpResponse<String> result = dfhOpClient.executePostJson("/qyzw", headerParamMap, null, bodyParamMap);
        System.out.println(result);
    }

    private static void 企业英文() {
        Map<String, String> headerParamMap = new HashMap<>();
        Map<String, String> bodyParamMap = new HashMap<String, String>();
        Map<String, Object> paramsMap = new HashMap<String, Object>();

        bodyParamMap.put("appId", "3903");
        bodyParamMap.put("apiCode", "d6e0c80e-0c3b-470b-87a0-8d1ffadbaf5a");

        paramsMap.put("abc", "企业英文");
        bodyParamMap.put("requestParams", JSON.toJSONString(paramsMap));

        DfhOpResponse<String> result = dfhOpClient.executePostJson("/qyyw", headerParamMap, null, bodyParamMap);
        System.out.println(result);
    }

    private static void 标准ip() {
        Map<String, String> headerParamMap = new HashMap<>();
        Map<String, String> bodyParamMap = new HashMap<String, String>();
        Map<String, Object> paramsMap = new HashMap<String, Object>();

        bodyParamMap.put("appId", "3903");
        bodyParamMap.put("apiCode", "b4a38098-7c5d-4a6f-b776-ae38cc3aef65");

        paramsMap.put("abc", "标准ip");
        bodyParamMap.put("requestParams", JSON.toJSONString(paramsMap));

        DfhOpResponse<String> result = dfhOpClient.executePostJson("/bzip", headerParamMap, null, bodyParamMap);
        System.out.println(result);
    }

    private static void 非标准ip() {
        Map<String, String> headerParamMap = new HashMap<>();
        Map<String, String> bodyParamMap = new HashMap<String, String>();
        Map<String, Object> paramsMap = new HashMap<String, Object>();

        bodyParamMap.put("appId", "3903");
        bodyParamMap.put("apiCode", "d9347b5a-4800-4757-8830-79ceca508d0f");

        paramsMap.put("abc", "非标准ip");
        bodyParamMap.put("requestParams", JSON.toJSONString(paramsMap));

        DfhOpResponse<String> result = dfhOpClient.executePostJson("/fbzip", headerParamMap, null, bodyParamMap);
        System.out.println(result);
    }

    private static void 自四至五固定映射() {
        Map<String, String> headerParamMap = new HashMap<>();
        Map<String, String> bodyParamMap = new HashMap<String, String>();
        Map<String, Object> paramsMap = new HashMap<String, Object>();

        bodyParamMap.put("appId", "3903");
        bodyParamMap.put("apiCode", "015b25e0-32a8-4fb6-b33c-d05dd7c19a4a");

        paramsMap.put("abc", "自四至五固定映射");
        bodyParamMap.put("requestParams", JSON.toJSONString(paramsMap));

        DfhOpResponse<String> result = dfhOpClient.executePostJson("/zszwgdys", headerParamMap, null, bodyParamMap);
        System.out.println(result);
    }

    private static void 前七位固定映射() {
        Map<String, String> headerParamMap = new HashMap<>();
        Map<String, String> bodyParamMap = new HashMap<String, String>();
        Map<String, Object> paramsMap = new HashMap<String, Object>();

        bodyParamMap.put("appId", "3903");
        bodyParamMap.put("apiCode", "b6a7bb8a-c61f-48c6-94f8-7850253f10f1");

        paramsMap.put("abc", "前七位固定映射");
        bodyParamMap.put("requestParams", JSON.toJSONString(paramsMap));

        DfhOpResponse<String> result = dfhOpClient.executePostJson("/qqwgdys", headerParamMap, null, bodyParamMap);
        System.out.println(result);
    }

    private static void 后七位固定映射() {
        Map<String, String> headerParamMap = new HashMap<>();
        Map<String, String> bodyParamMap = new HashMap<String, String>();
        Map<String, Object> paramsMap = new HashMap<String, Object>();

        bodyParamMap.put("appId", "3903");
        bodyParamMap.put("apiCode", "6b5dec7f-3bc8-42a3-a1c4-ab8c6f547924");

        paramsMap.put("abc", "后七位固定映射");
        bodyParamMap.put("requestParams", JSON.toJSONString(paramsMap));

        DfhOpResponse<String> result = dfhOpClient.executePostJson("/hqwgdys", headerParamMap, null, bodyParamMap);
        System.out.println(result);
    }
    private static void 后四位随机映射() {
        Map<String, String> headerParamMap = new HashMap<>();
        Map<String, String> bodyParamMap = new HashMap<String, String>();
        Map<String, Object> paramsMap = new HashMap<String, Object>();

        bodyParamMap.put("appId", "3903");
        bodyParamMap.put("apiCode", "0b7ae62a-f849-47fd-845d-541d67da1e22");

        paramsMap.put("abc", "后四位随机映射");
        bodyParamMap.put("requestParams", JSON.toJSONString(paramsMap));

        DfhOpResponse<String> result = dfhOpClient.executePostJson("/hswsjys", headerParamMap, null, bodyParamMap);
        System.out.println(result);
    }
    private static void 自一至四位随机映射() {
        Map<String, String> headerParamMap = new HashMap<>();
        Map<String, String> bodyParamMap = new HashMap<String, String>();
        Map<String, Object> paramsMap = new HashMap<String, Object>();

        bodyParamMap.put("appId", "3903");
        bodyParamMap.put("apiCode", "0b7ae62a-f849-47fd-845d-541d67da1e22");

        paramsMap.put("abc", "自一至四位随机映射");
        bodyParamMap.put("requestParams", JSON.toJSONString(paramsMap));

        DfhOpResponse<String> result = dfhOpClient.executePostJson("/zyzssjys", headerParamMap, null, bodyParamMap);
        System.out.println(result);
    }
    private static void 前四位随机映射() {
        Map<String, String> headerParamMap = new HashMap<>();
        Map<String, String> bodyParamMap = new HashMap<String, String>();
        Map<String, Object> paramsMap = new HashMap<String, Object>();

        bodyParamMap.put("appId", "3903");
        bodyParamMap.put("apiCode", "224f2a03-0031-4f2e-aef8-5ddef445e87a");

        paramsMap.put("abc", "前四位随机映射");
        bodyParamMap.put("requestParams", JSON.toJSONString(paramsMap));

        DfhOpResponse<String> result = dfhOpClient.executePostJson("/qswsjys", headerParamMap, null, bodyParamMap);
        System.out.println(result);
    }
    private static void 关键词映射() {
        Map<String, String> headerParamMap = new HashMap<>();
        Map<String, String> bodyParamMap = new HashMap<String, String>();
        Map<String, Object> paramsMap = new HashMap<String, Object>();

        bodyParamMap.put("appId", "3903");
        bodyParamMap.put("apiCode", "b2cdfb5a-e60a-453c-9f47-5f1cd8da54be");

        paramsMap.put("abc", "关键词映射");
        bodyParamMap.put("requestParams", JSON.toJSONString(paramsMap));

        DfhOpResponse<String> result = dfhOpClient.executePostJson("/gjcys", headerParamMap, null, bodyParamMap);
        System.out.println(result);
    }
    private static void 二四截断() {
        Map<String, String> headerParamMap = new HashMap<>();
        Map<String, String> bodyParamMap = new HashMap<String, String>();
        Map<String, Object> paramsMap = new HashMap<String, Object>();

        bodyParamMap.put("appId", "3903");
        bodyParamMap.put("apiCode", "b8362ec4-1ee6-45bc-8e85-3c10e4d2a4ad");

        paramsMap.put("abc", "二四截断");
        bodyParamMap.put("requestParams", JSON.toJSONString(paramsMap));

        DfhOpResponse<String> result = dfhOpClient.executePostJson("/esjd", headerParamMap, null, bodyParamMap);
        System.out.println(result);
    }
    private static void 一四截断() {
        Map<String, String> headerParamMap = new HashMap<>();
        Map<String, String> bodyParamMap = new HashMap<String, String>();
        Map<String, Object> paramsMap = new HashMap<String, Object>();

        bodyParamMap.put("appId", "3903");
        bodyParamMap.put("apiCode", "2cf5cd42-00df-4dff-9a60-1f64a296fe75");

        paramsMap.put("abc", "一四截断");
        bodyParamMap.put("requestParams", JSON.toJSONString(paramsMap));

        DfhOpResponse<String> result = dfhOpClient.executePostJson("/ysjd", headerParamMap, null, bodyParamMap);
        System.out.println(result);
    }
    private static void 二四截取() {
        Map<String, String> headerParamMap = new HashMap<>();
        Map<String, String> bodyParamMap = new HashMap<String, String>();
        Map<String, Object> paramsMap = new HashMap<String, Object>();

        bodyParamMap.put("appId", "3903");
        bodyParamMap.put("apiCode", "a9dc5e8c-c16d-4bc5-867f-0fd5a2da60a0");

        paramsMap.put("abc", "二四截取");
        bodyParamMap.put("requestParams", JSON.toJSONString(paramsMap));

        DfhOpResponse<String> result = dfhOpClient.executePostJson("/esjq", headerParamMap, null, bodyParamMap);
        System.out.println(result);
    }
    private static void 一四截取() {
        Map<String, String> headerParamMap = new HashMap<>();
        Map<String, String> bodyParamMap = new HashMap<String, String>();
        Map<String, Object> paramsMap = new HashMap<String, Object>();

        bodyParamMap.put("appId", "3903");
        bodyParamMap.put("apiCode", "df686cb6-75c9-4f52-ae1f-67e5fb926bb0");

        paramsMap.put("abc", "一四截取");
        bodyParamMap.put("requestParams", JSON.toJSONString(paramsMap));

        DfhOpResponse<String> result = dfhOpClient.executePostJson("/ysjq", headerParamMap, null, bodyParamMap);
        System.out.println(result);
    }
    private static void 老后截断() {
        Map<String, String> headerParamMap = new HashMap<>();
        Map<String, String> bodyParamMap = new HashMap<String, String>();
        Map<String, Object> paramsMap = new HashMap<String, Object>();

        bodyParamMap.put("appId", "3903");
        bodyParamMap.put("apiCode", "ae35599b-41a3-47ee-9a0f-cba0760dd932");

        paramsMap.put("abc", "老后截断");
        bodyParamMap.put("requestParams", JSON.toJSONString(paramsMap));

        DfhOpResponse<String> result = dfhOpClient.executePostJson("/lhjd", headerParamMap, null, bodyParamMap);
        System.out.println(result);
    }
    private static void 二取整散列() {
        Map<String, String> headerParamMap = new HashMap<>();
        Map<String, String> bodyParamMap = new HashMap<String, String>();
        Map<String, Object> paramsMap = new HashMap<String, Object>();

        bodyParamMap.put("appId", "3903");
        bodyParamMap.put("apiCode", "94093da5-fc37-4d47-a87e-396d885114ad");

        paramsMap.put("abc", "取整散列");
        bodyParamMap.put("requestParams", JSON.toJSONString(paramsMap));

        DfhOpResponse<String> result = dfhOpClient.executePostJson("/eqzsl", headerParamMap, null, bodyParamMap);
        System.out.println(result);
    }
    private static void 三分级散列() {
        Map<String, String> headerParamMap = new HashMap<>();
        Map<String, String> bodyParamMap = new HashMap<String, String>();
        Map<String, Object> paramsMap = new HashMap<String, Object>();

        bodyParamMap.put("appId", "3903");
        bodyParamMap.put("apiCode", "149ca2cd-2e41-4d33-85fc-2d0603d50f0c");

        paramsMap.put("abc", "分级散列");
        bodyParamMap.put("requestParams", JSON.toJSONString(paramsMap));

        DfhOpResponse<String> result = dfhOpClient.executePostJson("/sjfxsl", headerParamMap, null, bodyParamMap);
        System.out.println(result);
    }
}
