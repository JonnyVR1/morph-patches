package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.upstream.C2047a;
import com.google.android.exoplayer2.upstream.UdpDataSource;
import com.google.common.primitives.Ints;
import java.io.IOException;
import p149l.l7j0;
import p149l.p11;
import p149l.vck0;

/* JADX INFO: renamed from: com.google.android.exoplayer2.source.rtsp.l */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C1988l implements InterfaceC1977a {

    /* JADX INFO: renamed from: a */
    public final UdpDataSource f8938a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public C1988l f8939b;

    public C1988l(long j) {
        this.f8938a = new UdpDataSource(2000, Ints.m16459d(j));
    }

    @Override // p149l.a5c
    @Nullable
    /* JADX INFO: renamed from: a */
    public Uri mo11121a() {
        return this.f8938a.mo11121a();
    }

    @Override // p149l.a5c
    public void close() {
        this.f8938a.close();
        C1988l c1988l = this.f8939b;
        if (c1988l != null) {
            c1988l.close();
        }
    }

    @Override // p149l.a5c
    /* JADX INFO: renamed from: e */
    public void mo11123e(l7j0 l7j0Var) {
        this.f8938a.mo11123e(l7j0Var);
    }

    @Override // com.google.android.exoplayer2.source.rtsp.InterfaceC1977a
    public int getLocalPort() {
        int localPort = this.f8938a.getLocalPort();
        if (localPort == -1) {
            return -1;
        }
        return localPort;
    }

    @Override // com.google.android.exoplayer2.source.rtsp.InterfaceC1977a
    public String getTransport() {
        int localPort = getLocalPort();
        p11.m167013g(localPort != -1);
        return vck0.m197793D("RTP/AVP;unicast;client_port=%d-%d", Integer.valueOf(localPort), Integer.valueOf(localPort + 1));
    }

    @Override // com.google.android.exoplayer2.source.rtsp.InterfaceC1977a
    /* JADX INFO: renamed from: i */
    public boolean mo11473i() {
        return true;
    }

    /* JADX INFO: renamed from: j */
    public void m11669j(C1988l c1988l) {
        p11.m167007a(this != c1988l);
        this.f8939b = c1988l;
    }

    @Override // com.google.android.exoplayer2.source.rtsp.InterfaceC1977a
    @Nullable
    /* JADX INFO: renamed from: l */
    public C1983g.b mo11474l() {
        return null;
    }

    @Override // p149l.a5c
    /* JADX INFO: renamed from: n */
    public long mo11125n(C2047a c2047a) throws IOException {
        return this.f8938a.mo11125n(c2047a);
    }

    @Override // p149l.w4c
    public int read(byte[] bArr, int i, int i2) throws IOException {
        try {
            return this.f8938a.read(bArr, i, i2);
        } catch (UdpDataSource.UdpDataSourceException e) {
            if (e.reason == 2002) {
                return -1;
            }
            throw e;
        }
    }
}
