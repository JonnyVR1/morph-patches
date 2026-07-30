package com.tencent.liteav.network.p103a;

/* JADX INFO: renamed from: com.tencent.liteav.network.a.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C14307d {

    /* JADX INFO: renamed from: a */
    public static final C14307d f60330a = new C14307d(a.NO_NETWORK, 0);

    /* JADX INFO: renamed from: b */
    public static final C14307d f60331b = new C14307d(a.WIFI, 0);

    /* JADX INFO: renamed from: c */
    public final int f60332c;

    /* JADX INFO: renamed from: d */
    public final a f60333d;

    /* JADX INFO: renamed from: com.tencent.liteav.network.a.d$a */
    public enum a {
        NO_NETWORK,
        WIFI,
        MOBILE
    }

    public C14307d(a aVar, int i) {
        this.f60333d = aVar;
        this.f60332c = i;
    }
}
