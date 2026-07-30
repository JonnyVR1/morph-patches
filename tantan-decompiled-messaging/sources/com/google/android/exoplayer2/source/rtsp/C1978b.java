package com.google.android.exoplayer2.source.rtsp;

import android.os.Handler;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.upstream.Loader;
import java.io.IOException;
import p149l.fd80;
import p149l.g5c;
import p149l.iid0;
import p149l.lnd;
import p149l.mhd0;
import p149l.p11;
import p149l.tqf;
import p149l.uqf;
import p149l.vck0;
import p149l.w4c;

/* JADX INFO: renamed from: com.google.android.exoplayer2.source.rtsp.b */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C1978b implements Loader.InterfaceC2044e {

    /* JADX INFO: renamed from: a */
    public final int f8817a;

    /* JADX INFO: renamed from: b */
    public final iid0 f8818b;

    /* JADX INFO: renamed from: c */
    public final a f8819c;

    /* JADX INFO: renamed from: d */
    public final uqf f8820d;

    /* JADX INFO: renamed from: f */
    public final InterfaceC1977a.a f8822f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public InterfaceC1977a f8823g;

    /* JADX INFO: renamed from: h */
    public mhd0 f8824h;

    /* JADX INFO: renamed from: i */
    public lnd f8825i;

    /* JADX INFO: renamed from: j */
    public volatile boolean f8826j;

    /* JADX INFO: renamed from: l */
    public volatile long f8828l;

    /* JADX INFO: renamed from: e */
    public final Handler f8821e = vck0.m197896w();

    /* JADX INFO: renamed from: k */
    public volatile long f8827k = -9223372036854775807L;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.rtsp.b$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo11482a(String str, InterfaceC1977a interfaceC1977a);
    }

    public C1978b(int i, iid0 iid0Var, a aVar, uqf uqfVar, InterfaceC1977a.a aVar2) {
        this.f8817a = i;
        this.f8818b = iid0Var;
        this.f8819c = aVar;
        this.f8820d = uqfVar;
        this.f8822f = aVar2;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2044e
    /* JADX INFO: renamed from: a */
    public void mo11377a() throws IOException {
        if (this.f8826j) {
            this.f8826j = false;
        }
        try {
            if (this.f8823g == null) {
                InterfaceC1977a interfaceC1977aMo11476b = this.f8822f.mo11476b(this.f8817a);
                this.f8823g = interfaceC1977aMo11476b;
                final String transport = interfaceC1977aMo11476b.getTransport();
                final InterfaceC1977a interfaceC1977a = this.f8823g;
                this.f8821e.post(new Runnable() { // from class: l.lhd0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f128092a.f8819c.mo11482a(transport, interfaceC1977a);
                    }
                });
                this.f8825i = new lnd((w4c) p11.m167011e(this.f8823g), 0L, -1L);
                mhd0 mhd0Var = new mhd0(this.f8818b.f113397a, this.f8817a);
                this.f8824h = mhd0Var;
                mhd0Var.mo10976b(this.f8820d);
            }
            while (!this.f8826j) {
                if (this.f8827k != -9223372036854775807L) {
                    ((mhd0) p11.m167011e(this.f8824h)).mo10975a(this.f8828l, this.f8827k);
                    this.f8827k = -9223372036854775807L;
                }
                if (((mhd0) p11.m167011e(this.f8824h)).mo10978h((tqf) p11.m167011e(this.f8825i), new fd80()) == -1) {
                    break;
                }
            }
            this.f8826j = false;
        } finally {
            if (((InterfaceC1977a) p11.m167011e(this.f8823g)).mo11473i()) {
                g5c.m124484a(this.f8823g);
                this.f8823g = null;
            }
        }
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2044e
    /* JADX INFO: renamed from: c */
    public void mo11378c() {
        this.f8826j = true;
    }

    /* JADX INFO: renamed from: d */
    public void m11478d() {
        ((mhd0) p11.m167011e(this.f8824h)).m154617e();
    }

    /* JADX INFO: renamed from: e */
    public void m11479e(long j, long j2) {
        this.f8827k = j;
        this.f8828l = j2;
    }

    /* JADX INFO: renamed from: f */
    public void m11480f(int i) {
        if (((mhd0) p11.m167011e(this.f8824h)).m154616d()) {
            return;
        }
        this.f8824h.m154618g(i);
    }

    /* JADX INFO: renamed from: g */
    public void m11481g(long j) {
        if (j == -9223372036854775807L || ((mhd0) p11.m167011e(this.f8824h)).m154616d()) {
            return;
        }
        this.f8824h.m154619i(j);
    }
}
