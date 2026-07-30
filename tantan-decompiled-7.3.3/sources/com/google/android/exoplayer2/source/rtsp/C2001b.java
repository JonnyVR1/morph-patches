package com.google.android.exoplayer2.source.rtsp;

import android.os.Handler;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.upstream.Loader;
import java.io.IOException;
import p153l.asf;
import p153l.bmk0;
import p153l.bsf;
import p153l.e6c;
import p153l.ll80;
import p153l.lqd0;
import p153l.m6c;
import p153l.ppd0;
import p153l.qod;
import p153l.w11;

/* JADX INFO: renamed from: com.google.android.exoplayer2.source.rtsp.b */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C2001b implements Loader.InterfaceC2067e {

    /* JADX INFO: renamed from: a */
    public final int f8854a;

    /* JADX INFO: renamed from: b */
    public final lqd0 f8855b;

    /* JADX INFO: renamed from: c */
    public final a f8856c;

    /* JADX INFO: renamed from: d */
    public final bsf f8857d;

    /* JADX INFO: renamed from: f */
    public final InterfaceC2000a.a f8859f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public InterfaceC2000a f8860g;

    /* JADX INFO: renamed from: h */
    public ppd0 f8861h;

    /* JADX INFO: renamed from: i */
    public qod f8862i;

    /* JADX INFO: renamed from: j */
    public volatile boolean f8863j;

    /* JADX INFO: renamed from: l */
    public volatile long f8865l;

    /* JADX INFO: renamed from: e */
    public final Handler f8858e = bmk0.m105174w();

    /* JADX INFO: renamed from: k */
    public volatile long f8864k = -9223372036854775807L;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.rtsp.b$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo11536a(String str, InterfaceC2000a interfaceC2000a);
    }

    public C2001b(int i, lqd0 lqd0Var, a aVar, bsf bsfVar, InterfaceC2000a.a aVar2) {
        this.f8854a = i;
        this.f8855b = lqd0Var;
        this.f8856c = aVar;
        this.f8857d = bsfVar;
        this.f8859f = aVar2;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2067e
    /* JADX INFO: renamed from: a */
    public void mo11431a() throws IOException {
        if (this.f8863j) {
            this.f8863j = false;
        }
        try {
            if (this.f8860g == null) {
                InterfaceC2000a interfaceC2000aMo11530b = this.f8859f.mo11530b(this.f8854a);
                this.f8860g = interfaceC2000aMo11530b;
                final String transport = interfaceC2000aMo11530b.getTransport();
                final InterfaceC2000a interfaceC2000a = this.f8860g;
                this.f8858e.post(new Runnable() { // from class: l.opd0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f148452a.f8856c.mo11536a(transport, interfaceC2000a);
                    }
                });
                this.f8862i = new qod((e6c) w11.m204369e(this.f8860g), 0L, -1L);
                ppd0 ppd0Var = new ppd0(this.f8855b.f133191a, this.f8854a);
                this.f8861h = ppd0Var;
                ppd0Var.mo11030b(this.f8857d);
            }
            while (!this.f8863j) {
                if (this.f8864k != -9223372036854775807L) {
                    ((ppd0) w11.m204369e(this.f8861h)).mo11029a(this.f8865l, this.f8864k);
                    this.f8864k = -9223372036854775807L;
                }
                if (((ppd0) w11.m204369e(this.f8861h)).mo11032h((asf) w11.m204369e(this.f8862i), new ll80()) == -1) {
                    break;
                }
            }
            this.f8863j = false;
        } finally {
            if (((InterfaceC2000a) w11.m204369e(this.f8860g)).mo11527i()) {
                m6c.m157209a(this.f8860g);
                this.f8860g = null;
            }
        }
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.InterfaceC2067e
    /* JADX INFO: renamed from: c */
    public void mo11432c() {
        this.f8863j = true;
    }

    /* JADX INFO: renamed from: d */
    public void m11532d() {
        ((ppd0) w11.m204369e(this.f8861h)).m173192e();
    }

    /* JADX INFO: renamed from: e */
    public void m11533e(long j, long j2) {
        this.f8864k = j;
        this.f8865l = j2;
    }

    /* JADX INFO: renamed from: f */
    public void m11534f(int i) {
        if (((ppd0) w11.m204369e(this.f8861h)).m173191d()) {
            return;
        }
        this.f8861h.m173193g(i);
    }

    /* JADX INFO: renamed from: g */
    public void m11535g(long j) {
        if (j == -9223372036854775807L || ((ppd0) w11.m204369e(this.f8861h)).m173191d()) {
            return;
        }
        this.f8861h.m173194i(j);
    }
}
