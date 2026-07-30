package p153l;

import android.util.Pair;
import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class ncy0 implements m0z0, buy0 {

    /* JADX INFO: renamed from: a */
    public final ucy0 f141412a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ bdy0 f141413b;

    public ncy0(bdy0 bdy0Var, ucy0 ucy0Var) {
        this.f141413b = bdy0Var;
        this.f141412a = ucy0Var;
    }

    @Override // p153l.m0z0
    /* JADX INFO: renamed from: M */
    public final void mo141198M(int i, @Nullable kzy0 kzy0Var, final bzy0 bzy0Var, final gzy0 gzy0Var) {
        final Pair pairM162605a = m162605a(0, kzy0Var);
        if (pairM162605a != null) {
            this.f141413b.f76316i.mo121303g(new Runnable() { // from class: l.yby0
                @Override // java.lang.Runnable
                public final void run() {
                    Pair pair = pairM162605a;
                    this.f198370a.f141413b.f76315h.mo141198M(((Integer) pair.first).intValue(), (kzy0) pair.second, bzy0Var, gzy0Var);
                }
            });
        }
    }

    @Override // p153l.m0z0
    /* JADX INFO: renamed from: N */
    public final void mo141199N(int i, @Nullable kzy0 kzy0Var, final bzy0 bzy0Var, final gzy0 gzy0Var) {
        final Pair pairM162605a = m162605a(0, kzy0Var);
        if (pairM162605a != null) {
            this.f141413b.f76316i.mo121303g(new Runnable() { // from class: l.uby0
                @Override // java.lang.Runnable
                public final void run() {
                    Pair pair = pairM162605a;
                    this.f178371a.f141413b.f76315h.mo141199N(((Integer) pair.first).intValue(), (kzy0) pair.second, bzy0Var, gzy0Var);
                }
            });
        }
    }

    @Override // p153l.m0z0
    /* JADX INFO: renamed from: P */
    public final void mo141201P(int i, @Nullable kzy0 kzy0Var, final bzy0 bzy0Var, final gzy0 gzy0Var) {
        final Pair pairM162605a = m162605a(0, kzy0Var);
        if (pairM162605a != null) {
            this.f141413b.f76316i.mo121303g(new Runnable() { // from class: l.icy0
                @Override // java.lang.Runnable
                public final void run() {
                    Pair pair = pairM162605a;
                    this.f114453a.f141413b.f76315h.mo141201P(((Integer) pair.first).intValue(), (kzy0) pair.second, bzy0Var, gzy0Var);
                }
            });
        }
    }

    @Override // p153l.m0z0
    /* JADX INFO: renamed from: U */
    public final void mo141206U(int i, @Nullable kzy0 kzy0Var, final gzy0 gzy0Var) {
        final Pair pairM162605a = m162605a(0, kzy0Var);
        if (pairM162605a != null) {
            this.f141413b.f76316i.mo121303g(new Runnable() { // from class: l.dcy0
                @Override // java.lang.Runnable
                public final void run() {
                    Pair pair = pairM162605a;
                    this.f87841a.f141413b.f76315h.mo141206U(((Integer) pair.first).intValue(), (kzy0) pair.second, gzy0Var);
                }
            });
        }
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final Pair m162605a(int i, @Nullable kzy0 kzy0Var) {
        kzy0 kzy0VarM152239a;
        kzy0 kzy0Var2 = null;
        if (kzy0Var != null) {
            ucy0 ucy0Var = this.f141412a;
            int i2 = 0;
            while (true) {
                if (i2 >= ucy0Var.f178474c.size()) {
                    kzy0VarM152239a = null;
                    break;
                }
                if (((kzy0) ucy0Var.f178474c.get(i2)).f129479d == kzy0Var.f129479d) {
                    kzy0VarM152239a = kzy0Var.m152239a(Pair.create(ucy0Var.f178473b, kzy0Var.f129476a));
                    break;
                }
                i2++;
            }
            if (kzy0VarM152239a == null) {
                return null;
            }
            kzy0Var2 = kzy0VarM152239a;
        }
        return Pair.create(Integer.valueOf(this.f141412a.f178475d), kzy0Var2);
    }

    @Override // p153l.m0z0
    /* JADX INFO: renamed from: w */
    public final void mo141237w(int i, @Nullable kzy0 kzy0Var, final bzy0 bzy0Var, final gzy0 gzy0Var, final IOException iOException, final boolean z) {
        final Pair pairM162605a = m162605a(0, kzy0Var);
        if (pairM162605a != null) {
            this.f141413b.f76316i.mo121303g(new Runnable() { // from class: l.pby0
                @Override // java.lang.Runnable
                public final void run() {
                    Pair pair = pairM162605a;
                    this.f151450a.f141413b.f76315h.mo141237w(((Integer) pair.first).intValue(), (kzy0) pair.second, bzy0Var, gzy0Var, iOException, z);
                }
            });
        }
    }
}
