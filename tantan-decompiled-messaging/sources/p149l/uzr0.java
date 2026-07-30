package p149l;

import androidx.annotation.VisibleForTesting;
import com.google.ads.mediation.AbstractAdViewAdapter;

/* JADX INFO: loaded from: classes6.dex */
@VisibleForTesting
public final class uzr0 extends h70 implements fv0, b1r0 {

    /* JADX INFO: renamed from: a */
    @VisibleForTesting
    public final AbstractAdViewAdapter f179029a;

    /* JADX INFO: renamed from: b */
    @VisibleForTesting
    public final bzx f179030b;

    public uzr0(AbstractAdViewAdapter abstractAdViewAdapter, bzx bzxVar) {
        this.f179029a = abstractAdViewAdapter;
        this.f179030b = bzxVar;
    }

    @Override // p149l.h70
    /* JADX INFO: renamed from: A */
    public final void mo98570A() {
        this.f179030b.mo104703f(this.f179029a);
    }

    @Override // p149l.h70
    /* JADX INFO: renamed from: B */
    public final void mo29988B() {
        this.f179030b.mo104704g(this.f179029a);
    }

    @Override // p149l.h70
    public final void onAdClicked() {
        this.f179030b.mo104701c(this.f179029a);
    }

    @Override // p149l.fv0
    /* JADX INFO: renamed from: q */
    public final void mo123249q(String str, String str2) {
        this.f179030b.mo104706r(this.f179029a, str, str2);
    }

    @Override // p149l.h70
    /* JADX INFO: renamed from: u */
    public final void mo108701u() {
        this.f179030b.mo104705i(this.f179029a);
    }

    @Override // p149l.h70
    /* JADX INFO: renamed from: x */
    public final void mo29990x(irv irvVar) {
        this.f179030b.mo104702d(this.f179029a, irvVar);
    }
}
