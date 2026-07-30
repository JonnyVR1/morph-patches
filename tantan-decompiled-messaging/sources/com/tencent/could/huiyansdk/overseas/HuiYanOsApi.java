package com.tencent.could.huiyansdk.overseas;

import android.content.Context;
import com.tencent.could.huiyansdk.api.HuiYanAuthEventCallBack;
import com.tencent.could.huiyansdk.api.HuiYanResultDataCallBack;

/* JADX INFO: loaded from: classes2.dex */
public class HuiYanOsApi {
    public static String getVersion() {
        return "v1.0.9.36";
    }

    public static void init(Context context) {
        HuiYanOsApiImp.getInstance().init(context);
    }

    public static void release() {
        HuiYanOsApiImp.getInstance().release();
    }

    public static void setAuthEventCallBack(HuiYanAuthEventCallBack huiYanAuthEventCallBack) {
        HuiYanOsApiImp.getInstance().setAuthEventCallBack(huiYanAuthEventCallBack);
    }

    public static void setResultDataCallBack(HuiYanResultDataCallBack huiYanResultDataCallBack) {
        HuiYanOsApiImp.getInstance().setResultDataCallBack(huiYanResultDataCallBack);
    }

    public static void startAuthByLightData(String str, HuiYanResultCallBack huiYanResultCallBack) {
        HuiYanOsApiImp.getInstance().startAuthByLightData(str, huiYanResultCallBack);
    }

    public static void startGetAuthConfigData(HuiYanOsConfig huiYanOsConfig, HuiYanConfigCallback huiYanConfigCallback) {
        HuiYanOsApiImp.getInstance().startGetAuthConfigData(huiYanOsConfig, huiYanConfigCallback);
    }

    public static void startHuiYanAuth(String str, HuiYanOsConfig huiYanOsConfig, HuiYanOsAuthCallBack huiYanOsAuthCallBack) {
        HuiYanOsApiImp.getInstance().startHuiYanAuth(str, huiYanOsConfig, huiYanOsAuthCallBack);
    }
}
