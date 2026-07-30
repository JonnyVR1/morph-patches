package p149l;

import android.util.Pair;
import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class h3y0 implements gry0, vky0 {

    /* JADX INFO: renamed from: a */
    public final o3y0 f105771a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ v3y0 f105772b;

    public h3y0(v3y0 v3y0Var, o3y0 o3y0Var) {
        this.f105772b = v3y0Var;
        this.f105771a = o3y0Var;
    }

    @Override // p149l.gry0
    /* JADX INFO: renamed from: M */
    public final void mo106370M(int i, @Nullable eqy0 eqy0Var, final vpy0 vpy0Var, final aqy0 aqy0Var) {
        final Pair pairM129195a = m129195a(0, eqy0Var);
        if (pairM129195a != null) {
            this.f105772b.f179867i.mo164792g(new Runnable() { // from class: l.s2y0
                @Override // java.lang.Runnable
                public final void run() {
                    Pair pair = pairM129195a;
                    this.f162027a.f105772b.f179866h.mo106370M(((Integer) pair.first).intValue(), (eqy0) pair.second, vpy0Var, aqy0Var);
                }
            });
        }
    }

    @Override // p149l.gry0
    /* JADX INFO: renamed from: N */
    public final void mo106371N(int i, @Nullable eqy0 eqy0Var, final vpy0 vpy0Var, final aqy0 aqy0Var) {
        final Pair pairM129195a = m129195a(0, eqy0Var);
        if (pairM129195a != null) {
            this.f105772b.f179867i.mo164792g(new Runnable() { // from class: l.o2y0
                @Override // java.lang.Runnable
                public final void run() {
                    Pair pair = pairM129195a;
                    this.f141571a.f105772b.f179866h.mo106371N(((Integer) pair.first).intValue(), (eqy0) pair.second, vpy0Var, aqy0Var);
                }
            });
        }
    }

    @Override // p149l.gry0
    /* JADX INFO: renamed from: P */
    public final void mo106373P(int i, @Nullable eqy0 eqy0Var, final vpy0 vpy0Var, final aqy0 aqy0Var) {
        final Pair pairM129195a = m129195a(0, eqy0Var);
        if (pairM129195a != null) {
            this.f105772b.f179867i.mo164792g(new Runnable() { // from class: l.c3y0
                @Override // java.lang.Runnable
                public final void run() {
                    Pair pair = pairM129195a;
                    this.f79044a.f105772b.f179866h.mo106373P(((Integer) pair.first).intValue(), (eqy0) pair.second, vpy0Var, aqy0Var);
                }
            });
        }
    }

    @Override // p149l.gry0
    /* JADX INFO: renamed from: U */
    public final void mo106378U(int i, @Nullable eqy0 eqy0Var, final aqy0 aqy0Var) {
        final Pair pairM129195a = m129195a(0, eqy0Var);
        if (pairM129195a != null) {
            this.f105772b.f179867i.mo164792g(new Runnable() { // from class: l.x2y0
                @Override // java.lang.Runnable
                public final void run() {
                    Pair pair = pairM129195a;
                    this.f190852a.f105772b.f179866h.mo106378U(((Integer) pair.first).intValue(), (eqy0) pair.second, aqy0Var);
                }
            });
        }
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final Pair m129195a(int i, @Nullable eqy0 eqy0Var) {
        eqy0 eqy0VarM117806a;
        eqy0 eqy0Var2 = null;
        if (eqy0Var != null) {
            o3y0 o3y0Var = this.f105771a;
            int i2 = 0;
            while (true) {
                if (i2 >= o3y0Var.f141720c.size()) {
                    eqy0VarM117806a = null;
                    break;
                }
                if (((eqy0) o3y0Var.f141720c.get(i2)).f92870d == eqy0Var.f92870d) {
                    eqy0VarM117806a = eqy0Var.m117806a(Pair.create(o3y0Var.f141719b, eqy0Var.f92867a));
                    break;
                }
                i2++;
            }
            if (eqy0VarM117806a == null) {
                return null;
            }
            eqy0Var2 = eqy0VarM117806a;
        }
        return Pair.create(Integer.valueOf(this.f105771a.f141721d), eqy0Var2);
    }

    @Override // p149l.gry0
    /* JADX INFO: renamed from: w */
    public final void mo106410w(int i, @Nullable eqy0 eqy0Var, final vpy0 vpy0Var, final aqy0 aqy0Var, final IOException iOException, final boolean z) {
        final Pair pairM129195a = m129195a(0, eqy0Var);
        if (pairM129195a != null) {
            this.f105772b.f179867i.mo164792g(new Runnable() { // from class: l.j2y0
                @Override // java.lang.Runnable
                public final void run() {
                    Pair pair = pairM129195a;
                    this.f115987a.f105772b.f179866h.mo106410w(((Integer) pair.first).intValue(), (eqy0) pair.second, vpy0Var, aqy0Var, iOException, z);
                }
            });
        }
    }
}
