package com.tencent.connect.auth;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.tencent.connect.common.BaseApi;
import com.tencent.connect.common.Constants;
import com.tencent.connect.p077a.C13803a;
import com.tencent.open.log.SLog;
import com.tencent.open.utils.C14385c;
import com.tencent.open.utils.C14390h;
import com.tencent.open.utils.C14394l;
import com.tencent.open.utils.C14396n;
import com.tencent.tauth.IUiListener;
import java.io.File;
import java.util.Map;

/* JADX INFO: renamed from: com.tencent.connect.auth.c */
/* JADX INFO: loaded from: classes13.dex */
public class C13812c {

    /* JADX INFO: renamed from: a */
    private AuthAgent f57114a;

    /* JADX INFO: renamed from: b */
    private QQToken f57115b;

    private C13812c(String str, Context context) {
        SLog.m84309i("openSDK_LOG.QQAuth", "new QQAuth() --start");
        this.f57115b = new QQToken(str);
        this.f57114a = new AuthAgent(this.f57115b);
        C13803a.m81989c(context, this.f57115b);
        m82070a(context, Constants.SDK_VERSION);
        SLog.m84309i("openSDK_LOG.QQAuth", "new QQAuth() --end");
    }

    /* JADX INFO: renamed from: a */
    private int m82068a(Activity activity, Fragment fragment, String str, IUiListener iUiListener, String str2, boolean z, Map<String, Object> map) {
        try {
            String strM84431a = C14394l.m84431a(activity);
            if (strM84431a != null) {
                String strM84382a = C14385c.m84382a(new File(strM84431a));
                if (!TextUtils.isEmpty(strM84382a)) {
                    SLog.m84313v("openSDK_LOG.QQAuth", "-->login channelId: " + strM84382a);
                    return m82075a(activity, str, iUiListener, z, strM84382a, strM84382a, "");
                }
            }
        } catch (Throwable th) {
            SLog.m84308e("openSDK_LOG.QQAuth", "-->login get channel id exception.", th);
        }
        SLog.m84305d("openSDK_LOG.QQAuth", "-->login channelId is null ");
        BaseApi.isOEM = false;
        return this.f57114a.doLogin(activity, str, iUiListener, false, fragment, z, map);
    }

    /* JADX INFO: renamed from: b */
    public void m82083b(Context context, String str) {
        SLog.m84309i("openSDK_LOG.QQAuth", "setOpenId() --start");
        this.f57115b.setOpenId(str);
        C13803a.m81990d(context, this.f57115b);
        SLog.m84309i("openSDK_LOG.QQAuth", "setOpenId() --end");
    }

    /* JADX INFO: renamed from: c */
    public boolean m82084c() {
        SLog.m84309i("openSDK_LOG.QQAuth", "isSessionValid(), result = ".concat(this.f57115b.isSessionValid() ? "true" : "false"));
        return this.f57115b.isSessionValid();
    }

    /* JADX INFO: renamed from: b */
    public QQToken m82082b() {
        return this.f57115b;
    }

    /* JADX INFO: renamed from: b */
    public int m82081b(Activity activity, String str, IUiListener iUiListener) {
        SLog.m84309i("openSDK_LOG.QQAuth", "reAuth()");
        return this.f57114a.m82013a(activity, str, iUiListener, true, null, false);
    }

    /* JADX INFO: renamed from: a */
    public static C13812c m82069a(String str, Context context) {
        C14390h.m84406a(context.getApplicationContext());
        SLog.m84309i("openSDK_LOG.QQAuth", "QQAuth -- createInstance() --start");
        C13812c c13812c = new C13812c(str, context);
        SLog.m84309i("openSDK_LOG.QQAuth", "QQAuth -- createInstance()  --end");
        return c13812c;
    }

    /* JADX INFO: renamed from: a */
    public int m82072a(Activity activity, String str, IUiListener iUiListener) {
        SLog.m84309i("openSDK_LOG.QQAuth", "login()");
        return m82073a(activity, str, iUiListener, "");
    }

    /* JADX INFO: renamed from: a */
    public int m82074a(Activity activity, String str, IUiListener iUiListener, boolean z) {
        SLog.m84309i("openSDK_LOG.QQAuth", "login()");
        return m82067a(activity, null, str, iUiListener, "", z);
    }

    /* JADX INFO: renamed from: a */
    public int m82071a(Activity activity, IUiListener iUiListener, Map<String, Object> map) {
        SLog.m84309i("openSDK_LOG.QQAuth", "login--params");
        return m82068a(activity, (Fragment) null, C14396n.m84473a(map, Constants.KEY_SCOPE, "all"), iUiListener, "", C14396n.m84482a(map, Constants.KEY_QRCODE, false), map);
    }

    /* JADX INFO: renamed from: a */
    public int m82073a(Activity activity, String str, IUiListener iUiListener, String str2) {
        SLog.m84309i("openSDK_LOG.QQAuth", "-->login activity: " + activity);
        return m82066a(activity, (Fragment) null, str, iUiListener, str2);
    }

    /* JADX INFO: renamed from: a */
    public int m82076a(Fragment fragment, String str, IUiListener iUiListener, String str2) {
        FragmentActivity activity = fragment.getActivity();
        SLog.m84309i("openSDK_LOG.QQAuth", "-->login activity: " + activity);
        return m82066a(activity, fragment, str, iUiListener, str2);
    }

    /* JADX INFO: renamed from: a */
    public int m82077a(Fragment fragment, String str, IUiListener iUiListener, String str2, boolean z) {
        FragmentActivity activity = fragment.getActivity();
        SLog.m84309i("openSDK_LOG.QQAuth", "-->login activity: " + activity);
        return m82067a(activity, fragment, str, iUiListener, str2, z);
    }

    /* JADX INFO: renamed from: a */
    private int m82066a(Activity activity, Fragment fragment, String str, IUiListener iUiListener, String str2) {
        return m82067a(activity, fragment, str, iUiListener, str2, false);
    }

    /* JADX INFO: renamed from: a */
    private int m82067a(Activity activity, Fragment fragment, String str, IUiListener iUiListener, String str2, boolean z) {
        return m82068a(activity, fragment, str, iUiListener, str2, z, (Map<String, Object>) null);
    }

    /* JADX INFO: renamed from: a */
    public static void m82070a(Context context, String str) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("BuglySdkInfos", 0).edit();
        editorEdit.putString("bcb3903995", str);
        editorEdit.apply();
    }

    @Deprecated
    /* JADX INFO: renamed from: a */
    public int m82075a(Activity activity, String str, IUiListener iUiListener, boolean z, String str2, String str3, String str4) {
        SLog.m84309i("openSDK_LOG.QQAuth", "loginWithOEM");
        BaseApi.isOEM = true;
        if (str2.equals("")) {
            str2 = "null";
        }
        if (str3.equals("")) {
            str3 = "null";
        }
        if (str4.equals("")) {
            str4 = "null";
        }
        BaseApi.installChannel = str3;
        BaseApi.registerChannel = str2;
        BaseApi.businessId = str4;
        return this.f57114a.m82013a(activity, str, iUiListener, false, null, z);
    }

    /* JADX INFO: renamed from: a */
    public void m82078a() {
        this.f57114a.m82014a((IUiListener) null);
    }

    /* JADX INFO: renamed from: a */
    public void m82079a(IUiListener iUiListener) {
        this.f57114a.m82015b(iUiListener);
    }

    /* JADX INFO: renamed from: a */
    public void m82080a(String str, String str2) {
        SLog.m84309i("openSDK_LOG.QQAuth", "setAccessToken(), validTimeInSecond = " + str2 + "");
        this.f57115b.setAccessToken(str, str2);
    }
}
