package p153l;

import androidx.annotation.WorkerThread;

/* JADX INFO: loaded from: classes6.dex */
public abstract class kix0 extends v1v0 {

    /* JADX INFO: renamed from: b */
    public boolean f127052b;

    public kix0(atx0 atx0Var) {
        super(atx0Var);
        this.f202159a.m100296i();
    }

    /* JADX INFO: renamed from: p */
    public final void m149988p() {
        if (m149991t()) {
            return;
        }
        wtq0.m207906a("Not initialized");
    }

    /* JADX INFO: renamed from: q */
    public final void m149989q() {
        if (this.f127052b) {
            wtq0.m207906a("Can't initialize twice");
        } else {
            if (mo15155u()) {
                return;
            }
            this.f202159a.m100292M();
            this.f127052b = true;
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m149990r() {
        if (this.f127052b) {
            wtq0.m207906a("Can't initialize twice");
            return;
        }
        mo15154s();
        this.f202159a.m100292M();
        this.f127052b = true;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m149991t() {
        return this.f127052b;
    }

    /* JADX INFO: renamed from: u */
    public abstract boolean mo15155u();

    @WorkerThread
    /* JADX INFO: renamed from: s */
    public void mo15154s() {
    }
}
