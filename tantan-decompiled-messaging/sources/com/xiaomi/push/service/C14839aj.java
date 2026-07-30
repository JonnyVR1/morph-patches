package com.xiaomi.push.service;

import android.text.TextUtils;
import p149l.ilq0;
import p149l.vlq0;

/* JADX INFO: renamed from: com.xiaomi.push.service.aj */
/* JADX INFO: loaded from: classes2.dex */
public class C14839aj {

    /* JADX INFO: renamed from: a */
    private static long f62874a = 0;

    /* JADX INFO: renamed from: a */
    private static String f62875a = "";

    /* JADX INFO: renamed from: a */
    public static String m86496a(String str) {
        if (TextUtils.isEmpty(str) || str.length() < 32) {
            return str;
        }
        try {
            return "BlockId_".concat(str.substring(8));
        } catch (Exception e) {
            ilq0.m137025B("Exception occurred when filtering registration packet id for log. " + e);
            return "UnexpectedId";
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m86497b() {
        return vlq0.m198838a(32);
    }

    /* JADX INFO: renamed from: a */
    public static String m86495a() {
        if (TextUtils.isEmpty(f62875a)) {
            f62875a = vlq0.m198838a(4);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(f62875a);
        long j = f62874a;
        f62874a = 1 + j;
        sb.append(j);
        return sb.toString();
    }
}
