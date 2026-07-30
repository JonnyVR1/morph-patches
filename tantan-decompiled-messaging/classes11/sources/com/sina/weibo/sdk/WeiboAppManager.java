package com.sina.weibo.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.text.TextUtils;
import com.sina.weibo.sdk.auth.WbAppInfo;
import com.sina.weibo.sdk.utils.LogUtil;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class WeiboAppManager {
    private static final String SDK_INT_FILE_NAME = "weibo_for_sdk.json";
    private static final String TAG = "com.sina.weibo.sdk.WeiboAppManager";
    private static final String WEIBO_4G_PACKAGENAME = "com.sina.weibog3";
    public static final String WEIBO_IDENTITY_ACTION = "com.sina.weibo.action.sdkidentity";
    private static final String WEIBO_PACKAGENAME = "com.sina.weibo";
    private static WeiboAppManager sInstance;
    private Context mContext;
    private WbAppInfo wbAppInfo;

    private WeiboAppManager(Context context) {
        this.mContext = context.getApplicationContext();
    }

    public static synchronized WeiboAppManager getInstance(Context context) {
        try {
            if (sInstance == null) {
                sInstance = new WeiboAppManager(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return sInstance;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x009b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    private static WbAppInfo parseWbInfoByAsset(Context context, String str) throws Throwable {
        InputStream inputStreamOpen;
        FilterInputStream filterInputStream = 0;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            try {
                byte[] bArr = new byte[4096];
                inputStreamOpen = context.createPackageContext(str, 2).getAssets().open(SDK_INT_FILE_NAME);
                try {
                    StringBuilder sb = new StringBuilder();
                    while (true) {
                        int i = inputStreamOpen.read(bArr, 0, 4096);
                        if (i == -1) {
                            break;
                        }
                        sb.append(new String(bArr, 0, i));
                    }
                    if (!TextUtils.isEmpty(sb.toString())) {
                        ApiUtils.validateWeiboSign(context, str);
                    }
                    JSONObject jSONObject = new JSONObject(sb.toString());
                    int iOptInt = jSONObject.optInt("support_api", -1);
                    String strOptString = jSONObject.optString("authActivityName", null);
                    if (iOptInt != -1 && !TextUtils.isEmpty(strOptString)) {
                        WbAppInfo wbAppInfo = new WbAppInfo();
                        wbAppInfo.setPackageName(str);
                        wbAppInfo.setSupportVersion(iOptInt);
                        wbAppInfo.setAuthActivityName(strOptString);
                        try {
                            inputStreamOpen.close();
                            return wbAppInfo;
                        } catch (IOException e) {
                            e.printStackTrace();
                            return wbAppInfo;
                        }
                    }
                    try {
                        inputStreamOpen.close();
                        return null;
                    } catch (IOException e2) {
                        e2.printStackTrace();
                        return null;
                    }
                } catch (Exception e3) {
                    e = e3;
                    LogUtil.m10830e(TAG, e.getMessage());
                    if (inputStreamOpen != null) {
                        try {
                            inputStreamOpen.close();
                        } catch (IOException e4) {
                            e4.printStackTrace();
                        }
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                filterInputStream = 2;
                if (filterInputStream != 0) {
                    try {
                        filterInputStream.close();
                    } catch (IOException e5) {
                        e5.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (Exception e6) {
            e = e6;
            inputStreamOpen = null;
        } catch (Throwable th2) {
            th = th2;
            if (filterInputStream != 0) {
                filterInputStream.close();
            }
            throw th;
        }
    }

    private static WbAppInfo queryWbInfoByAsset(Context context) throws Throwable {
        Intent intent = new Intent(WEIBO_IDENTITY_ACTION);
        intent.addCategory("android.intent.category.DEFAULT");
        List<ResolveInfo> listQueryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
        WbAppInfo wbAppInfo = null;
        if (listQueryIntentServices != null && !listQueryIntentServices.isEmpty()) {
            for (ResolveInfo resolveInfo : listQueryIntentServices) {
                ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                if (serviceInfo != null && serviceInfo.applicationInfo != null && !TextUtils.isEmpty(serviceInfo.packageName)) {
                    String str = resolveInfo.serviceInfo.packageName;
                    WbAppInfo wbInfoByAsset = parseWbInfoByAsset(context, str);
                    if (wbInfoByAsset != null) {
                        wbAppInfo = wbInfoByAsset;
                    }
                    if (WEIBO_PACKAGENAME.equals(str) || WEIBO_4G_PACKAGENAME.equals(str)) {
                        break;
                    }
                }
            }
        }
        return wbAppInfo;
    }

    public static WbAppInfo queryWbInfoInternal(Context context) {
        return queryWbInfoByAsset(context);
    }

    public synchronized WbAppInfo getWbAppInfo() {
        return queryWbInfoInternal(this.mContext);
    }

    @Deprecated
    public boolean hasWbInstall() {
        Intent intent = new Intent(WEIBO_IDENTITY_ACTION);
        intent.addCategory("android.intent.category.DEFAULT");
        List<ResolveInfo> listQueryIntentServices = this.mContext.getPackageManager().queryIntentServices(intent, 0);
        return (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) ? false : true;
    }
}
