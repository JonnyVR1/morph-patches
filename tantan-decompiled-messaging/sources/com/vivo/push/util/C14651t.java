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
import com.vivo.push.C14622p;
import com.vivo.push.cache.C14568b;
import com.vivo.push.cache.InterfaceC14570d;
import com.vivo.push.model.C14619b;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: com.vivo.push.util.t */
/* JADX INFO: loaded from: classes2.dex */
public final class C14651t {

    /* JADX INFO: renamed from: a */
    private static Boolean f61133a;

    /* JADX INFO: renamed from: b */
    private static String f61134b;

    /* JADX INFO: renamed from: a */
    public static C14619b m85028a(Context context) {
        C14619b c14619bM85040f;
        C14619b c14619bM85040f2;
        Context applicationContext = ContextDelegate.getContext(context).getApplicationContext();
        C14619b c14619bM85036d = m85036d(applicationContext);
        if (c14619bM85036d != null) {
            C14647p.m85021d("PushPackageUtils", "get system push info :".concat(String.valueOf(c14619bM85036d)));
            return c14619bM85036d;
        }
        List<String> listM85038e = m85038e(applicationContext);
        C14619b c14619bM85040f3 = m85040f(applicationContext, applicationContext.getPackageName());
        if (listM85038e.size() <= 0) {
            if (c14619bM85040f3 != null && c14619bM85040f3.m84927d()) {
                c14619bM85036d = c14619bM85040f3;
            }
            C14647p.m85008a("PushPackageUtils", "findAllPushPackages error: find no package!");
        } else {
            C14619b c14619b = null;
            String strMo84971a = C14656y.m85051b(applicationContext).mo84971a("com.vivo.push.cur_pkg", null);
            if (TextUtils.isEmpty(strMo84971a) || !m85031a(applicationContext, strMo84971a, "com.vivo.pushservice.action.METHOD") || (c14619bM85040f = m85040f(applicationContext, strMo84971a)) == null || !c14619bM85040f.m84927d()) {
                c14619bM85040f = null;
            }
            if (c14619bM85040f3 == null || !c14619bM85040f3.m84927d()) {
                c14619bM85040f3 = null;
            }
            if (c14619bM85040f == null) {
                c14619bM85040f = null;
            }
            if (c14619bM85040f3 == null || (c14619bM85040f != null && (!c14619bM85040f3.m84926c() ? !(c14619bM85040f.m84926c() || c14619bM85040f3.m84924b() > c14619bM85040f.m84924b()) : !(c14619bM85040f.m84926c() && c14619bM85040f3.m84924b() > c14619bM85040f.m84924b())))) {
                c14619bM85040f3 = c14619bM85040f;
            }
            HashMap map = new HashMap();
            if (c14619bM85040f3 == null) {
                c14619bM85040f3 = null;
            } else if (c14619bM85040f3.m84926c()) {
                c14619b = c14619bM85040f3;
                c14619bM85040f3 = null;
            }
            int size = listM85038e.size();
            for (int i = 0; i < size; i++) {
                String str = listM85038e.get(i);
                if (!TextUtils.isEmpty(str) && (c14619bM85040f2 = m85040f(applicationContext, str)) != null) {
                    map.put(str, c14619bM85040f2);
                    if (c14619bM85040f2.m84927d()) {
                        if (c14619bM85040f2.m84926c()) {
                            if (c14619b == null || c14619bM85040f2.m84924b() > c14619b.m84924b()) {
                                c14619b = c14619bM85040f2;
                            }
                        } else if (c14619bM85040f3 == null || c14619bM85040f2.m84924b() > c14619bM85040f3.m84924b()) {
                            c14619bM85040f3 = c14619bM85040f2;
                        }
                    }
                }
            }
            if (c14619bM85040f3 != null) {
                c14619bM85036d = c14619bM85040f3;
            } else {
                C14647p.m85021d("PushPackageUtils", "findSuitablePushPackage, all push app in balck list.");
                c14619bM85036d = c14619b;
            }
        }
        if (c14619bM85036d == null) {
            C14647p.m85018b(applicationContext, "查找最优包为空!");
            C14647p.m85021d("PushPackageUtils", "finSuitablePushPackage is null");
            return c14619bM85036d;
        }
        if (c14619bM85036d.m84926c()) {
            C14647p.m85012a(applicationContext, "查找最优包为:" + c14619bM85036d.m84919a() + "(" + c14619bM85036d.m84924b() + ", Black)");
            C14647p.m85021d("PushPackageUtils", "finSuitablePushPackage" + c14619bM85036d.m84919a() + "(" + c14619bM85036d.m84924b() + ", Black)");
            return c14619bM85036d;
        }
        C14647p.m85012a(applicationContext, "查找最优包为:" + c14619bM85036d.m84919a() + "(" + c14619bM85036d.m84924b() + ")");
        C14647p.m85021d("PushPackageUtils", "finSuitablePushPackage" + c14619bM85036d.m84919a() + "(" + c14619bM85036d.m84924b() + ")");
        return c14619bM85036d;
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00b2 A[Catch: Exception -> 0x00a1, TRY_ENTER, TRY_LEAVE, TryCatch #9 {Exception -> 0x00a1, blocks: (B:47:0x009d, B:57:0x00b2), top: B:82:0x0012 }] */
    /* JADX INFO: renamed from: b */
    public static String m85033b(Context context) {
        String string;
        if (!TextUtils.isEmpty(f61134b)) {
            return f61134b;
        }
        Cursor cursor = null;
        try {
            try {
                try {
                    Cursor cursorQuery = context.getContentResolver().query(C14622p.f61068a, null, null, null, null);
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
                                    C14647p.m85009a("PushPackageUtils", "getSystemPush", e);
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    return string;
                                }
                            }
                            f61134b = string;
                            if (TextUtils.isEmpty(string)) {
                                try {
                                    cursorQuery.close();
                                } catch (Exception e2) {
                                    C14647p.m85009a("PushPackageUtils", "close", e2);
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
                                C14647p.m85009a("PushPackageUtils", "close", e3);
                            }
                            return null;
                        }
                        try {
                            C14647p.m85008a("PushPackageUtils", "cursor is null");
                            if (cursorQuery != null) {
                                try {
                                    cursorQuery.close();
                                } catch (Exception e4) {
                                    C14647p.m85009a("PushPackageUtils", "close", e4);
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
                            C14647p.m85009a("PushPackageUtils", "close", e6);
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
            C14647p.m85009a("PushPackageUtils", "getSystemPush", e);
        } catch (Exception e8) {
            C14647p.m85009a("PushPackageUtils", "close", e8);
        }
        return string;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m85034c(Context context) {
        ProviderInfo providerInfoResolveContentProvider;
        Boolean bool = f61133a;
        if (bool != null) {
            return bool.booleanValue();
        }
        String str = null;
        if (context != null && !TextUtils.isEmpty("com.vivo.push.sdk.service.SystemPushConfig") && (providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.vivo.push.sdk.service.SystemPushConfig", 128)) != null) {
            str = providerInfoResolveContentProvider.packageName;
        }
        boolean zEquals = "BCC35D4D3606F154F0402AB7634E8490C0B244C2675C3C6238986987024F0C02".equals(m85041g(context, str));
        f61133a = Boolean.valueOf(zEquals);
        return zEquals;
    }

    /* JADX INFO: renamed from: d */
    private static C14619b m85036d(Context context) {
        String strM85033b = m85033b(context);
        ApplicationInfo applicationInfo = null;
        if (TextUtils.isEmpty(strM85033b)) {
            return null;
        }
        C14619b c14619b = new C14619b(strM85033b);
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(strM85033b, 128);
            if (packageInfo != null) {
                c14619b.m84920a(packageInfo.versionCode);
                c14619b.m84922a(packageInfo.versionName);
                applicationInfo = packageInfo.applicationInfo;
            }
            if (applicationInfo != null) {
                c14619b.m84921a(C14657z.m85054a(context, strM85033b));
            }
            c14619b.m84923a(m85029a(context, c14619b.m84924b()));
            c14619b.m84925b(m85030a(context, strM85033b));
            return c14619b;
        } catch (Exception e) {
            e.printStackTrace();
            C14647p.m85016b("PushPackageUtils", "PackageManager NameNotFoundException is null", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    private static List<String> m85038e(Context context) {
        List<ResolveInfo> listQueryIntentServices;
        C14638g.m84978a("findAllCoreClientPush");
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
            C14647p.m85021d("PushPackageUtils", "get all push packages is null");
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: f */
    private static C14619b m85040f(Context context, String str) {
        ApplicationInfo applicationInfo;
        if (!TextUtils.isEmpty(str) && (m85031a(context, str, "com.vivo.pushservice.action.METHOD") || m85031a(context, str, "com.vivo.pushservice.action.RECEIVE"))) {
            C14619b c14619b = new C14619b(str);
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 128);
                if (packageInfo != null) {
                    c14619b.m84920a(packageInfo.versionCode);
                    c14619b.m84922a(packageInfo.versionName);
                    applicationInfo = packageInfo.applicationInfo;
                } else {
                    applicationInfo = null;
                }
                if (applicationInfo != null) {
                    c14619b.m84921a(C14657z.m85054a(context, str));
                }
                c14619b.m84925b(m85030a(context, str));
                c14619b.m84923a(m85029a(context, c14619b.m84924b()));
                return c14619b;
            } catch (Exception e) {
                C14647p.m85009a("PushPackageUtils", "getPushPackageInfo exception: ", e);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    private static String m85041g(Context context, String str) {
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
                C14647p.m85008a("PushPackageUtils", " getSignatureSHA exception ".concat(String.valueOf(e)));
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m85035c(Context context, String str) {
        return m85031a(context, str, "com.vivo.pushclient.action.RECEIVE");
    }

    /* JADX INFO: renamed from: d */
    public static boolean m85037d(Context context, String str) {
        return m85031a(context, str, "com.vivo.pushservice.action.RECEIVE");
    }

    /* JADX INFO: renamed from: e */
    public static boolean m85039e(Context context, String str) {
        return m85031a(context, str, "com.vivo.pushservice.action.METHOD");
    }

    /* JADX INFO: renamed from: b */
    public static int m85032b(Context context, String str) {
        int i = m85031a(context, str, "com.vivo.pushservice.action.RECEIVE") ? 0 : -1;
        if (m85031a(context, str, "com.vivo.pushclient.action.RECEIVE")) {
            return 1;
        }
        return i;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m85030a(Context context, String str) {
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
            C14647p.m85008a("PushPackageUtils", "isEnablePush error: can not find push service.");
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    private static boolean m85029a(Context context, long j) {
        InterfaceC14570d interfaceC14570dM84806a = C14568b.m84805a().m84806a(context);
        if (interfaceC14570dM84806a != null) {
            return interfaceC14570dM84806a.isInBlackList(j);
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    private static boolean m85031a(Context context, String str, String str2) {
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
