package com.vivo.push.util;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.database.Cursor;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.AuthenticationTokenClaims;
import com.tencent.connect.common.Constants;
import com.vivo.push.C14622p;
import java.security.PublicKey;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.vivo.push.util.z */
/* JADX INFO: loaded from: classes2.dex */
public final class C14657z {

    /* JADX INFO: renamed from: a */
    private static String[] f61148a = {"com.vivo.push.sdk.RegistrationReceiver", "com.vivo.push.sdk.service.PushService", "com.vivo.push.sdk.service.CommonJobService"};

    /* JADX INFO: renamed from: b */
    private static String[] f61149b = {"android.permission.INTERNET", "android.permission.READ_PHONE_STATE", "android.permission.ACCESS_NETWORK_STATE", "android.permission.WRITE_SETTINGS", "android.permission.VIBRATE", "android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.ACCESS_WIFI_STATE", "android.permission.WAKE_LOCK", "android.permission.GET_ACCOUNTS", "com.bbk.account.permission.READ_ACCOUNTINFO", "android.permission.AUTHENTICATE_ACCOUNTS", "android.permission.MOUNT_UNMOUNT_FILESYSTEMS", "android.permission.GET_TASKS"};

    /* JADX INFO: renamed from: c */
    private static String[] f61150c = {"com.vivo.push.sdk.service.CommandService", "com.vivo.push.sdk.service.CommonJobService"};

    /* JADX INFO: renamed from: d */
    private static String[] f61151d = {"com.vivo.push.sdk.RegistrationReceiver"};

    /* JADX INFO: renamed from: e */
    private static String[] f61152e = new String[0];

    /* JADX INFO: renamed from: f */
    private static Map<String, Bundle> f61153f = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    private static void m85058a(Context context, String str, String str2, boolean z) throws VivoPushException {
        Intent intent = new Intent(str);
        intent.setPackage(context.getPackageName());
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                throw new VivoPushException("localPackageManager is null");
            }
            if (z) {
                List<ResolveInfo> listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 576);
                if (listQueryBroadcastReceivers == null || listQueryBroadcastReceivers.size() <= 0) {
                    throw new VivoPushException("checkModule " + intent + " has no receivers");
                }
                Iterator<ResolveInfo> it = listQueryBroadcastReceivers.iterator();
                while (it.hasNext()) {
                    if (str2.equals(it.next().activityInfo.name)) {
                        return;
                    }
                }
                throw new VivoPushException(str2 + " is missing");
            }
            List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 576);
            if (listQueryIntentServices == null || listQueryIntentServices.size() <= 0) {
                throw new VivoPushException("checkModule " + intent + " has no services");
            }
            for (ResolveInfo resolveInfo : listQueryIntentServices) {
                if (str2.equals(resolveInfo.serviceInfo.name)) {
                    if (resolveInfo.serviceInfo.exported) {
                        return;
                    }
                    throw new VivoPushException(resolveInfo.serviceInfo.name + " exported is false");
                }
            }
            throw new VivoPushException(str2 + " is missing");
        } catch (Exception e) {
            C14647p.m85008a("Utility", "error  " + e.getMessage());
            throw new VivoPushException("checkModule error" + e.getMessage());
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m85063b(Context context) throws VivoPushException {
        String string;
        C14647p.m85021d("Utility", "check PushService AndroidManifest declearation !");
        String strM85033b = C14651t.m85033b(context);
        boolean zM85037d = C14651t.m85037d(context, context.getPackageName());
        boolean zM85039e = C14651t.m85039e(context, context.getPackageName());
        boolean zM85035c = C14651t.m85035c(context, context.getPackageName());
        if (zM85039e) {
            f61148a = new String[]{"com.vivo.push.sdk.RegistrationReceiver", "com.vivo.push.sdk.service.PushService", "com.vivo.push.sdk.service.CommonJobService"};
            f61149b = new String[]{"android.permission.INTERNET", "android.permission.READ_PHONE_STATE", "android.permission.ACCESS_NETWORK_STATE", "android.permission.WRITE_SETTINGS", "android.permission.VIBRATE", "android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.ACCESS_WIFI_STATE", "android.permission.WAKE_LOCK", "android.permission.GET_ACCOUNTS", "com.bbk.account.permission.READ_ACCOUNTINFO", "android.permission.AUTHENTICATE_ACCOUNTS", "android.permission.MOUNT_UNMOUNT_FILESYSTEMS", "android.permission.GET_TASKS"};
            f61150c = new String[]{"com.vivo.push.sdk.service.CommandService", "com.vivo.push.sdk.service.CommonJobService"};
            f61151d = new String[]{"com.vivo.push.sdk.RegistrationReceiver"};
        } else {
            if (!zM85035c && !zM85037d) {
                throw new VivoPushException("AndroidManifest.xml中receiver配置项错误，详见接入文档");
            }
            if (zM85035c) {
                f61150c = new String[]{"com.vivo.push.sdk.service.CommandClientService"};
            } else {
                f61150c = new String[]{"com.vivo.push.sdk.service.CommandService"};
            }
            f61151d = new String[0];
            f61148a = new String[0];
            if (zM85037d) {
                f61149b = new String[]{"android.permission.INTERNET", "android.permission.WRITE_SETTINGS"};
            } else {
                f61149b = new String[]{"android.permission.INTERNET"};
            }
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                throw new VivoPushException("localPackageManager is null");
            }
            String[] strArr = packageManager.getPackageInfo(context.getPackageName(), 4096).requestedPermissions;
            if (strArr == null) {
                throw new VivoPushException("Permissions is null!");
            }
            for (String str : f61149b) {
                int length = strArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        throw new VivoPushException("permission : " + str + "  check fail : " + Arrays.toString(strArr));
                    }
                    if (!str.equals(strArr[i])) {
                        i++;
                    }
                }
            }
            m85070f(context, strM85033b);
            m85067d(context, strM85033b);
            m85069e(context, strM85033b);
            try {
                if (m85055a(context, context.getPackageName(), "local_iv") == null) {
                    throw new VivoPushException("AndroidManifest.xml中未配置".concat("local_iv"));
                }
                String packageName = context.getPackageName();
                Object objM85055a = m85055a(context, packageName, "com.vivo.push.api_key");
                if (objM85055a != null) {
                    string = objM85055a.toString();
                } else {
                    Object objM85055a2 = m85055a(context, packageName, "api_key");
                    string = objM85055a2 != null ? objM85055a2.toString() : "";
                }
                if (TextUtils.isEmpty(string)) {
                    throw new VivoPushException("com.vivo.push.api_key is null");
                }
                if (TextUtils.isEmpty(m85061b(context, context.getPackageName()))) {
                    throw new VivoPushException("com.vivo.push.app_id is null");
                }
                if ((zM85037d || zM85039e) && m85054a(context, context.getPackageName()) == -1) {
                    throw new VivoPushException("sdkversion is null");
                }
                if (zM85039e) {
                    m85058a(context, "com.vivo.pushservice.action.METHOD", "com.vivo.push.sdk.RegistrationReceiver", true);
                    m85058a(context, "com.vivo.pushservice.action.PUSH_SERVICE", "com.vivo.push.sdk.service.PushService", false);
                }
            } catch (Exception e) {
                throw new VivoPushException("getMetaValue error " + e.getMessage());
            }
        } catch (Exception e2) {
            throw new VivoPushException(e2.getMessage());
        }
    }

    /* JADX INFO: renamed from: c */
    public static PublicKey m85066c(Context context) {
        Cursor cursorQuery = context.getContentResolver().query(C14622p.f61068a, null, null, null, null);
        if (cursorQuery == null) {
            return null;
        }
        while (cursorQuery.moveToNext()) {
            try {
                try {
                    if ("pushkey".equals(cursorQuery.getString(cursorQuery.getColumnIndex(AuthenticationTokenClaims.JSON_KEY_NAME)))) {
                        String string = cursorQuery.getString(cursorQuery.getColumnIndex("value"));
                        C14647p.m85021d("Utility", "result key : ".concat(String.valueOf(string)));
                        PublicKey publicKeyM85043a = C14652u.m85043a(string);
                        try {
                            cursorQuery.close();
                        } catch (Exception unused) {
                        }
                        return publicKeyM85043a;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } catch (Throwable th) {
                try {
                    cursorQuery.close();
                } catch (Exception unused2) {
                }
                throw th;
            }
        }
        try {
            cursorQuery.close();
        } catch (Exception unused3) {
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m85068d(Context context) {
        Cursor cursorQuery = null;
        try {
            if (context == null) {
                C14647p.m85008a("Utility", "context is null");
                return false;
            }
            String packageName = context.getPackageName();
            cursorQuery = context.getContentResolver().query(C14622p.f61069b, null, "pushVersion = ? and appPkgName = ? and appCode = ? ", new String[]{"323", packageName, String.valueOf(context.getPackageManager().getPackageInfo(packageName, 0).versionCode)}, null);
            if (cursorQuery == null) {
                C14647p.m85008a("Utility", "cursor is null");
                if (cursorQuery != null) {
                    try {
                        cursorQuery.close();
                    } catch (Exception e) {
                        C14647p.m85009a("Utility", "close", e);
                    }
                }
                return false;
            }
            if (cursorQuery.moveToFirst() && (cursorQuery.getInt(cursorQuery.getColumnIndex("permission")) & 1) != 0) {
                try {
                    cursorQuery.close();
                } catch (Exception e2) {
                    C14647p.m85009a("Utility", "close", e2);
                }
                return true;
            }
            return false;
        } catch (Exception e3) {
            C14647p.m85009a("Utility", "isSupport", e3);
            return false;
        } finally {
            if (0 != 0) {
                try {
                    cursorQuery.close();
                } catch (Exception e4) {
                    C14647p.m85009a("Utility", "close", e4);
                }
            }
        }
    }

    /* JADX INFO: renamed from: e */
    private static void m85069e(Context context, String str) throws VivoPushException {
        if (f61152e.length <= 0) {
            return;
        }
        try {
            if (context.getPackageManager() == null) {
                throw new VivoPushException("localPackageManager is null");
            }
            ActivityInfo[] activityInfoArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 1).activities;
            if (activityInfoArr == null) {
                throw new VivoPushException("activityInfos is null");
            }
            for (String str2 : f61152e) {
                m85060a(str2, activityInfoArr, str);
            }
        } catch (Exception e) {
            throw new VivoPushException("error " + e.getMessage());
        }
    }

    /* JADX INFO: renamed from: f */
    private static void m85070f(Context context, String str) throws VivoPushException {
        try {
            if (context.getPackageManager() == null) {
                throw new VivoPushException("localPackageManager is null");
            }
            ActivityInfo[] activityInfoArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 2).receivers;
            if (activityInfoArr == null) {
                throw new VivoPushException("receivers is null");
            }
            for (String str2 : f61151d) {
                m85060a(str2, activityInfoArr, str);
            }
        } catch (Exception e) {
            throw new VivoPushException(e.getMessage());
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m85065c(Context context, String str) {
        Object objM85055a = m85055a(context, str, "verification_status");
        if (objM85055a != null) {
            return objM85055a.toString();
        }
        return "";
    }

    /* JADX INFO: renamed from: d */
    private static void m85067d(Context context, String str) throws VivoPushException {
        try {
            if (context.getPackageManager() != null) {
                ServiceInfo[] serviceInfoArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 4).services;
                if (serviceInfoArr != null) {
                    for (String str2 : f61150c) {
                        m85060a(str2, serviceInfoArr, str);
                    }
                    return;
                }
                throw new VivoPushException("serviceInfos is null");
            }
            throw new VivoPushException("localPackageManager is null");
        } catch (Exception e) {
            throw new VivoPushException("error " + e.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    public static long m85054a(Context context, String str) {
        Object objM85055a = m85055a(context, str, "com.vivo.push.sdk_version");
        if (objM85055a == null) {
            objM85055a = m85055a(context, str, Constants.JumpUrlConstants.URL_KEY_SDK_VERSION);
        }
        if (objM85055a == null) {
            C14647p.m85008a("Utility", "getSdkVersionCode sdk version is null");
            return -1L;
        }
        try {
            return Long.parseLong(objM85055a.toString());
        } catch (Exception e) {
            e.printStackTrace();
            C14647p.m85009a("Utility", "getSdkVersionCode error ", e);
            return -1L;
        }
    }

    /* JADX INFO: renamed from: a */
    public static Object m85055a(Context context, String str, String str2) {
        Bundle bundle;
        Bundle bundle2 = null;
        if (context != null && str2 != null && !TextUtils.isEmpty(str)) {
            try {
                Map<String, Bundle> map = f61153f;
                Object obj = (map == null || map.size() <= 0 || (bundle = f61153f.get(str)) == null) ? null : bundle.get(str2);
                if (obj != null) {
                    return obj;
                }
                try {
                    ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 128);
                    bundle2 = applicationInfo != null ? applicationInfo.metaData : null;
                    Object obj2 = bundle2 != null ? bundle2.get(str2) : obj;
                    try {
                        if (f61153f.size() > 300) {
                            return obj2;
                        }
                        f61153f.put(str, bundle2);
                        return obj2;
                    } catch (Exception e) {
                        bundle2 = obj2;
                        e = e;
                        C14647p.m85008a("Utility", "getMetaValue::".concat(String.valueOf(e)));
                        return bundle2;
                    }
                } catch (Exception e2) {
                    e = e2;
                    bundle2 = obj;
                }
            } catch (Exception e3) {
                e = e3;
            }
        }
        return bundle2;
    }

    /* JADX INFO: renamed from: a */
    public static Object m85056a(String str, String str2) throws Exception {
        Class<?> cls = Class.forName(str);
        return cls.getField(str2).get(cls);
    }

    /* JADX INFO: renamed from: a */
    private static void m85060a(String str, ComponentInfo[] componentInfoArr, String str2) throws VivoPushException {
        for (ComponentInfo componentInfo : componentInfoArr) {
            if (str.equals(componentInfo.name)) {
                if (componentInfo.enabled) {
                    m85059a(componentInfo, str2);
                    return;
                }
                throw new VivoPushException(componentInfo.name + " module Push-SDK need is illegitmacy !");
            }
        }
        throw new VivoPushException(str + " module Push-SDK need is not exist");
    }

    /* JADX INFO: renamed from: a */
    private static void m85059a(ComponentInfo componentInfo, String str) throws VivoPushException {
        if (componentInfo.applicationInfo.packageName.equals(str)) {
            return;
        }
        for (String str2 : f61148a) {
            if (str2.equals(componentInfo.name) && !componentInfo.processName.contains(":pushservice")) {
                throw new VivoPushException("module : " + componentInfo.name + " process :" + componentInfo.processName + "  check process fail");
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static long m85053a(Context context) {
        String strM85033b = C14651t.m85033b(context);
        if (TextUtils.isEmpty(strM85033b)) {
            C14647p.m85008a("Utility", "systemPushPkgName is null");
            return -1L;
        }
        return m85054a(context, strM85033b);
    }

    /* JADX INFO: renamed from: a */
    public static void m85057a(Context context, Intent intent) {
        String strM85033b = C14651t.m85033b(context);
        String stringExtra = intent.getStringExtra("client_pkgname");
        if (TextUtils.isEmpty(strM85033b)) {
            C14647p.m85008a("Utility", "illegality abe adapter : push pkg is null");
            return;
        }
        if (TextUtils.isEmpty(stringExtra)) {
            C14647p.m85008a("Utility", "illegality abe adapter : src pkg is null");
            return;
        }
        if (strM85033b.equals(context.getPackageName())) {
            C14647p.m85008a("Utility", "illegality abe adapter : abe is not pushservice");
            return;
        }
        if (!strM85033b.equals(stringExtra)) {
            C14647p.m85021d("Utility", "proxy to core : intent pkg : " + intent.getPackage() + " ; src pkg : " + stringExtra + " ; push pkg : " + strM85033b);
            intent.setPackage(strM85033b);
            intent.setClassName(strM85033b, "com.vivo.push.sdk.service.PushService");
            context.startService(intent);
            return;
        }
        C14647p.m85008a("Utility", "illegality abe adapter : pushPkg = " + strM85033b + " ; srcPkg = " + stringExtra);
    }

    /* JADX INFO: renamed from: b */
    public static String m85061b(Context context, String str) {
        Object objM85055a = m85055a(context, str, "com.vivo.push.app_id");
        if (objM85055a != null) {
            return objM85055a.toString();
        }
        Object objM85055a2 = m85055a(context, str, Constants.JumpUrlConstants.URL_KEY_APPID);
        if (objM85055a2 != null) {
            return objM85055a2.toString();
        }
        return "";
    }

    /* JADX INFO: renamed from: b */
    public static String m85062b(String str, String str2) {
        String str3;
        try {
            str3 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
        } catch (Exception e) {
            e.printStackTrace();
            str3 = str2;
        }
        return (str3 == null || str3.length() == 0) ? str2 : str3;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m85064b(Context context, String str, String str2) {
        Cursor cursorQuery = null;
        try {
            if (context == null) {
                C14647p.m85008a("Utility", "context is null");
                return false;
            }
            cursorQuery = context.getContentResolver().query(C14622p.f61070c, null, "appPkgName = ? and regId = ? sdkVersion = ? ", new String[]{str, str2, "323"}, null);
            if (cursorQuery == null) {
                C14647p.m85008a("Utility", "cursor is null");
                if (cursorQuery != null) {
                    try {
                        cursorQuery.close();
                    } catch (Exception e) {
                        C14647p.m85009a("Utility", "close", e);
                    }
                }
                return false;
            }
            if (cursorQuery.moveToFirst()) {
                boolean z = Boolean.parseBoolean(cursorQuery.getString(cursorQuery.getColumnIndex("clientState")));
                try {
                    cursorQuery.close();
                    return z;
                } catch (Exception e2) {
                    C14647p.m85009a("Utility", "close", e2);
                    return z;
                }
            }
            return false;
        } catch (Exception e3) {
            C14647p.m85009a("Utility", "isOverdue", e3);
            return false;
        } finally {
            if (0 != 0) {
                try {
                    cursorQuery.close();
                } catch (Exception e4) {
                    C14647p.m85009a("Utility", "close", e4);
                }
            }
        }
    }
}
