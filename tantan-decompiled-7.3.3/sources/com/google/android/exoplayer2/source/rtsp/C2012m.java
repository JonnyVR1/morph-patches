package com.google.android.exoplayer2.source.rtsp;

import java.io.IOException;
import p153l.dqd0;
import p153l.m6c;

/* JADX INFO: renamed from: com.google.android.exoplayer2.source.rtsp.m */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C2012m implements InterfaceC2000a.a {

    /* JADX INFO: renamed from: a */
    public final long f8977a;

    public C2012m(long j) {
        this.f8977a = j;
    }

    @Override // com.google.android.exoplayer2.source.rtsp.InterfaceC2000a.a
    /* JADX INFO: renamed from: a */
    public InterfaceC2000a.a mo11529a() {
        return new C2010k(this.f8977a);
    }

    @Override // com.google.android.exoplayer2.source.rtsp.InterfaceC2000a.a
    /* JADX INFO: renamed from: b */
    public InterfaceC2000a mo11530b(int i) throws IOException {
        C2011l c2011l = new C2011l(this.f8977a);
        C2011l c2011l2 = new C2011l(this.f8977a);
        try {
            c2011l.mo11179n(dqd0.m117515a(0));
            int localPort = c2011l.getLocalPort();
            boolean z = localPort % 2 == 0;
            c2011l2.mo11179n(dqd0.m117515a(z ? localPort + 1 : localPort - 1));
            if (z) {
                c2011l.m11723j(c2011l2);
                return c2011l;
            }
            c2011l2.m11723j(c2011l);
            return c2011l2;
        } catch (IOException e) {
            m6c.m157209a(c2011l);
            m6c.m157209a(c2011l2);
            throw e;
        }
    }
}
