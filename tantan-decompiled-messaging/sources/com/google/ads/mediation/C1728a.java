package com.google.ads.mediation;

import androidx.annotation.VisibleForTesting;
import p149l.a0n;
import p149l.b0n;
import p149l.ezx;
import p149l.irv;
import p149l.xvt0;

/* JADX INFO: renamed from: com.google.ads.mediation.a */
/* JADX INFO: loaded from: classes6.dex */
@VisibleForTesting
public final class C1728a extends b0n {

    /* JADX INFO: renamed from: a */
    @VisibleForTesting
    public final AbstractAdViewAdapter f6936a;

    /* JADX INFO: renamed from: b */
    @VisibleForTesting
    public final ezx f6937b;

    public C1728a(AbstractAdViewAdapter abstractAdViewAdapter, ezx ezxVar) {
        this.f6936a = abstractAdViewAdapter;
        this.f6937b = ezxVar;
    }

    @Override // p149l.i70
    /* JADX INFO: renamed from: a */
    public final void mo9290a(irv irvVar) {
        this.f6937b.mo119022k(this.f6936a, irvVar);
    }

    @Override // p149l.i70
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ void mo9291b(a0n a0nVar) {
        AbstractAdViewAdapter abstractAdViewAdapter = this.f6936a;
        a0n a0nVar2 = a0nVar;
        abstractAdViewAdapter.mInterstitialAd = a0nVar2;
        a0nVar2.mo94455c(new xvt0(abstractAdViewAdapter, this.f6937b));
        this.f6937b.mo119023m(this.f6936a);
    }
}
