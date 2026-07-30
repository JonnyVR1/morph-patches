package com.facebook.cache.common;

/* JADX INFO: renamed from: com.facebook.cache.common.b */
/* JADX INFO: loaded from: classes.dex */
public class C1579b implements CacheErrorLogger {

    /* JADX INFO: renamed from: a */
    public static C1579b f6195a;

    /* JADX INFO: renamed from: b */
    public static synchronized C1579b m8073b() {
        try {
            if (f6195a == null) {
                f6195a = new C1579b();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f6195a;
    }

    @Override // com.facebook.cache.common.CacheErrorLogger
    /* JADX INFO: renamed from: a */
    public void mo8065a(CacheErrorLogger.CacheErrorCategory cacheErrorCategory, Class<?> cls, String str, Throwable th) {
    }
}
