package com.tencent.liteav.network.p098a;

/* JADX INFO: renamed from: com.tencent.liteav.network.a.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C14144d {

    /* JADX INFO: renamed from: a */
    public static final C14144d f59482a = new C14144d(a.NO_NETWORK, 0);

    /* JADX INFO: renamed from: b */
    public static final C14144d f59483b = new C14144d(a.WIFI, 0);

    /* JADX INFO: renamed from: c */
    public final int f59484c;

    /* JADX INFO: renamed from: d */
    public final a f59485d;

    /* JADX INFO: renamed from: com.tencent.liteav.network.a.d$a */
    public enum a {
        NO_NETWORK,
        WIFI,
        MOBILE
    }

    public C14144d(a aVar, int i) {
        this.f59485d = aVar;
        this.f59484c = i;
    }
}
