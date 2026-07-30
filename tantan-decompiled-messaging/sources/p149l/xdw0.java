package p149l;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public abstract class xdw0 implements Runnable {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final sei0 f192470a;

    public xdw0() {
        this.f192470a = null;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo96146a();

    @Nullable
    /* JADX INFO: renamed from: b */
    public final sei0 m208431b() {
        return this.f192470a;
    }

    /* JADX INFO: renamed from: c */
    public final void m208432c(Exception exc) {
        sei0 sei0Var = this.f192470a;
        if (sei0Var != null) {
            sei0Var.m183660d(exc);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            mo96146a();
        } catch (Exception e) {
            m208432c(e);
        }
    }

    public xdw0(@Nullable sei0 sei0Var) {
        this.f192470a = sei0Var;
    }
}
