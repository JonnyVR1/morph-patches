package p153l;

import android.content.Context;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.internal.ads.zzbjb;
import com.google.android.gms.internal.ads.zzbpp;

/* JADX INFO: loaded from: classes6.dex */
public final class tkv0 extends bss0 {

    /* JADX INFO: renamed from: a */
    public final Context f174751a;

    /* JADX INFO: renamed from: b */
    public final dlt0 f174752b;

    /* JADX INFO: renamed from: c */
    @VisibleForTesting
    public final m7w0 f174753c;

    /* JADX INFO: renamed from: d */
    @VisibleForTesting
    public final dmu0 f174754d;

    /* JADX INFO: renamed from: e */
    public xhs0 f174755e;

    public tkv0(dlt0 dlt0Var, Context context, String str) {
        m7w0 m7w0Var = new m7w0();
        this.f174753c = m7w0Var;
        this.f174754d = new dmu0();
        this.f174752b = dlt0Var;
        m7w0Var.m157315J(str);
        this.f174751a = context;
    }

    @Override // p153l.ats0
    /* JADX INFO: renamed from: B2 */
    public final void mo100261B2(String str, oms0 oms0Var, @Nullable lms0 lms0Var) {
        this.f174754d.m117025c(str, oms0Var, lms0Var);
    }

    @Override // p153l.ats0
    /* JADX INFO: renamed from: T3 */
    public final void mo100262T3(xhs0 xhs0Var) {
        this.f174755e = xhs0Var;
    }

    @Override // p153l.ats0
    /* JADX INFO: renamed from: W5 */
    public final void mo100263W5(sms0 sms0Var, zzq zzqVar) {
        this.f174754d.m117027e(sms0Var);
        this.f174753c.m157314I(zzqVar);
    }

    @Override // p153l.ats0
    /* JADX INFO: renamed from: X0 */
    public final void mo100264X0(zzbjb zzbjbVar) {
        this.f174753c.m157323a(zzbjbVar);
    }

    @Override // p153l.ats0
    /* JADX INFO: renamed from: Z5 */
    public final void mo100265Z5(xss0 xss0Var) {
        this.f174754d.m117026d(xss0Var);
    }

    @Override // p153l.ats0
    /* JADX INFO: renamed from: a8 */
    public final void mo100266a8(zct0 zct0Var) {
        this.f174753c.m157332q(zct0Var);
    }

    @Override // p153l.ats0
    /* JADX INFO: renamed from: h4 */
    public final void mo100267h4(fns0 fns0Var) {
        this.f174754d.m117028f(fns0Var);
    }

    @Override // p153l.ats0
    /* JADX INFO: renamed from: k6 */
    public final void mo100268k6(fms0 fms0Var) {
        this.f174754d.m117023a(fms0Var);
    }

    @Override // p153l.ats0
    /* JADX INFO: renamed from: l7 */
    public final void mo100269l7(ims0 ims0Var) {
        this.f174754d.m117024b(ims0Var);
    }

    @Override // p153l.ats0
    /* JADX INFO: renamed from: o4 */
    public final void mo100270o4(PublisherAdViewOptions publisherAdViewOptions) {
        this.f174753c.m157326d(publisherAdViewOptions);
    }

    @Override // p153l.ats0
    /* JADX INFO: renamed from: q4 */
    public final void mo100271q4(AdManagerAdViewOptions adManagerAdViewOptions) {
        this.f174753c.m157313H(adManagerAdViewOptions);
    }

    @Override // p153l.ats0
    /* JADX INFO: renamed from: t2 */
    public final void mo100272t2(zzbpp zzbppVar) {
        this.f174753c.m157318M(zzbppVar);
    }

    @Override // p153l.ats0
    public final lps0 zze() {
        fmu0 fmu0VarM117029g = this.f174754d.m117029g();
        this.f174753c.m157324b(fmu0VarM117029g.m126333i());
        this.f174753c.m157325c(fmu0VarM117029g.m126332h());
        m7w0 m7w0Var = this.f174753c;
        if (m7w0Var.m157334x() == null) {
            m7w0Var.m157314I(zzq.m12307H());
        }
        return new ukv0(this.f174751a, this.f174752b, this.f174753c, fmu0VarM117029g, this.f174755e);
    }
}
