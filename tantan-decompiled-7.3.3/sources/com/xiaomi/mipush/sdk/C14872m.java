package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PermissionInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.text.TextUtils;
import android.util.Log;
import com.xiaomi.push.service.AbstractC14991an;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import p153l.ouq0;
import p153l.t5r0;
import p153l.z4r0;

/* JADX INFO: renamed from: com.xiaomi.mipush.sdk.m */
/* JADX INFO: loaded from: classes2.dex */
public class C14872m {

    /* JADX INFO: renamed from: com.xiaomi.mipush.sdk.m$a */
    public static class a extends RuntimeException {
        public a(String str) {
            super(str);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.mipush.sdk.m$b */
    public static class b implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Context f62465a;

        public b(Context context) {
            this.f62465a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                PackageInfo packageInfo = this.f62465a.getPackageManager().getPackageInfo(this.f62465a.getPackageName(), 4612);
                C14872m.m86619j(this.f62465a);
                C14872m.m86621l(this.f62465a, packageInfo);
                C14872m.m86620k(this.f62465a, packageInfo);
            } catch (Throwable th) {
                Log.e("ManifestChecker", "", th);
            }
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.mipush.sdk.m$c */
    public static class c {

        /* JADX INFO: renamed from: a */
        public String f62466a;

        /* JADX INFO: renamed from: b */
        public boolean f62467b;

        /* JADX INFO: renamed from: c */
        public boolean f62468c;

        /* JADX INFO: renamed from: d */
        public String f62469d;

        public c(String str, boolean z, boolean z2, String str2) {
            this.f62466a = str;
            this.f62467b = z;
            this.f62468c = z2;
            this.f62469d = str2;
        }
    }

    /* JADX INFO: renamed from: a */
    private static ActivityInfo m86610a(PackageManager packageManager, Intent intent, Class<?> cls) {
        Iterator<ResolveInfo> it = packageManager.queryBroadcastReceivers(intent, 16384).iterator();
        while (it.hasNext()) {
            ActivityInfo activityInfo = it.next().activityInfo;
            if (activityInfo != null && cls.getCanonicalName().equals(activityInfo.name)) {
                return activityInfo;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static void m86611b(Context context) {
        new Thread(new b(context)).start();
    }

    /* JADX INFO: renamed from: d */
    private static void m86613d(Context context, String str, String str2) {
        PackageManager packageManager = context.getPackageManager();
        String packageName = context.getPackageName();
        Intent intent = new Intent(str);
        intent.setPackage(packageName);
        Iterator<ResolveInfo> it = packageManager.queryBroadcastReceivers(intent, 16384).iterator();
        boolean z = false;
        while (it.hasNext()) {
            ActivityInfo activityInfo = it.next().activityInfo;
            z = (activityInfo == null || TextUtils.isEmpty(activityInfo.name) || !activityInfo.name.equals(str2)) ? false : true;
            if (z) {
                break;
            }
        }
        if (z) {
            return;
        }
        z4r0.m218608a("<receiver android:name=\"%1$s\" .../> is missing or disabled in AndroidManifest.", new Object[]{str2});
    }

    /* JADX INFO: renamed from: e */
    private static void m86614e(ActivityInfo activityInfo, Boolean[] boolArr) {
        if (boolArr[0].booleanValue() != activityInfo.enabled) {
            z4r0.m218608a("<receiver android:name=\"%1$s\" .../> in AndroidManifest had the wrong enabled attribute, which should be android:enabled=%2$b.", new Object[]{activityInfo.name, boolArr[0]});
        } else {
            if (boolArr[1].booleanValue() == activityInfo.exported) {
                return;
            }
            z4r0.m218608a("<receiver android:name=\"%1$s\" .../> in AndroidManifest had the wrong exported attribute, which should be android:exported=%2$b.", new Object[]{activityInfo.name, boolArr[1]});
        }
    }

    /* JADX INFO: renamed from: f */
    private static boolean m86615f(PackageInfo packageInfo, String[] strArr) {
        for (ServiceInfo serviceInfo : packageInfo.services) {
            if (m86616g(strArr, serviceInfo.name)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    private static boolean m86616g(String[] strArr, String str) {
        if (strArr != null && str != null) {
            for (String str2 : strArr) {
                if (TextUtils.equals(str2, str)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:45:0x009d A[EDGE_INSN: B:45:0x009d->B:31:0x009d BREAK  A[LOOP:0: B:16:0x0069->B:50:0x0069], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x0069 A[SYNTHETIC] */
    /* JADX INFO: renamed from: j */
    public static void m86619j(Context context) {
        PackageManager packageManager = context.getPackageManager();
        String packageName = context.getPackageName();
        Intent intent = new Intent(AbstractC14991an.f63799q);
        intent.setPackage(packageName);
        try {
            ActivityInfo activityInfoM86610a = m86610a(packageManager, intent, t5r0.m189419c(context, "com.xiaomi.push.service.receivers.PingReceiver"));
            if (MiPushClient.shouldUseMIUIPush(context)) {
                if (activityInfoM86610a != null) {
                    m86614e(activityInfoM86610a, new Boolean[]{Boolean.TRUE, Boolean.FALSE});
                }
            } else {
                if (activityInfoM86610a == null) {
                    throw new a(String.format("<receiver android:name=\"%1$s\" .../> is missing or disabled in AndroidManifest.", "com.xiaomi.push.service.receivers.PingReceiver"));
                }
                m86614e(activityInfoM86610a, new Boolean[]{Boolean.TRUE, Boolean.FALSE});
            }
        } catch (ClassNotFoundException e) {
            ouq0.m169397q(e);
        }
        Intent intent2 = new Intent("com.xiaomi.mipush.RECEIVE_MESSAGE");
        intent2.setPackage(packageName);
        Iterator<ResolveInfo> it = packageManager.queryBroadcastReceivers(intent2, 16384).iterator();
        boolean z = false;
        while (it.hasNext()) {
            ActivityInfo activityInfo = it.next().activityInfo;
            if (activityInfo != null) {
                try {
                    if (!TextUtils.isEmpty(activityInfo.name) && PushMessageReceiver.class.isAssignableFrom(t5r0.m189419c(context, activityInfo.name)) && activityInfo.enabled) {
                        z = true;
                    }
                    if (z) {
                        break;
                    }
                } catch (ClassNotFoundException e2) {
                    ouq0.m169397q(e2);
                }
            }
            z = false;
            if (z) {
                break;
                break;
            }
        }
        if (!z) {
            throw new a("Receiver: none of the subclasses of PushMessageReceiver is enabled or defined.");
        }
        if (MiPushClient.getOpenHmsPush(context)) {
            m86613d(context, "com.huawei.android.push.intent.RECEIVE", "com.xiaomi.assemble.control.HmsPushReceiver");
            m86613d(context, "com.huawei.intent.action.PUSH", "com.huawei.hms.support.api.push.PushEventReceiver");
        }
        if (MiPushClient.getOpenVIVOPush(context)) {
            m86613d(context, "com.vivo.pushclient.action.RECEIVE", "com.xiaomi.assemble.control.FTOSPushMessageReceiver");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static void m86620k(Context context, PackageInfo packageInfo) {
        HashSet hashSet = new HashSet();
        String str = context.getPackageName() + ".permission.MIPUSH_RECEIVE";
        hashSet.addAll(Arrays.asList("android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", str, "android.permission.ACCESS_WIFI_STATE", "android.permission.VIBRATE"));
        PermissionInfo[] permissionInfoArr = packageInfo.permissions;
        if (permissionInfoArr != null) {
            for (PermissionInfo permissionInfo : permissionInfoArr) {
                if (str.equals(permissionInfo.name)) {
                    String[] strArr = packageInfo.requestedPermissions;
                    if (strArr != null) {
                        for (String str2 : strArr) {
                            if (!TextUtils.isEmpty(str2) && hashSet.contains(str2)) {
                                hashSet.remove(str2);
                                if (hashSet.isEmpty()) {
                                    break;
                                }
                            }
                        }
                    }
                    if (hashSet.isEmpty()) {
                        return;
                    }
                    z4r0.m218608a("<uses-permission android:name=\"%1$s\"/> is missing in AndroidManifest.", new Object[]{hashSet.iterator().next()});
                    return;
                }
            }
        }
        z4r0.m218608a("<permission android:name=\"%1$s\" .../> is undefined in AndroidManifest.", new Object[]{str});
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static void m86621l(Context context, PackageInfo packageInfo) {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        map2.put(PushMessageHandler.class.getCanonicalName(), new c(PushMessageHandler.class.getCanonicalName(), true, true, ""));
        map2.put(MessageHandleService.class.getCanonicalName(), new c(MessageHandleService.class.getCanonicalName(), true, false, ""));
        if (!MiPushClient.shouldUseMIUIPush(context) || m86615f(packageInfo, new String[]{"com.xiaomi.push.service.XMJobService", "com.xiaomi.push.service.XMPushService"})) {
            map2.put("com.xiaomi.push.service.XMJobService", new c("com.xiaomi.push.service.XMJobService", true, false, "android.permission.BIND_JOB_SERVICE"));
            map2.put("com.xiaomi.push.service.XMPushService", new c("com.xiaomi.push.service.XMPushService", true, false, ""));
        }
        if (MiPushClient.getOpenFCMPush(context)) {
            map2.put("com.xiaomi.assemble.control.MiFireBaseInstanceIdService", new c("com.xiaomi.assemble.control.MiFireBaseInstanceIdService", true, false, ""));
            map2.put("com.xiaomi.assemble.control.MiFirebaseMessagingService", new c("com.xiaomi.assemble.control.MiFirebaseMessagingService", true, false, ""));
        }
        if (MiPushClient.getOpenOPPOPush(context)) {
            map2.put("com.xiaomi.assemble.control.COSPushMessageService", new c("com.xiaomi.assemble.control.COSPushMessageService", true, true, "com.coloros.mcs.permission.SEND_MCS_MESSAGE"));
        }
        ServiceInfo[] serviceInfoArr = packageInfo.services;
        if (serviceInfoArr != null) {
            for (ServiceInfo serviceInfo : serviceInfoArr) {
                if (!TextUtils.isEmpty(serviceInfo.name) && map2.containsKey(serviceInfo.name)) {
                    c cVar = (c) map2.remove(serviceInfo.name);
                    boolean z = cVar.f62467b;
                    boolean z2 = cVar.f62468c;
                    String str = cVar.f62469d;
                    if (z != serviceInfo.enabled) {
                        z4r0.m218608a("<service android:name=\"%1$s\" .../> in AndroidManifest had the wrong enabled attribute, which should be android:enabled=%2$b.", new Object[]{serviceInfo.name, Boolean.valueOf(z)});
                        return;
                    }
                    if (z2 == serviceInfo.exported) {
                        if (!TextUtils.isEmpty(str) && !TextUtils.equals(str, serviceInfo.permission)) {
                            z4r0.m218608a("<service android:name=\"%1$s\" .../> in AndroidManifest had the wrong permission attribute, which should be android:permission=\"%2$s\".", new Object[]{serviceInfo.name, str});
                            return;
                        } else {
                            map.put(serviceInfo.name, serviceInfo.processName);
                            if (map2.isEmpty()) {
                                break;
                            }
                        }
                    } else {
                        z4r0.m218608a("<service android:name=\"%1$s\" .../> in AndroidManifest had the wrong exported attribute, which should be android:exported=%2$b.", new Object[]{serviceInfo.name, Boolean.valueOf(z2)});
                        return;
                    }
                }
            }
        }
        if (!map2.isEmpty()) {
            z4r0.m218608a("<service android:name=\"%1$s\" .../> is missing or disabled in AndroidManifest.", new Object[]{map2.keySet().iterator().next()});
            return;
        }
        if (!TextUtils.equals((CharSequence) map.get(PushMessageHandler.class.getCanonicalName()), (CharSequence) map.get(MessageHandleService.class.getCanonicalName()))) {
            z4r0.m218608a("\"%1$s\" and \"%2$s\" must be running in the same process.", new Object[]{PushMessageHandler.class.getCanonicalName(), MessageHandleService.class.getCanonicalName()});
        } else if (map.containsKey("com.xiaomi.push.service.XMJobService") && map.containsKey("com.xiaomi.push.service.XMPushService") && !TextUtils.equals((CharSequence) map.get("com.xiaomi.push.service.XMJobService"), (CharSequence) map.get("com.xiaomi.push.service.XMPushService"))) {
            z4r0.m218608a("\"%1$s\" and \"%2$s\" must be running in the same process.", new Object[]{"com.xiaomi.push.service.XMJobService", "com.xiaomi.push.service.XMPushService"});
        }
    }
}
