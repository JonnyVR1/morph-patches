package p153l;

import com.p051p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes11.dex */
public class gf2 extends g1e implements f3m, d3m {

    /* JADX INFO: renamed from: j */
    public Act f103872j;

    /* JADX INFO: renamed from: k */
    public z2m f103873k;

    public gf2(Act act) {
        super(act, false, 0);
        this.f103872j = act;
    }

    /* JADX INFO: renamed from: E */
    public boolean m130034E() {
        if (!NullChecker.m82486a(this.f103872j) || this.f103872j.isFinishing() || this.f103872j.isDestroyed()) {
            return false;
        }
        show();
        return true;
    }

    @Override // p153l.d3m
    /* JADX INFO: renamed from: a */
    public boolean mo21859a() {
        return m130034E();
    }

    @Override // p153l.g1e, android.app.Dialog, android.content.DialogInterface, p153l.j1e.InterfaceC17849b
    public void dismiss() {
        super.dismiss();
        if (NullChecker.m82486a(this.f103873k)) {
            this.f103873k.mo22108a(this);
        }
    }

    @Override // p153l.f3m
    /* JADX INFO: renamed from: h */
    public boolean mo21866h(al80 al80Var) {
        return m130034E();
    }

    @Override // p153l.a3m
    /* JADX INFO: renamed from: i */
    public void mo21867i(z2m z2mVar) {
        this.f103873k = z2mVar;
    }

    @Override // p153l.d3m
    /* JADX INFO: renamed from: n */
    public void mo21871n(boolean z) {
        dismiss();
    }

    @Override // p153l.d3m
    /* JADX INFO: renamed from: f */
    public void mo21864f(boolean z) {
    }
}
