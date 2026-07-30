package com.cosmos.photon.push;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.RequiresApi;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.clevertap.android.sdk.Constants;
import com.cosmos.mdlog.MDLog;
import com.cosmos.photon.push.channel.ChannelConstant;
import com.cosmos.photon.push.dns.PushHttpDns;
import com.cosmos.photon.push.dns.RequestEventListener;
import com.cosmos.photon.push.log.LogTag;
import com.cosmos.photon.push.referee.Referee;
import com.cosmos.photon.push.uniqueid.UniqueIdManager;
import com.cosmos.photon.push.util.AppContext;
import com.cosmos.photon.push.util.Base64;
import com.cosmos.photon.push.util.ENCUtils;
import com.cosmos.photon.push.util.FileUtil;
import com.cosmos.photon.push.util.MD5Utils;
import com.cosmos.photon.push.util.NetUtil;
import com.cosmos.photon.push.util.ThreadUtils;
import java.io.File;
import java.io.IOException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p153l.azm;
import p153l.c050;
import p153l.e7y;
import p153l.glb0;
import p153l.i5d0;
import p153l.ku10;
import p153l.l1j;
import p153l.rg50;
import p153l.x1d0;
import p153l.z1d0;

/* JADX INFO: loaded from: classes.dex */
public class PushApi {
    private static final String ACTION_REG = "reg";
    private static final String ACTION_REGWITHALIAS = "regwithalias";
    private static final String API = "https://paas-push-api.immomo.com/push/index/";
    private static final String API_PREFIX = "https://paas-push-api.immomo.com/push/";
    private static final String DATA = "data";

    /* JADX INFO: renamed from: EC */
    private static final String f5838EC = "ec";

    /* JADX INFO: renamed from: EM */
    private static final String f5839EM = "em";
    private static final String LOG_API_PREFIX = "https://paas-push-api-log.immomo.com/push/";
    private static final String PARAMS_AIDS = "aIds";
    private static final String PARAMS_ALIAS = "alias";
    private static final String PARAMS_APP_ID = "app_id";
    private static final String PARAMS_DEVICE_ID = "device_id";
    private static final String PARAMS_MSC = "msc";
    private static final String PARAMS_MZIP = "mzip";
    private static final String PARAMS_NBAR = "n_bar";
    private static final String PARAMS_NBAR_CHANNELS = "channels";
    private static final String PARAMS_NBAR_CHANNELS_CONFIG = "config";
    private static final String PARAMS_NBAR_CHANNELS_ID = "id";
    private static final String PARAMS_NBAR_CHANNELS_OPEN = "open";
    private static final String PARAMS_NBAR_OPEN = "open";
    private static final String PARAMS_SHA1 = "keystore_sha1";
    private static final String PARAMS_SN = "sn";
    private static final String PARAMS_TAG = "tag";
    private static final String PARAMS_TOKEN = "token";
    private static final String PARAMS_UNIQ_DID = "uniq_did";
    private static final String PARAMS_VENDOR_TOKEN = "vendor_token";
    private static final String PARAMS_VENDOR_TYPE = "vendor_type";
    private static final String TAG_API = "https://paas-push-api.immomo.com/push/tag/";
    private static final int TIMEOUT_READ = 5;
    private static final int TIMEOUT_WRITE = 15;
    private static final String TOKEN = "token";
    private static final rg50 client;
    private static String logoutPath;
    private static String unAliasPath;

    static {
        rg50.C19837b c19837bM181363a = new rg50.C19837b().m181373k(new RequestEventListener()).m181372j(new PushHttpDns(Referee.APP_ID)).m181363a(new azm() { // from class: com.cosmos.photon.push.PushApi.1
            @Override // p153l.azm
            public i5d0 intercept(azm.InterfaceC15867a interfaceC15867a) throws IOException {
                x1d0 x1d0VarRequest = interfaceC15867a.request();
                return interfaceC15867a.mo101076a(x1d0VarRequest.m209023h().m209045s(x1d0VarRequest.m209026k().m182288p().m182300c("appsr", MD5Utils.getMD5(PhotonPushManager.APP_ID)).m182301d()).m209028b());
            }
        });
        TimeUnit timeUnit = TimeUnit.SECONDS;
        client = c19837bM181363a.m181387y(15L, timeUnit).m181383u(5L, timeUnit).m181365c();
        unAliasPath = new File(AppContext.getContext().getFilesDir(), "unalias").getAbsolutePath();
        logoutPath = new File(AppContext.getContext().getFilesDir(), ChannelConstant.Action.AIDL_ACTION_LOGOUT).getAbsolutePath();
    }

    public static void alias(final String str, final String str2, final String str3, final String str4) {
        ThreadUtils.execute(new Runnable() { // from class: com.cosmos.photon.push.PushApi.3
            @Override // java.lang.Runnable
            public void run() {
                try {
                    HashMap map = new HashMap(3);
                    map.put("token", str);
                    map.put("app_id", str2);
                    map.put("alias", str3);
                    if (!TextUtils.isEmpty(str4)) {
                        map.put(PushApi.PARAMS_SN, str4);
                    }
                    JSONObject jSONObject = new JSONObject(PushApi.request("alias", map));
                    PhotonPushManager.getInstance().onCommand(1, jSONObject.optInt(PushApi.f5838EC), jSONObject.optString(PushApi.f5839EM));
                    if (TextUtils.isEmpty(str3)) {
                        return;
                    }
                    ChannelBridge.setAlias(str3);
                } catch (Exception e) {
                    MDLog.printErrStackTrace(LogTag.API, e);
                    PhotonPushManager.getInstance().onCommand(1, -1, "异常：" + e.getMessage());
                }
            }
        });
    }

    public static void checkUnSendData() {
        if (NetUtil.isNetworkAvailable()) {
            if (new File(unAliasPath).exists()) {
                unAliasFromFile();
            }
            if (new File(logoutPath).exists()) {
                logoutFromFile();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String doPost(String str, Map<String, String> map) throws Exception {
        JSONObject jSONObjectOptJSONObject;
        MDLog.m7450i(LogTag.API, "doPost: %s params：%s", str, map);
        JSONObject jSONObject = new JSONObject();
        for (String str2 : map.keySet()) {
            jSONObject.put(str2, map.get(str2));
        }
        l1j.C18332a c18332a = new l1j.C18332a();
        String strRandom = ENCUtils.random(12);
        c18332a.m152497a(PARAMS_MSC, Base64.encode(ENCUtils.RSAEncode(strRandom.getBytes())));
        c18332a.m152497a(PARAMS_MZIP, ENCUtils.getInstance().encrypt(Base64.encode(jSONObject.toString().getBytes()), strRandom));
        String str3 = new String(client.mo181341a(new x1d0.C21228a().m209043q(str).m209038l(c18332a.m152498b()).m209027a("User-Agent", AppContext.getUserAgent()).m209028b()).execute().m138670k().bytes(), "UTF-8");
        JSONObject jSONObject2 = new JSONObject(str3);
        if (jSONObject2.optInt(f5838EC, -1) == 0 && (jSONObjectOptJSONObject = jSONObject2.optJSONObject("data")) != null) {
            String strOptString = jSONObjectOptJSONObject.optString(PARAMS_MZIP);
            if (!TextUtils.isEmpty(strOptString)) {
                jSONObject2.put("data", new JSONObject(ENCUtils.getInstance().decrypt(strOptString, strRandom)));
                str3 = jSONObject2.toString();
            }
        }
        MDLog.m7450i(LogTag.API, "url: %s response：%s", str, str3);
        return str3;
    }

    @RequiresApi(api = 26)
    private static String getChannelConfigs(NotificationChannel notificationChannel) {
        return notificationChannel.getImportance() + Constants.SEPARATOR_COMMA + (notificationChannel.shouldVibrate() ? 1 : 0) + Constants.SEPARATOR_COMMA + notificationChannel.getLockscreenVisibility() + Constants.SEPARATOR_COMMA + (notificationChannel.canShowBadge() ? 1 : 0) + Constants.SEPARATOR_COMMA + (notificationChannel.canBypassDnd() ? 1 : 0);
    }

    private static JSONObject getNBarParams() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("open", c050.m107319e(AppContext.getContext()).m107322a() ? 1 : 0);
            if (Build.VERSION.SDK_INT >= 26) {
                List notificationChannels = ((NotificationManager) AppContext.getContext().getSystemService("notification")).getNotificationChannels();
                if (notificationChannels.size() != 0) {
                    JSONArray jSONArray = new JSONArray();
                    Iterator it = notificationChannels.iterator();
                    while (it.hasNext()) {
                        NotificationChannel notificationChannelM130641a = glb0.m130641a(it.next());
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("id", notificationChannelM130641a.getId());
                        jSONObject2.put("open", notificationChannelM130641a.getImportance() != 0 ? 1 : 0);
                        jSONObject2.put("config", getChannelConfigs(notificationChannelM130641a));
                        jSONArray.put(jSONObject2);
                    }
                    jSONObject.put(PARAMS_NBAR_CHANNELS, jSONArray);
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        MDLog.m7451v(PARAMS_NBAR, jSONObject.toString());
        return jSONObject;
    }

    public static void log(final String str, final String str2, final String str3) {
        MDLog.m7450i(LogTag.API, "http post log : %s", str3);
        ThreadUtils.execute(new Runnable() { // from class: com.cosmos.photon.push.PushApi.11
            @Override // java.lang.Runnable
            public void run() {
                HashMap map = new HashMap(3);
                map.put("token", str);
                map.put("app_id", str2);
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(str3);
                map.put("log_content", jSONArray.toString());
                try {
                    PushApi.doPost("https://paas-push-api-log.immomo.com/push/log/uploadjson", map);
                } catch (Exception e) {
                    MDLog.printErrStackTrace(LogTag.API, e);
                    try {
                        PushApi.doPost("https://paas-push-api-log.immomo.com/push/log/uploadjson", map);
                    } catch (Exception e2) {
                        MDLog.printErrStackTrace(LogTag.API, e2);
                    }
                }
            }
        });
    }

    public static void logout(final String str, final String str2) {
        ThreadUtils.execute(new Runnable() { // from class: com.cosmos.photon.push.PushApi.7
            @Override // java.lang.Runnable
            public void run() throws Throwable {
                try {
                    ApiCacheUtil.clearAll();
                    HashMap map = new HashMap(3);
                    map.put("token", str);
                    map.put("app_id", str2);
                    JSONObject jSONObject = new JSONObject(PushApi.request(ChannelConstant.Action.AIDL_ACTION_LOGOUT, map));
                    PhotonPushManager.getInstance().onCommand(3, jSONObject.optInt(PushApi.f5838EC), jSONObject.optString(PushApi.f5839EM));
                } catch (UnknownHostException e) {
                    MDLog.printErrStackTrace(LogTag.API, e);
                    if (!TextUtils.isEmpty(str)) {
                        try {
                            FileUtil.writeStr(new File(PushApi.logoutPath), str + Constants.SEPARATOR_COMMA + str2);
                        } catch (IOException unused) {
                        }
                    }
                    PhotonPushManager.getInstance().onCommand(2, -1, "异常：" + e.getMessage());
                } catch (Exception e2) {
                    MDLog.printErrStackTrace(LogTag.API, e2);
                    PhotonPushManager.getInstance().onCommand(3, -1, "异常：" + e2.getMessage());
                }
            }
        });
    }

    private static void logoutFromFile() {
        MDLog.m7445e(LogTag.API, "logoutFromFile");
        ThreadUtils.execute(new Runnable() { // from class: com.cosmos.photon.push.PushApi.10
            @Override // java.lang.Runnable
            public void run() {
                try {
                    File file = new File(PushApi.logoutPath);
                    String[] strArrSplit = FileUtil.readStr(file).split(Constants.SEPARATOR_COMMA);
                    HashMap map = new HashMap(3);
                    map.put("token", strArrSplit[0]);
                    map.put("app_id", strArrSplit[1]);
                    if (new JSONObject(PushApi.request(ChannelConstant.Action.AIDL_ACTION_LOGOUT, map)).optInt(PushApi.f5838EC, -1) == 0) {
                        FileUtil.deleteFile(file);
                    }
                    MDLog.m7445e(LogTag.API, "logoutFromFile 成功");
                } catch (Exception e) {
                    MDLog.printErrStackTrace(LogTag.API, e);
                }
            }
        });
    }

    public static void regVendor(final String str, final String str2, final String str3, final String str4) {
        ThreadUtils.execute(new Runnable() { // from class: com.cosmos.photon.push.PushApi.6
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (ApiCacheUtil.isRegVendorExpired(str, str2, str3, str4)) {
                        LastRegistKeeper.getInstance().keepRegistVendorToken(str, str2, str3, str4);
                        HashMap map = new HashMap(3);
                        map.put("token", str);
                        map.put("app_id", str2);
                        map.put(PushApi.PARAMS_VENDOR_TOKEN, str4);
                        map.put(PushApi.PARAMS_VENDOR_TYPE, str3);
                        JSONObject jSONObject = new JSONObject(PushApi.request("regvendor", map));
                        ApiCacheUtil.saveRegVendorCurrentTimeMillis(str, str2, str3, str4);
                        PhotonPushManager.getInstance().onCommand(4, jSONObject.optInt(PushApi.f5838EC), jSONObject.optString(PushApi.f5839EM));
                        LastRegistKeeper.getInstance().clearRegistTokenRequest();
                    }
                } catch (Exception e) {
                    MDLog.printErrStackTrace(LogTag.API, e);
                    PhotonPushManager.getInstance().onCommand(4, -1, "异常：" + e.getMessage());
                }
            }
        });
    }

    public static void register(final String str, final String str2, final String str3, final String str4, final boolean z) {
        ThreadUtils.execute(new Runnable() { // from class: com.cosmos.photon.push.PushApi.2
            @Override // java.lang.Runnable
            public void run() {
                String strRequest;
                JSONObject jSONObject;
                String strOptString;
                try {
                    LastRegistKeeper.getInstance().keepRegistSelfToken(str, str2, str3, str4, z);
                    UniqueIdManager.getInstance().init(AppContext.getContext(), str);
                    if (ApiCacheUtil.isRegisterExpired(str, str2, str3)) {
                        strRequest = null;
                        jSONObject = null;
                    } else {
                        MDLog.m7449i(LogTag.API, "prefs register");
                        strRequest = ApiCacheUtil.getRegisterData(str, str2, str3);
                        jSONObject = !TextUtils.isEmpty(strRequest) ? new JSONObject(strRequest) : null;
                    }
                    if (jSONObject == null) {
                        HashMap map = new HashMap(3);
                        map.put(PushApi.PARAMS_DEVICE_ID, str);
                        map.put("app_id", str2);
                        if (!TextUtils.isEmpty(str3)) {
                            map.put("alias", str3);
                        }
                        map.put(PushApi.PARAMS_SHA1, AppContext.getAppSHA1());
                        if (!TextUtils.isEmpty(str4)) {
                            map.put(PushApi.PARAMS_SN, str4);
                        }
                        strRequest = PushApi.request(TextUtils.isEmpty(str3) ? PushApi.ACTION_REG : PushApi.ACTION_REGWITHALIAS, map);
                        jSONObject = new JSONObject(strRequest);
                        if (jSONObject.optInt(PushApi.f5838EC, -1) == 0) {
                            ApiCacheUtil.saveRegisterCurrentTimeMillis(str, str2, str3);
                            ApiCacheUtil.saveRegisterData(str, str2, str3, strRequest);
                        }
                    }
                    int iOptInt = jSONObject.optInt(PushApi.f5838EC, -1);
                    if (iOptInt == 0) {
                        if (!TextUtils.isEmpty(str3)) {
                            ChannelBridge.setAlias(str3);
                        }
                        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                        strOptString = jSONObject2.optString("token");
                        PushPreferenceUtils.updateConfig(jSONObject2.optJSONObject("push_config"));
                    } else {
                        strOptString = null;
                    }
                    MDLog.m7450i(LogTag.API, "register result : %s", strRequest);
                    PhotonPushManager.getInstance().onSelfTokenRegistered(iOptInt, strOptString, jSONObject.optString(PushApi.f5839EM), str3);
                    LastRegistKeeper.getInstance().clearRegistSelfRequest();
                } catch (Exception e) {
                    MDLog.printErrStackTrace(LogTag.API, e);
                    PhotonPushManager.getInstance().onSelfTokenRegistered(-1, null, "异常：" + e.getMessage(), null);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String request(String str, Map<String, String> map) throws Exception {
        MDLog.m7450i(LogTag.API, "action: %s request：%s", str, map);
        JSONObject jSONObject = new JSONObject();
        for (String str2 : map.keySet()) {
            jSONObject.put(str2, map.get(str2));
        }
        if (str.equals(ACTION_REG) || str.equals(ACTION_REGWITHALIAS)) {
            jSONObject.put(PARAMS_NBAR, getNBarParams());
            jSONObject.put(PARAMS_AIDS, UniqueIdManager.getInstance().getUniqueId());
            jSONObject.put(PARAMS_UNIQ_DID, UniqueIdManager.getInstance().getPushID());
        }
        l1j.C18332a c18332a = new l1j.C18332a();
        String strRandom = ENCUtils.random(12);
        c18332a.m152497a(PARAMS_MSC, Base64.encode(ENCUtils.RSAEncode(strRandom.getBytes())));
        c18332a.m152497a(PARAMS_MZIP, ENCUtils.getInstance().encrypt(Base64.encode(jSONObject.toString().getBytes()), strRandom));
        String str3 = new String(client.mo181341a(new x1d0.C21228a().m209043q(API.concat(str)).m209038l(c18332a.m152498b()).m209027a("User-Agent", AppContext.getUserAgent()).m209028b()).execute().m138670k().bytes(), "UTF-8");
        MDLog.m7450i(LogTag.API, "action: %s response：%s", str, str3);
        if (ACTION_REG.equals(str) || ACTION_REGWITHALIAS.equals(str)) {
            JSONObject jSONObject2 = new JSONObject(str3);
            if (jSONObject2.optInt(f5838EC, -1) == 0) {
                jSONObject2.put("data", new JSONObject(ENCUtils.getInstance().decrypt(jSONObject2.getJSONObject("data").optString(PARAMS_MZIP), strRandom)));
                return jSONObject2.toString();
            }
        }
        return str3;
    }

    public static void tags(final String str, final String str2, final String str3, final String str4) {
        ThreadUtils.execute(new Runnable() { // from class: com.cosmos.photon.push.PushApi.8
            @Override // java.lang.Runnable
            public void run() {
                try {
                    HashMap map = new HashMap(3);
                    map.put("app_id", str2);
                    map.put("token", str);
                    if (!TextUtils.isEmpty(str3)) {
                        map.put("alias", str3);
                    }
                    map.put("tag", str4);
                    map.put(PushApi.PARAMS_SHA1, AppContext.getAppSHA1());
                    JSONObject jSONObject = new JSONObject(PushApi.doPost(TextUtils.isEmpty(str3) ? "https://paas-push-api.immomo.com/push/tag/regTokenTag" : "https://paas-push-api.immomo.com/push/tag/regAliasTag", map));
                    PhotonPushManager.getInstance().onCommand(5, jSONObject.optInt(PushApi.f5838EC), jSONObject.optString(PushApi.f5839EM));
                } catch (Exception e) {
                    MDLog.printErrStackTrace(LogTag.API, e);
                    PhotonPushManager.getInstance().onCommand(5, -1, "异常：" + e.getMessage());
                }
            }
        });
    }

    public static void unAlias(final String str, final String str2, final String str3, final String str4) {
        ThreadUtils.execute(new Runnable() { // from class: com.cosmos.photon.push.PushApi.5
            @Override // java.lang.Runnable
            public void run() throws Throwable {
                String str5;
                try {
                    ApiCacheUtil.clearAll();
                    HashMap map = new HashMap(3);
                    map.put("token", str);
                    map.put("app_id", str2);
                    map.put("alias", str3);
                    if (!TextUtils.isEmpty(str4)) {
                        map.put(PushApi.PARAMS_SN, str4);
                    }
                    JSONObject jSONObject = new JSONObject(PushApi.request("unalias", map));
                    if (!TextUtils.isEmpty(str3)) {
                        ChannelBridge.unsetAlias(str3);
                    }
                    PhotonPushManager.getInstance().onCommand(2, jSONObject.optInt(PushApi.f5838EC), jSONObject.optString(PushApi.f5839EM));
                } catch (UnknownHostException e) {
                    MDLog.printErrStackTrace(LogTag.API, e);
                    if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str3)) {
                        try {
                            if (TextUtils.isEmpty(str4)) {
                                str5 = str + Constants.SEPARATOR_COMMA + str2 + Constants.SEPARATOR_COMMA + str3;
                            } else {
                                str5 = str + Constants.SEPARATOR_COMMA + str2 + Constants.SEPARATOR_COMMA + str3 + Constants.SEPARATOR_COMMA + str4;
                            }
                            FileUtil.writeStr(new File(PushApi.unAliasPath), str5);
                        } catch (IOException unused) {
                        }
                    }
                    PhotonPushManager.getInstance().onCommand(2, -1, "异常：" + e.getMessage());
                } catch (Exception e2) {
                    MDLog.printErrStackTrace(LogTag.API, e2);
                    PhotonPushManager.getInstance().onCommand(2, -1, "异常：" + e2.getMessage());
                }
            }
        });
    }

    private static void unAliasFromFile() {
        MDLog.m7445e(LogTag.API, "unAliasFromFile");
        ThreadUtils.execute(new Runnable() { // from class: com.cosmos.photon.push.PushApi.4
            @Override // java.lang.Runnable
            public void run() {
                try {
                    File file = new File(PushApi.unAliasPath);
                    String[] strArrSplit = FileUtil.readStr(file).split(Constants.SEPARATOR_COMMA);
                    HashMap map = new HashMap(3);
                    map.put("token", strArrSplit[0]);
                    map.put("app_id", strArrSplit[1]);
                    map.put("alias", strArrSplit[2]);
                    if (strArrSplit.length > 3) {
                        map.put(PushApi.PARAMS_SN, strArrSplit[3]);
                    }
                    if (new JSONObject(PushApi.request("unalias", map)).optInt(PushApi.f5838EC, -1) == 0) {
                        FileUtil.deleteFile(file);
                        ChannelBridge.unsetAlias(strArrSplit[2]);
                    }
                    MDLog.m7445e(LogTag.API, "unAliasFromFile 成功");
                } catch (Exception e) {
                    MDLog.printErrStackTrace(LogTag.API, e);
                }
            }
        });
    }

    public static void unTags(final String str, final String str2, final String str3, final String str4) {
        ThreadUtils.execute(new Runnable() { // from class: com.cosmos.photon.push.PushApi.9
            @Override // java.lang.Runnable
            public void run() {
                try {
                    HashMap map = new HashMap(3);
                    map.put("app_id", str2);
                    map.put("token", str);
                    if (!TextUtils.isEmpty(str3)) {
                        map.put("alias", str3);
                    }
                    map.put("tag", str4);
                    map.put(PushApi.PARAMS_SHA1, AppContext.getAppSHA1());
                    JSONObject jSONObject = new JSONObject(PushApi.doPost(TextUtils.isEmpty(str3) ? "https://paas-push-api.immomo.com/push/tag/unregTokenTag" : "https://paas-push-api.immomo.com/push/tag/unregAliasTag", map));
                    PhotonPushManager.getInstance().onCommand(6, jSONObject.optInt(PushApi.f5838EC), jSONObject.optString(PushApi.f5839EM));
                } catch (Exception e) {
                    MDLog.printErrStackTrace(LogTag.API, e);
                    PhotonPushManager.getInstance().onCommand(6, -1, "异常：" + e.getMessage());
                }
            }
        });
    }

    public static boolean uploadLogFile(String str, String str2, Map<String, String> map) throws Exception {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && map != null && map.size() > 0) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("token", str);
            jSONObject.put("app_id", str2);
            String strRandom = ENCUtils.random(12);
            String strEncode = Base64.encode(ENCUtils.RSAEncode(strRandom.getBytes()));
            String strEncrypt = ENCUtils.getInstance().encrypt(Base64.encode(jSONObject.toString().getBytes()), strRandom);
            ku10.C18260a c18260a = new ku10.C18260a("---------------------------7da2137580612");
            c18260a.m151432f(e7y.m119773d("multipart/form-data; boundary=---------------------------7da2137580612"));
            JSONArray jSONArray = new JSONArray();
            int i = 0;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                c18260a.m151430d(ku10.C18261b.m151435c("mmfile_" + i, entry.getKey(), z1d0.create(e7y.m119773d(OSSConstants.DEFAULT_OBJECT_CONTENT_TYPE), new File(entry.getValue()))));
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(Constants.KEY_KEY, "mmfile_" + i);
                jSONArray.put(jSONObject2);
                i++;
            }
            i5d0 i5d0VarExecute = client.mo181341a(new x1d0.C21228a().m209043q("https://paas-push-api-log.immomo.com/push/log/upload").m209027a("User-Agent", AppContext.getUserAgent()).m209038l(c18260a.m151427a(PARAMS_MSC, strEncode).m151427a(PARAMS_MZIP, strEncrypt).m151427a("mmfile", jSONArray.toString()).m151431e()).m209028b()).execute();
            if (i5d0VarExecute.m138661I()) {
                JSONObject jSONObject3 = new JSONObject(new String(i5d0VarExecute.m138670k().bytes(), "UTF-8"));
                int iOptInt = jSONObject3.optInt(f5838EC, -1);
                MDLog.m7450i(LogTag.API, "action: %s response：%s", "log/upload", jSONObject3.toString());
                if (iOptInt == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void register(String str, String str2, String str3, String str4) {
        register(str, str2, str3, str4, false);
    }

    public static void register(String str, String str2) {
        register(str, str2, null, null);
    }
}
