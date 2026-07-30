package com.immomo.framework.storage.p039kv;

import android.content.ContentValues;
import android.content.Context;
import androidx.annotation.Nullable;
import com.cosmos.mdlog.MDLog;
import com.tencent.mmkv.MMKV;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.immomo.framework.storage.kv.b */
/* JADX INFO: loaded from: classes7.dex */
class C3752b {

    /* JADX INFO: renamed from: a */
    private static volatile InterfaceC3751a f12928a;

    /* JADX INFO: renamed from: b */
    private static volatile ConcurrentHashMap<String, InterfaceC3751a> f12929b = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: a */
    public static boolean m18350a(String str) {
        return m18351b(0).mo18349e(str);
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC3751a m18351b(int i) {
        if (i != 1) {
            if (i != 0) {
                return null;
            }
            if (f12928a == null) {
                f12928a = new C3753c("kv_system");
            }
            return f12928a;
        }
        String strM18335b = C3750KV.m18335b();
        InterfaceC3751a interfaceC3751a = f12929b.get(strM18335b);
        if (interfaceC3751a != null) {
            return interfaceC3751a;
        }
        C3753c c3753c = new C3753c("kvu" + strM18335b);
        f12929b.put(strM18335b, c3753c);
        return c3753c;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m18352c(String str, boolean z) {
        return m18351b(0).mo18348d(str, z);
    }

    /* JADX INFO: renamed from: d */
    public static int m18353d(String str, int i) {
        return m18351b(0).getInt(str, i);
    }

    /* JADX INFO: renamed from: e */
    public static long m18354e(String str, Long l2) {
        return m18351b(0).mo18345a(str, l2);
    }

    /* JADX INFO: renamed from: f */
    public static String m18355f(String str, @Nullable String str2) {
        return m18351b(0).getString(str, str2);
    }

    /* JADX INFO: renamed from: g */
    public static void m18356g(Context context) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            MMKV.relinkerContext = context;
            MMKV.initialize(context);
            MDLog.m7390d("KV", "MMKV init time=%d", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
        } catch (Throwable th) {
            th.printStackTrace();
            C3750KV.m18341h("MMKV_ERROR_INIT_LOAD", null, th);
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m18357h(String str) {
        m18351b(0).remove(str);
    }

    /* JADX INFO: renamed from: i */
    public static boolean m18358i(String str, @Nullable Object obj) {
        return m18351b(0).mo18347c(str, obj);
    }

    /* JADX INFO: renamed from: j */
    public static boolean m18359j(@Nullable ContentValues contentValues) {
        return m18351b(0).mo18346b(contentValues);
    }
}
