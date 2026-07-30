package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.upstream.C2070a;
import java.util.Arrays;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import p153l.bmk0;
import p153l.w11;
import p153l.zi2;

/* JADX INFO: renamed from: com.google.android.exoplayer2.source.rtsp.j */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C2009j extends zi2 implements InterfaceC2000a, C2006g.b {

    /* JADX INFO: renamed from: e */
    public final LinkedBlockingQueue<byte[]> f8970e;

    /* JADX INFO: renamed from: f */
    public final long f8971f;

    /* JADX INFO: renamed from: g */
    public byte[] f8972g;

    /* JADX INFO: renamed from: h */
    public int f8973h;

    public C2009j(long j) {
        super(true);
        this.f8971f = j;
        this.f8970e = new LinkedBlockingQueue<>();
        this.f8972g = new byte[0];
        this.f8973h = -1;
    }

    @Override // p153l.g6c
    public void close() {
    }

    @Override // p153l.g6c
    @Nullable
    /* JADX INFO: renamed from: d */
    public Uri mo11176d() {
        return null;
    }

    @Override // com.google.android.exoplayer2.source.rtsp.InterfaceC2000a
    public int getLocalPort() {
        return this.f8973h;
    }

    @Override // com.google.android.exoplayer2.source.rtsp.InterfaceC2000a
    public String getTransport() {
        w11.m204371g(this.f8973h != -1);
        return bmk0.m105071D("RTP/AVP/TCP;unicast;interleaved=%d-%d", Integer.valueOf(this.f8973h), Integer.valueOf(this.f8973h + 1));
    }

    @Override // com.google.android.exoplayer2.source.rtsp.InterfaceC2000a
    /* JADX INFO: renamed from: i */
    public boolean mo11527i() {
        return false;
    }

    @Override // com.google.android.exoplayer2.source.rtsp.C2006g.b
    /* JADX INFO: renamed from: j */
    public void mo11688j(byte[] bArr) {
        this.f8970e.add(bArr);
    }

    @Override // com.google.android.exoplayer2.source.rtsp.InterfaceC2000a
    /* JADX INFO: renamed from: l */
    public C2006g.b mo11528l() {
        return this;
    }

    @Override // p153l.g6c
    /* JADX INFO: renamed from: n */
    public long mo11179n(C2070a c2070a) {
        this.f8973h = c2070a.f9529a.getPort();
        return -1L;
    }

    @Override // p153l.e6c
    public int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int iMin = Math.min(i2, this.f8972g.length);
        System.arraycopy(this.f8972g, 0, bArr, i, iMin);
        byte[] bArr2 = this.f8972g;
        this.f8972g = Arrays.copyOfRange(bArr2, iMin, bArr2.length);
        if (iMin == i2) {
            return iMin;
        }
        try {
            byte[] bArrPoll = this.f8970e.poll(this.f8971f, TimeUnit.MILLISECONDS);
            if (bArrPoll == null) {
                return -1;
            }
            int iMin2 = Math.min(i2 - iMin, bArrPoll.length);
            System.arraycopy(bArrPoll, 0, bArr, i + iMin, iMin2);
            if (iMin2 < bArrPoll.length) {
                this.f8972g = Arrays.copyOfRange(bArrPoll, iMin2, bArrPoll.length);
            }
            return iMin + iMin2;
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return -1;
        }
    }
}
