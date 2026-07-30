package p153l;

import androidx.annotation.VisibleForTesting;
import com.google.ads.mediation.AbstractAdViewAdapter;

/* JADX INFO: loaded from: classes6.dex */
@VisibleForTesting
public final class a9s0 extends d70 implements mv0, har0 {

    /* JADX INFO: renamed from: a */
    @VisibleForTesting
    public final AbstractAdViewAdapter f69072a;

    /* JADX INFO: renamed from: b */
    @VisibleForTesting
    public final y7y f69073b;

    public a9s0(AbstractAdViewAdapter abstractAdViewAdapter, y7y y7yVar) {
        this.f69072a = abstractAdViewAdapter;
        this.f69073b = y7yVar;
    }

    @Override // p153l.d70
    /* JADX INFO: renamed from: A */
    public final void mo96609A() {
        this.f69073b.mo113237f(this.f69072a);
    }

    @Override // p153l.d70
    /* JADX INFO: renamed from: B */
    public final void mo30986B() {
        this.f69073b.mo113238g(this.f69072a);
    }

    @Override // p153l.d70
    public final void onAdClicked() {
        this.f69073b.mo113234c(this.f69072a);
    }

    @Override // p153l.mv0
    /* JADX INFO: renamed from: q */
    public final void mo96610q(String str, String str2) {
        this.f69073b.mo113245r(this.f69072a, str, str2);
    }

    @Override // p153l.d70
    /* JADX INFO: renamed from: u */
    public final void mo96611u() {
        this.f69073b.mo113240i(this.f69072a);
    }

    @Override // p153l.d70
    /* JADX INFO: renamed from: x */
    public final void mo30988x(jtv jtvVar) {
        this.f69073b.mo113235d(this.f69072a, jtvVar);
    }
}
