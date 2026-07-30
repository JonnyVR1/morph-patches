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
import com.tencent.connect.auth.C13975c;
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
import com.tencent.open.p109a.C14518f;
import com.tencent.open.p110b.C14523b;
import com.tencent.open.p112im.C14536IM;
import com.tencent.open.utils.C14552g;
import com.tencent.open.utils.C14553h;
import com.tencent.open.utils.C14555j;
import com.tencent.open.utils.C14557l;
import com.tencent.open.utils.C14559n;
import com.tencent.open.utils.HttpUtils;
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
    private static Tencent f61306c = null;

    /* JADX INFO: renamed from: d */
    private static boolean f61307d = false;
    public static boolean disableResetOrientation = false;

    /* JADX INFO: renamed from: a */
    private final C13975c f61308a;

    /* JADX INFO: renamed from: b */
    private String f61309b;

    private Tencent(String str, Context context) {
        this.f61308a = C13975c.m83252a(str, context);
        C14523b.m85431a().m85441a(str, context);
        C14552g.m85580a().m85581a(context);
    }

    /* JADX INFO: renamed from: a */
    private static boolean m85798a(Context context, String str) {
        try {
            context.getPackageManager().getActivityInfo(new ComponentName(context.getPackageName(), "com.tencent.tauth.AuthActivity"), 128);
        } catch (PackageManager.NameNotFoundException unused) {
            SLog.m85490e("openSDK_LOG.Tencent", "AndroidManifest.xml 没有检测到com.tencent.tauth.AuthActivity".concat(("没有在AndroidManifest.xml中检测到com.tencent.tauth.AuthActivity,请加上com.tencent.tauth.AuthActivity,并配置<data android:scheme=\"tencent" + str + "\" />,详细信息请查看官网文档.") + "\n配置示例如下: \n<activity\n     android:name=\"com.tencent.tauth.AuthActivity\"\n     android:noHistory=\"true\"\n     android:launchMode=\"singleTask\">\n<intent-filter>\n    <action android:name=\"android.intent.action.VIEW\" />\n    <category android:name=\"android.intent.category.DEFAULT\" />\n    <category android:name=\"android.intent.category.BROWSABLE\" />\n    <data android:scheme=\"tencent" + str + "\" />\n</intent-filter>\n</activity>"));
            return false;
        } catch (Throwable th) {
            SLog.m85491e("openSDK_LOG.Tencent", "checkManifestConfig exception", th);
        }
        try {
            context.getPackageManager().getActivityInfo(new ComponentName(context.getPackageName(), "com.tencent.connect.common.AssistActivity"), 128);
            return true;
        } catch (PackageManager.NameNotFoundException unused2) {
            SLog.m85490e("openSDK_LOG.Tencent", "AndroidManifest.xml 没有检测到com.tencent.connect.common.AssistActivity\n".concat("没有在AndroidManifest.xml中检测到com.tencent.connect.common.AssistActivity,请加上com.tencent.connect.common.AssistActivity,详细信息请查看官网文档.\n配置示例如下: \n<activity\n     android:name=\"com.tencent.connect.common.AssistActivity\"\n     android:screenOrientation=\"behind\"\n     android:theme=\"@android:style/Theme.Translucent.NoTitleBar\"\n     android:configChanges=\"orientation|keyboardHidden\">\n</activity>"));
            return false;
        } catch (Throwable th2) {
            SLog.m85491e("openSDK_LOG.Tencent", "checkManifestConfig exception", th2);
            return true;
        }
    }

    public static synchronized Tencent createInstance(String str, Context context) {
        C14553h.m85589a(context.getApplicationContext());
        SLog.m85492i("openSDK_LOG.Tencent", "createInstance()  -- start, appId = " + str);
        if (TextUtils.isEmpty(str)) {
            SLog.m85490e("openSDK_LOG.Tencent", "appId should not be empty!");
            return null;
        }
        Tencent tencent = f61306c;
        if (tencent == null) {
            f61306c = new Tencent(str, context);
        } else if (!str.equals(tencent.getAppId())) {
            f61306c.logout(context);
            f61306c = new Tencent(str, context);
        }
        if (!m85798a(context, str)) {
            return null;
        }
        m85797a("createInstance", "appid", str);
        C14518f.m85410a().m85417a(C14555j.m85598a(context, str));
        SLog.m85492i("openSDK_LOG.Tencent", "createInstance()  -- end");
        return f61306c;
    }

    public static synchronized String getAuthorities(String str) {
        m85797a("getAuthorities", "appid", str);
        if (TextUtils.isEmpty(str)) {
            SLog.m85492i("openSDK_LOG.Tencent", "TextUtils.isEmpty(appId)");
            return null;
        }
        Tencent tencent = f61306c;
        if (tencent != null) {
            return str.equals(tencent.getAppId()) ? f61306c.f61309b : "";
        }
        SLog.m85492i("openSDK_LOG.Tencent", "sInstance == null");
        return null;
    }

    public static void handleResultData(Intent intent, IUiListener iUiListener) {
        StringBuilder sb = new StringBuilder("handleResultData() data = null ? ");
        sb.append(intent == null);
        sb.append(", listener = null ? ");
        sb.append(iUiListener == null);
        SLog.m85492i("openSDK_LOG.Tencent", sb.toString());
        m85797a("handleResultData", new Object[0]);
        UIListenerManager.getInstance().handleDataToListener(intent, iUiListener);
    }

    public static boolean isPermissionNotGranted() {
        return !f61307d || TextUtils.isEmpty(C14552g.m85580a().m85583b());
    }

    public static boolean isSupportPushToQZone(Context context) {
        boolean z = C14557l.m85628c(context, "5.9.5") >= 0;
        SLog.m85492i("openSDK_LOG.Tencent", "isSupportPushToQZone() support=" + z);
        m85796a("isSupportPushToQZone", Boolean.valueOf(z));
        return z;
    }

    public static boolean isSupportShareToQQ(Context context) {
        SLog.m85492i("openSDK_LOG.Tencent", "isSupportShareToQQ()");
        boolean z = true;
        if (C14559n.m85676c(context) && C14557l.m85617a(context, Constants.PACKAGE_QQ_PAD) != null) {
            m85796a("isSupportShareToQQ", Boolean.TRUE);
            return true;
        }
        if (C14557l.m85628c(context, "4.1") < 0 && C14557l.m85617a(context, Constants.PACKAGE_TIM) == null) {
            z = false;
        }
        SLog.m85492i("openSDK_LOG.Tencent", "isSupportShareToQQ() support=" + z);
        m85796a("isSupportShareToQQ", Boolean.valueOf(z));
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
        SLog.m85492i("openSDK_LOG.Tencent", sb.toString());
        m85797a("onActivityResultData", "requestCode", Integer.valueOf(i), "resultCode", Integer.valueOf(i2));
        return UIListenerManager.getInstance().onActivityResult(i, i2, intent, iUiListener);
    }

    public static Map<String, String> parseMiniParameters(Intent intent) {
        m85797a("parseMiniParameters", new Object[0]);
        HashMap map = new HashMap();
        if (intent == null) {
            SLog.m85490e("openSDK_LOG.Tencent", "parseMiniParameters null == intent");
            return map;
        }
        try {
            String stringExtra = intent.getStringExtra("appParameter");
            if (TextUtils.isEmpty(stringExtra)) {
                Uri data = intent.getData();
                if (data == null) {
                    SLog.m85488d("openSDK_LOG.Tencent", "parseMiniParameters uri==null");
                    return map;
                }
                String string = data.toString();
                if (TextUtils.isEmpty(string)) {
                    SLog.m85488d("openSDK_LOG.Tencent", "parseMiniParameters uriStr isEmpty");
                    return map;
                }
                String strSubstring = string.substring(string.lastIndexOf(63) + 1);
                if (TextUtils.isEmpty(strSubstring)) {
                    SLog.m85488d("openSDK_LOG.Tencent", "parseMiniParameters uriParam is empty");
                    return map;
                }
                SLog.m85488d("openSDK_LOG.Tencent", "parseMiniParameters uriParam=".concat(strSubstring));
                for (String str : strSubstring.split("&")) {
                    String[] strArrSplit = str.split("=");
                    if (strArrSplit.length == 2) {
                        map.put(strArrSplit[0], strArrSplit[1]);
                    }
                }
            } else {
                SLog.m85488d("openSDK_LOG.Tencent", "parseMiniParameters appParameter=" + stringExtra);
                JSONObject jSONObject = new JSONObject(stringExtra);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    map.put(next, jSONObject.getString(next));
                }
            }
            return map;
        } catch (Exception e) {
            SLog.m85491e("openSDK_LOG.Tencent", "parseMiniParameters Exception", e);
            return map;
        }
    }

    public static void resetQQAppInfoCache() {
        C14557l.m85619a("com.tencent.mobileqq");
    }

    public static void resetTargetAppInfoCache() {
        C14557l.m85618a();
    }

    public static void resetTimAppInfoCache() {
        C14557l.m85619a(Constants.PACKAGE_TIM);
    }

    public static void setCustomLogger(Tracer tracer) {
        SLog.m85492i("openSDK_LOG.Tencent", "setCustomLogger");
        m85797a("setCustomLogger", new Object[0]);
        SLog.getInstance().setCustomLogger(tracer);
    }

    public static void setIsPermissionGranted(boolean z, String str) {
        SLog.m85492i("openSDK_LOG.Tencent", "setIsPermissionGranted, isPermissionGranted: " + z + ", model = " + str);
        if (!z) {
            str = null;
        } else if (str == null || str.trim().isEmpty()) {
            SLog.m85490e("openSDK_LOG.Tencent", "setIsPermissionGranted error! model= [" + str + com.clevertap.android.sdk.Constants.AES_SUFFIX);
            str = "unknown";
        }
        f61307d = z;
        C14552g.m85580a().m85582a(C14553h.m85587a(), str);
    }

    public void bindQQGroup(Activity activity, String str, String str2, IUiListener iUiListener) {
        SLog.m85492i("openSDK_LOG.Tencent", "bindQQGroup()");
        m85797a("bindQQGroup", "organizationId", str, "organizationName", str2);
        new SocialOperation(getQQToken()).bindQQGroup(activity, str, str2, iUiListener);
    }

    public void callCommonChannelApi(Activity activity, Bundle bundle, IUiListener iUiListener) {
        C13975c c13975c = this.f61308a;
        SLog.m85492i("openSDK_LOG.Tencent", "callCommonChannelApi ret: " + new CommonChannelApi(c13975c, c13975c.m83265b()).launchQQ(activity, bundle, iUiListener));
    }

    public void checkLogin(IUiListener iUiListener) {
        SLog.m85492i("openSDK_LOG.Tencent", "checkLogin()");
        m85797a("checkLogin", new Object[0]);
        this.f61308a.m83262a(iUiListener);
    }

    public String getAccessToken() {
        String accessToken = this.f61308a.m83265b().getAccessToken();
        SLog.m85492i("openSDK_LOG.Tencent", "getAccessToken() accessToken = " + accessToken);
        m85797a("getAccessToken", new Object[0]);
        return accessToken;
    }

    public String getAppId() {
        String appId = this.f61308a.m83265b().getAppId();
        SLog.m85492i("openSDK_LOG.Tencent", "getAppId() appid =" + appId);
        m85796a("getAppId", appId);
        return appId;
    }

    public long getExpiresIn() {
        long expireTimeInSecond = this.f61308a.m83265b().getExpireTimeInSecond();
        SLog.m85492i("openSDK_LOG.Tencent", "getExpiresIn() expiresin= " + expireTimeInSecond);
        m85796a("getExpiresIn", Long.valueOf(expireTimeInSecond));
        return expireTimeInSecond;
    }

    public String getOpenId() {
        String openId = this.f61308a.m83265b().getOpenId();
        SLog.m85492i("openSDK_LOG.Tencent", "getOpenId() openid= " + openId);
        m85797a("getOpenId", new Object[0]);
        return openId;
    }

    public QQToken getQQToken() {
        SLog.m85492i("openSDK_LOG.Tencent", "getQQToken()");
        m85797a("getQQToken", new Object[0]);
        return this.f61308a.m83265b();
    }

    @Deprecated
    public void handleLoginData(Intent intent, IUiListener iUiListener) {
        StringBuilder sb = new StringBuilder("handleLoginData() data = null ? ");
        sb.append(intent == null);
        sb.append(", listener = null ? ");
        sb.append(iUiListener == null);
        SLog.m85492i("openSDK_LOG.Tencent", sb.toString());
        m85797a("handleLoginData", new Object[0]);
        UIListenerManager.getInstance().handleDataToListener(intent, iUiListener);
    }

    public void initSessionCache(JSONObject jSONObject) {
        m85797a("initSessionCache", new Object[0]);
        try {
            String string = jSONObject.getString("access_token");
            String string2 = jSONObject.getString("expires_in");
            String string3 = jSONObject.getString("openid");
            if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2) && !TextUtils.isEmpty(string3)) {
                setAccessToken(string, string2);
                setOpenId(string3);
            }
            SLog.m85492i("openSDK_LOG.Tencent", "initSessionCache()");
        } catch (Exception e) {
            SLog.m85492i("QQToken", "initSessionCache " + e.toString());
        }
    }

    public boolean isQQInstalled(Context context, String str) {
        boolean z = C14557l.m85628c(context, str) >= 0;
        SLog.m85492i("openSDK_LOG.Tencent", "isQQInstalled version[" + str + "] = " + z);
        return z;
    }

    public boolean isReady() {
        boolean z = isSessionValid() && getOpenId() != null;
        SLog.m85492i("openSDK_LOG.Tencent", "isReady() --ready=" + z);
        m85796a("isReady", Boolean.valueOf(z));
        return z;
    }

    public boolean isSessionValid() {
        boolean zM83267c = this.f61308a.m83267c();
        SLog.m85492i("openSDK_LOG.Tencent", "isSessionValid() isvalid =" + zM83267c);
        m85796a("isSessionValid", Boolean.valueOf(zM83267c));
        return zM83267c;
    }

    public boolean isSupportSSOLogin(Activity activity) {
        SLog.m85492i("openSDK_LOG.Tencent", "isSupportSSOLogin()");
        boolean z = true;
        if (C14559n.m85676c(activity) && C14557l.m85617a((Context) activity, Constants.PACKAGE_QQ_PAD) != null) {
            m85796a("isSupportSSOLogin", Boolean.TRUE);
            return true;
        }
        if (C14557l.m85628c(activity, "4.1") < 0 && C14557l.m85631d(activity, "1.1") < 0) {
            z = false;
        }
        SLog.m85492i("openSDK_LOG.Tencent", "isSupportSSOLogin() support=" + z);
        m85796a("isSupportSSOLogin", Boolean.valueOf(z));
        return z;
    }

    public void joinQQGroup(Activity activity, String str, IUiListener iUiListener) {
        SLog.m85492i("openSDK_LOG.Tencent", "joinQQGroup()");
        m85797a("joinQQGroup", "organizationId", str);
        new SocialOperation(getQQToken()).joinGroup(activity, str, iUiListener);
    }

    public JSONObject loadSession(String str) {
        JSONObject jSONObjectLoadSession = this.f61308a.m83265b().loadSession(str);
        StringBuilder sb = new StringBuilder("loadSession() appid ");
        sb.append(str);
        sb.append(", length=");
        sb.append(jSONObjectLoadSession != null ? jSONObjectLoadSession.length() : 0);
        SLog.m85492i("openSDK_LOG.Tencent", sb.toString());
        m85797a("loadSession", "appid", str);
        return jSONObjectLoadSession;
    }

    public int login(Fragment fragment, String str, IUiListener iUiListener, boolean z) {
        SLog.m85492i("openSDK_LOG.Tencent", "login() with fragment, scope is " + str);
        m85797a("login_fragment_scope_qrcode", "scope", str, "qrcode", Boolean.valueOf(z));
        return this.f61308a.m83260a(fragment, str, iUiListener, "", z);
    }

    public int loginServerSide(Fragment fragment, String str, IUiListener iUiListener) {
        SLog.m85492i("openSDK_LOG.Tencent", "loginServerSide() with fragment, scope = " + str + ",server_side");
        m85797a("loginServerSide_fragment", "scope", str);
        return this.f61308a.m83259a(fragment, str + ",server_side", iUiListener, "");
    }

    public int loginWithOEM(Activity activity, String str, IUiListener iUiListener, boolean z, String str2, String str3, String str4) {
        SLog.m85492i("openSDK_LOG.Tencent", "loginWithOEM() with activity, scope = " + str);
        m85797a("loginWithOEM", "scope", str, "qrcode", Boolean.valueOf(z), "registerChannel", str2, "installChannel", str3, "businessId", str4);
        return this.f61308a.m83258a(activity, str, iUiListener, z, str2, str3, str4);
    }

    public void logout(Context context) {
        SLog.m85492i("openSDK_LOG.Tencent", "logout()");
        m85797a(ChannelConstant.Action.AIDL_ACTION_LOGOUT, new Object[0]);
        this.f61308a.m83265b().setAccessToken(null, "0");
        this.f61308a.m83265b().setOpenId(null);
        this.f61308a.m83265b().removeSession(this.f61308a.m83265b().getAppId());
    }

    public void publishToQzone(Activity activity, Bundle bundle, IUiListener iUiListener) {
        SLog.m85492i("openSDK_LOG.Tencent", "publishToQzone()");
        m85797a("publishToQzone", new Object[0]);
        new QzonePublish(activity, this.f61308a.m83265b()).publishToQzone(activity, bundle, iUiListener);
    }

    public int reAuth(Activity activity, String str, IUiListener iUiListener) {
        SLog.m85492i("openSDK_LOG.Tencent", "reAuth() with activity, scope = " + str);
        m85797a("reAuth", "scope", str);
        return this.f61308a.m83264b(activity, str, iUiListener);
    }

    public void reportDAU() {
        SLog.m85492i("openSDK_LOG.Tencent", "reportDAU() ");
        m85797a("reportDAU", new Object[0]);
        this.f61308a.m83261a();
    }

    public JSONObject request(String str, Bundle bundle, String str2) throws JSONException, IOException, HttpUtils.NetworkUnavailableException, HttpUtils.HttpStatusException {
        SLog.m85492i("openSDK_LOG.Tencent", "request()");
        m85797a(SocialConstants.TYPE_REQUEST, "graphPath", str, "httpMethod", str2);
        return HttpUtils.request(this.f61308a.m83265b(), C14553h.m85587a(), str, bundle, str2);
    }

    public void requestAsync(String str, Bundle bundle, String str2, IRequestListener iRequestListener) {
        SLog.m85492i("openSDK_LOG.Tencent", "requestAsync()");
        m85797a("requestAsync", "graphPath", str, "httpMethod", str2);
        HttpUtils.requestAsync(this.f61308a.m83265b(), C14553h.m85587a(), str, bundle, str2, iRequestListener);
    }

    public void saveSession(JSONObject jSONObject) {
        StringBuilder sb = new StringBuilder("saveSession() length=");
        sb.append(jSONObject != null ? jSONObject.length() : 0);
        SLog.m85492i("openSDK_LOG.Tencent", sb.toString());
        m85797a("saveSession", new Object[0]);
        this.f61308a.m83265b().saveSession(jSONObject);
    }

    public void setAccessToken(String str, String str2) {
        SLog.m85492i("openSDK_LOG.Tencent", "setAccessToken(), expiresIn = " + str2 + "");
        m85797a("setAccessToken", new Object[0]);
        this.f61308a.m83263a(str, str2);
    }

    public void setAvatar(Activity activity, Bundle bundle, IUiListener iUiListener) {
        SLog.m85492i("openSDK_LOG.Tencent", "setAvatar()");
        m85797a("setAvatar", new Object[0]);
        String string = bundle.getString("picture");
        new QQAvatar(this.f61308a.m83265b()).setAvatar(activity, Uri.parse(string), iUiListener, bundle.getInt("exitAnim"));
    }

    public void setAvatarByQQ(Activity activity, Uri uri, IUiListener iUiListener) {
        SLog.m85492i("openSDK_LOG.Tencent", "setAvatarByQQ()");
        m85797a("setAvatarByQQ", new Object[0]);
        new QQAvatar(this.f61308a.m83265b()).setAvatarByQQ(activity, uri, iUiListener);
    }

    public void setDynamicAvatar(Activity activity, Uri uri, IUiListener iUiListener) {
        SLog.m85492i("openSDK_LOG.Tencent", "setDynamicAvatar()");
        m85797a("setDynamicAvatar", new Object[0]);
        new QQAvatar(this.f61308a.m83265b()).setDynamicAvatar(activity, uri, iUiListener);
    }

    public void setEmotions(Activity activity, ArrayList<Uri> arrayList, IUiListener iUiListener) {
        SLog.m85492i("openSDK_LOG.Tencent", "saveQQEmotions()");
        m85797a("setEmotions", new Object[0]);
        new QQEmotion(this.f61308a.m83265b()).setEmotions(activity, arrayList, iUiListener);
    }

    public void setOpenId(String str) {
        SLog.m85492i("openSDK_LOG.Tencent", "setOpenId() --start");
        m85797a("setOpenId", new Object[0]);
        this.f61308a.m83266b(C14553h.m85587a(), str);
        SLog.m85492i("openSDK_LOG.Tencent", "setOpenId() --end");
    }

    public void shareToQQ(Activity activity, Bundle bundle, IUiListener iUiListener) {
        SLog.m85492i("openSDK_LOG.Tencent", "shareToQQ()");
        m85797a("shareToQQ", new Object[0]);
        if (TextUtils.isEmpty(this.f61309b)) {
            try {
                iUiListener.onWarning(-19);
            } catch (AbstractMethodError e) {
                SLog.m85491e("openSDK_LOG.Tencent", "onWarning AbstractMethodError", e);
            }
        }
        new QQShare(activity, this.f61308a.m83265b()).shareToQQ(activity, bundle, iUiListener);
    }

    public void shareToQzone(Activity activity, Bundle bundle, IUiListener iUiListener) {
        SLog.m85492i("openSDK_LOG.Tencent", "shareToQzone()");
        m85797a("shareToQzone", new Object[0]);
        new QzoneShare(activity, this.f61308a.m83265b()).shareToQzone(activity, bundle, iUiListener);
    }

    public void startAuthManagePage(Activity activity, IApiCallback iApiCallback) {
        SLog.m85492i("openSDK_LOG.Tencent", "startAuthManagePage");
        new QQAuthManage(this.f61308a, getQQToken()).gotoManagePage(activity, iApiCallback);
    }

    public int startIMAio(Activity activity, String str, String str2) {
        SLog.m85492i("openSDK_LOG.Tencent", "startIMAio()");
        m85797a("startIMAio", "uin", str, Constants.PARAM_PKG_NAME, str2);
        return startIMConversation(activity, C14536IM.CHAT_TYPE_AIO, str, str2);
    }

    public int startIMAudio(Activity activity, String str, String str2) {
        SLog.m85492i("openSDK_LOG.Tencent", "startIMAudio()");
        m85797a("startIMAudio", "uin", str, Constants.PARAM_PKG_NAME, str2);
        return startIMConversation(activity, C14536IM.CHAT_TYPE_AUDIO_CHAT, str, str2);
    }

    public int startIMConversation(Activity activity, String str, String str2, String str3) {
        m85797a("startIMConversation", "chatType", str, "uin", str2, Constants.PARAM_PKG_NAME, str3);
        return new C14536IM(getQQToken()).startIMConversation(activity, str, str2, str3);
    }

    public int startIMVideo(Activity activity, String str, String str2) {
        SLog.m85492i("openSDK_LOG.Tencent", "startIMVideo()");
        m85797a("startIMVideo", "uin", str, Constants.PARAM_PKG_NAME, str2);
        return startIMConversation(activity, C14536IM.CHAT_TYPE_VIDEO_CHAT, str, str2);
    }

    public int startMiniApp(Activity activity, String str, String str2, String str3) {
        SLog.m85492i("openSDK_LOG.Tencent", "startMiniApp()");
        m85797a("startMiniApp", "miniAppId", str, "miniAppPath", str2, "miniAppVersion", str3);
        return new MiniApp(getQQToken()).startMiniApp(activity, MiniApp.MINIAPP_TYPE_NORMAL, str, "21", str2, str3);
    }

    public void unBindQQGroup(Context context, String str, IUiListener iUiListener) {
        SLog.m85492i("openSDK_LOG.Tencent", "unBindQQGroup()");
        m85797a("unBindQQGroup", "organizationId", str);
        new SocialOperation(getQQToken()).unBindGroup(context, str, iUiListener);
    }

    public boolean isQQInstalled(Context context) {
        boolean zM85626b = C14557l.m85626b(context);
        SLog.m85492i("openSDK_LOG.Tencent", "isQQInstalled() installed=" + zM85626b);
        m85796a("isQQInstalled", Boolean.valueOf(zM85626b));
        return zM85626b;
    }

    public void setAvatar(Activity activity, Bundle bundle, IUiListener iUiListener, int i, int i2) {
        SLog.m85492i("openSDK_LOG.Tencent", "setAvatar()");
        m85797a("setAvatar_anim", new Object[0]);
        bundle.putInt("exitAnim", i2);
        activity.overridePendingTransition(i, 0);
        setAvatar(activity, bundle, iUiListener);
    }

    public int login(Activity activity, IUiListener iUiListener, Map<String, Object> map) {
        SLog.m85492i("openSDK_LOG.Tencent", "login activity with params");
        m85797a("login_param", new Object[0]);
        return this.f61308a.m83254a(activity, iUiListener, map);
    }

    public int login(Activity activity, String str, IUiListener iUiListener, boolean z) {
        SLog.m85492i("openSDK_LOG.Tencent", "login() with activity, scope is " + str);
        m85797a("login_qrcode", "scope", str, "qrcode", Boolean.valueOf(z));
        return this.f61308a.m83257a(activity, str, iUiListener, z);
    }

    public int login(Fragment fragment, String str, IUiListener iUiListener) {
        SLog.m85492i("openSDK_LOG.Tencent", "login() with fragment, scope is " + str);
        m85797a("login_fragment_scope", "scope", str);
        return this.f61308a.m83259a(fragment, str, iUiListener, "");
    }

    public int login(Activity activity, String str, IUiListener iUiListener) {
        SLog.m85492i("openSDK_LOG.Tencent", "login() with activity, scope is " + str);
        m85797a("login_scope", "scope", str);
        return this.f61308a.m83255a(activity, str, iUiListener);
    }

    public int loginServerSide(Activity activity, String str, IUiListener iUiListener) {
        SLog.m85492i("openSDK_LOG.Tencent", "loginServerSide() with activity, scope = " + str + ",server_side");
        m85797a("loginServerSide_activity", "scope", str);
        return this.f61308a.m83255a(activity, str + ",server_side", iUiListener);
    }

    public static void setIsPermissionGranted(boolean z) {
        String strM85583b;
        SLog.m85492i("openSDK_LOG.Tencent", "setIsPermissionGranted, isPermissionGranted: " + z);
        if (z) {
            C14552g.m85580a().m85581a(C14553h.m85587a());
            strM85583b = C14552g.m85580a().m85583b();
            if (strM85583b == null || strM85583b.isEmpty()) {
                strM85583b = Build.MODEL;
            }
        } else {
            strM85583b = "";
        }
        setIsPermissionGranted(z, strM85583b);
    }

    /* JADX INFO: renamed from: a */
    private static void m85797a(String str, Object... objArr) {
        C14523b.m85431a().m85443a(str, m85795a(objArr));
    }

    /* JADX INFO: renamed from: a */
    private static String m85795a(Object... objArr) {
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
            SLog.m85492i("openSDK_LOG.Tencent", "createInstance()  -- start, appId = " + str + ", authorities=" + str2);
            m85797a("createInstance_authority", "appid", str, "authorities", str2);
            if (tencentCreateInstance != null) {
                tencentCreateInstance.f61309b = str2;
            } else {
                SLog.m85492i("openSDK_LOG.Tencent", "null == tencent set mAuthorities fail");
            }
        } catch (Throwable th) {
            throw th;
        }
        return tencentCreateInstance;
    }

    /* JADX INFO: renamed from: a */
    private static void m85796a(String str, Object obj) {
        C14523b.m85431a().m85442a(str, obj);
    }
}
