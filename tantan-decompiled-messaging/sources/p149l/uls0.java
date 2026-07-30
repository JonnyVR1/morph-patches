package p149l;

import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes6.dex */
public final class uls0 extends e4t0 {

    /* JADX INFO: renamed from: d */
    public final h4s0 f177092d;

    /* JADX INFO: renamed from: c */
    public final Object f177091c = new Object();

    /* JADX INFO: renamed from: e */
    public boolean f177093e = false;

    /* JADX INFO: renamed from: f */
    public int f177094f = 0;

    public uls0(h4s0 h4s0Var) {
        this.f177092d = h4s0Var;
    }

    /* JADX INFO: renamed from: f */
    public final pls0 m194261f() {
        pls0 pls0Var = new pls0(this);
        xsu0.m210834k("createNewReference: Trying to acquire lock");
        synchronized (this.f177091c) {
            xsu0.m210834k("createNewReference: Lock acquired");
            m114708e(new qls0(this, pls0Var), new rls0(this, pls0Var));
            Preconditions.checkState(this.f177094f >= 0);
            this.f177094f++;
        }
        xsu0.m210834k("createNewReference: Lock released");
        return pls0Var;
    }

    /* JADX INFO: renamed from: g */
    public final void m194262g() {
        xsu0.m210834k("markAsDestroyable: Trying to acquire lock");
        synchronized (this.f177091c) {
            xsu0.m210834k("markAsDestroyable: Lock acquired");
            Preconditions.checkState(this.f177094f >= 0);
            xsu0.m210834k("Releasing root reference. JS Engine will be destroyed once other references are released.");
            this.f177093e = true;
            m194263h();
        }
        xsu0.m210834k("markAsDestroyable: Lock released");
    }

    /* JADX INFO: renamed from: h */
    public final void m194263h() {
        xsu0.m210834k("maybeDestroy: Trying to acquire lock");
        synchronized (this.f177091c) {
            try {
                xsu0.m210834k("maybeDestroy: Lock acquired");
                Preconditions.checkState(this.f177094f >= 0);
                if (this.f177093e && this.f177094f == 0) {
                    xsu0.m210834k("No reference is left (including root). Cleaning up engine.");
                    m114708e(new tls0(this), new q3t0());
                } else {
                    xsu0.m210834k("There are still references to the engine. Not destroying.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        xsu0.m210834k("maybeDestroy: Lock released");
    }

    /* JADX INFO: renamed from: i */
    public final void m194264i() {
        xsu0.m210834k("releaseOneReference: Trying to acquire lock");
        synchronized (this.f177091c) {
            xsu0.m210834k("releaseOneReference: Lock acquired");
            Preconditions.checkState(this.f177094f > 0);
            xsu0.m210834k("Releasing 1 reference for JS Engine");
            this.f177094f--;
            m194263h();
        }
        xsu0.m210834k("releaseOneReference: Lock released");
    }
}
