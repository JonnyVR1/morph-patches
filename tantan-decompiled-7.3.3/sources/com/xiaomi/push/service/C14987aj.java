package com.xiaomi.push.service;

import android.text.TextUtils;
import p153l.bvq0;
import p153l.ouq0;

/* JADX INFO: renamed from: com.xiaomi.push.service.aj */
/* JADX INFO: loaded from: classes2.dex */
public class C14987aj {

    /* JADX INFO: renamed from: a */
    private static long f63721a = 0;

    /* JADX INFO: renamed from: a */
    private static String f63722a = "";

    /* JADX INFO: renamed from: a */
    public static String m87667a(String str) {
        if (TextUtils.isEmpty(str) || str.length() < 32) {
            return str;
        }
        try {
            return "BlockId_".concat(str.substring(8));
        } catch (Exception e) {
            ouq0.m169378B("Exception occurred when filtering registration packet id for log. " + e);
            return "UnexpectedId";
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m87668b() {
        return bvq0.m106587a(32);
    }

    /* JADX INFO: renamed from: a */
    public static String m87666a() {
        if (TextUtils.isEmpty(f63722a)) {
            f63722a = bvq0.m106587a(4);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(f63722a);
        long j = f63721a;
        f63721a = 1 + j;
        sb.append(j);
        return sb.toString();
    }
}
