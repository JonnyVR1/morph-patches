package com.cosmos.photon.push;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.widget.Toast;
import com.clevertap.android.sdk.Constants;
import com.cosmos.mdlog.MDLog;
import com.cosmos.photon.push.dns.PushDNSConfig;
import com.cosmos.photon.push.log.LogTag;
import com.cosmos.photon.push.msg.MoMessage;
import com.cosmos.photon.push.notification.MoNotify;
import com.cosmos.photon.push.service.DefaultMessageReceiver;
import com.cosmos.photon.push.statistic.EventLogBody;
import com.cosmos.photon.push.statistic.PushEventStatistic;
import com.cosmos.photon.push.thirdparty.IStatisticReporter;
import com.cosmos.photon.push.thirdparty.NotificationWrapper;
import com.cosmos.photon.push.thirdparty.PushBridge;
import com.cosmos.photon.push.thirdparty.ThirdPartyEventReporter;
import com.cosmos.photon.push.thirdparty.ThirdPushManager;
import com.cosmos.photon.push.util.AppContext;
import com.cosmos.photon.push.util.NetUtil;
import com.cosmos.photon.push.util.ThreadUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import p149l.j0c;

/* JADX INFO: loaded from: classes.dex */
public final class PhotonPushManager {
    public static String APP_ID = null;
    public static boolean CHANNEL_MODE = true;
    private static final String KEY_PUSH_TYPE = "pushType";
    static final int TYPE_ALIAS = 1;
    static final int TYPE_LOGOUT = 3;
    static final int TYPE_REGVENDOR = 4;
    static final int TYPE_TAGS = 5;
    static final int TYPE_UNALIAS = 2;
    static final int TYPE_UNTAGS = 6;
    private static volatile boolean isInited = false;
    protected static PushMessageReceiver messageReceiver = new DefaultMessageReceiver();
    public static boolean uniqueChannel = true;
    private final Map<Integer, AssistPushCache> assistCacheMap;
    private boolean isFirstForeGround;
    protected boolean isForeGround;
    private int lastPushThirdType;
    private String lastSelfToken;
    private String lastThirdToken;
    private volatile String mAlias;
    private int mCount;
    private volatile String selfToken;
    private volatile String thirdToken;

    public final class ActivityLife implements Application.ActivityLifecycleCallbacks {
        private ActivityLife() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            PhotonPushManager.access$908(PhotonPushManager.this);
            if (PhotonPushManager.this.mCount == 1) {
                PhotonPushManager photonPushManager = PhotonPushManager.this;
                photonPushManager.isForeGround = true;
                boolean z = photonPushManager.isFirstForeGround;
                PhotonPushManager photonPushManager2 = PhotonPushManager.this;
                if (z) {
                    photonPushManager2.isFirstForeGround = false;
                } else {
                    ChannelBridge.start(photonPushManager2.selfToken, PhotonPushManager.this.mAlias);
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            PhotonPushManager.access$910(PhotonPushManager.this);
            if (PhotonPushManager.this.mCount == 0) {
                PhotonPushManager.this.isForeGround = false;
            }
        }
    }

    public class AssistPushCache {
        String assistThirdToken;
        String lastAssistThirdToken;
        String lastSelfToken;
        String selfToken;

        public AssistPushCache() {
        }
    }

    public static class SingletonHolder {
        private static final PhotonPushManager manager = new PhotonPushManager();

        private SingletonHolder() {
        }
    }

    private PhotonPushManager() {
        this.isFirstForeGround = true;
        this.assistCacheMap = Collections.synchronizedMap(new HashMap());
        this.lastPushThirdType = -1;
        this.mCount = 0;
    }

    public static /* synthetic */ int access$908(PhotonPushManager photonPushManager) {
        int i = photonPushManager.mCount;
        photonPushManager.mCount = i + 1;
        return i;
    }

    public static /* synthetic */ int access$910(PhotonPushManager photonPushManager) {
        int i = photonPushManager.mCount;
        photonPushManager.mCount = i - 1;
        return i;
    }

    private String assistPushType(int i) {
        return i != 105 ? "Unknow" : ThirdPushManager.VENDOR_TYPE_FCM;
    }

    private boolean checkInitialization() {
        if (AppContext.getContext() != null) {
            return true;
        }
        MDLog.m7391e("MoPush-Init", "not init,please init before!!");
        return false;
    }

    private boolean checkPermission() {
        return AppContext.getContext().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0 && AppContext.getContext().checkSelfPermission("android.permission.READ_PHONE_STATE") == 0;
    }

    public static PhotonPushManager getInstance() {
        return SingletonHolder.manager;
    }

    private boolean invalidSelfToken() {
        if (!TextUtils.isEmpty(this.selfToken)) {
            return false;
        }
        MDLog.m7391e(LogTag.NOTIFY_THIRD, "请注册自通道token");
        return true;
    }

    public static boolean isInit() {
        return isInited;
    }

    private String pushType(int i) {
        if (i == 1) {
            return ThirdPushManager.VENDOR_TYPE_XIAOMI;
        }
        if (i == 10) {
            return "HONOR";
        }
        if (i == 3) {
            return ThirdPushManager.VENDOR_TYPE_HUAWEI;
        }
        if (i == 4) {
            return ThirdPushManager.VENDOR_TYPE_OPPO;
        }
        if (i == 5) {
            return ThirdPushManager.VENDOR_TYPE_VIVO;
        }
        if (i == 6) {
            return ThirdPushManager.VENDOR_TYPE_MEIZU;
        }
        if (i != 7) {
            return null;
        }
        return ThirdPushManager.VENDOR_TYPE_XIAOMI;
    }

    private void setAlias(String str, String str2) {
        if (invalidSelfToken() || !checkInitialization()) {
            return;
        }
        this.mAlias = str;
        PushApi.alias(this.selfToken, APP_ID, str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void setAssistThirdTokenToServer(int i, AssistPushCache assistPushCache) {
        if (TextUtils.isEmpty(assistPushCache.selfToken)) {
            MDLog.m7392e(LogTag.NOTIFY_THIRD, "[%d]自通道token还未注册成功", Integer.valueOf(i));
            return;
        }
        if (TextUtils.isEmpty(assistPushCache.assistThirdToken)) {
            MDLog.m7392e(LogTag.NOTIFY_THIRD, "[%d]三方辅助Push还未注册成功，或不支持", Integer.valueOf(i));
            return;
        }
        if (TextUtils.equals(assistPushCache.lastSelfToken, assistPushCache.selfToken) && TextUtils.equals(assistPushCache.lastAssistThirdToken, assistPushCache.assistThirdToken)) {
            MDLog.m7392e(LogTag.NOTIFY_THIRD, "[%d]三方辅助Push已注册过，忽略", Integer.valueOf(i));
            return;
        }
        String strAssistPushType = assistPushType(i);
        if (TextUtils.isEmpty(strAssistPushType)) {
            MDLog.m7391e(LogTag.NOTIFY_THIRD, "[%d]assistThirdType invalid");
            return;
        }
        assistPushCache.lastSelfToken = assistPushCache.selfToken;
        assistPushCache.lastAssistThirdToken = assistPushCache.assistThirdToken;
        PushApi.regVendor(this.selfToken, APP_ID, strAssistPushType, assistPushCache.assistThirdToken);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void setThirdTokenToServer() {
        if (TextUtils.isEmpty(this.selfToken)) {
            MDLog.m7391e(LogTag.NOTIFY_THIRD, "自通道token还未注册成功");
            return;
        }
        if (TextUtils.isEmpty(this.thirdToken)) {
            MDLog.m7391e(LogTag.NOTIFY_THIRD, "三方Push还未注册成功，或不支持");
            return;
        }
        if (TextUtils.equals(this.lastSelfToken, this.selfToken) && TextUtils.equals(this.lastThirdToken, this.thirdToken)) {
            return;
        }
        this.lastSelfToken = this.selfToken;
        this.lastThirdToken = this.thirdToken;
        String str = this.selfToken;
        String str2 = APP_ID;
        int i = this.lastPushThirdType;
        PushApi.regVendor(str, str2, i != -1 ? pushType(i) : pushType(), this.thirdToken);
    }

    private void showToast(final String str) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            Toast.makeText(AppContext.getContext(), str, 0).show();
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.cosmos.photon.push.PhotonPushManager.5
                @Override // java.lang.Runnable
                public void run() {
                    Toast.makeText(AppContext.getContext(), str, 1).show();
                }
            });
        }
    }

    private void unAlias(String str, String str2) {
        if (invalidSelfToken() || !checkInitialization()) {
            return;
        }
        PushPreferenceUtils.removeAlias();
        PushApi.unAlias(this.selfToken, APP_ID, str, str2);
    }

    public void init(Application application, String str, final PushMessageReceiver pushMessageReceiver) {
        j0c.m139159c(application, new PushDNSConfig());
        AppContext.init(application.getApplicationContext());
        AppContext.setAppId(str);
        NetUtil.init(application.getApplicationContext());
        PushEventStatistic.init(application);
        PushPreferenceUtils.initConfig();
        APP_ID = str;
        messageReceiver = pushMessageReceiver;
        AppContext.setMessageReceiver(pushMessageReceiver);
        isInited = true;
        ThirdPushManager.mEnableFcmPush = pushMessageReceiver.isFcmOpen();
        if (AppContext.isRunningInMainProcess()) {
            LastRegistKeeper.getInstance().init();
            application.registerActivityLifecycleCallbacks(new ActivityLife());
            SharedPreferences prefs = PushPreferenceUtils.getPrefs();
            if (prefs != null) {
                this.mAlias = prefs.getString(PushPreferenceUtils.KEY_ALIAS, "");
                this.selfToken = prefs.getString(PushPreferenceUtils.KEY_P_TOKEN, "");
                this.thirdToken = prefs.getString(PushPreferenceUtils.KEY_T_TOKEN, "");
            }
            ThirdPartyEventReporter.setReporter(new IStatisticReporter() { // from class: com.cosmos.photon.push.PhotonPushManager.1
                @Override // com.cosmos.photon.push.thirdparty.IStatisticReporter
                public void log(String str2) {
                    PushEventStatistic.logPushEventInfo(str2);
                }
            });
            ThirdPartyEventReporter.setAppId(str);
            ThirdPushManager.getInstance().init(application, new PushBridge() { // from class: com.cosmos.photon.push.PhotonPushManager.2
                @Override // com.cosmos.photon.push.thirdparty.IPushBridge
                public String getRegisteredToken() {
                    return PhotonPushManager.this.thirdToken;
                }

                @Override // com.cosmos.photon.push.thirdparty.IPushBridge
                public void onGetTokenResult(boolean z, String str2) {
                    PushMessageReceiver pushMessageReceiver2 = pushMessageReceiver;
                    if (pushMessageReceiver2 != null) {
                        pushMessageReceiver2.onGetTokenResult(z, str2);
                    }
                }

                @Override // com.cosmos.photon.push.thirdparty.IPushBridge
                public synchronized void onPushRegisterResult(int i, int i2, String str2) {
                    try {
                        PhotonPushManager.this.thirdToken = str2;
                        if (ThirdPushManager.getPushSdk() == 7) {
                            PhotonPushManager.this.thirdToken = ThirdPushManager.XIAOMI_OVERSEA_PREFIX + PhotonPushManager.this.thirdToken;
                        }
                        MDLog.m7392e(LogTag.NOTIFY_THIRD, "code:%d  token: %s", Integer.valueOf(i2), str2);
                        PushMessageReceiver pushMessageReceiver2 = pushMessageReceiver;
                        if (pushMessageReceiver2 != null) {
                            pushMessageReceiver2.onThirdPushRegisterResult(i, i2, str2);
                        }
                        PhotonPushManager.this.setThirdTokenToServer();
                    } catch (Throwable th) {
                        throw th;
                    }
                }

                @Override // com.cosmos.photon.push.thirdparty.IPushBridge
                public void onReceiveAssistThirdNotification(int i, NotificationWrapper notificationWrapper) {
                    MoNotify moNotifyCreate = MoNotify.create(notificationWrapper);
                    String pushSource = DataProcessor.getPushSource(moNotifyCreate);
                    PushEventStatistic.logPushEventInfo(new EventLogBody.Builder().pushSource(pushSource).time(moNotifyCreate.time).data(moNotifyCreate.data).type(EventLogBody.TYPE_ARRIVED).uploadType(moNotifyCreate.logType).build());
                    if (!PhotonPushManager.messageReceiver.onNotificationShow(moNotifyCreate)) {
                        DataProcessor.onPushArrivedInner(moNotifyCreate);
                        return;
                    }
                    EventLogBody.Builder builder = new EventLogBody.Builder();
                    builder.pushSource(pushSource).time(moNotifyCreate.time).data(moNotifyCreate.data).uploadType(moNotifyCreate.logType).type(EventLogBody.TYPE_ARRIVED_NOT_SHOWN).reason(7);
                    PushEventStatistic.logPushEventInfo(builder.build());
                }

                @Override // com.cosmos.photon.push.thirdparty.IPushBridge
                public void onReceiveAssistThirdToken(int i, String str2) {
                    MDLog.m7392e(LogTag.NOTIFY_THIRD, "onReceiveAssistThirdToken assistTokenType:%d  token: %s", Integer.valueOf(i), str2);
                    synchronized (PhotonPushManager.this) {
                        try {
                            AssistPushCache assistPushCache = (AssistPushCache) PhotonPushManager.this.assistCacheMap.get(Integer.valueOf(i));
                            if (assistPushCache == null) {
                                assistPushCache = PhotonPushManager.this.new AssistPushCache();
                                PhotonPushManager.this.assistCacheMap.put(Integer.valueOf(i), assistPushCache);
                            }
                            assistPushCache.selfToken = PhotonPushManager.this.selfToken;
                            assistPushCache.assistThirdToken = str2;
                            PhotonPushManager.this.setAssistThirdTokenToServer(i, assistPushCache);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }

                @Override // com.cosmos.photon.push.thirdparty.IPushBridge
                public void onReceivePassThroughMessage(int i, String str2) {
                    if (str2 == null) {
                        return;
                    }
                    try {
                        JSONObject jSONObject = new JSONObject(str2);
                        MoMessage moMessage = new MoMessage();
                        moMessage.f5809id = jSONObject.optString("id");
                        moMessage.toPkg = AppContext.getPackageName();
                        moMessage.time = jSONObject.optLong("time");
                        moMessage.type = jSONObject.optInt("type");
                        moMessage.text = jSONObject.optString("text");
                        MDLog.m7396i("MOMOIM_PUSH", "onReceivePassThroughMessage [%d] <--:%s", Integer.valueOf(i), moMessage.toString());
                        DataProcessor.onMsgArrivedInner(moMessage);
                    } catch (JSONException e) {
                        MDLog.printErrStackTrace(LogTag.NOTIFY, e);
                    }
                }

                @Override // com.cosmos.photon.push.thirdparty.IPushBridge
                public void onUnRegisterResult(int i, int i2) {
                    MDLog.m7392e(LogTag.NOTIFY_THIRD, "code:%d  token: %s", Integer.valueOf(i2), PhotonPushManager.this.thirdToken);
                }
            }, messageReceiver.isMiPushOpen(), messageReceiver.isHuaweiPushOpen(), messageReceiver.isOppoPushOpen(), messageReceiver.isVivoPushOpen(), messageReceiver.isMeizuPushOpen(), messageReceiver.isFcmOpen(), messageReceiver.isHonorPushOpen());
            NetUtil.registerNetChangeReceiver(new NetUtil.NetChangeReceiver() { // from class: com.cosmos.photon.push.PhotonPushManager.3
                @Override // com.cosmos.photon.push.util.NetUtil.NetChangeReceiver
                public void onNetworkChanged() {
                    PushApi.checkUnSendData();
                }
            });
            if (!checkPermission() || TextUtils.isEmpty(this.selfToken)) {
                return;
            }
            ChannelBridge.start(this.selfToken, this.mAlias);
        }
    }

    public boolean isForeGround() {
        return this.isForeGround;
    }

    public String join(Iterator it, String str) {
        if (it == null) {
            return null;
        }
        if (!it.hasNext()) {
            return "";
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return next != null ? next.toString() : "";
        }
        StringBuilder sb = new StringBuilder(256);
        if (next != null) {
            sb.append(next);
        }
        while (it.hasNext()) {
            if (str != null) {
                sb.append(str);
            }
            Object next2 = it.next();
            if (next2 != null) {
                sb.append(next2);
            }
        }
        return sb.toString();
    }

    public void logPushClick(Intent intent) {
        int intExtra;
        int i;
        if (checkInitialization()) {
            try {
                intExtra = intent.getIntExtra(KEY_PUSH_TYPE, -1);
            } catch (Exception e) {
                e.printStackTrace();
                intExtra = -1;
            }
            if (intExtra == -1) {
                try {
                    String stringExtra = intent.getStringExtra(KEY_PUSH_TYPE);
                    if (!TextUtils.isEmpty(stringExtra)) {
                        intExtra = Integer.parseInt(stringExtra);
                    }
                } catch (Exception unused) {
                }
            }
            if (intExtra < 0) {
                return;
            }
            if (intExtra == 1 || intExtra == 2 || intExtra == 3 || intExtra == 4 || intExtra == 6 || intExtra == 10) {
                String stringExtra2 = "";
                try {
                    stringExtra2 = intent.getStringExtra("_ext");
                    i = Integer.parseInt(new JSONObject(stringExtra2).optString("ins_log", "0"));
                } catch (Exception e2) {
                    MDLog.printErrStackTrace(LogTag.STATISTIC, e2);
                    i = 0;
                }
                String pushSource = DataProcessor.getPushSource(intExtra);
                long jCurrentTimeMillis = System.currentTimeMillis();
                PushEventStatistic.logPushEventInfo(new EventLogBody.Builder().pushSource(pushSource).type(EventLogBody.TYPE_CLICKED).uploadType(i).time(jCurrentTimeMillis).data(stringExtra2).build());
                if (this.isForeGround) {
                    return;
                }
                PushEventStatistic.logPushEventInfo(new EventLogBody.Builder().pushSource(pushSource).type(EventLogBody.TYPE_FORGROUND_NOT_SHOWN).uploadType(i).time(jCurrentTimeMillis).data(stringExtra2).build());
            }
        }
    }

    public void onCommand(int i, int i2, String str) {
        if (i2 == 0) {
            if (i == 1) {
                PushPreferenceUtils.saveAlias(this.mAlias);
            } else if (i == 4) {
                PushPreferenceUtils.saveThirdToken(this.thirdToken);
            }
        }
        messageReceiver.onCommand(i, i2, str);
    }

    public void onPushClick(MoNotify moNotify) {
        if (checkInitialization()) {
            DataProcessor.onPushClickFromBusiness(moNotify);
        }
    }

    public void onPushShow(MoNotify moNotify, boolean z) {
        if (checkInitialization()) {
            DataProcessor.onPushShowFromBusiness(moNotify, z);
        }
    }

    public synchronized void onSelfTokenRegistered(int i, String str, String str2, String str3) {
        AssistPushCache assistPushCache;
        try {
            this.selfToken = str;
            if (i == 0) {
                PushPreferenceUtils.saveToken(str);
                if (!TextUtils.isEmpty(str3)) {
                    PushPreferenceUtils.saveAlias(str3);
                }
            }
            messageReceiver.onToken(i, str, str2);
            ChannelBridge.start(this.selfToken, this.mAlias);
            setThirdTokenToServer();
            if (messageReceiver.isFcmOpen() && (assistPushCache = this.assistCacheMap.get(105)) != null && TextUtils.isEmpty(assistPushCache.assistThirdToken)) {
                setFcmTokenToServer(assistPushCache.assistThirdToken);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void register() {
        registerWithAlias(null);
    }

    public void registerWithAlias(String str) {
        if (checkInitialization()) {
            String deviceId = ChannelBridge.getDeviceId();
            PushPreferenceUtils.saveDeviceId(deviceId);
            PushApi.register(deviceId, APP_ID, str, null);
            ThirdPushManager.getInstance().register();
        }
    }

    public void removeTag(String str) {
        if (invalidSelfToken() || TextUtils.isEmpty(str) || !checkInitialization()) {
            return;
        }
        PushApi.unTags(this.selfToken, APP_ID, null, str);
    }

    public void removeTagToAlias(String str, String str2) {
        if (invalidSelfToken() || TextUtils.isEmpty(str2) || !checkInitialization()) {
            return;
        }
        PushApi.unTags(this.selfToken, APP_ID, str, str2);
    }

    public void removeTags(Set<String> set) {
        if (invalidSelfToken() || set == null || set.isEmpty() || !checkInitialization()) {
            return;
        }
        PushApi.unTags(this.selfToken, APP_ID, null, join(set.iterator(), Constants.SEPARATOR_COMMA));
    }

    public void removeTagsToAlias(String str, Set<String> set) {
        if (invalidSelfToken() || set == null || set.isEmpty() || !checkInitialization()) {
            return;
        }
        PushApi.unTags(this.selfToken, APP_ID, str, join(set.iterator(), Constants.SEPARATOR_COMMA));
    }

    public synchronized void setFcmTokenToServer(String str) {
        try {
            AssistPushCache assistPushCache = this.assistCacheMap.get(105);
            if (assistPushCache == null) {
                assistPushCache = new AssistPushCache();
                this.assistCacheMap.put(105, assistPushCache);
            }
            assistPushCache.assistThirdToken = str;
            assistPushCache.lastAssistThirdToken = str;
            if (TextUtils.isEmpty(this.selfToken)) {
                MDLog.m7391e(LogTag.NOTIFY_THIRD, "自通道token还未注册成功");
            } else {
                assistPushCache.selfToken = this.selfToken;
                PushApi.regVendor(this.selfToken, APP_ID, ThirdPushManager.VENDOR_TYPE_FCM, str);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void setTag(String str) {
        if (invalidSelfToken() || TextUtils.isEmpty(str) || !checkInitialization()) {
            return;
        }
        PushApi.tags(this.selfToken, APP_ID, null, str);
    }

    public void setTagToAlias(String str, String str2) {
        if (invalidSelfToken() || TextUtils.isEmpty(str2) || !checkInitialization()) {
            return;
        }
        PushApi.tags(this.selfToken, APP_ID, str, str2);
    }

    public void setTags(Set<String> set) {
        if (invalidSelfToken() || set == null || set.isEmpty() || !checkInitialization()) {
            return;
        }
        PushApi.tags(this.selfToken, APP_ID, null, join(set.iterator(), Constants.SEPARATOR_COMMA));
    }

    public void setTagsToAlias(String str, Set<String> set) {
        if (invalidSelfToken() || set == null || set.isEmpty() || !checkInitialization()) {
            return;
        }
        PushApi.tags(this.selfToken, APP_ID, str, join(set.iterator(), Constants.SEPARATOR_COMMA));
    }

    public void unRegister() {
        if (invalidSelfToken() || !checkInitialization()) {
            return;
        }
        PushApi.logout(this.selfToken, APP_ID);
        ThreadUtils.execute(new Runnable() { // from class: com.cosmos.photon.push.PhotonPushManager.4
            @Override // java.lang.Runnable
            public void run() {
                ChannelManager.getInstance().release(ChannelBridge.getDeviceId());
                ChannelBridge.stopSync(PhotonPushManager.this.selfToken);
                ThirdPushManager.getInstance().unregister();
                PushPreferenceUtils.clearAll();
                PhotonPushManager.this.selfToken = null;
                PhotonPushManager.this.mAlias = null;
                PhotonPushManager.this.thirdToken = null;
            }
        });
    }

    public void setAlias(String str) {
        setAlias(str, null);
    }

    public void unAlias(String str) {
        unAlias(str, null);
    }

    private String pushType() {
        return pushType(ThirdPushManager.getPushSdk());
    }

    public synchronized void setThirdTokenToServer(int i, String str) {
        if (i == 7) {
            try {
                str = ThirdPushManager.XIAOMI_OVERSEA_PREFIX + str;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.thirdToken = str;
        this.lastPushThirdType = i;
        if (TextUtils.isEmpty(this.selfToken)) {
            MDLog.m7391e(LogTag.NOTIFY_THIRD, "自通道token还未注册成功");
        } else {
            this.lastSelfToken = this.selfToken;
            PushApi.regVendor(this.selfToken, APP_ID, pushType(i), str);
        }
    }
}
