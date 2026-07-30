package com.google.ads.mediation;

import androidx.annotation.VisibleForTesting;
import p153l.a2n;
import p153l.b2n;
import p153l.b8y;
import p153l.d5u0;
import p153l.jtv;

/* JADX INFO: renamed from: com.google.ads.mediation.a */
/* JADX INFO: loaded from: classes6.dex */
@VisibleForTesting
public final class C1751a extends b2n {

    /* JADX INFO: renamed from: a */
    @VisibleForTesting
    public final AbstractAdViewAdapter f6973a;

    /* JADX INFO: renamed from: b */
    @VisibleForTesting
    public final b8y f6974b;

    public C1751a(AbstractAdViewAdapter abstractAdViewAdapter, b8y b8yVar) {
        this.f6973a = abstractAdViewAdapter;
        this.f6974b = b8yVar;
    }

    @Override // p153l.e70
    /* JADX INFO: renamed from: a */
    public final void mo9344a(jtv jtvVar) {
        this.f6974b.mo103045k(this.f6973a, jtvVar);
    }

    @Override // p153l.e70
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ void mo9345b(a2n a2nVar) {
        AbstractAdViewAdapter abstractAdViewAdapter = this.f6973a;
        a2n a2nVar2 = a2nVar;
        abstractAdViewAdapter.mInterstitialAd = a2nVar2;
        a2nVar2.mo95718c(new d5u0(abstractAdViewAdapter, this.f6974b));
        this.f6974b.mo103046m(this.f6973a);
    }
}
