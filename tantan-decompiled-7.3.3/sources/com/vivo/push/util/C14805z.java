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
import com.vivo.push.C14770p;
import java.security.PublicKey;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.vivo.push.util.z */
/* JADX INFO: loaded from: classes2.dex */
public final class C14805z {

    /* JADX INFO: renamed from: a */
    private static String[] f61995a = {"com.vivo.push.sdk.RegistrationReceiver", "com.vivo.push.sdk.service.PushService", "com.vivo.push.sdk.service.CommonJobService"};

    /* JADX INFO: renamed from: b */
    private static String[] f61996b = {"android.permission.INTERNET", "android.permission.READ_PHONE_STATE", "android.permission.ACCESS_NETWORK_STATE", "android.permission.WRITE_SETTINGS", "android.permission.VIBRATE", "android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.ACCESS_WIFI_STATE", "android.permission.WAKE_LOCK", "android.permission.GET_ACCOUNTS", "com.bbk.account.permission.READ_ACCOUNTINFO", "android.permission.AUTHENTICATE_ACCOUNTS", "android.permission.MOUNT_UNMOUNT_FILESYSTEMS", "android.permission.GET_TASKS"};

    /* JADX INFO: renamed from: c */
    private static String[] f61997c = {"com.vivo.push.sdk.service.CommandService", "com.vivo.push.sdk.service.CommonJobService"};

    /* JADX INFO: renamed from: d */
    private static String[] f61998d = {"com.vivo.push.sdk.RegistrationReceiver"};

    /* JADX INFO: renamed from: e */
    private static String[] f61999e = new String[0];

    /* JADX INFO: renamed from: f */
    private static Map<String, Bundle> f62000f = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    private static void m86229a(Context context, String str, String str2, boolean z) throws VivoPushException {
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
            C14795p.m86179a("Utility", "error  " + e.getMessage());
            throw new VivoPushException("checkModule error" + e.getMessage());
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m86234b(Context context) throws VivoPushException {
        String string;
        C14795p.m86192d("Utility", "check PushService AndroidManifest declearation !");
        String strM86204b = C14799t.m86204b(context);
        boolean zM86208d = C14799t.m86208d(context, context.getPackageName());
        boolean zM86210e = C14799t.m86210e(context, context.getPackageName());
        boolean zM86206c = C14799t.m86206c(context, context.getPackageName());
        if (zM86210e) {
            f61995a = new String[]{"com.vivo.push.sdk.RegistrationReceiver", "com.vivo.push.sdk.service.PushService", "com.vivo.push.sdk.service.CommonJobService"};
            f61996b = new String[]{"android.permission.INTERNET", "android.permission.READ_PHONE_STATE", "android.permission.ACCESS_NETWORK_STATE", "android.permission.WRITE_SETTINGS", "android.permission.VIBRATE", "android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.ACCESS_WIFI_STATE", "android.permission.WAKE_LOCK", "android.permission.GET_ACCOUNTS", "com.bbk.account.permission.READ_ACCOUNTINFO", "android.permission.AUTHENTICATE_ACCOUNTS", "android.permission.MOUNT_UNMOUNT_FILESYSTEMS", "android.permission.GET_TASKS"};
            f61997c = new String[]{"com.vivo.push.sdk.service.CommandService", "com.vivo.push.sdk.service.CommonJobService"};
            f61998d = new String[]{"com.vivo.push.sdk.RegistrationReceiver"};
        } else {
            if (!zM86206c && !zM86208d) {
                throw new VivoPushException("AndroidManifest.xml中receiver配置项错误，详见接入文档");
            }
            if (zM86206c) {
                f61997c = new String[]{"com.vivo.push.sdk.service.CommandClientService"};
            } else {
                f61997c = new String[]{"com.vivo.push.sdk.service.CommandService"};
            }
            f61998d = new String[0];
            f61995a = new String[0];
            if (zM86208d) {
                f61996b = new String[]{"android.permission.INTERNET", "android.permission.WRITE_SETTINGS"};
            } else {
                f61996b = new String[]{"android.permission.INTERNET"};
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
            for (String str : f61996b) {
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
            m86241f(context, strM86204b);
            m86238d(context, strM86204b);
            m86240e(context, strM86204b);
            try {
                if (m86226a(context, context.getPackageName(), "local_iv") == null) {
                    throw new VivoPushException("AndroidManifest.xml中未配置".concat("local_iv"));
                }
                String packageName = context.getPackageName();
                Object objM86226a = m86226a(context, packageName, "com.vivo.push.api_key");
                if (objM86226a != null) {
                    string = objM86226a.toString();
                } else {
                    Object objM86226a2 = m86226a(context, packageName, "api_key");
                    string = objM86226a2 != null ? objM86226a2.toString() : "";
                }
                if (TextUtils.isEmpty(string)) {
                    throw new VivoPushException("com.vivo.push.api_key is null");
                }
                if (TextUtils.isEmpty(m86232b(context, context.getPackageName()))) {
                    throw new VivoPushException("com.vivo.push.app_id is null");
                }
                if ((zM86208d || zM86210e) && m86225a(context, context.getPackageName()) == -1) {
                    throw new VivoPushException("sdkversion is null");
                }
                if (zM86210e) {
                    m86229a(context, "com.vivo.pushservice.action.METHOD", "com.vivo.push.sdk.RegistrationReceiver", true);
                    m86229a(context, "com.vivo.pushservice.action.PUSH_SERVICE", "com.vivo.push.sdk.service.PushService", false);
                }
            } catch (Exception e) {
                throw new VivoPushException("getMetaValue error " + e.getMessage());
            }
        } catch (Exception e2) {
            throw new VivoPushException(e2.getMessage());
        }
    }

    /* JADX INFO: renamed from: c */
    public static PublicKey m86237c(Context context) {
        Cursor cursorQuery = context.getContentResolver().query(C14770p.f61915a, null, null, null, null);
        if (cursorQuery == null) {
            return null;
        }
        while (cursorQuery.moveToNext()) {
            try {
                try {
                    if ("pushkey".equals(cursorQuery.getString(cursorQuery.getColumnIndex(AuthenticationTokenClaims.JSON_KEY_NAME)))) {
                        String string = cursorQuery.getString(cursorQuery.getColumnIndex("value"));
                        C14795p.m86192d("Utility", "result key : ".concat(String.valueOf(string)));
                        PublicKey publicKeyM86214a = C14800u.m86214a(string);
                        try {
                            cursorQuery.close();
                        } catch (Exception unused) {
                        }
                        return publicKeyM86214a;
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
    public static boolean m86239d(Context context) {
        Cursor cursorQuery = null;
        try {
            if (context == null) {
                C14795p.m86179a("Utility", "context is null");
                return false;
            }
            String packageName = context.getPackageName();
            cursorQuery = context.getContentResolver().query(C14770p.f61916b, null, "pushVersion = ? and appPkgName = ? and appCode = ? ", new String[]{"323", packageName, String.valueOf(context.getPackageManager().getPackageInfo(packageName, 0).versionCode)}, null);
            if (cursorQuery == null) {
                C14795p.m86179a("Utility", "cursor is null");
                if (cursorQuery != null) {
                    try {
                        cursorQuery.close();
                    } catch (Exception e) {
                        C14795p.m86180a("Utility", "close", e);
                    }
                }
                return false;
            }
            if (cursorQuery.moveToFirst() && (cursorQuery.getInt(cursorQuery.getColumnIndex("permission")) & 1) != 0) {
                try {
                    cursorQuery.close();
                } catch (Exception e2) {
                    C14795p.m86180a("Utility", "close", e2);
                }
                return true;
            }
            return false;
        } catch (Exception e3) {
            C14795p.m86180a("Utility", "isSupport", e3);
            return false;
        } finally {
            if (0 != 0) {
                try {
                    cursorQuery.close();
                } catch (Exception e4) {
                    C14795p.m86180a("Utility", "close", e4);
                }
            }
        }
    }

    /* JADX INFO: renamed from: e */
    private static void m86240e(Context context, String str) throws VivoPushException {
        if (f61999e.length <= 0) {
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
            for (String str2 : f61999e) {
                m86231a(str2, activityInfoArr, str);
            }
        } catch (Exception e) {
            throw new VivoPushException("error " + e.getMessage());
        }
    }

    /* JADX INFO: renamed from: f */
    private static void m86241f(Context context, String str) throws VivoPushException {
        try {
            if (context.getPackageManager() == null) {
                throw new VivoPushException("localPackageManager is null");
            }
            ActivityInfo[] activityInfoArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 2).receivers;
            if (activityInfoArr == null) {
                throw new VivoPushException("receivers is null");
            }
            for (String str2 : f61998d) {
                m86231a(str2, activityInfoArr, str);
            }
        } catch (Exception e) {
            throw new VivoPushException(e.getMessage());
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m86236c(Context context, String str) {
        Object objM86226a = m86226a(context, str, "verification_status");
        if (objM86226a != null) {
            return objM86226a.toString();
        }
        return "";
    }

    /* JADX INFO: renamed from: d */
    private static void m86238d(Context context, String str) throws VivoPushException {
        try {
            if (context.getPackageManager() != null) {
                ServiceInfo[] serviceInfoArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 4).services;
                if (serviceInfoArr != null) {
                    for (String str2 : f61997c) {
                        m86231a(str2, serviceInfoArr, str);
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
    public static long m86225a(Context context, String str) {
        Object objM86226a = m86226a(context, str, "com.vivo.push.sdk_version");
        if (objM86226a == null) {
            objM86226a = m86226a(context, str, Constants.JumpUrlConstants.URL_KEY_SDK_VERSION);
        }
        if (objM86226a == null) {
            C14795p.m86179a("Utility", "getSdkVersionCode sdk version is null");
            return -1L;
        }
        try {
            return Long.parseLong(objM86226a.toString());
        } catch (Exception e) {
            e.printStackTrace();
            C14795p.m86180a("Utility", "getSdkVersionCode error ", e);
            return -1L;
        }
    }

    /* JADX INFO: renamed from: a */
    public static Object m86226a(Context context, String str, String str2) {
        Bundle bundle;
        Bundle bundle2 = null;
        if (context != null && str2 != null && !TextUtils.isEmpty(str)) {
            try {
                Map<String, Bundle> map = f62000f;
                Object obj = (map == null || map.size() <= 0 || (bundle = f62000f.get(str)) == null) ? null : bundle.get(str2);
                if (obj != null) {
                    return obj;
                }
                try {
                    ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 128);
                    bundle2 = applicationInfo != null ? applicationInfo.metaData : null;
                    Object obj2 = bundle2 != null ? bundle2.get(str2) : obj;
                    try {
                        if (f62000f.size() > 300) {
                            return obj2;
                        }
                        f62000f.put(str, bundle2);
                        return obj2;
                    } catch (Exception e) {
                        bundle2 = obj2;
                        e = e;
                        C14795p.m86179a("Utility", "getMetaValue::".concat(String.valueOf(e)));
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
    public static Object m86227a(String str, String str2) throws Exception {
        Class<?> cls = Class.forName(str);
        return cls.getField(str2).get(cls);
    }

    /* JADX INFO: renamed from: a */
    private static void m86231a(String str, ComponentInfo[] componentInfoArr, String str2) throws VivoPushException {
        for (ComponentInfo componentInfo : componentInfoArr) {
            if (str.equals(componentInfo.name)) {
                if (componentInfo.enabled) {
                    m86230a(componentInfo, str2);
                    return;
                }
                throw new VivoPushException(componentInfo.name + " module Push-SDK need is illegitmacy !");
            }
        }
        throw new VivoPushException(str + " module Push-SDK need is not exist");
    }

    /* JADX INFO: renamed from: a */
    private static void m86230a(ComponentInfo componentInfo, String str) throws VivoPushException {
        if (componentInfo.applicationInfo.packageName.equals(str)) {
            return;
        }
        for (String str2 : f61995a) {
            if (str2.equals(componentInfo.name) && !componentInfo.processName.contains(":pushservice")) {
                throw new VivoPushException("module : " + componentInfo.name + " process :" + componentInfo.processName + "  check process fail");
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static long m86224a(Context context) {
        String strM86204b = C14799t.m86204b(context);
        if (TextUtils.isEmpty(strM86204b)) {
            C14795p.m86179a("Utility", "systemPushPkgName is null");
            return -1L;
        }
        return m86225a(context, strM86204b);
    }

    /* JADX INFO: renamed from: a */
    public static void m86228a(Context context, Intent intent) {
        String strM86204b = C14799t.m86204b(context);
        String stringExtra = intent.getStringExtra("client_pkgname");
        if (TextUtils.isEmpty(strM86204b)) {
            C14795p.m86179a("Utility", "illegality abe adapter : push pkg is null");
            return;
        }
        if (TextUtils.isEmpty(stringExtra)) {
            C14795p.m86179a("Utility", "illegality abe adapter : src pkg is null");
            return;
        }
        if (strM86204b.equals(context.getPackageName())) {
            C14795p.m86179a("Utility", "illegality abe adapter : abe is not pushservice");
            return;
        }
        if (!strM86204b.equals(stringExtra)) {
            C14795p.m86192d("Utility", "proxy to core : intent pkg : " + intent.getPackage() + " ; src pkg : " + stringExtra + " ; push pkg : " + strM86204b);
            intent.setPackage(strM86204b);
            intent.setClassName(strM86204b, "com.vivo.push.sdk.service.PushService");
            context.startService(intent);
            return;
        }
        C14795p.m86179a("Utility", "illegality abe adapter : pushPkg = " + strM86204b + " ; srcPkg = " + stringExtra);
    }

    /* JADX INFO: renamed from: b */
    public static String m86232b(Context context, String str) {
        Object objM86226a = m86226a(context, str, "com.vivo.push.app_id");
        if (objM86226a != null) {
            return objM86226a.toString();
        }
        Object objM86226a2 = m86226a(context, str, Constants.JumpUrlConstants.URL_KEY_APPID);
        if (objM86226a2 != null) {
            return objM86226a2.toString();
        }
        return "";
    }

    /* JADX INFO: renamed from: b */
    public static String m86233b(String str, String str2) {
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
    public static boolean m86235b(Context context, String str, String str2) {
        Cursor cursorQuery = null;
        try {
            if (context == null) {
                C14795p.m86179a("Utility", "context is null");
                return false;
            }
            cursorQuery = context.getContentResolver().query(C14770p.f61917c, null, "appPkgName = ? and regId = ? sdkVersion = ? ", new String[]{str, str2, "323"}, null);
            if (cursorQuery == null) {
                C14795p.m86179a("Utility", "cursor is null");
                if (cursorQuery != null) {
                    try {
                        cursorQuery.close();
                    } catch (Exception e) {
                        C14795p.m86180a("Utility", "close", e);
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
                    C14795p.m86180a("Utility", "close", e2);
                    return z;
                }
            }
            return false;
        } catch (Exception e3) {
            C14795p.m86180a("Utility", "isOverdue", e3);
            return false;
        } finally {
            if (0 != 0) {
                try {
                    cursorQuery.close();
                } catch (Exception e4) {
                    C14795p.m86180a("Utility", "close", e4);
                }
            }
        }
    }
}
