package p153l;

import android.os.Bundle;
import android.util.Pair;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes5.dex */
public class jtx extends q0m {

    /* JADX INFO: renamed from: c */
    public final v120 f122631c;

    /* JADX INFO: renamed from: d */
    public yqx.InterfaceC21667a f122632d;

    public jtx(v120 v120Var, C22421c<Pair<Boolean, Boolean>> c22421c, g8t g8tVar) {
        super(c22421c, g8tVar);
        this.f122632d = new yqx.InterfaceC21667a() { // from class: l.itx
            @Override // p153l.yqx.InterfaceC21667a
            /* JADX INFO: renamed from: a */
            public final void mo142132a(int i, int i2, Bundle bundle) {
                this.f116882a.m146922h(i, i2, bundle);
            }
        };
        this.f122631c = v120Var;
    }

    @Override // p153l.q0m
    /* JADX INFO: renamed from: b */
    public void mo108622b() {
        yqx.m217138b().m217143g(this.f122632d);
    }

    @Override // p153l.q0m
    /* JADX INFO: renamed from: f */
    public void mo108623f() {
        yqx.m217138b().m217142f(this.f122632d);
        if (yqx.m217138b().m217139c()) {
            this.f122631c.mo174618a(true);
        }
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m146922h(int i, int i2, Bundle bundle) {
        if (i2 == 0) {
            m146923i(true);
        } else if (i2 == 1 || i2 == 4 || i2 == 5 || i2 == 6) {
            m146923i(false);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m146923i(boolean z) {
        if (m174728d()) {
            return;
        }
        v120 v120Var = this.f122631c;
        if (z) {
            v120Var.mo174618a(true);
        } else {
            v120Var.mo174618a(v120Var.mo174619b());
        }
    }
}
