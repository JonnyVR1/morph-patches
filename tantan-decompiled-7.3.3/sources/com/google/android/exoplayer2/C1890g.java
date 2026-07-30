package com.google.android.exoplayer2;

import androidx.annotation.Nullable;
import p153l.erx;
import p153l.n1g0;
import p153l.qa5;
import p153l.w11;

/* JADX INFO: renamed from: com.google.android.exoplayer2.g */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C1890g implements erx {

    /* JADX INFO: renamed from: a */
    public final n1g0 f7557a;

    /* JADX INFO: renamed from: b */
    public final a f7558b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public InterfaceC2089x f7559c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public erx f7560d;

    /* JADX INFO: renamed from: e */
    public boolean f7561e = true;

    /* JADX INFO: renamed from: f */
    public boolean f7562f;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.g$a */
    public interface a {
        /* JADX INFO: renamed from: s */
        void mo10056s(C1953s c1953s);
    }

    public C1890g(a aVar, qa5 qa5Var) {
        this.f7558b = aVar;
        this.f7557a = new n1g0(qa5Var);
    }

    /* JADX INFO: renamed from: a */
    public void m10048a(InterfaceC2089x interfaceC2089x) {
        if (interfaceC2089x == this.f7559c) {
            this.f7560d = null;
            this.f7559c = null;
            this.f7561e = true;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m10049b(InterfaceC2089x interfaceC2089x) throws ExoPlaybackException {
        erx erxVar;
        erx erxVarMo9711m = interfaceC2089x.mo9711m();
        if (erxVarMo9711m == null || erxVarMo9711m == (erxVar = this.f7560d)) {
            return;
        }
        if (erxVar != null) {
            throw ExoPlaybackException.createForUnexpected(new IllegalStateException("Multiple renderer media clocks enabled."));
        }
        this.f7560d = erxVarMo9711m;
        this.f7559c = interfaceC2089x;
        erxVarMo9711m.setPlaybackParameters(this.f7557a.getPlaybackParameters());
    }

    /* JADX INFO: renamed from: c */
    public void m10050c(long j) {
        this.f7557a.m161113a(j);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m10051d(boolean z) {
        InterfaceC2089x interfaceC2089x = this.f7559c;
        if (interfaceC2089x == null || interfaceC2089x.mo9708c()) {
            return true;
        }
        if (this.f7559c.mo9707b()) {
            return false;
        }
        return z || this.f7559c.mo9829d();
    }

    /* JADX INFO: renamed from: e */
    public void m10052e() {
        this.f7562f = true;
        this.f7557a.m161114b();
    }

    /* JADX INFO: renamed from: f */
    public void m10053f() {
        this.f7562f = false;
        this.f7557a.m161115c();
    }

    /* JADX INFO: renamed from: g */
    public long m10054g(boolean z) {
        m10055h(z);
        return mo9715z();
    }

    @Override // p153l.erx
    public C1953s getPlaybackParameters() {
        erx erxVar = this.f7560d;
        return erxVar != null ? erxVar.getPlaybackParameters() : this.f7557a.getPlaybackParameters();
    }

    /* JADX INFO: renamed from: h */
    public final void m10055h(boolean z) {
        if (m10051d(z)) {
            this.f7561e = true;
            if (this.f7562f) {
                this.f7557a.m161114b();
                return;
            }
            return;
        }
        erx erxVar = (erx) w11.m204369e(this.f7560d);
        long jMo9715z = erxVar.mo9715z();
        if (this.f7561e) {
            if (jMo9715z < this.f7557a.mo9715z()) {
                this.f7557a.m161115c();
                return;
            } else {
                this.f7561e = false;
                if (this.f7562f) {
                    this.f7557a.m161114b();
                }
            }
        }
        this.f7557a.m161113a(jMo9715z);
        C1953s playbackParameters = erxVar.getPlaybackParameters();
        if (playbackParameters.equals(this.f7557a.getPlaybackParameters())) {
            return;
        }
        this.f7557a.setPlaybackParameters(playbackParameters);
        this.f7558b.mo10056s(playbackParameters);
    }

    @Override // p153l.erx
    public void setPlaybackParameters(C1953s c1953s) {
        erx erxVar = this.f7560d;
        if (erxVar != null) {
            erxVar.setPlaybackParameters(c1953s);
            c1953s = this.f7560d.getPlaybackParameters();
        }
        this.f7557a.setPlaybackParameters(c1953s);
    }

    @Override // p153l.erx
    /* JADX INFO: renamed from: z */
    public long mo9715z() {
        return this.f7561e ? this.f7557a.mo9715z() : ((erx) w11.m204369e(this.f7560d)).mo9715z();
    }
}
