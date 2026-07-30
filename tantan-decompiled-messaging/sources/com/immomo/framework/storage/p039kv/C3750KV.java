package com.immomo.framework.storage.p039kv;

import android.content.ContentValues;
import android.content.Context;
import androidx.annotation.Nullable;
import com.cosmos.mdlog.MDLog;
import p149l.C15944br;
import p149l.axq;

/* JADX INFO: renamed from: com.immomo.framework.storage.kv.KV */
/* JADX INFO: loaded from: classes7.dex */
public class C3750KV {

    /* JADX INFO: renamed from: a */
    private static int f12926a;

    /* JADX INFO: renamed from: b */
    private static axq f12927b;

    /* JADX INFO: renamed from: com.immomo.framework.storage.kv.KV$Type */
    public enum Type {
        System,
        User
    }

    /* JADX INFO: renamed from: a */
    public static boolean m18334a(String str) {
        return C3752b.m18350a(str);
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static String m18335b() {
        C15944br.m103428a();
        return "no_user";
    }

    /* JADX INFO: renamed from: c */
    public static boolean m18336c(String str, boolean z) {
        return C3752b.m18352c(str, z);
    }

    /* JADX INFO: renamed from: d */
    public static int m18337d(String str, Integer num) {
        return C3752b.m18353d(str, num.intValue());
    }

    /* JADX INFO: renamed from: e */
    public static long m18338e(String str, Long l2) {
        return C3752b.m18354e(str, l2);
    }

    /* JADX INFO: renamed from: f */
    public static String m18339f(String str, String str2) {
        return C3752b.m18355f(str, str2);
    }

    /* JADX INFO: renamed from: g */
    public static void m18340g(Context context, @Nullable axq axqVar) {
        f12927b = axqVar;
        C3752b.m18356g(context);
    }

    /* JADX INFO: renamed from: h */
    public static void m18341h(String str, @Nullable String str2, @Nullable Throwable th) {
        int i;
        MDLog.m7392e("KV", "logEvent key=%s, errorMsg=%s, dataKey=%s", str, th != null ? th.getMessage() : "null", str2);
        axq axqVar = f12927b;
        if (axqVar == null || (i = f12926a) >= 100) {
            return;
        }
        f12926a = i + 1;
        axqVar.mo99516a(str, str2, th);
    }

    /* JADX INFO: renamed from: i */
    public static void m18342i(String str) {
        C3752b.m18357h(str);
    }

    /* JADX INFO: renamed from: j */
    public static boolean m18343j(String str, Object obj) {
        return C3752b.m18358i(str, obj);
    }

    /* JADX INFO: renamed from: k */
    public static boolean m18344k(ContentValues contentValues) {
        return C3752b.m18359j(contentValues);
    }
}
