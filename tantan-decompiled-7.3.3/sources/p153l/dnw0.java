package p153l;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public abstract class dnw0 implements Runnable {

    /* JADX INFO: renamed from: a */
    @Nullable
    public final sni0 f89848a;

    public dnw0() {
        this.f89848a = null;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo117085a();

    @Nullable
    /* JADX INFO: renamed from: b */
    public final sni0 m117086b() {
        return this.f89848a;
    }

    /* JADX INFO: renamed from: c */
    public final void m117087c(Exception exc) {
        sni0 sni0Var = this.f89848a;
        if (sni0Var != null) {
            sni0Var.m186942d(exc);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            mo117085a();
        } catch (Exception e) {
            m117087c(e);
        }
    }

    public dnw0(@Nullable sni0 sni0Var) {
        this.f89848a = sni0Var;
    }
}
