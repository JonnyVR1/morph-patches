package com.xiaomi.push.service;

import android.content.Context;
import android.content.Intent;
import android.util.Pair;
import com.xiaomi.push.C14885fi;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p153l.ouq0;
import p153l.w5r0;

/* JADX INFO: renamed from: com.xiaomi.push.service.t */
/* JADX INFO: loaded from: classes2.dex */
public class C15027t {

    /* JADX INFO: renamed from: a */
    private static final Map<String, byte[]> f63961a = new HashMap();

    /* JADX INFO: renamed from: a */
    private static ArrayList<Pair<String, byte[]>> f63960a = new ArrayList<>();

    /* JADX INFO: renamed from: a */
    public static void m87962a(XMPushService xMPushService, boolean z) {
        try {
            Map<String, byte[]> map = f63961a;
            synchronized (map) {
                for (String str : map.keySet()) {
                    ouq0.m169393m("processing pending registration request. " + str);
                    C15030w.m88016a(xMPushService, str, f63961a.get(str));
                    if (z && !w5r0.m204984c()) {
                        try {
                            Thread.sleep(200L);
                        } catch (Exception unused) {
                        }
                    }
                }
                f63961a.clear();
            }
        } catch (C14885fi e) {
            ouq0.m169378B("fail to deal with pending register request. " + e);
            xMPushService.m87515a(10, e);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m87964b(String str, byte[] bArr) {
        synchronized (f63960a) {
            try {
                f63960a.add(new Pair<>(str, bArr));
                if (f63960a.size() > 50) {
                    f63960a.remove(0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m87963a(String str, byte[] bArr) {
        Map<String, byte[]> map = f63961a;
        synchronized (map) {
            ouq0.m169393m("pending registration request. " + str);
            map.put(str, bArr);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m87959a(Context context, int i, String str) {
        Map<String, byte[]> map = f63961a;
        synchronized (map) {
            try {
                for (String str2 : map.keySet()) {
                    ouq0.m169393m("notify registration error. " + str2);
                    m87960a(context, str2, f63961a.get(str2), i, str);
                }
                f63961a.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m87961a(XMPushService xMPushService) {
        ArrayList<Pair<String, byte[]>> arrayList;
        try {
            synchronized (f63960a) {
                arrayList = f63960a;
                f63960a = new ArrayList<>();
            }
            boolean zM204984c = w5r0.m204984c();
            for (Pair<String, byte[]> pair : arrayList) {
                C15030w.m88016a(xMPushService, (String) pair.first, (byte[]) pair.second);
                if (!zM204984c) {
                    try {
                        Thread.sleep(100L);
                    } catch (InterruptedException unused) {
                    }
                }
            }
        } catch (C14885fi e) {
            ouq0.m169378B("meet error when process pending message. " + e);
            xMPushService.m87515a(10, e);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m87960a(Context context, String str, byte[] bArr, int i, String str2) {
        Intent intent = new Intent("com.xiaomi.mipush.ERROR");
        intent.setPackage(str);
        intent.putExtra("mipush_payload", bArr);
        intent.putExtra("mipush_error_code", i);
        intent.putExtra("mipush_error_msg", str2);
        context.sendBroadcast(intent, C15030w.m88009a(str));
    }
}
