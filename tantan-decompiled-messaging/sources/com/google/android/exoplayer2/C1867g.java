package com.google.android.exoplayer2;

import androidx.annotation.Nullable;
import p149l.etf0;
import p149l.hix;
import p149l.p11;
import p149l.p95;

/* JADX INFO: renamed from: com.google.android.exoplayer2.g */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C1867g implements hix {

    /* JADX INFO: renamed from: a */
    public final etf0 f7520a;

    /* JADX INFO: renamed from: b */
    public final a f7521b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public InterfaceC2066x f7522c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public hix f7523d;

    /* JADX INFO: renamed from: e */
    public boolean f7524e = true;

    /* JADX INFO: renamed from: f */
    public boolean f7525f;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.g$a */
    public interface a {
        /* JADX INFO: renamed from: s */
        void mo10002s(C1930s c1930s);
    }

    public C1867g(a aVar, p95 p95Var) {
        this.f7521b = aVar;
        this.f7520a = new etf0(p95Var);
    }

    /* JADX INFO: renamed from: a */
    public void m9994a(InterfaceC2066x interfaceC2066x) {
        if (interfaceC2066x == this.f7522c) {
            this.f7523d = null;
            this.f7522c = null;
            this.f7524e = true;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m9995b(InterfaceC2066x interfaceC2066x) throws ExoPlaybackException {
        hix hixVar;
        hix hixVarMo9657m = interfaceC2066x.mo9657m();
        if (hixVarMo9657m == null || hixVarMo9657m == (hixVar = this.f7523d)) {
            return;
        }
        if (hixVar != null) {
            throw ExoPlaybackException.createForUnexpected(new IllegalStateException("Multiple renderer media clocks enabled."));
        }
        this.f7523d = hixVarMo9657m;
        this.f7522c = interfaceC2066x;
        hixVarMo9657m.setPlaybackParameters(this.f7520a.getPlaybackParameters());
    }

    /* JADX INFO: renamed from: c */
    public void m9996c(long j) {
        this.f7520a.m118083a(j);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m9997d(boolean z) {
        InterfaceC2066x interfaceC2066x = this.f7522c;
        if (interfaceC2066x == null || interfaceC2066x.mo9654c()) {
            return true;
        }
        if (this.f7522c.mo9653b()) {
            return false;
        }
        return z || this.f7522c.mo9775d();
    }

    /* JADX INFO: renamed from: e */
    public void m9998e() {
        this.f7525f = true;
        this.f7520a.m118084b();
    }

    /* JADX INFO: renamed from: f */
    public void m9999f() {
        this.f7525f = false;
        this.f7520a.m118085c();
    }

    /* JADX INFO: renamed from: g */
    public long m10000g(boolean z) {
        m10001h(z);
        return mo9661z();
    }

    @Override // p149l.hix
    public C1930s getPlaybackParameters() {
        hix hixVar = this.f7523d;
        return hixVar != null ? hixVar.getPlaybackParameters() : this.f7520a.getPlaybackParameters();
    }

    /* JADX INFO: renamed from: h */
    public final void m10001h(boolean z) {
        if (m9997d(z)) {
            this.f7524e = true;
            if (this.f7525f) {
                this.f7520a.m118084b();
                return;
            }
            return;
        }
        hix hixVar = (hix) p11.m167011e(this.f7523d);
        long jMo9661z = hixVar.mo9661z();
        if (this.f7524e) {
            if (jMo9661z < this.f7520a.mo9661z()) {
                this.f7520a.m118085c();
                return;
            } else {
                this.f7524e = false;
                if (this.f7525f) {
                    this.f7520a.m118084b();
                }
            }
        }
        this.f7520a.m118083a(jMo9661z);
        C1930s playbackParameters = hixVar.getPlaybackParameters();
        if (playbackParameters.equals(this.f7520a.getPlaybackParameters())) {
            return;
        }
        this.f7520a.setPlaybackParameters(playbackParameters);
        this.f7521b.mo10002s(playbackParameters);
    }

    @Override // p149l.hix
    public void setPlaybackParameters(C1930s c1930s) {
        hix hixVar = this.f7523d;
        if (hixVar != null) {
            hixVar.setPlaybackParameters(c1930s);
            c1930s = this.f7523d.getPlaybackParameters();
        }
        this.f7520a.setPlaybackParameters(c1930s);
    }

    @Override // p149l.hix
    /* JADX INFO: renamed from: z */
    public long mo9661z() {
        return this.f7524e ? this.f7520a.mo9661z() : ((hix) p11.m167011e(this.f7523d)).mo9661z();
    }
}
