package p149l;

import android.os.Bundle;
import android.util.Pair;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes4.dex */
public class mkx extends xxl {

    /* JADX INFO: renamed from: c */
    public final nt10 f134393c;

    /* JADX INFO: renamed from: d */
    public bix.InterfaceC15871a f134394d;

    public mkx(nt10 nt10Var, C22306c<Pair<Boolean, Boolean>> c22306c, f6t f6tVar) {
        super(c22306c, f6tVar);
        this.f134394d = new bix.InterfaceC15871a() { // from class: l.lkx
            @Override // p149l.bix.InterfaceC15871a
            /* JADX INFO: renamed from: a */
            public final void mo102133a(int i, int i2, Bundle bundle) {
                this.f128615a.m155107h(i, i2, bundle);
            }
        };
        this.f134393c = nt10Var;
    }

    @Override // p149l.xxl
    /* JADX INFO: renamed from: b */
    public void mo105960b() {
        bix.m102127b().m102132g(this.f134394d);
    }

    @Override // p149l.xxl
    /* JADX INFO: renamed from: f */
    public void mo105961f() {
        bix.m102127b().m102131f(this.f134394d);
        if (bix.m102127b().m102128c()) {
            this.f134393c.mo160504a(true);
        }
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m155107h(int i, int i2, Bundle bundle) {
        if (i2 == 0) {
            m155108i(true);
        } else if (i2 == 1 || i2 == 4 || i2 == 5 || i2 == 6) {
            m155108i(false);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m155108i(boolean z) {
        if (m211509d()) {
            return;
        }
        nt10 nt10Var = this.f134393c;
        if (z) {
            nt10Var.mo160504a(true);
        } else {
            nt10Var.mo160504a(nt10Var.mo160800b());
        }
    }
}
