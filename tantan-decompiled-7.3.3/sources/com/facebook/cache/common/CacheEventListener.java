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
    void mo8120a(InterfaceC1601a interfaceC1601a);

    /* JADX INFO: renamed from: b */
    void mo8121b(InterfaceC1601a interfaceC1601a);

    /* JADX INFO: renamed from: c */
    void mo8122c(InterfaceC1601a interfaceC1601a);

    /* JADX INFO: renamed from: d */
    void mo8123d(InterfaceC1601a interfaceC1601a);

    /* JADX INFO: renamed from: e */
    void mo8124e(InterfaceC1601a interfaceC1601a);

    /* JADX INFO: renamed from: f */
    void mo8125f(InterfaceC1601a interfaceC1601a);

    /* JADX INFO: renamed from: g */
    void mo8126g(InterfaceC1601a interfaceC1601a);
}
