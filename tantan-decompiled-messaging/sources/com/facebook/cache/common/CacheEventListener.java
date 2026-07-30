package com.facebook.cache.common;

/* JADX INFO: loaded from: classes.dex */
public interface CacheEventListener {

    public enum EvictionReason {
        CACHE_FULL,
        CONTENT_STALE,
        USER_FORCED,
        CACHE_MANAGER_TRIMMED,
        TRIM_EXPIRED
    }

    /* JADX INFO: renamed from: a */
    void mo8066a(InterfaceC1578a interfaceC1578a);

    /* JADX INFO: renamed from: b */
    void mo8067b(InterfaceC1578a interfaceC1578a);

    /* JADX INFO: renamed from: c */
    void mo8068c(InterfaceC1578a interfaceC1578a);

    /* JADX INFO: renamed from: d */
    void mo8069d(InterfaceC1578a interfaceC1578a);

    /* JADX INFO: renamed from: e */
    void mo8070e(InterfaceC1578a interfaceC1578a);

    /* JADX INFO: renamed from: f */
    void mo8071f(InterfaceC1578a interfaceC1578a);

    /* JADX INFO: renamed from: g */
    void mo8072g(InterfaceC1578a interfaceC1578a);
}
