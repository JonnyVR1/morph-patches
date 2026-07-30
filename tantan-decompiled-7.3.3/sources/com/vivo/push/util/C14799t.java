package com.vivo.push.util;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.database.Cursor;
import android.text.TextUtils;
import com.facebook.AuthenticationTokenClaims;
import com.vivo.push.C14770p;
import com.vivo.push.cache.C14716b;
import com.vivo.push.cache.InterfaceC14718d;
import com.vivo.push.model.C14767b;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: com.vivo.push.util.t */
/* JADX INFO: loaded from: classes2.dex */
public final class C14799t {

    /* JADX INFO: renamed from: a */
    private static Boolean f61980a;

    /* JADX INFO: renamed from: b */
    private static String f61981b;

    /* JADX INFO: renamed from: a */
    public static C14767b m86199a(Context context) {
        C14767b c14767bM86211f;
        C14767b c14767bM86211f2;
        Context applicationContext = ContextDelegate.getContext(context).getApplicationContext();
        C14767b c14767bM86207d = m86207d(applicationContext);
        if (c14767bM86207d != null) {
            C14795p.m86192d("PushPackageUtils", "get system push info :".concat(String.valueOf(c14767bM86207d)));
            return c14767bM86207d;
        }
        List<String> listM86209e = m86209e(applicationContext);
        C14767b c14767bM86211f3 = m86211f(applicationContext, applicationContext.getPackageName());
        if (listM86209e.size() <= 0) {
            if (c14767bM86211f3 != null && c14767bM86211f3.m86098d()) {
                c14767bM86207d = c14767bM86211f3;
            }
            C14795p.m86179a("PushPackageUtils", "findAllPushPackages error: find no package!");
        } else {
            C14767b c14767b = null;
            String strMo86142a = C14804y.m86222b(applicationContext).mo86142a("com.vivo.push.cur_pkg", null);
            if (TextUtils.isEmpty(strMo86142a) || !m86202a(applicationContext, strMo86142a, "com.vivo.pushservice.action.METHOD") || (c14767bM86211f = m86211f(applicationContext, strMo86142a)) == null || !c14767bM86211f.m86098d()) {
                c14767bM86211f = null;
            }
            if (c14767bM86211f3 == null || !c14767bM86211f3.m86098d()) {
                c14767bM86211f3 = null;
            }
            if (c14767bM86211f == null) {
                c14767bM86211f = null;
            }
            if (c14767bM86211f3 == null || (c14767bM86211f != null && (!c14767bM86211f3.m86097c() ? !(c14767bM86211f.m86097c() || c14767bM86211f3.m86095b() > c14767bM86211f.m86095b()) : !(c14767bM86211f.m86097c() && c14767bM86211f3.m86095b() > c14767bM86211f.m86095b())))) {
                c14767bM86211f3 = c14767bM86211f;
            }
            HashMap map = new HashMap();
            if (c14767bM86211f3 == null) {
                c14767bM86211f3 = null;
            } else if (c14767bM86211f3.m86097c()) {
                c14767b = c14767bM86211f3;
                c14767bM86211f3 = null;
            }
            int size = listM86209e.size();
            for (int i = 0; i < size; i++) {
                String str = listM86209e.get(i);
                if (!TextUtils.isEmpty(str) && (c14767bM86211f2 = m86211f(applicationContext, str)) != null) {
                    map.put(str, c14767bM86211f2);
                    if (c14767bM86211f2.m86098d()) {
                        if (c14767bM86211f2.m86097c()) {
                            if (c14767b == null || c14767bM86211f2.m86095b() > c14767b.m86095b()) {
                                c14767b = c14767bM86211f2;
                            }
                        } else if (c14767bM86211f3 == null || c14767bM86211f2.m86095b() > c14767bM86211f3.m86095b()) {
                            c14767bM86211f3 = c14767bM86211f2;
                        }
                    }
                }
            }
            if (c14767bM86211f3 != null) {
                c14767bM86207d = c14767bM86211f3;
            } else {
                C14795p.m86192d("PushPackageUtils", "findSuitablePushPackage, all push app in balck list.");
                c14767bM86207d = c14767b;
            }
        }
        if (c14767bM86207d == null) {
            C14795p.m86189b(applicationContext, "查找最优包为空!");
            C14795p.m86192d("PushPackageUtils", "finSuitablePushPackage is null");
            return c14767bM86207d;
        }
        if (c14767bM86207d.m86097c()) {
            C14795p.m86183a(applicationContext, "查找最优包为:" + c14767bM86207d.m86090a() + "(" + c14767bM86207d.m86095b() + ", Black)");
            C14795p.m86192d("PushPackageUtils", "finSuitablePushPackage" + c14767bM86207d.m86090a() + "(" + c14767bM86207d.m86095b() + ", Black)");
            return c14767bM86207d;
        }
        C14795p.m86183a(applicationContext, "查找最优包为:" + c14767bM86207d.m86090a() + "(" + c14767bM86207d.m86095b() + ")");
        C14795p.m86192d("PushPackageUtils", "finSuitablePushPackage" + c14767bM86207d.m86090a() + "(" + c14767bM86207d.m86095b() + ")");
        return c14767bM86207d;
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00b2 A[Catch: Exception -> 0x00a1, TRY_ENTER, TRY_LEAVE, TryCatch #9 {Exception -> 0x00a1, blocks: (B:47:0x009d, B:57:0x00b2), top: B:82:0x0012 }] */
    /* JADX INFO: renamed from: b */
    public static String m86204b(Context context) {
        String string;
        if (!TextUtils.isEmpty(f61981b)) {
            return f61981b;
        }
        Cursor cursor = null;
        try {
            try {
                try {
                    Cursor cursorQuery = context.getContentResolver().query(C14770p.f61915a, null, null, null, null);
                    try {
                        if (cursorQuery != null) {
                            boolean z = false;
                            string = null;
                            while (cursorQuery.moveToNext()) {
                                try {
                                    if ("pushPkgName".equals(cursorQuery.getString(cursorQuery.getColumnIndex(AuthenticationTokenClaims.JSON_KEY_NAME)))) {
                                        string = cursorQuery.getString(cursorQuery.getColumnIndex("value"));
                                    } else if ("pushEnable".equals(cursorQuery.getString(cursorQuery.getColumnIndex(AuthenticationTokenClaims.JSON_KEY_NAME)))) {
                                        z = Boolean.parseBoolean(cursorQuery.getString(cursorQuery.getColumnIndex("value")));
                                    }
                                } catch (Exception e) {
                                    e = e;
                                    cursor = cursorQuery;
                                    C14795p.m86180a("PushPackageUtils", "getSystemPush", e);
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    return string;
                                }
                            }
                            f61981b = string;
                            if (TextUtils.isEmpty(string)) {
                                try {
                                    cursorQuery.close();
                                } catch (Exception e2) {
                                    C14795p.m86180a("PushPackageUtils", "close", e2);
                                }
                                return null;
                            }
                            if (z) {
                                cursorQuery.close();
                                return string;
                            }
                            try {
                                cursorQuery.close();
                            } catch (Exception e3) {
                                C14795p.m86180a("PushPackageUtils", "close", e3);
                            }
                            return null;
                        }
                        try {
                            C14795p.m86179a("PushPackageUtils", "cursor is null");
                            if (cursorQuery != null) {
                                try {
                                    cursorQuery.close();
                                } catch (Exception e4) {
                                    C14795p.m86180a("PushPackageUtils", "close", e4);
                                }
                            }
                            return null;
                        } catch (Exception e5) {
                            e = e5;
                            string = null;
                        }
                        cursor = cursorQuery;
                    } catch (Throwable th) {
                        th = th;
                        cursor = cursorQuery;
                        Throwable th2 = th;
                        if (cursor == null) {
                            throw th2;
                        }
                        try {
                            cursor.close();
                            throw th2;
                        } catch (Exception e6) {
                            C14795p.m86180a("PushPackageUtils", "close", e6);
                            throw th2;
                        }
                    }
                } catch (Exception e7) {
                    e = e7;
                    string = null;
                }
                if (cursor != null) {
                    cursor.close();
                }
            } catch (Throwable th3) {
                th = th3;
            }
            C14795p.m86180a("PushPackageUtils", "getSystemPush", e);
        } catch (Exception e8) {
            C14795p.m86180a("PushPackageUtils", "close", e8);
        }
        return string;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m86205c(Context context) {
        ProviderInfo providerInfoResolveContentProvider;
        Boolean bool = f61980a;
        if (bool != null) {
            return bool.booleanValue();
        }
        String str = null;
        if (context != null && !TextUtils.isEmpty("com.vivo.push.sdk.service.SystemPushConfig") && (providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.vivo.push.sdk.service.SystemPushConfig", 128)) != null) {
            str = providerInfoResolveContentProvider.packageName;
        }
        boolean zEquals = "BCC35D4D3606F154F0402AB7634E8490C0B244C2675C3C6238986987024F0C02".equals(m86212g(context, str));
        f61980a = Boolean.valueOf(zEquals);
        return zEquals;
    }

    /* JADX INFO: renamed from: d */
    private static C14767b m86207d(Context context) {
        String strM86204b = m86204b(context);
        ApplicationInfo applicationInfo = null;
        if (TextUtils.isEmpty(strM86204b)) {
            return null;
        }
        C14767b c14767b = new C14767b(strM86204b);
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(strM86204b, 128);
            if (packageInfo != null) {
                c14767b.m86091a(packageInfo.versionCode);
                c14767b.m86093a(packageInfo.versionName);
                applicationInfo = packageInfo.applicationInfo;
            }
            if (applicationInfo != null) {
                c14767b.m86092a(C14805z.m86225a(context, strM86204b));
            }
            c14767b.m86094a(m86200a(context, c14767b.m86095b()));
            c14767b.m86096b(m86201a(context, strM86204b));
            return c14767b;
        } catch (Exception e) {
            e.printStackTrace();
            C14795p.m86187b("PushPackageUtils", "PackageManager NameNotFoundException is null", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    private static List<String> m86209e(Context context) {
        List<ResolveInfo> listQueryIntentServices;
        C14786g.m86149a("findAllCoreClientPush");
        ArrayList arrayList = new ArrayList();
        try {
            listQueryIntentServices = context.getPackageManager().queryIntentServices(new Intent("com.vivo.pushservice.action.PUSH_SERVICE"), 576);
        } catch (Exception unused) {
            listQueryIntentServices = null;
        }
        if (listQueryIntentServices != null && listQueryIntentServices.size() > 0) {
            int size = listQueryIntentServices.size();
            for (int i = 0; i < size; i++) {
                ResolveInfo resolveInfo = listQueryIntentServices.get(i);
                if (resolveInfo != null) {
                    String str = resolveInfo.serviceInfo.packageName;
                    if (!TextUtils.isEmpty(str)) {
                        arrayList.add(str);
                    }
                }
            }
        }
        if (arrayList.size() <= 0) {
            C14795p.m86192d("PushPackageUtils", "get all push packages is null");
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: f */
    private static C14767b m86211f(Context context, String str) {
        ApplicationInfo applicationInfo;
        if (!TextUtils.isEmpty(str) && (m86202a(context, str, "com.vivo.pushservice.action.METHOD") || m86202a(context, str, "com.vivo.pushservice.action.RECEIVE"))) {
            C14767b c14767b = new C14767b(str);
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 128);
                if (packageInfo != null) {
                    c14767b.m86091a(packageInfo.versionCode);
                    c14767b.m86093a(packageInfo.versionName);
                    applicationInfo = packageInfo.applicationInfo;
                } else {
                    applicationInfo = null;
                }
                if (applicationInfo != null) {
                    c14767b.m86092a(C14805z.m86225a(context, str));
                }
                c14767b.m86096b(m86201a(context, str));
                c14767b.m86094a(m86200a(context, c14767b.m86095b()));
                return c14767b;
            } catch (Exception e) {
                C14795p.m86180a("PushPackageUtils", "getPushPackageInfo exception: ", e);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    private static String m86212g(Context context, String str) {
        if (!TextUtils.isEmpty(str) && context != null) {
            try {
                Signature[] signatureArr = context.getPackageManager().getPackageInfo(str, 64).signatures;
                byte[] bArrDigest = MessageDigest.getInstance("SHA256").digest(signatureArr[0].toByteArray());
                StringBuffer stringBuffer = new StringBuffer();
                for (byte b : bArrDigest) {
                    String upperCase = Integer.toHexString(b & 255).toUpperCase(Locale.US);
                    if (upperCase.length() == 1) {
                        stringBuffer.append("0");
                    }
                    stringBuffer.append(upperCase);
                }
                return stringBuffer.toString();
            } catch (Exception e) {
                C14795p.m86179a("PushPackageUtils", " getSignatureSHA exception ".concat(String.valueOf(e)));
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m86206c(Context context, String str) {
        return m86202a(context, str, "com.vivo.pushclient.action.RECEIVE");
    }

    /* JADX INFO: renamed from: d */
    public static boolean m86208d(Context context, String str) {
        return m86202a(context, str, "com.vivo.pushservice.action.RECEIVE");
    }

    /* JADX INFO: renamed from: e */
    public static boolean m86210e(Context context, String str) {
        return m86202a(context, str, "com.vivo.pushservice.action.METHOD");
    }

    /* JADX INFO: renamed from: b */
    public static int m86203b(Context context, String str) {
        int i = m86202a(context, str, "com.vivo.pushservice.action.RECEIVE") ? 0 : -1;
        if (m86202a(context, str, "com.vivo.pushclient.action.RECEIVE")) {
            return 1;
        }
        return i;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m86201a(Context context, String str) {
        ServiceInfo serviceInfo;
        if (!TextUtils.isEmpty(str) && context != null) {
            Intent intent = new Intent("com.vivo.pushservice.action.PUSH_SERVICE");
            intent.setPackage(str);
            PackageManager packageManager = context.getPackageManager();
            List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 576);
            if (listQueryIntentServices != null && listQueryIntentServices.size() > 0) {
                int size = listQueryIntentServices.size();
                boolean z = false;
                for (int i = 0; i < size; i++) {
                    ResolveInfo resolveInfo = listQueryIntentServices.get(i);
                    if (resolveInfo != null && (serviceInfo = resolveInfo.serviceInfo) != null) {
                        String str2 = serviceInfo.name;
                        boolean z2 = serviceInfo.exported;
                        if ("com.vivo.push.sdk.service.PushService".equals(str2) && z2) {
                            boolean z3 = resolveInfo.serviceInfo.enabled;
                            int componentEnabledSetting = packageManager.getComponentEnabledSetting(new ComponentName(str, "com.vivo.push.sdk.service.PushService"));
                            z = componentEnabledSetting == 1 || (componentEnabledSetting == 0 && z3);
                        }
                    }
                }
                return z;
            }
            C14795p.m86179a("PushPackageUtils", "isEnablePush error: can not find push service.");
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    private static boolean m86200a(Context context, long j) {
        InterfaceC14718d interfaceC14718dM85977a = C14716b.m85976a().m85977a(context);
        if (interfaceC14718dM85977a != null) {
            return interfaceC14718dM85977a.isInBlackList(j);
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    private static boolean m86202a(Context context, String str, String str2) {
        List<ResolveInfo> listQueryBroadcastReceivers;
        Intent intent = new Intent(str2);
        intent.setPackage(str);
        try {
            listQueryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 576);
        } catch (Exception unused) {
            listQueryBroadcastReceivers = null;
        }
        return listQueryBroadcastReceivers != null && listQueryBroadcastReceivers.size() > 0;
    }
}
