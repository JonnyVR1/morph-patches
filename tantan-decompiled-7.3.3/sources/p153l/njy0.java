package p153l;

import com.google.android.gms.measurement.internal.C2484j;

/* JADX INFO: loaded from: classes6.dex */
public abstract class njy0 extends qjy0 {

    /* JADX INFO: renamed from: c */
    public boolean f142367c;

    public njy0(C2484j c2484j) {
        super(c2484j);
        this.f158066b.m15370x0();
    }

    /* JADX INFO: renamed from: o */
    public final void m163482o() {
        if (m163484q()) {
            return;
        }
        wtq0.m207906a("Not initialized");
    }

    /* JADX INFO: renamed from: p */
    public final void m163483p() {
        if (this.f142367c) {
            wtq0.m207906a("Can't initialize twice");
            return;
        }
        mo15198r();
        this.f158066b.m15368w0();
        this.f142367c = true;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m163484q() {
        return this.f142367c;
    }

    /* JADX INFO: renamed from: r */
    public abstract boolean mo15198r();
}
