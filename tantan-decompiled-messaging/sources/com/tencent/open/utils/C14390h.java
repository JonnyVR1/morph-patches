package com.tencent.open.utils;

import android.content.Context;
import java.io.File;

/* JADX INFO: renamed from: com.tencent.open.utils.h */
/* JADX INFO: loaded from: classes2.dex */
public final class C14390h {

    /* JADX INFO: renamed from: a */
    private static Context f60331a;

    /* JADX INFO: renamed from: a */
    public static File m84405a(String str) {
        return C14396n.m84506h(m84404a(), str);
    }

    /* JADX INFO: renamed from: b */
    public static String m84407b() {
        return m84404a() == null ? "" : m84404a().getPackageName();
    }

    /* JADX INFO: renamed from: c */
    public static File m84408c() {
        Context contextM84404a = m84404a();
        if (contextM84404a != null) {
            return contextM84404a.getCacheDir();
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static File m84409d() {
        return m84405a((String) null);
    }

    /* JADX INFO: renamed from: a */
    public static void m84406a(Context context) {
        f60331a = context;
    }

    /* JADX INFO: renamed from: a */
    public static Context m84404a() {
        Context context = f60331a;
        if (context == null) {
            return null;
        }
        return context;
    }
}
