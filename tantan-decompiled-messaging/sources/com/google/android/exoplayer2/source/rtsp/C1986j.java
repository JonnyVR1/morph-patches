package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.upstream.C2047a;
import java.util.Arrays;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import p149l.p11;
import p149l.si2;
import p149l.vck0;

/* JADX INFO: renamed from: com.google.android.exoplayer2.source.rtsp.j */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C1986j extends si2 implements InterfaceC1977a, C1983g.b {

    /* JADX INFO: renamed from: e */
    public final LinkedBlockingQueue<byte[]> f8933e;

    /* JADX INFO: renamed from: f */
    public final long f8934f;

    /* JADX INFO: renamed from: g */
    public byte[] f8935g;

    /* JADX INFO: renamed from: h */
    public int f8936h;

    public C1986j(long j) {
        super(true);
        this.f8934f = j;
        this.f8933e = new LinkedBlockingQueue<>();
        this.f8935g = new byte[0];
        this.f8936h = -1;
    }

    @Override // p149l.a5c
    @Nullable
    /* JADX INFO: renamed from: a */
    public Uri mo11121a() {
        return null;
    }

    @Override // p149l.a5c
    public void close() {
    }

    @Override // com.google.android.exoplayer2.source.rtsp.InterfaceC1977a
    public int getLocalPort() {
        return this.f8936h;
    }

    @Override // com.google.android.exoplayer2.source.rtsp.InterfaceC1977a
    public String getTransport() {
        p11.m167013g(this.f8936h != -1);
        return vck0.m197793D("RTP/AVP/TCP;unicast;interleaved=%d-%d", Integer.valueOf(this.f8936h), Integer.valueOf(this.f8936h + 1));
    }

    @Override // com.google.android.exoplayer2.source.rtsp.InterfaceC1977a
    /* JADX INFO: renamed from: i */
    public boolean mo11473i() {
        return false;
    }

    @Override // com.google.android.exoplayer2.source.rtsp.C1983g.b
    /* JADX INFO: renamed from: j */
    public void mo11634j(byte[] bArr) {
        this.f8933e.add(bArr);
    }

    @Override // com.google.android.exoplayer2.source.rtsp.InterfaceC1977a
    /* JADX INFO: renamed from: l */
    public C1983g.b mo11474l() {
        return this;
    }

    @Override // p149l.a5c
    /* JADX INFO: renamed from: n */
    public long mo11125n(C2047a c2047a) {
        this.f8936h = c2047a.f9492a.getPort();
        return -1L;
    }

    @Override // p149l.w4c
    public int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int iMin = Math.min(i2, this.f8935g.length);
        System.arraycopy(this.f8935g, 0, bArr, i, iMin);
        byte[] bArr2 = this.f8935g;
        this.f8935g = Arrays.copyOfRange(bArr2, iMin, bArr2.length);
        if (iMin == i2) {
            return iMin;
        }
        try {
            byte[] bArrPoll = this.f8933e.poll(this.f8934f, TimeUnit.MILLISECONDS);
            if (bArrPoll == null) {
                return -1;
            }
            int iMin2 = Math.min(i2 - iMin, bArrPoll.length);
            System.arraycopy(bArrPoll, 0, bArr, i + iMin, iMin2);
            if (iMin2 < bArrPoll.length) {
                this.f8935g = Arrays.copyOfRange(bArrPoll, iMin2, bArrPoll.length);
            }
            return iMin + iMin2;
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return -1;
        }
    }
}
