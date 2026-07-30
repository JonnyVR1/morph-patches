package p149l;

import com.google.android.gms.measurement.internal.C2461j;

/* JADX INFO: loaded from: classes6.dex */
public abstract class hay0 extends kay0 {

    /* JADX INFO: renamed from: c */
    public boolean f106858c;

    public hay0(C2461j c2461j) {
        super(c2461j);
        this.f122162b.m15316x0();
    }

    /* JADX INFO: renamed from: o */
    public final void m130251o() {
        if (m130253q()) {
            return;
        }
        qkq0.m175383a("Not initialized");
    }

    /* JADX INFO: renamed from: p */
    public final void m130252p() {
        if (this.f106858c) {
            qkq0.m175383a("Can't initialize twice");
            return;
        }
        mo15144r();
        this.f122162b.m15314w0();
        this.f106858c = true;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m130253q() {
        return this.f106858c;
    }

    /* JADX INFO: renamed from: r */
    public abstract boolean mo15144r();
}
