package com.tencent.connect.auth;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.tencent.connect.common.BaseApi;
import com.tencent.connect.common.Constants;
import com.tencent.connect.p082a.C13966a;
import com.tencent.open.log.SLog;
import com.tencent.open.utils.C14548c;
import com.tencent.open.utils.C14553h;
import com.tencent.open.utils.C14557l;
import com.tencent.open.utils.C14559n;
import com.tencent.tauth.IUiListener;
import java.io.File;
import java.util.Map;

/* JADX INFO: renamed from: com.tencent.connect.auth.c */
/* JADX INFO: loaded from: classes12.dex */
public class C13975c {

    /* JADX INFO: renamed from: a */
    private AuthAgent f57962a;

    /* JADX INFO: renamed from: b */
    private QQToken f57963b;

    private C13975c(String str, Context context) {
        SLog.m85492i("openSDK_LOG.QQAuth", "new QQAuth() --start");
        this.f57963b = new QQToken(str);
        this.f57962a = new AuthAgent(this.f57963b);
        C13966a.m83172c(context, this.f57963b);
        m83253a(context, Constants.SDK_VERSION);
        SLog.m85492i("openSDK_LOG.QQAuth", "new QQAuth() --end");
    }

    /* JADX INFO: renamed from: a */
    private int m83251a(Activity activity, Fragment fragment, String str, IUiListener iUiListener, String str2, boolean z, Map<String, Object> map) {
        try {
            String strM85614a = C14557l.m85614a(activity);
            if (strM85614a != null) {
                String strM85565a = C14548c.m85565a(new File(strM85614a));
                if (!TextUtils.isEmpty(strM85565a)) {
                    SLog.m85496v("openSDK_LOG.QQAuth", "-->login channelId: " + strM85565a);
                    return m83258a(activity, str, iUiListener, z, strM85565a, strM85565a, "");
                }
            }
        } catch (Throwable th) {
            SLog.m85491e("openSDK_LOG.QQAuth", "-->login get channel id exception.", th);
        }
        SLog.m85488d("openSDK_LOG.QQAuth", "-->login channelId is null ");
        BaseApi.isOEM = false;
        return this.f57962a.doLogin(activity, str, iUiListener, false, fragment, z, map);
    }

    /* JADX INFO: renamed from: b */
    public void m83266b(Context context, String str) {
        SLog.m85492i("openSDK_LOG.QQAuth", "setOpenId() --start");
        this.f57963b.setOpenId(str);
        C13966a.m83173d(context, this.f57963b);
        SLog.m85492i("openSDK_LOG.QQAuth", "setOpenId() --end");
    }

    /* JADX INFO: renamed from: c */
    public boolean m83267c() {
        SLog.m85492i("openSDK_LOG.QQAuth", "isSessionValid(), result = ".concat(this.f57963b.isSessionValid() ? "true" : "false"));
        return this.f57963b.isSessionValid();
    }

    /* JADX INFO: renamed from: b */
    public QQToken m83265b() {
        return this.f57963b;
    }

    /* JADX INFO: renamed from: b */
    public int m83264b(Activity activity, String str, IUiListener iUiListener) {
        SLog.m85492i("openSDK_LOG.QQAuth", "reAuth()");
        return this.f57962a.m83196a(activity, str, iUiListener, true, null, false);
    }

    /* JADX INFO: renamed from: a */
    public static C13975c m83252a(String str, Context context) {
        C14553h.m85589a(context.getApplicationContext());
        SLog.m85492i("openSDK_LOG.QQAuth", "QQAuth -- createInstance() --start");
        C13975c c13975c = new C13975c(str, context);
        SLog.m85492i("openSDK_LOG.QQAuth", "QQAuth -- createInstance()  --end");
        return c13975c;
    }

    /* JADX INFO: renamed from: a */
    public int m83255a(Activity activity, String str, IUiListener iUiListener) {
        SLog.m85492i("openSDK_LOG.QQAuth", "login()");
        return m83256a(activity, str, iUiListener, "");
    }

    /* JADX INFO: renamed from: a */
    public int m83257a(Activity activity, String str, IUiListener iUiListener, boolean z) {
        SLog.m85492i("openSDK_LOG.QQAuth", "login()");
        return m83250a(activity, null, str, iUiListener, "", z);
    }

    /* JADX INFO: renamed from: a */
    public int m83254a(Activity activity, IUiListener iUiListener, Map<String, Object> map) {
        SLog.m85492i("openSDK_LOG.QQAuth", "login--params");
        return m83251a(activity, (Fragment) null, C14559n.m85656a(map, Constants.KEY_SCOPE, "all"), iUiListener, "", C14559n.m85665a(map, Constants.KEY_QRCODE, false), map);
    }

    /* JADX INFO: renamed from: a */
    public int m83256a(Activity activity, String str, IUiListener iUiListener, String str2) {
        SLog.m85492i("openSDK_LOG.QQAuth", "-->login activity: " + activity);
        return m83249a(activity, (Fragment) null, str, iUiListener, str2);
    }

    /* JADX INFO: renamed from: a */
    public int m83259a(Fragment fragment, String str, IUiListener iUiListener, String str2) {
        FragmentActivity activity = fragment.getActivity();
        SLog.m85492i("openSDK_LOG.QQAuth", "-->login activity: " + activity);
        return m83249a(activity, fragment, str, iUiListener, str2);
    }

    /* JADX INFO: renamed from: a */
    public int m83260a(Fragment fragment, String str, IUiListener iUiListener, String str2, boolean z) {
        FragmentActivity activity = fragment.getActivity();
        SLog.m85492i("openSDK_LOG.QQAuth", "-->login activity: " + activity);
        return m83250a(activity, fragment, str, iUiListener, str2, z);
    }

    /* JADX INFO: renamed from: a */
    private int m83249a(Activity activity, Fragment fragment, String str, IUiListener iUiListener, String str2) {
        return m83250a(activity, fragment, str, iUiListener, str2, false);
    }

    /* JADX INFO: renamed from: a */
    private int m83250a(Activity activity, Fragment fragment, String str, IUiListener iUiListener, String str2, boolean z) {
        return m83251a(activity, fragment, str, iUiListener, str2, z, (Map<String, Object>) null);
    }

    /* JADX INFO: renamed from: a */
    public static void m83253a(Context context, String str) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("BuglySdkInfos", 0).edit();
        editorEdit.putString("bcb3903995", str);
        editorEdit.apply();
    }

    @Deprecated
    /* JADX INFO: renamed from: a */
    public int m83258a(Activity activity, String str, IUiListener iUiListener, boolean z, String str2, String str3, String str4) {
        SLog.m85492i("openSDK_LOG.QQAuth", "loginWithOEM");
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
        return this.f57962a.m83196a(activity, str, iUiListener, false, null, z);
    }

    /* JADX INFO: renamed from: a */
    public void m83261a() {
        this.f57962a.m83197a((IUiListener) null);
    }

    /* JADX INFO: renamed from: a */
    public void m83262a(IUiListener iUiListener) {
        this.f57962a.m83198b(iUiListener);
    }

    /* JADX INFO: renamed from: a */
    public void m83263a(String str, String str2) {
        SLog.m85492i("openSDK_LOG.QQAuth", "setAccessToken(), validTimeInSecond = " + str2 + "");
        this.f57963b.setAccessToken(str, str2);
    }
}
