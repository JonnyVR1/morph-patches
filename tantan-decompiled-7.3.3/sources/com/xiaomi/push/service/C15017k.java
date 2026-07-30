package com.xiaomi.push.service;

import android.os.SystemClock;
import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p153l.bvq0;

/* JADX INFO: renamed from: com.xiaomi.push.service.k */
/* JADX INFO: loaded from: classes2.dex */
public class C15017k {

    /* JADX INFO: renamed from: a */
    private static final Map<String, Long> f63893a = new HashMap();

    /* JADX INFO: renamed from: a */
    private static void m87844a() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Map<String, Long> map = f63893a;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, Long> entry : map.entrySet()) {
            if (jElapsedRealtime - entry.getValue().longValue() > Constants.ONE_MIN_IN_MILLIS) {
                arrayList.add(entry.getKey());
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            f63893a.remove((String) it.next());
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m87845a(byte[] bArr, String str) {
        boolean z = false;
        if (bArr != null && bArr.length > 0 && !TextUtils.isEmpty(str)) {
            String strM106592f = bvq0.m106592f(bArr);
            if (!TextUtils.isEmpty(strM106592f)) {
                Map<String, Long> map = f63893a;
                synchronized (map) {
                    if (map.get(strM106592f + str) != null) {
                        z = true;
                    } else {
                        map.put(strM106592f + str, Long.valueOf(SystemClock.elapsedRealtime()));
                    }
                    m87844a();
                }
                return z;
            }
        }
        return false;
    }
}
