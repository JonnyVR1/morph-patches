package com.xiaomi.push.service;

import android.content.Context;
import android.content.Intent;
import android.util.Pair;
import com.xiaomi.push.C14737fi;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p149l.ilq0;
import p149l.qwq0;

/* JADX INFO: renamed from: com.xiaomi.push.service.t */
/* JADX INFO: loaded from: classes2.dex */
public class C14879t {

    /* JADX INFO: renamed from: a */
    private static final Map<String, byte[]> f63114a = new HashMap();

    /* JADX INFO: renamed from: a */
    private static ArrayList<Pair<String, byte[]>> f63113a = new ArrayList<>();

    /* JADX INFO: renamed from: a */
    public static void m86791a(XMPushService xMPushService, boolean z) {
        try {
            Map<String, byte[]> map = f63114a;
            synchronized (map) {
                for (String str : map.keySet()) {
                    ilq0.m137040m("processing pending registration request. " + str);
                    C14882w.m86845a(xMPushService, str, f63114a.get(str));
                    if (z && !qwq0.m176892c()) {
                        try {
                            Thread.sleep(200L);
                        } catch (Exception unused) {
                        }
                    }
                }
                f63114a.clear();
            }
        } catch (C14737fi e) {
            ilq0.m137025B("fail to deal with pending register request. " + e);
            xMPushService.m86344a(10, e);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m86793b(String str, byte[] bArr) {
        synchronized (f63113a) {
            try {
                f63113a.add(new Pair<>(str, bArr));
                if (f63113a.size() > 50) {
                    f63113a.remove(0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m86792a(String str, byte[] bArr) {
        Map<String, byte[]> map = f63114a;
        synchronized (map) {
            ilq0.m137040m("pending registration request. " + str);
            map.put(str, bArr);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m86788a(Context context, int i, String str) {
        Map<String, byte[]> map = f63114a;
        synchronized (map) {
            try {
                for (String str2 : map.keySet()) {
                    ilq0.m137040m("notify registration error. " + str2);
                    m86789a(context, str2, f63114a.get(str2), i, str);
                }
                f63114a.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m86790a(XMPushService xMPushService) {
        ArrayList<Pair<String, byte[]>> arrayList;
        try {
            synchronized (f63113a) {
                arrayList = f63113a;
                f63113a = new ArrayList<>();
            }
            boolean zM176892c = qwq0.m176892c();
            for (Pair<String, byte[]> pair : arrayList) {
                C14882w.m86845a(xMPushService, (String) pair.first, (byte[]) pair.second);
                if (!zM176892c) {
                    try {
                        Thread.sleep(100L);
                    } catch (InterruptedException unused) {
                    }
                }
            }
        } catch (C14737fi e) {
            ilq0.m137025B("meet error when process pending message. " + e);
            xMPushService.m86344a(10, e);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m86789a(Context context, String str, byte[] bArr, int i, String str2) {
        Intent intent = new Intent("com.xiaomi.mipush.ERROR");
        intent.setPackage(str);
        intent.putExtra("mipush_payload", bArr);
        intent.putExtra("mipush_error_code", i);
        intent.putExtra("mipush_error_msg", str2);
        context.sendBroadcast(intent, C14882w.m86838a(str));
    }
}
