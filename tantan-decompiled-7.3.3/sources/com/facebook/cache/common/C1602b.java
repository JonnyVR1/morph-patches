package com.facebook.cache.common;

/* JADX INFO: renamed from: com.facebook.cache.common.b */
/* JADX INFO: loaded from: classes.dex */
public class C1602b implements CacheErrorLogger {

    /* JADX INFO: renamed from: a */
    public static C1602b f6232a;

    /* JADX INFO: renamed from: b */
    public static synchronized C1602b m8127b() {
        try {
            if (f6232a == null) {
                f6232a = new C1602b();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f6232a;
    }

    @Override // com.facebook.cache.common.CacheErrorLogger
    /* JADX INFO: renamed from: a */
    public void mo8119a(CacheErrorLogger.CacheErrorCategory cacheErrorCategory, Class<?> cls, String str, Throwable th) {
    }
}
