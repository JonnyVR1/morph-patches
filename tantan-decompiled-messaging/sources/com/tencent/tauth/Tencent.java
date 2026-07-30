package com.tencent.tauth;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.cosmos.photon.push.channel.ChannelConstant;
import com.tencent.connect.api.QQAuthManage;
import com.tencent.connect.auth.C13812c;
import com.tencent.connect.auth.QQToken;
import com.tencent.connect.avatar.QQAvatar;
import com.tencent.connect.common.Constants;
import com.tencent.connect.common.UIListenerManager;
import com.tencent.connect.commonchannel.CommonChannelApi;
import com.tencent.connect.emotion.QQEmotion;
import com.tencent.connect.share.QQShare;
import com.tencent.connect.share.QzonePublish;
import com.tencent.connect.share.QzoneShare;
import com.tencent.open.SocialConstants;
import com.tencent.open.SocialOperation;
import com.tencent.open.apireq.IApiCallback;
import com.tencent.open.log.SLog;
import com.tencent.open.log.Tracer;
import com.tencent.open.miniapp.MiniApp;
import com.tencent.open.p104a.C14355f;
import com.tencent.open.p105b.C14360b;
import com.tencent.open.p107im.C14373IM;
import com.tencent.open.utils.C14389g;
import com.tencent.open.utils.C14390h;
import com.tencent.open.utils.C14392j;
import com.tencent.open.utils.C14394l;
import com.tencent.open.utils.C14396n;
import com.tencent.open.utils.HttpUtils;
import com.tencent.wcdb.BuildConfig;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class Tencent {
    public static final int REQUEST_LOGIN = 10001;
    public static boolean USE_ONE_HOUR = false;

    /* JADX INFO: renamed from: c */
    private static Tencent f60458c = null;

    /* JADX INFO: renamed from: d */
    private static boolean f60459d = false;
    public static boolean disableResetOrientation = false;

    /* JADX INFO: renamed from: a */
    private final C13812c f60460a;

    /* JADX INFO: renamed from: b */
    private String f60461b;

    private Tencent(String str, Context context) {
        this.f60460a = C13812c.m82069a(str, context);
        C14360b.m84248a().m84258a(str, context);
        C14389g.m84397a().m84398a(context);
    }

    /* JADX INFO: renamed from: a */
    private static boolean m84615a(Context context, String str) {
        try {
            context.getPackageManager().getActivityInfo(new ComponentName(context.getPackageName(), "com.tencent.tauth.AuthActivity"), 128);
        } catch (PackageManager.NameNotFoundException unused) {
            SLog.m84307e("openSDK_LOG.Tencent", "AndroidManifest.xml 没有检测到com.tencent.tauth.AuthActivity".concat(("没有在AndroidManifest.xml中检测到com.tencent.tauth.AuthActivity,请加上com.tencent.tauth.AuthActivity,并配置<data android:scheme=\"tencent" + str + "\" />,详细信息请查看官网文档.") + "\n配置示例如下: \n<activity\n     android:name=\"com.tencent.tauth.AuthActivity\"\n     android:noHistory=\"true\"\n     android:launchMode=\"singleTask\">\n<intent-filter>\n    <action android:name=\"android.intent.action.VIEW\" />\n    <category android:name=\"android.intent.category.DEFAULT\" />\n    <category android:name=\"android.intent.category.BROWSABLE\" />\n    <data android:scheme=\"tencent" + str + "\" />\n</intent-filter>\n</activity>"));
            return false;
        } catch (Throwable th) {
            SLog.m84308e("openSDK_LOG.Tencent", "checkManifestConfig exception", th);
        }
        try {
            context.getPackageManager().getActivityInfo(new ComponentName(context.getPackageName(), "com.tencent.connect.common.AssistActivity"), 128);
            return true;
        } catch (PackageManager.NameNotFoundException unused2) {
            SLog.m84307e("openSDK_LOG.Tencent", "AndroidManifest.xml 没有检测到com.tencent.connect.common.AssistActivity\n".concat("没有在AndroidManifest.xml中检测到com.tencent.connect.common.AssistActivity,请加上com.tencent.connect.common.AssistActivity,详细信息请查看官网文档.\n配置示例如下: \n<activity\n     android:name=\"com.tencent.connect.common.AssistActivity\"\n     android:screenOrientation=\"behind\"\n     android:theme=\"@android:style/Theme.Translucent.NoTitleBar\"\n     android:configChanges=\"orientation|keyboardHidden\">\n</activity>"));
            return false;
        } catch (Throwable th2) {
            SLog.m84308e("openSDK_LOG.Tencent", "checkManifestConfig exception", th2);
            return true;
        }
    }

    public static synchronized Tencent createInstance(String str, Context context) {
        C14390h.m84406a(context.getApplicationContext());
        SLog.m84309i("openSDK_LOG.Tencent", "createInstance()  -- start, appId = " + str);
        if (TextUtils.isEmpty(str)) {
            SLog.m84307e("openSDK_LOG.Tencent", "appId should not be empty!");
            return null;
        }
        Tencent tencent = f60458c;
        if (tencent == null) {
            f60458c = new Tencent(str, context);
        } else if (!str.equals(tencent.getAppId())) {
            f60458c.logout(context);
            f60458c = new Tencent(str, context);
        }
        if (!m84615a(context, str)) {
            return null;
        }
        m84614a("createInstance", "appid", str);
        C14355f.m84227a().m84234a(C14392j.m84415a(context, str));
        SLog.m84309i("openSDK_LOG.Tencent", "createInstance()  -- end");
        return f60458c;
    }

    public static synchronized String getAuthorities(String str) {
        m84614a("getAuthorities", "appid", str);
        if (TextUtils.isEmpty(str)) {
            SLog.m84309i("openSDK_LOG.Tencent", "TextUtils.isEmpty(appId)");
            return null;
        }
        Tencent tencent = f60458c;
        if (tencent != null) {
            return str.equals(tencent.getAppId()) ? f60458c.f60461b : "";
        }
        SLog.m84309i("openSDK_LOG.Tencent", "sInstance == null");
        return null;
    }

    public static void handleResultData(Intent intent, IUiListener iUiListener) {
        StringBuilder sb = new StringBuilder("handleResultData() data = null ? ");
        sb.append(intent == null);
        sb.append(", listener = null ? ");
        sb.append(iUiListener == null);
        SLog.m84309i("openSDK_LOG.Tencent", sb.toString());
        m84614a("handleResultData", new Object[0]);
        UIListenerManager.getInstance().handleDataToListener(intent, iUiListener);
    }

    public static boolean isPermissionNotGranted() {
        return !f60459d || TextUtils.isEmpty(C14389g.m84397a().m84400b());
    }

    public static boolean isSupportPushToQZone(Context context) {
        boolean z = C14394l.m84445c(context, "5.9.5") >= 0;
        SLog.m84309i("openSDK_LOG.Tencent", "isSupportPushToQZone() support=" + z);
        m84613a("isSupportPushToQZone", Boolean.valueOf(z));
        return z;
    }

    public static boolean isSupportShareToQQ(Context context) {
        SLog.m84309i("openSDK_LOG.Tencent", "isSupportShareToQQ()");
        boolean z = true;
        if (C14396n.m84493c(context) && C14394l.m84434a(context, Constants.PACKAGE_QQ_PAD) != null) {
            m84613a("isSupportShareToQQ", Boolean.TRUE);
            return true;
        }
        if (C14394l.m84445c(context, "4.1") < 0 && C14394l.m84434a(context, Constants.PACKAGE_TIM) == null) {
            z = false;
        }
        SLog.m84309i("openSDK_LOG.Tencent", "isSupportShareToQQ() support=" + z);
        m84613a("isSupportShareToQQ", Boolean.valueOf(z));
        return z;
    }

    public static boolean onActivityResultData(int i, int i2, Intent intent, IUiListener iUiListener) {
        StringBuilder sb = new StringBuilder("onActivityResultData() reqcode = ");
        sb.append(i);
        sb.append(", resultcode = ");
        sb.append(i2);
        sb.append(", data = null ? ");
        sb.append(intent == null);
        sb.append(", listener = null ? ");
        sb.append(iUiListener == null);
        SLog.m84309i("openSDK_LOG.Tencent", sb.toString());
        m84614a("onActivityResultData", "requestCode", Integer.valueOf(i), "resultCode", Integer.valueOf(i2));
        return UIListenerManager.getInstance().onActivityResult(i, i2, intent, iUiListener);
    }

    public static Map<String, String> parseMiniParameters(Intent intent) {
        m84614a("parseMiniParameters", new Object[0]);
        HashMap map = new HashMap();
        if (intent == null) {
            SLog.m84307e("openSDK_LOG.Tencent", "parseMiniParameters null == intent");
            return map;
        }
        try {
            String stringExtra = intent.getStringExtra("appParameter");
            if (TextUtils.isEmpty(stringExtra)) {
                Uri data = intent.getData();
                if (data == null) {
                    SLog.m84305d("openSDK_LOG.Tencent", "parseMiniParameters uri==null");
                    return map;
                }
                String string = data.toString();
                if (TextUtils.isEmpty(string)) {
                    SLog.m84305d("openSDK_LOG.Tencent", "parseMiniParameters uriStr isEmpty");
                    return map;
                }
                String strSubstring = string.substring(string.lastIndexOf(63) + 1);
                if (TextUtils.isEmpty(strSubstring)) {
                    SLog.m84305d("openSDK_LOG.Tencent", "parseMiniParameters uriParam is empty");
                    return map;
                }
                SLog.m84305d("openSDK_LOG.Tencent", "parseMiniParameters uriParam=".concat(strSubstring));
                for (String str : strSubstring.split("&")) {
                    String[] strArrSplit = str.split("=");
                    if (strArrSplit.length == 2) {
                        map.put(strArrSplit[0], strArrSplit[1]);
                    }
                }
            } else {
                SLog.m84305d("openSDK_LOG.Tencent", "parseMiniParameters appParameter=" + stringExtra);
                JSONObject jSONObject = new JSONObject(stringExtra);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    map.put(next, jSONObject.getString(next));
                }
            }
            return map;
        } catch (Exception e) {
            SLog.m84308e("openSDK_LOG.Tencent", "parseMiniParameters Exception", e);
            return map;
        }
    }

    public static void resetQQAppInfoCache() {
        C14394l.m84436a("com.tencent.mobileqq");
    }

    public static void resetTargetAppInfoCache() {
        C14394l.m84435a();
    }

    public static void resetTimAppInfoCache() {
        C14394l.m84436a(Constants.PACKAGE_TIM);
    }

    public static void setCustomLogger(Tracer tracer) {
        SLog.m84309i("openSDK_LOG.Tencent", "setCustomLogger");
        m84614a("setCustomLogger", new Object[0]);
        SLog.getInstance().setCustomLogger(tracer);
    }

    public static void setIsPermissionGranted(boolean z, String str) {
        SLog.m84309i("openSDK_LOG.Tencent", "setIsPermissionGranted, isPermissionGranted: " + z + ", model = " + str);
        if (!z) {
            str = null;
        } else if (str == null || str.trim().isEmpty()) {
            SLog.m84307e("openSDK_LOG.Tencent", "setIsPermissionGranted error! model= [" + str + com.clevertap.android.sdk.Constants.AES_SUFFIX);
            str = "unknown";
        }
        f60459d = z;
        C14389g.m84397a().m84399a(C14390h.m84404a(), str);
    }

    public void bindQQGroup(Activity activity, String str, String str2, IUiListener iUiListener) {
        SLog.m84309i("openSDK_LOG.Tencent", "bindQQGroup()");
        m84614a("bindQQGroup", "organizationId", str, "organizationName", str2);
        new SocialOperation(getQQToken()).bindQQGroup(activity, str, str2, iUiListener);
    }

    public void callCommonChannelApi(Activity activity, Bundle bundle, IUiListener iUiListener) {
        C13812c c13812c = this.f60460a;
        SLog.m84309i("openSDK_LOG.Tencent", "callCommonChannelApi ret: " + new CommonChannelApi(c13812c, c13812c.m82082b()).launchQQ(activity, bundle, iUiListener));
    }

    public void checkLogin(IUiListener iUiListener) {
        SLog.m84309i("openSDK_LOG.Tencent", "checkLogin()");
        m84614a("checkLogin", new Object[0]);
        this.f60460a.m82079a(iUiListener);
    }

    public String getAccessToken() {
        String accessToken = this.f60460a.m82082b().getAccessToken();
        SLog.m84309i("openSDK_LOG.Tencent", "getAccessToken() accessToken = " + accessToken);
        m84614a("getAccessToken", new Object[0]);
        return accessToken;
    }

    public String getAppId() {
        String appId = this.f60460a.m82082b().getAppId();
        SLog.m84309i("openSDK_LOG.Tencent", "getAppId() appid =" + appId);
        m84613a("getAppId", appId);
        return appId;
    }

    public long getExpiresIn() {
        long expireTimeInSecond = this.f60460a.m82082b().getExpireTimeInSecond();
        SLog.m84309i("openSDK_LOG.Tencent", "getExpiresIn() expiresin= " + expireTimeInSecond);
        m84613a("getExpiresIn", Long.valueOf(expireTimeInSecond));
        return expireTimeInSecond;
    }

    public String getOpenId() {
        String openId = this.f60460a.m82082b().getOpenId();
        SLog.m84309i("openSDK_LOG.Tencent", "getOpenId() openid= " + openId);
        m84614a("getOpenId", new Object[0]);
        return openId;
    }

    public QQToken getQQToken() {
        SLog.m84309i("openSDK_LOG.Tencent", "getQQToken()");
        m84614a("getQQToken", new Object[0]);
        return this.f60460a.m82082b();
    }

    @Deprecated
    public void handleLoginData(Intent intent, IUiListener iUiListener) {
        StringBuilder sb = new StringBuilder("handleLoginData() data = null ? ");
        sb.append(intent == null);
        sb.append(", listener = null ? ");
        sb.append(iUiListener == null);
        SLog.m84309i("openSDK_LOG.Tencent", sb.toString());
        m84614a("handleLoginData", new Object[0]);
        UIListenerManager.getInstance().handleDataToListener(intent, iUiListener);
    }

    public void initSessionCache(JSONObject jSONObject) {
        m84614a("initSessionCache", new Object[0]);
        try {
            String string = jSONObject.getString("access_token");
            String string2 = jSONObject.getString("expires_in");
            String string3 = jSONObject.getString("openid");
            if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2) && !TextUtils.isEmpty(string3)) {
                setAccessToken(string, string2);
                setOpenId(string3);
            }
            SLog.m84309i("openSDK_LOG.Tencent", "initSessionCache()");
        } catch (Exception e) {
            SLog.m84309i("QQToken", "initSessionCache " + e.toString());
        }
    }

    public boolean isQQInstalled(Context context, String str) {
        boolean z = C14394l.m84445c(context, str) >= 0;
        SLog.m84309i("openSDK_LOG.Tencent", "isQQInstalled version[" + str + "] = " + z);
        return z;
    }

    public boolean isReady() {
        boolean z = isSessionValid() && getOpenId() != null;
        SLog.m84309i("openSDK_LOG.Tencent", "isReady() --ready=" + z);
        m84613a("isReady", Boolean.valueOf(z));
        return z;
    }

    public boolean isSessionValid() {
        boolean zM82084c = this.f60460a.m82084c();
        SLog.m84309i("openSDK_LOG.Tencent", "isSessionValid() isvalid =" + zM82084c);
        m84613a("isSessionValid", Boolean.valueOf(zM82084c));
        return zM82084c;
    }

    public boolean isSupportSSOLogin(Activity activity) {
        SLog.m84309i("openSDK_LOG.Tencent", "isSupportSSOLogin()");
        boolean z = true;
        if (C14396n.m84493c(activity) && C14394l.m84434a((Context) activity, Constants.PACKAGE_QQ_PAD) != null) {
            m84613a("isSupportSSOLogin", Boolean.TRUE);
            return true;
        }
        if (C14394l.m84445c(activity, "4.1") < 0 && C14394l.m84448d(activity, BuildConfig.VERSION_NAME) < 0) {
            z = false;
        }
        SLog.m84309i("openSDK_LOG.Tencent", "isSupportSSOLogin() support=" + z);
        m84613a("isSupportSSOLogin", Boolean.valueOf(z));
        return z;
    }

    public void joinQQGroup(Activity activity, String str, IUiListener iUiListener) {
        SLog.m84309i("openSDK_LOG.Tencent", "joinQQGroup()");
        m84614a("joinQQGroup", "organizationId", str);
        new SocialOperation(getQQToken()).joinGroup(activity, str, iUiListener);
    }

    public JSONObject loadSession(String str) {
        JSONObject jSONObjectLoadSession = this.f60460a.m82082b().loadSession(str);
        StringBuilder sb = new StringBuilder("loadSession() appid ");
        sb.append(str);
        sb.append(", length=");
        sb.append(jSONObjectLoadSession != null ? jSONObjectLoadSession.length() : 0);
        SLog.m84309i("openSDK_LOG.Tencent", sb.toString());
        m84614a("loadSession", "appid", str);
        return jSONObjectLoadSession;
    }

    public int login(Fragment fragment, String str, IUiListener iUiListener, boolean z) {
        SLog.m84309i("openSDK_LOG.Tencent", "login() with fragment, scope is " + str);
        m84614a("login_fragment_scope_qrcode", "scope", str, "qrcode", Boolean.valueOf(z));
        return this.f60460a.m82077a(fragment, str, iUiListener, "", z);
    }

    public int loginServerSide(Fragment fragment, String str, IUiListener iUiListener) {
        SLog.m84309i("openSDK_LOG.Tencent", "loginServerSide() with fragment, scope = " + str + ",server_side");
        m84614a("loginServerSide_fragment", "scope", str);
        return this.f60460a.m82076a(fragment, str + ",server_side", iUiListener, "");
    }

    public int loginWithOEM(Activity activity, String str, IUiListener iUiListener, boolean z, String str2, String str3, String str4) {
        SLog.m84309i("openSDK_LOG.Tencent", "loginWithOEM() with activity, scope = " + str);
        m84614a("loginWithOEM", "scope", str, "qrcode", Boolean.valueOf(z), "registerChannel", str2, "installChannel", str3, "businessId", str4);
        return this.f60460a.m82075a(activity, str, iUiListener, z, str2, str3, str4);
    }

    public void logout(Context context) {
        SLog.m84309i("openSDK_LOG.Tencent", "logout()");
        m84614a(ChannelConstant.Action.AIDL_ACTION_LOGOUT, new Object[0]);
        this.f60460a.m82082b().setAccessToken(null, "0");
        this.f60460a.m82082b().setOpenId(null);
        this.f60460a.m82082b().removeSession(this.f60460a.m82082b().getAppId());
    }

    public void publishToQzone(Activity activity, Bundle bundle, IUiListener iUiListener) {
        SLog.m84309i("openSDK_LOG.Tencent", "publishToQzone()");
        m84614a("publishToQzone", new Object[0]);
        new QzonePublish(activity, this.f60460a.m82082b()).publishToQzone(activity, bundle, iUiListener);
    }

    public int reAuth(Activity activity, String str, IUiListener iUiListener) {
        SLog.m84309i("openSDK_LOG.Tencent", "reAuth() with activity, scope = " + str);
        m84614a("reAuth", "scope", str);
        return this.f60460a.m82081b(activity, str, iUiListener);
    }

    public void reportDAU() {
        SLog.m84309i("openSDK_LOG.Tencent", "reportDAU() ");
        m84614a("reportDAU", new Object[0]);
        this.f60460a.m82078a();
    }

    public JSONObject request(String str, Bundle bundle, String str2) throws JSONException, IOException, HttpUtils.NetworkUnavailableException, HttpUtils.HttpStatusException {
        SLog.m84309i("openSDK_LOG.Tencent", "request()");
        m84614a(SocialConstants.TYPE_REQUEST, "graphPath", str, "httpMethod", str2);
        return HttpUtils.request(this.f60460a.m82082b(), C14390h.m84404a(), str, bundle, str2);
    }

    public void requestAsync(String str, Bundle bundle, String str2, IRequestListener iRequestListener) {
        SLog.m84309i("openSDK_LOG.Tencent", "requestAsync()");
        m84614a("requestAsync", "graphPath", str, "httpMethod", str2);
        HttpUtils.requestAsync(this.f60460a.m82082b(), C14390h.m84404a(), str, bundle, str2, iRequestListener);
    }

    public void saveSession(JSONObject jSONObject) {
        StringBuilder sb = new StringBuilder("saveSession() length=");
        sb.append(jSONObject != null ? jSONObject.length() : 0);
        SLog.m84309i("openSDK_LOG.Tencent", sb.toString());
        m84614a("saveSession", new Object[0]);
        this.f60460a.m82082b().saveSession(jSONObject);
    }

    public void setAccessToken(String str, String str2) {
        SLog.m84309i("openSDK_LOG.Tencent", "setAccessToken(), expiresIn = " + str2 + "");
        m84614a("setAccessToken", new Object[0]);
        this.f60460a.m82080a(str, str2);
    }

    public void setAvatar(Activity activity, Bundle bundle, IUiListener iUiListener) {
        SLog.m84309i("openSDK_LOG.Tencent", "setAvatar()");
        m84614a("setAvatar", new Object[0]);
        String string = bundle.getString("picture");
        new QQAvatar(this.f60460a.m82082b()).setAvatar(activity, Uri.parse(string), iUiListener, bundle.getInt("exitAnim"));
    }

    public void setAvatarByQQ(Activity activity, Uri uri, IUiListener iUiListener) {
        SLog.m84309i("openSDK_LOG.Tencent", "setAvatarByQQ()");
        m84614a("setAvatarByQQ", new Object[0]);
        new QQAvatar(this.f60460a.m82082b()).setAvatarByQQ(activity, uri, iUiListener);
    }

    public void setDynamicAvatar(Activity activity, Uri uri, IUiListener iUiListener) {
        SLog.m84309i("openSDK_LOG.Tencent", "setDynamicAvatar()");
        m84614a("setDynamicAvatar", new Object[0]);
        new QQAvatar(this.f60460a.m82082b()).setDynamicAvatar(activity, uri, iUiListener);
    }

    public void setEmotions(Activity activity, ArrayList<Uri> arrayList, IUiListener iUiListener) {
        SLog.m84309i("openSDK_LOG.Tencent", "saveQQEmotions()");
        m84614a("setEmotions", new Object[0]);
        new QQEmotion(this.f60460a.m82082b()).setEmotions(activity, arrayList, iUiListener);
    }

    public void setOpenId(String str) {
        SLog.m84309i("openSDK_LOG.Tencent", "setOpenId() --start");
        m84614a("setOpenId", new Object[0]);
        this.f60460a.m82083b(C14390h.m84404a(), str);
        SLog.m84309i("openSDK_LOG.Tencent", "setOpenId() --end");
    }

    public void shareToQQ(Activity activity, Bundle bundle, IUiListener iUiListener) {
        SLog.m84309i("openSDK_LOG.Tencent", "shareToQQ()");
        m84614a("shareToQQ", new Object[0]);
        if (TextUtils.isEmpty(this.f60461b)) {
            try {
                iUiListener.onWarning(-19);
            } catch (AbstractMethodError e) {
                SLog.m84308e("openSDK_LOG.Tencent", "onWarning AbstractMethodError", e);
            }
        }
        new QQShare(activity, this.f60460a.m82082b()).shareToQQ(activity, bundle, iUiListener);
    }

    public void shareToQzone(Activity activity, Bundle bundle, IUiListener iUiListener) {
        SLog.m84309i("openSDK_LOG.Tencent", "shareToQzone()");
        m84614a("shareToQzone", new Object[0]);
        new QzoneShare(activity, this.f60460a.m82082b()).shareToQzone(activity, bundle, iUiListener);
    }

    public void startAuthManagePage(Activity activity, IApiCallback iApiCallback) {
        SLog.m84309i("openSDK_LOG.Tencent", "startAuthManagePage");
        new QQAuthManage(this.f60460a, getQQToken()).gotoManagePage(activity, iApiCallback);
    }

    public int startIMAio(Activity activity, String str, String str2) {
        SLog.m84309i("openSDK_LOG.Tencent", "startIMAio()");
        m84614a("startIMAio", "uin", str, Constants.PARAM_PKG_NAME, str2);
        return startIMConversation(activity, C14373IM.CHAT_TYPE_AIO, str, str2);
    }

    public int startIMAudio(Activity activity, String str, String str2) {
        SLog.m84309i("openSDK_LOG.Tencent", "startIMAudio()");
        m84614a("startIMAudio", "uin", str, Constants.PARAM_PKG_NAME, str2);
        return startIMConversation(activity, C14373IM.CHAT_TYPE_AUDIO_CHAT, str, str2);
    }

    public int startIMConversation(Activity activity, String str, String str2, String str3) {
        m84614a("startIMConversation", "chatType", str, "uin", str2, Constants.PARAM_PKG_NAME, str3);
        return new C14373IM(getQQToken()).startIMConversation(activity, str, str2, str3);
    }

    public int startIMVideo(Activity activity, String str, String str2) {
        SLog.m84309i("openSDK_LOG.Tencent", "startIMVideo()");
        m84614a("startIMVideo", "uin", str, Constants.PARAM_PKG_NAME, str2);
        return startIMConversation(activity, C14373IM.CHAT_TYPE_VIDEO_CHAT, str, str2);
    }

    public int startMiniApp(Activity activity, String str, String str2, String str3) {
        SLog.m84309i("openSDK_LOG.Tencent", "startMiniApp()");
        m84614a("startMiniApp", "miniAppId", str, "miniAppPath", str2, "miniAppVersion", str3);
        return new MiniApp(getQQToken()).startMiniApp(activity, MiniApp.MINIAPP_TYPE_NORMAL, str, "21", str2, str3);
    }

    public void unBindQQGroup(Context context, String str, IUiListener iUiListener) {
        SLog.m84309i("openSDK_LOG.Tencent", "unBindQQGroup()");
        m84614a("unBindQQGroup", "organizationId", str);
        new SocialOperation(getQQToken()).unBindGroup(context, str, iUiListener);
    }

    public boolean isQQInstalled(Context context) {
        boolean zM84443b = C14394l.m84443b(context);
        SLog.m84309i("openSDK_LOG.Tencent", "isQQInstalled() installed=" + zM84443b);
        m84613a("isQQInstalled", Boolean.valueOf(zM84443b));
        return zM84443b;
    }

    public void setAvatar(Activity activity, Bundle bundle, IUiListener iUiListener, int i, int i2) {
        SLog.m84309i("openSDK_LOG.Tencent", "setAvatar()");
        m84614a("setAvatar_anim", new Object[0]);
        bundle.putInt("exitAnim", i2);
        activity.overridePendingTransition(i, 0);
        setAvatar(activity, bundle, iUiListener);
    }

    public int login(Activity activity, IUiListener iUiListener, Map<String, Object> map) {
        SLog.m84309i("openSDK_LOG.Tencent", "login activity with params");
        m84614a("login_param", new Object[0]);
        return this.f60460a.m82071a(activity, iUiListener, map);
    }

    public int login(Activity activity, String str, IUiListener iUiListener, boolean z) {
        SLog.m84309i("openSDK_LOG.Tencent", "login() with activity, scope is " + str);
        m84614a("login_qrcode", "scope", str, "qrcode", Boolean.valueOf(z));
        return this.f60460a.m82074a(activity, str, iUiListener, z);
    }

    public int login(Fragment fragment, String str, IUiListener iUiListener) {
        SLog.m84309i("openSDK_LOG.Tencent", "login() with fragment, scope is " + str);
        m84614a("login_fragment_scope", "scope", str);
        return this.f60460a.m82076a(fragment, str, iUiListener, "");
    }

    public int login(Activity activity, String str, IUiListener iUiListener) {
        SLog.m84309i("openSDK_LOG.Tencent", "login() with activity, scope is " + str);
        m84614a("login_scope", "scope", str);
        return this.f60460a.m82072a(activity, str, iUiListener);
    }

    public int loginServerSide(Activity activity, String str, IUiListener iUiListener) {
        SLog.m84309i("openSDK_LOG.Tencent", "loginServerSide() with activity, scope = " + str + ",server_side");
        m84614a("loginServerSide_activity", "scope", str);
        return this.f60460a.m82072a(activity, str + ",server_side", iUiListener);
    }

    public static void setIsPermissionGranted(boolean z) {
        String strM84400b;
        SLog.m84309i("openSDK_LOG.Tencent", "setIsPermissionGranted, isPermissionGranted: " + z);
        if (z) {
            C14389g.m84397a().m84398a(C14390h.m84404a());
            strM84400b = C14389g.m84397a().m84400b();
            if (strM84400b == null || strM84400b.isEmpty()) {
                strM84400b = Build.MODEL;
            }
        } else {
            strM84400b = "";
        }
        setIsPermissionGranted(z, strM84400b);
    }

    /* JADX INFO: renamed from: a */
    private static void m84614a(String str, Object... objArr) {
        C14360b.m84248a().m84260a(str, m84612a(objArr));
    }

    /* JADX INFO: renamed from: a */
    private static String m84612a(Object... objArr) {
        if (objArr == null || objArr.length == 0 || objArr.length % 2 != 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int length = objArr.length;
        for (int i = 0; i < length; i += 2) {
            if (i > 0) {
                sb.append('|');
            }
            sb.append(objArr[i]);
            sb.append(':');
            sb.append(objArr[i + 1]);
        }
        return sb.toString();
    }

    public static synchronized Tencent createInstance(String str, Context context, String str2) {
        Tencent tencentCreateInstance;
        try {
            tencentCreateInstance = createInstance(str, context);
            SLog.m84309i("openSDK_LOG.Tencent", "createInstance()  -- start, appId = " + str + ", authorities=" + str2);
            m84614a("createInstance_authority", "appid", str, "authorities", str2);
            if (tencentCreateInstance != null) {
                tencentCreateInstance.f60461b = str2;
            } else {
                SLog.m84309i("openSDK_LOG.Tencent", "null == tencent set mAuthorities fail");
            }
        } catch (Throwable th) {
            throw th;
        }
        return tencentCreateInstance;
    }

    /* JADX INFO: renamed from: a */
    private static void m84613a(String str, Object obj) {
        C14360b.m84248a().m84259a(str, obj);
    }
}
