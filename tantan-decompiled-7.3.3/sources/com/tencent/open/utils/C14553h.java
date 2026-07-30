package com.tencent.open.utils;

import android.content.Context;
import java.io.File;

/* JADX INFO: renamed from: com.tencent.open.utils.h */
/* JADX INFO: loaded from: classes2.dex */
public final class C14553h {

    /* JADX INFO: renamed from: a */
    private static Context f61179a;

    /* JADX INFO: renamed from: a */
    public static File m85588a(String str) {
        return C14559n.m85689h(m85587a(), str);
    }

    /* JADX INFO: renamed from: b */
    public static String m85590b() {
        return m85587a() == null ? "" : m85587a().getPackageName();
    }

    /* JADX INFO: renamed from: c */
    public static File m85591c() {
        Context contextM85587a = m85587a();
        if (contextM85587a != null) {
            return contextM85587a.getCacheDir();
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static File m85592d() {
        return m85588a((String) null);
    }

    /* JADX INFO: renamed from: a */
    public static void m85589a(Context context) {
        f61179a = context;
    }

    /* JADX INFO: renamed from: a */
    public static Context m85587a() {
        Context context = f61179a;
        if (context == null) {
            return null;
        }
        return context;
    }
}
