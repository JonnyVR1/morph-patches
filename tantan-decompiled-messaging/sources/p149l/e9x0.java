package p149l;

import androidx.annotation.WorkerThread;

/* JADX INFO: loaded from: classes6.dex */
public abstract class e9x0 extends psu0 {

    /* JADX INFO: renamed from: b */
    public boolean f90156b;

    public e9x0(ujx0 ujx0Var) {
        super(ujx0Var);
        this.f165891a.m194116i();
    }

    /* JADX INFO: renamed from: p */
    public final void m115400p() {
        if (m115403t()) {
            return;
        }
        qkq0.m175383a("Not initialized");
    }

    /* JADX INFO: renamed from: q */
    public final void m115401q() {
        if (this.f90156b) {
            qkq0.m175383a("Can't initialize twice");
        } else {
            if (mo15101u()) {
                return;
            }
            this.f165891a.m194112M();
            this.f90156b = true;
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m115402r() {
        if (this.f90156b) {
            qkq0.m175383a("Can't initialize twice");
            return;
        }
        mo15100s();
        this.f165891a.m194112M();
        this.f90156b = true;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m115403t() {
        return this.f90156b;
    }

    /* JADX INFO: renamed from: u */
    public abstract boolean mo15101u();

    @WorkerThread
    /* JADX INFO: renamed from: s */
    public void mo15100s() {
    }
}
