package com.google.android.exoplayer2.source.rtsp;

import java.io.IOException;
import p149l.aid0;
import p149l.g5c;

/* JADX INFO: renamed from: com.google.android.exoplayer2.source.rtsp.m */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C1989m implements InterfaceC1977a.a {

    /* JADX INFO: renamed from: a */
    public final long f8940a;

    public C1989m(long j) {
        this.f8940a = j;
    }

    @Override // com.google.android.exoplayer2.source.rtsp.InterfaceC1977a.a
    /* JADX INFO: renamed from: a */
    public InterfaceC1977a.a mo11475a() {
        return new C1987k(this.f8940a);
    }

    @Override // com.google.android.exoplayer2.source.rtsp.InterfaceC1977a.a
    /* JADX INFO: renamed from: b */
    public InterfaceC1977a mo11476b(int i) throws IOException {
        C1988l c1988l = new C1988l(this.f8940a);
        C1988l c1988l2 = new C1988l(this.f8940a);
        try {
            c1988l.mo11125n(aid0.m96804a(0));
            int localPort = c1988l.getLocalPort();
            boolean z = localPort % 2 == 0;
            c1988l2.mo11125n(aid0.m96804a(z ? localPort + 1 : localPort - 1));
            if (z) {
                c1988l.m11669j(c1988l2);
                return c1988l;
            }
            c1988l2.m11669j(c1988l);
            return c1988l2;
        } catch (IOException e) {
            g5c.m124484a(c1988l);
            g5c.m124484a(c1988l2);
            throw e;
        }
    }
}
