package com.heytap.mcssdk;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import com.heytap.mcssdk.callback.PushCallback;
import com.heytap.mcssdk.mode.AppMessage;
import com.heytap.mcssdk.mode.CommandMessage;
import com.heytap.mcssdk.mode.MessageStat;
import com.heytap.mcssdk.mode.SptDataMessage;
import com.heytap.mcssdk.p041a.C3614a;
import com.heytap.mcssdk.p041a.C3615b;
import com.heytap.mcssdk.p041a.C3618e;
import com.heytap.mcssdk.p041a.InterfaceC3617d;
import com.heytap.mcssdk.p042b.C3620a;
import com.heytap.mcssdk.p042b.C3621b;
import com.heytap.mcssdk.p042b.C3623d;
import com.heytap.mcssdk.p042b.InterfaceC3622c;
import com.heytap.mcssdk.utils.LogUtil;
import com.heytap.mcssdk.utils.StatUtil;
import com.heytap.mcssdk.utils.Utils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p153l.wg3;

/* JADX INFO: loaded from: classes7.dex */
public class PushManager implements InterfaceC3619b {
    private static final String APP_PACKAGE = "appPackage";
    private static final String APP_VERSION_CODE = "versionCode";
    private static final String APP_VERSION_NAME = "versionName";
    private static final String EVENT_ID = "eventID";
    public static final String EVENT_ID_APP_BLACK_LIST = "app_black_list";
    public static final String EVENT_ID_PUSH_ADD_MESSAGE_NO_DISTURBING = "add_message_no_disturbing";
    public static final String EVENT_ID_PUSH_ADD_MESSAGE_TOP = "add_message_top";
    public static final String EVENT_ID_PUSH_CLICK = "push_click";
    public static final String EVENT_ID_PUSH_DELETE = "push_delete";
    public static final String EVENT_ID_PUSH_EXCEPTION = "push_exception";
    public static final String EVENT_ID_PUSH_MESSAGE_REPEAT = "message_repeat";
    public static final String EVENT_ID_PUSH_NO_IMSI = "imsi_not_exist";
    public static final String EVENT_ID_PUSH_NO_SHOW = "push_no_show";
    public static final String EVENT_ID_PUSH_REGISTER = "push_register";
    public static final String EVENT_ID_PUSH_REVOKE = "push_revoke";
    public static final String EVENT_ID_PUSH_REVOKE_DELETE = "push_revoke_delete";
    public static final String EVENT_ID_PUSH_SHOW = "push_show";
    public static final String EVENT_ID_PUSH_TRANSMIT = "push_transmit";
    public static final String EVENT_ID_READ_MESSAGE = "push_read_message";
    private static final String EXTRA = "extra";
    private static final String GLOBAL_ID = "globalID";
    private static final int MAX_HOUR_IN_DAY = 23;
    private static final int MAX_MIN_IN_HOUR = 59;
    private static final int MCS_SUPPORT_VERSION = 1012;
    private static final String MESSAGE_ID = "messageID";
    private static final String MESSAGE_TYPE = "messageType";
    private static final String NEW_MCS_RECEIVE_SDK_ACTION = "com.mcs.action.RECEIVE_SDK_MESSAGE";
    private static final String PUSH_SDK_VERSION = "pushSdkVersion";
    private static final int SDK_INT_24 = 24;
    private static final String SUPPORT_OPEN_PUSH = "supportOpenPush";
    private static final int SYSTEM_UID = 1000;
    private static final String TASK_ID = "taskID";
    private static final String TYPE = "type";
    private static boolean sIsNewMcsPkg;
    private static String sMcsPkgName;
    private String mAppKey;
    private String mAppSecret;
    private Context mContext;
    private final Object mMcsServiceLock;
    private List<InterfaceC3617d> mParsers;
    private List<InterfaceC3622c> mProcessors;
    private PushCallback mPushCallback;
    private String mRegisterID;
    private static final int[] OLD_MCS_PACKAGE = {99, 111, 109, 46, 99, 111, 108, 111, 114, 111, 115, 46, 109, 99, 115};
    private static final int[] OLD_MCS_RECEIVE_SDK_ACTION = {99, 111, 109, 46, 99, 111, 108, 111, 114, 111, 115, 46, 109, 99, 115, 115, 100, 107, 46, 97, 99, 116, 105, 111, 110, 46, 82, 69, 67, 69, 73, 86, 69, 95, 83, 68, 75, 95, 77, 69, 83, 83, 65, 71, 69};
    private static int sCount = 0;

    private PushManager() {
        this.mMcsServiceLock = new Object();
        this.mProcessors = new ArrayList();
        this.mParsers = new ArrayList();
        this.mRegisterID = null;
        synchronized (PushManager.class) {
            int i = sCount;
            if (i > 0) {
                throw new RuntimeException("PushManager can't create again!");
            }
            sCount = i + 1;
        }
        addParser(new C3614a());
        addParser(new C3618e());
        addParser(new C3615b());
        addProcessor(new C3620a());
        addProcessor(new C3623d());
        addProcessor(new C3621b());
    }

    private synchronized void addParser(InterfaceC3617d interfaceC3617d) {
        if (interfaceC3617d != null) {
            this.mParsers.add(interfaceC3617d);
        }
    }

    private synchronized void addProcessor(InterfaceC3622c interfaceC3622c) {
        if (interfaceC3622c != null) {
            this.mProcessors.add(interfaceC3622c);
        }
    }

    private void checkAll() {
        checkContext();
        checkRegisterID();
    }

    private void checkContext() {
        if (this.mContext != null) {
            return;
        }
        wg3.m206174a("please call the register first!");
    }

    private void checkRegisterID() {
        if (this.mRegisterID != null) {
            return;
        }
        wg3.m206174a("please call the register until get the registerID!");
    }

    public static PushManager getInstance() {
        return C3626e.f12565a;
    }

    private Intent getIntent(int i, String str, JSONObject jSONObject) {
        Intent intent = new Intent();
        intent.setAction(getReceiveSdkAction(this.mContext));
        intent.setPackage(getMcsPackageName(this.mContext));
        intent.putExtra("type", i);
        JSONObject jSONObject2 = new JSONObject();
        try {
            Context context = this.mContext;
            jSONObject2.putOpt(APP_VERSION_NAME, Utils.getVersionName(context, context.getPackageName()));
            Context context2 = this.mContext;
            jSONObject2.putOpt(APP_VERSION_CODE, Integer.valueOf(Utils.getVersionCode(context2, context2.getPackageName())));
            if (jSONObject != null) {
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    jSONObject2.putOpt(next, jSONObject.get(next));
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            intent.putExtra("extra", jSONObject2.toString());
            throw th;
        }
        intent.putExtra("extra", jSONObject2.toString());
        intent.putExtra(CommandMessage.PARAMS, str);
        intent.putExtra("appPackage", this.mContext.getPackageName());
        intent.putExtra("appKey", this.mAppKey);
        intent.putExtra(CommandMessage.APP_SECRET, this.mAppSecret);
        intent.putExtra(CommandMessage.REGISTER_ID, this.mRegisterID);
        intent.putExtra("sdkVersion", getSDKVersion());
        return intent;
    }

    public static String getMcsPackageName(Context context) {
        boolean z;
        if (sMcsPkgName == null) {
            String newMcsPackageName = getNewMcsPackageName(context);
            if (newMcsPackageName == null) {
                sMcsPkgName = Utils.getString(OLD_MCS_PACKAGE);
                z = false;
            } else {
                sMcsPkgName = newMcsPackageName;
                z = true;
            }
            sIsNewMcsPkg = z;
        }
        return sMcsPkgName;
    }

    private static String getNewMcsPackageName(Context context) {
        Iterator<ResolveInfo> it = context.getPackageManager().queryIntentServices(new Intent(NEW_MCS_RECEIVE_SDK_ACTION), 8192).iterator();
        while (it.hasNext()) {
            String str = it.next().serviceInfo.packageName;
            try {
                boolean z = (context.getPackageManager().getApplicationInfo(str, 0).flags & 1) == 1;
                boolean z2 = context.getPackageManager().getPackageUid(str, 0) == context.getPackageManager().getPackageUid("android", 0);
                if (z || z2) {
                    return str;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return null;
    }

    public static String getReceiveSdkAction(Context context) {
        if (sMcsPkgName == null) {
            getNewMcsPackageName(context);
        }
        return sIsNewMcsPkg ? NEW_MCS_RECEIVE_SDK_ACTION : Utils.getString(OLD_MCS_RECEIVE_SDK_ACTION);
    }

    public static String getSDKVersion() {
        return C3613a.f12562f;
    }

    public static boolean isSupportPush(Context context) {
        String mcsPackageName = getMcsPackageName(context);
        return Utils.isExistPackage(context, mcsPackageName) && Utils.getVersionCode(context, mcsPackageName) >= 1012 && Utils.isSupportPush(context, mcsPackageName, SUPPORT_OPEN_PUSH);
    }

    @Deprecated
    private static void onAppStart(Context context) {
        statisticMessage(context, new MessageStat(context.getPackageName(), "app_start", null));
    }

    private void startMcsService(int i, String str, JSONObject jSONObject) {
        synchronized (this.mMcsServiceLock) {
            this.mContext.startService(getIntent(i, str, jSONObject));
        }
    }

    public static void statisticMessage(Context context, AppMessage appMessage, String str) {
        try {
            Intent intent = new Intent();
            intent.setAction(getReceiveSdkAction(context));
            intent.setPackage(getMcsPackageName(context));
            intent.putExtra("type", CommandMessage.COMMAND_STATISTIC);
            intent.putExtra("taskID", appMessage.getTaskID());
            intent.putExtra("appPackage", appMessage.getAppPackage());
            intent.putExtra("messageID", String.valueOf(appMessage.getMessageID()));
            intent.putExtra("globalID", String.valueOf(appMessage.getMessageID()));
            intent.putExtra(MESSAGE_TYPE, appMessage.getType());
            intent.putExtra(EVENT_ID, str);
            context.startService(intent);
        } catch (Exception e) {
            LogUtil.m18545e("statisticMessage--Exception" + e.getMessage());
        }
    }

    public void bindMcsService(int i) {
        Intent intent = getIntent(i, "", null);
        this.mContext.bindService(intent, new ServiceConnectionC3625d(this, intent), 1);
    }

    @Override // com.heytap.mcssdk.InterfaceC3624c
    public void clearNotificationType(JSONObject jSONObject) {
        try {
            checkAll();
            startMcsService(CommandMessage.COMMAND_CLEAR_NOTIFICATION_TYPE, jSONObject);
        } catch (Exception e) {
            LogUtil.m18547e(LogUtil.TAG, e);
        }
    }

    @Override // com.heytap.mcssdk.InterfaceC3624c
    public void clearNotifications(JSONObject jSONObject) {
        try {
            checkContext();
            startMcsService(CommandMessage.COMMAND_CLEAR_PKG_NOTIFICATION, jSONObject);
        } catch (Exception e) {
            LogUtil.m18547e(LogUtil.TAG, e);
        }
    }

    @Override // com.heytap.mcssdk.InterfaceC3624c
    public void getAliases(JSONObject jSONObject) {
        try {
            checkAll();
            startMcsService(CommandMessage.COMMAND_GET_ALIAS, jSONObject);
        } catch (Exception unused) {
            if (getPushCallback() != null) {
                getPushCallback().onGetAliases(-2, null);
            }
        }
    }

    @Override // com.heytap.mcssdk.InterfaceC3624c
    public void getNotificationStatus(JSONObject jSONObject) {
        try {
            checkAll();
            startMcsService(CommandMessage.COMMAND_GET_NOTIFICATION_STATUS, jSONObject);
        } catch (Exception unused) {
            if (getPushCallback() != null) {
                getPushCallback().onGetNotificationStatus(-2, 0);
            }
        }
    }

    public List<InterfaceC3617d> getParsers() {
        return this.mParsers;
    }

    public List<InterfaceC3622c> getProcessors() {
        return this.mProcessors;
    }

    public PushCallback getPushCallback() {
        return this.mPushCallback;
    }

    public void getPushStatus() {
        try {
            checkAll();
            startMcsService(CommandMessage.COMMAND_GET_PUSH_STATUS, null);
        } catch (Exception unused) {
            if (getPushCallback() != null) {
                getPushCallback().onGetPushStatus(-2, 0);
            }
        }
    }

    public int getPushVersionCode() {
        checkContext();
        Context context = this.mContext;
        return Utils.getVersionCode(context, getMcsPackageName(context));
    }

    public String getPushVersionName() {
        checkContext();
        Context context = this.mContext;
        return Utils.getVersionName(context, getMcsPackageName(context));
    }

    @Override // com.heytap.mcssdk.InterfaceC3624c
    public void getRegister(JSONObject jSONObject) {
        try {
            checkContext();
            startMcsService(CommandMessage.COMMAND_REGISTER, jSONObject);
        } catch (Exception unused) {
            if (getPushCallback() != null) {
                getPushCallback().onRegister(-2, null);
            }
        }
    }

    @Override // com.heytap.mcssdk.InterfaceC3619b
    public String getRegisterID() {
        return this.mRegisterID;
    }

    @Override // com.heytap.mcssdk.InterfaceC3624c
    public void getTags(JSONObject jSONObject) {
        try {
            checkAll();
            startMcsService(CommandMessage.COMMAND_GET_TAGS, jSONObject);
        } catch (Exception unused) {
            if (getPushCallback() != null) {
                getPushCallback().onGetTags(-2, null);
            }
        }
    }

    @Override // com.heytap.mcssdk.InterfaceC3624c
    public void getUserAccounts(JSONObject jSONObject) {
        try {
            checkAll();
            startMcsService(CommandMessage.COMMAND_GET_ACCOUNTS, jSONObject);
        } catch (Exception unused) {
            if (getPushCallback() != null) {
                getPushCallback().onGetUserAccounts(-2, null);
            }
        }
    }

    @Override // com.heytap.mcssdk.InterfaceC3624c
    public void openNotificationSettings(JSONObject jSONObject) {
        try {
            checkAll();
            startMcsService(12310, jSONObject);
        } catch (Exception e) {
            LogUtil.m18547e(LogUtil.TAG, e);
        }
    }

    @Override // com.heytap.mcssdk.InterfaceC3624c
    public void pausePush(JSONObject jSONObject) {
        try {
            checkAll();
            startMcsService(CommandMessage.COMMAND_PAUSE_PUSH, jSONObject);
        } catch (Exception e) {
            LogUtil.m18547e(LogUtil.TAG, e);
        }
    }

    @Override // com.heytap.mcssdk.InterfaceC3624c
    public void register(Context context, String str, String str2, JSONObject jSONObject, PushCallback pushCallback) {
        try {
            if (context == null) {
                throw new IllegalArgumentException("context is null !");
            }
            statisticMessage(context, new MessageStat(context.getPackageName(), EVENT_ID_PUSH_REGISTER, null));
            if (!isSupportPush(context)) {
                throw new IllegalArgumentException("the phone is not support push!");
            }
            this.mAppKey = str;
            this.mAppSecret = str2;
            this.mContext = context.getApplicationContext();
            this.mPushCallback = pushCallback;
            startMcsService(CommandMessage.COMMAND_REGISTER, jSONObject);
        } catch (Exception unused) {
            if (getPushCallback() != null) {
                getPushCallback().onRegister(-2, null);
            }
        }
    }

    @Override // com.heytap.mcssdk.InterfaceC3619b
    public void requestNotificationPermission() {
        try {
            checkContext();
            bindMcsService(CommandMessage.COMMANAD_NOTIFICATION_ALLOWANCE);
        } catch (Exception e) {
            LogUtil.m18547e(LogUtil.TAG, e);
        }
    }

    @Override // com.heytap.mcssdk.InterfaceC3624c
    public void resumePush(JSONObject jSONObject) {
        try {
            checkAll();
            startMcsService(CommandMessage.COMMAND_RESUME_PUSH, jSONObject);
        } catch (Exception e) {
            LogUtil.m18547e(LogUtil.TAG, e);
        }
    }

    @Override // com.heytap.mcssdk.InterfaceC3624c
    public void setAliases(List<String> list, JSONObject jSONObject) {
        try {
            checkAll();
            if (list != null && list.size() != 0) {
                startMcsService(CommandMessage.COMMAND_SET_ALIAS, CommandMessage.parseToString(list), jSONObject);
            }
        } catch (Exception unused) {
            if (getPushCallback() != null) {
                getPushCallback().onSetAliases(-2, null);
            }
        }
    }

    public void setAppKeySecret(String str, String str2) {
        this.mAppKey = str;
        this.mAppSecret = str2;
    }

    @Override // com.heytap.mcssdk.InterfaceC3624c
    public void setNotificationType(int i, JSONObject jSONObject) {
        try {
            checkAll();
            startMcsService(CommandMessage.COMMAND_SET_NOTIFICATION_TYPE, String.valueOf(i), jSONObject);
        } catch (Exception e) {
            LogUtil.m18547e(LogUtil.TAG, e);
        }
    }

    public void setPushCallback(PushCallback pushCallback) {
        this.mPushCallback = pushCallback;
    }

    @Override // com.heytap.mcssdk.InterfaceC3624c
    public void setPushTime(List<Integer> list, int i, int i2, int i3, int i4, JSONObject jSONObject) {
        try {
            checkAll();
            if (list == null || list.size() <= 0 || i < 0 || i > 23 || i2 < 0 || i2 > 59 || i3 < i || i3 > 23 || i4 < i2 || i4 > 59) {
                throw new IllegalArgumentException("params are not all right,please check params");
            }
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("weekDays", CommandMessage.parseToString(list));
                jSONObject2.put("startHour", i);
                jSONObject2.put("startMin", i2);
                jSONObject2.put("endHour", i3);
                jSONObject2.put("endMin", i4);
                startMcsService(CommandMessage.COMMAND_SET_PUSH_TIME, jSONObject2.toString(), jSONObject);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        } catch (Exception e2) {
            if (getPushCallback() != null) {
                getPushCallback().onSetPushTime(-2, e2.getMessage());
            }
        }
    }

    @Override // com.heytap.mcssdk.InterfaceC3619b
    public void setRegisterID(String str) {
        this.mRegisterID = str;
    }

    @Override // com.heytap.mcssdk.InterfaceC3624c
    public void setTags(List<String> list, JSONObject jSONObject) {
        try {
            checkAll();
            if (list != null && list.size() != 0) {
                startMcsService(CommandMessage.COMMAND_SET_TAGS, CommandMessage.parseToString(list), jSONObject);
            }
        } catch (Exception unused) {
            if (getPushCallback() != null) {
                getPushCallback().onSetTags(-2, null);
            }
        }
    }

    @Override // com.heytap.mcssdk.InterfaceC3624c
    public void setUserAccount(String str, JSONObject jSONObject) {
        try {
            checkAll();
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            setUserAccounts(arrayList, jSONObject);
        } catch (Exception unused) {
            if (getPushCallback() != null) {
                getPushCallback().onSetUserAccounts(-2, null);
            }
        }
    }

    @Override // com.heytap.mcssdk.InterfaceC3624c
    @Deprecated
    public void setUserAccounts(List<String> list, JSONObject jSONObject) {
        try {
            checkAll();
            if (list != null && list.size() != 0) {
                startMcsService(CommandMessage.COMMAND_SET_ACCOUNTS, CommandMessage.parseToString(list), jSONObject);
            }
        } catch (Exception unused) {
            if (getPushCallback() != null) {
                getPushCallback().onSetUserAccounts(-2, null);
            }
        }
    }

    @Override // com.heytap.mcssdk.InterfaceC3624c
    public void unRegister(JSONObject jSONObject) {
        try {
            checkContext();
            startMcsService(CommandMessage.COMMAND_UNREGISTER, jSONObject);
        } catch (Exception unused) {
            if (getPushCallback() != null) {
                getPushCallback().onUnRegister(-2);
            }
        }
    }

    @Override // com.heytap.mcssdk.InterfaceC3624c
    public void unsetAlias(String str, JSONObject jSONObject) {
        try {
            checkAll();
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            unsetAliases(arrayList, jSONObject);
        } catch (Exception unused) {
            if (getPushCallback() != null) {
                getPushCallback().onUnsetAliases(-2, null);
            }
        }
    }

    @Override // com.heytap.mcssdk.InterfaceC3624c
    @Deprecated
    public void unsetAliases(List<String> list, JSONObject jSONObject) {
        try {
            checkAll();
            if (list != null && list.size() != 0) {
                startMcsService(CommandMessage.COMMAND_UNSET_ALIAS, CommandMessage.parseToString(list), jSONObject);
            }
        } catch (Exception unused) {
            if (getPushCallback() != null) {
                getPushCallback().onUnsetAliases(-2, null);
            }
        }
    }

    @Override // com.heytap.mcssdk.InterfaceC3624c
    public void unsetTags(List<String> list, JSONObject jSONObject) {
        try {
            checkAll();
            if (list != null && list.size() != 0) {
                startMcsService(CommandMessage.COMMAND_UNSET_TAGS, CommandMessage.parseToString(list), jSONObject);
            }
        } catch (Exception unused) {
            if (getPushCallback() != null) {
                getPushCallback().onUnsetTags(-2, null);
            }
        }
    }

    @Override // com.heytap.mcssdk.InterfaceC3624c
    public void unsetUserAccounts(List<String> list, JSONObject jSONObject) {
        try {
            checkAll();
            if (list != null && list.size() != 0) {
                startMcsService(CommandMessage.COMMAND_UNSET_ACCOUNTS, CommandMessage.parseToString(list), jSONObject);
            }
        } catch (Exception unused) {
            if (getPushCallback() != null) {
                getPushCallback().onUnsetUserAccounts(-2, null);
            }
        }
    }

    public /* synthetic */ PushManager(ServiceConnectionC3625d serviceConnectionC3625d) {
        this();
    }

    private void startMcsService(int i, JSONObject jSONObject) {
        startMcsService(i, "", jSONObject);
    }

    public static void statisticMessage(Context context, MessageStat messageStat) {
        StatUtil.statisticMessage(context, messageStat);
    }

    @Override // com.heytap.mcssdk.InterfaceC3619b
    public void clearNotificationType() {
        clearNotificationType(null);
    }

    @Override // com.heytap.mcssdk.InterfaceC3619b
    public void clearNotifications() {
        clearNotifications(null);
    }

    @Override // com.heytap.mcssdk.InterfaceC3619b
    public void getAliases() {
        getAliases(null);
    }

    @Override // com.heytap.mcssdk.InterfaceC3619b
    public void getNotificationStatus() {
        getNotificationStatus(null);
    }

    @Override // com.heytap.mcssdk.InterfaceC3619b
    public void getRegister() {
        getRegister(null);
    }

    @Override // com.heytap.mcssdk.InterfaceC3619b
    public void getTags() {
        getTags(null);
    }

    @Override // com.heytap.mcssdk.InterfaceC3619b
    public void getUserAccounts() {
        getUserAccounts(null);
    }

    @Override // com.heytap.mcssdk.InterfaceC3619b
    public void openNotificationSettings() {
        openNotificationSettings(null);
    }

    @Override // com.heytap.mcssdk.InterfaceC3619b
    public void pausePush() {
        pausePush(null);
    }

    @Override // com.heytap.mcssdk.InterfaceC3619b
    public void register(Context context, String str, String str2, PushCallback pushCallback) {
        register(context, str, str2, null, pushCallback);
    }

    @Override // com.heytap.mcssdk.InterfaceC3619b
    public void resumePush() {
        resumePush(null);
    }

    @Override // com.heytap.mcssdk.InterfaceC3619b
    public void setAliases(List<String> list) {
        setAliases(list, null);
    }

    @Override // com.heytap.mcssdk.InterfaceC3619b
    public void setNotificationType(int i) {
        setNotificationType(i, null);
    }

    @Override // com.heytap.mcssdk.InterfaceC3619b
    public void setPushTime(List<Integer> list, int i, int i2, int i3, int i4) {
        setPushTime(list, i, i2, i3, i4, null);
    }

    @Override // com.heytap.mcssdk.InterfaceC3619b
    public void setTags(List<String> list) {
        setTags(list, null);
    }

    @Override // com.heytap.mcssdk.InterfaceC3619b
    public void setUserAccount(String str) {
        setUserAccount(str, null);
    }

    @Override // com.heytap.mcssdk.InterfaceC3619b
    public void setUserAccounts(List<String> list) {
        setUserAccounts(list, null);
    }

    public void unRegister(Context context, String str, String str2, JSONObject jSONObject, PushCallback pushCallback) {
        this.mAppKey = str;
        this.mAppSecret = str2;
        this.mContext = context.getApplicationContext();
        this.mPushCallback = pushCallback;
        unRegister(jSONObject);
    }

    @Override // com.heytap.mcssdk.InterfaceC3619b
    public void unsetAlias(String str) {
        unsetAlias(str, null);
    }

    @Override // com.heytap.mcssdk.InterfaceC3619b
    public void unsetAliases(List<String> list) {
        unsetAliases(list, null);
    }

    @Override // com.heytap.mcssdk.InterfaceC3619b
    public void unsetTags(List<String> list) {
        unsetTags(list, null);
    }

    @Override // com.heytap.mcssdk.InterfaceC3619b
    public void unsetUserAccounts(List<String> list) {
        unsetUserAccounts(list, null);
    }

    public static void statisticMessage(Context context, SptDataMessage sptDataMessage, String str) {
        try {
            Intent intent = new Intent();
            intent.setAction(getReceiveSdkAction(context));
            intent.setPackage(getMcsPackageName(context));
            intent.putExtra("type", CommandMessage.COMMAND_STATISTIC);
            intent.putExtra("taskID", sptDataMessage.getTaskID());
            intent.putExtra("appPackage", sptDataMessage.getAppPackage());
            intent.putExtra("messageID", sptDataMessage.getMessageID());
            intent.putExtra("globalID", sptDataMessage.getGlobalID());
            intent.putExtra(MESSAGE_TYPE, sptDataMessage.getType());
            intent.putExtra(EVENT_ID, str);
            context.startService(intent);
        } catch (Exception e) {
            LogUtil.m18545e("statisticMessage--Exception" + e.getMessage());
        }
    }

    @Override // com.heytap.mcssdk.InterfaceC3619b
    public void unRegister() {
        unRegister(null);
    }

    public static void statisticMessage(Context context, List<MessageStat> list) {
        StatUtil.statisticMessage(context, list);
    }
}
