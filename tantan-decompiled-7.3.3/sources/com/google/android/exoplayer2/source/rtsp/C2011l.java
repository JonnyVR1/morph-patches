package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.upstream.C2070a;
import com.google.android.exoplayer2.upstream.UdpDataSource;
import com.google.common.primitives.Ints;
import java.io.IOException;
import p153l.bmk0;
import p153l.pgj0;
import p153l.w11;

/* JADX INFO: renamed from: com.google.android.exoplayer2.source.rtsp.l */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C2011l implements InterfaceC2000a {

    /* JADX INFO: renamed from: a */
    public final UdpDataSource f8975a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public C2011l f8976b;

    public C2011l(long j) {
        this.f8975a = new UdpDataSource(2000, Ints.m16514d(j));
    }

    @Override // p153l.g6c
    public void close() {
        this.f8975a.close();
        C2011l c2011l = this.f8976b;
        if (c2011l != null) {
            c2011l.close();
        }
    }

    @Override // p153l.g6c
    @Nullable
    /* JADX INFO: renamed from: d */
    public Uri mo11176d() {
        return this.f8975a.mo11176d();
    }

    @Override // p153l.g6c
    /* JADX INFO: renamed from: e */
    public void mo11177e(pgj0 pgj0Var) {
        this.f8975a.mo11177e(pgj0Var);
    }

    @Override // com.google.android.exoplayer2.source.rtsp.InterfaceC2000a
    public int getLocalPort() {
        int localPort = this.f8975a.getLocalPort();
        if (localPort == -1) {
            return -1;
        }
        return localPort;
    }

    @Override // com.google.android.exoplayer2.source.rtsp.InterfaceC2000a
    public String getTransport() {
        int localPort = getLocalPort();
        w11.m204371g(localPort != -1);
        return bmk0.m105071D("RTP/AVP;unicast;client_port=%d-%d", Integer.valueOf(localPort), Integer.valueOf(localPort + 1));
    }

    @Override // com.google.android.exoplayer2.source.rtsp.InterfaceC2000a
    /* JADX INFO: renamed from: i */
    public boolean mo11527i() {
        return true;
    }

    /* JADX INFO: renamed from: j */
    public void m11723j(C2011l c2011l) {
        w11.m204365a(this != c2011l);
        this.f8976b = c2011l;
    }

    @Override // com.google.android.exoplayer2.source.rtsp.InterfaceC2000a
    @Nullable
    /* JADX INFO: renamed from: l */
    public C2006g.b mo11528l() {
        return null;
    }

    @Override // p153l.g6c
    /* JADX INFO: renamed from: n */
    public long mo11179n(C2070a c2070a) throws IOException {
        return this.f8975a.mo11179n(c2070a);
    }

    @Override // p153l.e6c
    public int read(byte[] bArr, int i, int i2) throws IOException {
        try {
            return this.f8975a.read(bArr, i, i2);
        } catch (UdpDataSource.UdpDataSourceException e) {
            if (e.reason == 2002) {
                return -1;
            }
            throw e;
        }
    }
}
