package p002l;

import l.e30;
import l.j760;
import l.soj0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public abstract class nk2 extends wq4<soj0, j760<kbg, e30<Boolean>>> {
    /* JADX INFO: renamed from: f */
    public abstract void mo10899f(kbg kbgVar, e30<Boolean> e30Var);

    /* JADX INFO: renamed from: g */
    public final boolean m18826g(j760<kbg, e30<Boolean>> j760Var) {
        return (((kbg) j760Var.a) == null || ((e30) j760Var.b) == null) ? false : true;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m18827h(j760 j760Var, Boolean bool) {
        if (this.f21908a == 0 || !bool.booleanValue()) {
            ((e30) j760Var.b).call(bool);
        } else {
            this.f21908a.mo18825b((T) j760Var);
        }
    }

    @Override // p002l.wq4
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final soj0 mo18825b(final j760<kbg, e30<Boolean>> j760Var) {
        if (!m18826g(j760Var)) {
            return soj0.a;
        }
        mo10899f((kbg) j760Var.a, new e30() { // from class: l.mk2
            public final void call(Object obj) {
                this.f15418a.m18827h(j760Var, (Boolean) obj);
            }
        });
        return soj0.a;
    }

    /* JADX INFO: renamed from: j */
    public final void m18829j(kbg kbgVar) {
        mo10900k(kbgVar);
        Object obj = this.f21908a;
        if (obj != null) {
            ((nk2) obj).m18829j(kbgVar);
        }
    }

    /* JADX INFO: renamed from: k */
    public void mo10900k(kbg kbgVar) {
    }
}
