package p002l;

import android.os.Bundle;
import android.util.Pair;
import l.bix;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class mkx extends xxl {

    /* JADX INFO: renamed from: c */
    public final nt10 f15436c;

    /* JADX INFO: renamed from: d */
    public bix.a f15437d;

    public mkx(nt10 nt10Var, c<Pair<Boolean, Boolean>> cVar, f6t f6tVar) {
        super(cVar, f6tVar);
        this.f15437d = new bix.a() { // from class: l.lkx
            /* JADX INFO: renamed from: a */
            public final void m17292a(int i, int i2, Bundle bundle) {
                this.f14918a.m17999h(i, i2, bundle);
            }
        };
        this.f15436c = nt10Var;
    }

    @Override // p002l.xxl
    /* JADX INFO: renamed from: b */
    public void mo10923b() {
        bix.b().g(this.f15437d);
    }

    @Override // p002l.xxl
    /* JADX INFO: renamed from: f */
    public void mo10924f() {
        bix.b().f(this.f15437d);
        if (bix.b().c()) {
            this.f15436c.mo18909a(true);
        }
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m17999h(int i, int i2, Bundle bundle) {
        if (i2 == 0) {
            m18000i(true);
        } else if (i2 == 1 || i2 == 4 || i2 == 5 || i2 == 6) {
            m18000i(false);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m18000i(boolean z) {
        if (m26173d()) {
            return;
        }
        nt10 nt10Var = this.f15436c;
        if (z) {
            nt10Var.mo18909a(true);
        } else {
            nt10Var.mo18909a(nt10Var.mo18978b());
        }
    }
}
