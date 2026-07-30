package p149l;

import androidx.annotation.VisibleForTesting;
import com.google.ads.mediation.AbstractAdViewAdapter;

/* JADX INFO: loaded from: classes6.dex */
@VisibleForTesting
public final class ctu0 extends h70 implements hkx0, shw0, vov0 {

    /* JADX INFO: renamed from: a */
    @VisibleForTesting
    public final AbstractAdViewAdapter f82500a;

    /* JADX INFO: renamed from: b */
    @VisibleForTesting
    public final gzx f82501b;

    public ctu0(AbstractAdViewAdapter abstractAdViewAdapter, gzx gzxVar) {
        this.f82500a = abstractAdViewAdapter;
        this.f82501b = gzxVar;
    }

    @Override // p149l.h70
    /* JADX INFO: renamed from: B */
    public final void mo29988B() {
        this.f82501b.mo128925a(this.f82500a);
    }

    @Override // p149l.hkx0
    /* JADX INFO: renamed from: b */
    public final void mo108698b(joj0 joj0Var) {
        this.f82501b.mo128929j(this.f82500a, new d0r0(joj0Var));
    }

    @Override // p149l.shw0
    /* JADX INFO: renamed from: i */
    public final void mo108699i(wcs0 wcs0Var) {
        this.f82501b.mo128926b(this.f82500a, wcs0Var);
    }

    @Override // p149l.vov0
    /* JADX INFO: renamed from: k */
    public final void mo108700k(wcs0 wcs0Var, String str) {
        this.f82501b.mo128931n(this.f82500a, wcs0Var, str);
    }

    @Override // p149l.h70
    public final void onAdClicked() {
        this.f82501b.mo128930l(this.f82500a);
    }

    @Override // p149l.h70
    /* JADX INFO: renamed from: u */
    public final void mo108701u() {
        this.f82501b.mo128927e(this.f82500a);
    }

    @Override // p149l.h70
    /* JADX INFO: renamed from: x */
    public final void mo29990x(irv irvVar) {
        this.f82501b.mo128932q(this.f82500a, irvVar);
    }

    @Override // p149l.h70
    /* JADX INFO: renamed from: z */
    public final void mo108702z() {
        this.f82501b.mo128928h(this.f82500a);
    }

    @Override // p149l.h70
    /* JADX INFO: renamed from: A */
    public final void mo98570A() {
    }
}
