package p153l;

import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes6.dex */
public final class avs0 extends kdt0 {

    /* JADX INFO: renamed from: d */
    public final nds0 f73656d;

    /* JADX INFO: renamed from: c */
    public final Object f73655c = new Object();

    /* JADX INFO: renamed from: e */
    public boolean f73657e = false;

    /* JADX INFO: renamed from: f */
    public int f73658f = 0;

    public avs0(nds0 nds0Var) {
        this.f73656d = nds0Var;
    }

    /* JADX INFO: renamed from: f */
    public final vus0 m100515f() {
        vus0 vus0Var = new vus0(this);
        d2v0.m113737k("createNewReference: Trying to acquire lock");
        synchronized (this.f73655c) {
            d2v0.m113737k("createNewReference: Lock acquired");
            m149269e(new wus0(this, vus0Var), new xus0(this, vus0Var));
            Preconditions.checkState(this.f73658f >= 0);
            this.f73658f++;
        }
        d2v0.m113737k("createNewReference: Lock released");
        return vus0Var;
    }

    /* JADX INFO: renamed from: g */
    public final void m100516g() {
        d2v0.m113737k("markAsDestroyable: Trying to acquire lock");
        synchronized (this.f73655c) {
            d2v0.m113737k("markAsDestroyable: Lock acquired");
            Preconditions.checkState(this.f73658f >= 0);
            d2v0.m113737k("Releasing root reference. JS Engine will be destroyed once other references are released.");
            this.f73657e = true;
            m100517h();
        }
        d2v0.m113737k("markAsDestroyable: Lock released");
    }

    /* JADX INFO: renamed from: h */
    public final void m100517h() {
        d2v0.m113737k("maybeDestroy: Trying to acquire lock");
        synchronized (this.f73655c) {
            try {
                d2v0.m113737k("maybeDestroy: Lock acquired");
                Preconditions.checkState(this.f73658f >= 0);
                if (this.f73657e && this.f73658f == 0) {
                    d2v0.m113737k("No reference is left (including root). Cleaning up engine.");
                    m149269e(new zus0(this), new wct0());
                } else {
                    d2v0.m113737k("There are still references to the engine. Not destroying.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        d2v0.m113737k("maybeDestroy: Lock released");
    }

    /* JADX INFO: renamed from: i */
    public final void m100518i() {
        d2v0.m113737k("releaseOneReference: Trying to acquire lock");
        synchronized (this.f73655c) {
            d2v0.m113737k("releaseOneReference: Lock acquired");
            Preconditions.checkState(this.f73658f > 0);
            d2v0.m113737k("Releasing 1 reference for JS Engine");
            this.f73658f--;
            m100517h();
        }
        d2v0.m113737k("releaseOneReference: Lock released");
    }
}
