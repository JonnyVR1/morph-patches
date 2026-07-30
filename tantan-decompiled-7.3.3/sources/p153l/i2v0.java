package p153l;

import androidx.annotation.VisibleForTesting;
import com.google.ads.mediation.AbstractAdViewAdapter;

/* JADX INFO: loaded from: classes6.dex */
@VisibleForTesting
public final class i2v0 extends d70 implements ntx0, yqw0, byv0 {

    /* JADX INFO: renamed from: a */
    @VisibleForTesting
    public final AbstractAdViewAdapter f112667a;

    /* JADX INFO: renamed from: b */
    @VisibleForTesting
    public final d8y f112668b;

    public i2v0(AbstractAdViewAdapter abstractAdViewAdapter, d8y d8yVar) {
        this.f112667a = abstractAdViewAdapter;
        this.f112668b = d8yVar;
    }

    @Override // p153l.d70
    /* JADX INFO: renamed from: B */
    public final void mo30986B() {
        this.f112668b.mo113232a(this.f112667a);
    }

    @Override // p153l.ntx0
    /* JADX INFO: renamed from: b */
    public final void mo138240b(mxj0 mxj0Var) {
        this.f112668b.mo113241j(this.f112667a, new j9r0(mxj0Var));
    }

    @Override // p153l.yqw0
    /* JADX INFO: renamed from: i */
    public final void mo138241i(cms0 cms0Var) {
        this.f112668b.mo113233b(this.f112667a, cms0Var);
    }

    @Override // p153l.byv0
    /* JADX INFO: renamed from: k */
    public final void mo107090k(cms0 cms0Var, String str) {
        this.f112668b.mo113243n(this.f112667a, cms0Var, str);
    }

    @Override // p153l.d70
    public final void onAdClicked() {
        this.f112668b.mo113242l(this.f112667a);
    }

    @Override // p153l.d70
    /* JADX INFO: renamed from: u */
    public final void mo96611u() {
        this.f112668b.mo113236e(this.f112667a);
    }

    @Override // p153l.d70
    /* JADX INFO: renamed from: x */
    public final void mo30988x(jtv jtvVar) {
        this.f112668b.mo113244q(this.f112667a, jtvVar);
    }

    @Override // p153l.d70
    /* JADX INFO: renamed from: z */
    public final void mo114576z() {
        this.f112668b.mo113239h(this.f112667a);
    }

    @Override // p153l.d70
    /* JADX INFO: renamed from: A */
    public final void mo96609A() {
    }
}
