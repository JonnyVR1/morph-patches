package com.google.android.exoplayer2.source.rtsp;

import p153l.dqd0;

/* JADX INFO: renamed from: com.google.android.exoplayer2.source.rtsp.k */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C2010k implements InterfaceC2000a.a {

    /* JADX INFO: renamed from: a */
    public final long f8974a;

    public C2010k(long j) {
        this.f8974a = j;
    }

    @Override // com.google.android.exoplayer2.source.rtsp.InterfaceC2000a.a
    /* JADX INFO: renamed from: b */
    public InterfaceC2000a mo11530b(int i) {
        C2009j c2009j = new C2009j(this.f8974a);
        c2009j.mo11179n(dqd0.m117515a(i * 2));
        return c2009j;
    }
}
