package com.xiaomi.push.service;

import android.os.SystemClock;
import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p149l.vlq0;

/* JADX INFO: renamed from: com.xiaomi.push.service.k */
/* JADX INFO: loaded from: classes2.dex */
public class C14869k {

    /* JADX INFO: renamed from: a */
    private static final Map<String, Long> f63046a = new HashMap();

    /* JADX INFO: renamed from: a */
    private static void m86673a() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Map<String, Long> map = f63046a;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, Long> entry : map.entrySet()) {
            if (jElapsedRealtime - entry.getValue().longValue() > Constants.ONE_MIN_IN_MILLIS) {
                arrayList.add(entry.getKey());
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            f63046a.remove((String) it.next());
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m86674a(byte[] bArr, String str) {
        boolean z = false;
        if (bArr != null && bArr.length > 0 && !TextUtils.isEmpty(str)) {
            String strM198843f = vlq0.m198843f(bArr);
            if (!TextUtils.isEmpty(strM198843f)) {
                Map<String, Long> map = f63046a;
                synchronized (map) {
                    if (map.get(strM198843f + str) != null) {
                        z = true;
                    } else {
                        map.put(strM198843f + str, Long.valueOf(SystemClock.elapsedRealtime()));
                    }
                    m86673a();
                }
                return z;
            }
        }
        return false;
    }
}
