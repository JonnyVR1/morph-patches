package p153l;

/* JADX INFO: loaded from: classes4.dex */
public abstract class vk2 extends vr4<vxj0, pf60<ycg, y20<Boolean>>> {
    /* JADX INFO: renamed from: f */
    public abstract void mo162170f(ycg ycgVar, y20<Boolean> y20Var);

    /* JADX INFO: renamed from: g */
    public final boolean m201562g(pf60<ycg, y20<Boolean>> pf60Var) {
        return (pf60Var.f152156a == null || pf60Var.f152157b == null) ? false : true;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m201563h(pf60 pf60Var, Boolean bool) {
        if (this.f185431a == 0 || !bool.booleanValue()) {
            ((y20) pf60Var.f152157b).call(bool);
        } else {
            this.f185431a.mo168854b((T) pf60Var);
        }
    }

    @Override // p153l.vr4
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final vxj0 mo168854b(final pf60<ycg, y20<Boolean>> pf60Var) {
        if (!m201562g(pf60Var)) {
            return vxj0.f186265a;
        }
        mo162170f(pf60Var.f152156a, new y20() { // from class: l.uk2
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f179356a.m201563h(pf60Var, (Boolean) obj);
            }
        });
        return vxj0.f186265a;
    }

    /* JADX INFO: renamed from: j */
    public final void m201565j(ycg ycgVar) {
        mo175840k(ycgVar);
        Object obj = this.f185431a;
        if (obj != null) {
            ((vk2) obj).m201565j(ycgVar);
        }
    }

    /* JADX INFO: renamed from: k */
    public void mo175840k(ycg ycgVar) {
    }
}
