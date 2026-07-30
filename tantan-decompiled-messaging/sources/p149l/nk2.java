package p149l;

/* JADX INFO: loaded from: classes4.dex */
public abstract class nk2 extends wq4<soj0, j760<kbg, e30<Boolean>>> {
    /* JADX INFO: renamed from: f */
    public abstract void mo105792f(kbg kbgVar, e30<Boolean> e30Var);

    /* JADX INFO: renamed from: g */
    public final boolean m159821g(j760<kbg, e30<Boolean>> j760Var) {
        return (j760Var.f116564a == null || j760Var.f116565b == null) ? false : true;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m159822h(j760 j760Var, Boolean bool) {
        if (this.f187639a == 0 || !bool.booleanValue()) {
            ((e30) j760Var.f116565b).call(bool);
        } else {
            this.f187639a.mo159820b((T) j760Var);
        }
    }

    @Override // p149l.wq4
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final soj0 mo159820b(final j760<kbg, e30<Boolean>> j760Var) {
        if (!m159821g(j760Var)) {
            return soj0.f165695a;
        }
        mo105792f(j760Var.f116564a, new e30() { // from class: l.mk2
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f134277a.m159822h(j760Var, (Boolean) obj);
            }
        });
        return soj0.f165695a;
    }

    /* JADX INFO: renamed from: j */
    public final void m159824j(kbg kbgVar) {
        mo105793k(kbgVar);
        Object obj = this.f187639a;
        if (obj != null) {
            ((nk2) obj).m159824j(kbgVar);
        }
    }

    /* JADX INFO: renamed from: k */
    public void mo105793k(kbg kbgVar) {
    }
}
