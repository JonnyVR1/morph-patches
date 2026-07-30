package com.google.android.exoplayer2.source.rtsp;

import p149l.aid0;

/* JADX INFO: renamed from: com.google.android.exoplayer2.source.rtsp.k */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C1987k implements InterfaceC1977a.a {

    /* JADX INFO: renamed from: a */
    public final long f8937a;

    public C1987k(long j) {
        this.f8937a = j;
    }

    @Override // com.google.android.exoplayer2.source.rtsp.InterfaceC1977a.a
    /* JADX INFO: renamed from: b */
    public InterfaceC1977a mo11476b(int i) {
        C1986j c1986j = new C1986j(this.f8937a);
        c1986j.mo11125n(aid0.m96804a(i * 2));
        return c1986j;
    }
}
