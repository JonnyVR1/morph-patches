package p149l;

import android.content.Context;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.internal.ads.zzbjb;
import com.google.android.gms.internal.ads.zzbpp;

/* JADX INFO: loaded from: classes6.dex */
public final class nbv0 extends vis0 {

    /* JADX INFO: renamed from: a */
    public final Context f138070a;

    /* JADX INFO: renamed from: b */
    public final xbt0 f138071b;

    /* JADX INFO: renamed from: c */
    @VisibleForTesting
    public final gyv0 f138072c;

    /* JADX INFO: renamed from: d */
    @VisibleForTesting
    public final xcu0 f138073d;

    /* JADX INFO: renamed from: e */
    public r8s0 f138074e;

    public nbv0(xbt0 xbt0Var, Context context, String str) {
        gyv0 gyv0Var = new gyv0();
        this.f138072c = gyv0Var;
        this.f138073d = new xcu0();
        this.f138071b = xbt0Var;
        gyv0Var.m128758J(str);
        this.f138070a = context;
    }

    @Override // p149l.ujs0
    /* JADX INFO: renamed from: B2 */
    public final void mo131151B2(String str, ids0 ids0Var, @Nullable fds0 fds0Var) {
        this.f138073d.m208160c(str, ids0Var, fds0Var);
    }

    @Override // p149l.ujs0
    /* JADX INFO: renamed from: T3 */
    public final void mo131152T3(r8s0 r8s0Var) {
        this.f138074e = r8s0Var;
    }

    @Override // p149l.ujs0
    /* JADX INFO: renamed from: W5 */
    public final void mo131153W5(mds0 mds0Var, zzq zzqVar) {
        this.f138073d.m208162e(mds0Var);
        this.f138072c.m128757I(zzqVar);
    }

    @Override // p149l.ujs0
    /* JADX INFO: renamed from: X0 */
    public final void mo131154X0(zzbjb zzbjbVar) {
        this.f138072c.m128766a(zzbjbVar);
    }

    @Override // p149l.ujs0
    /* JADX INFO: renamed from: Z5 */
    public final void mo131155Z5(rjs0 rjs0Var) {
        this.f138073d.m208161d(rjs0Var);
    }

    @Override // p149l.ujs0
    /* JADX INFO: renamed from: a8 */
    public final void mo131156a8(t3t0 t3t0Var) {
        this.f138072c.m128775q(t3t0Var);
    }

    @Override // p149l.ujs0
    /* JADX INFO: renamed from: h4 */
    public final void mo131157h4(zds0 zds0Var) {
        this.f138073d.m208163f(zds0Var);
    }

    @Override // p149l.ujs0
    /* JADX INFO: renamed from: k6 */
    public final void mo131158k6(zcs0 zcs0Var) {
        this.f138073d.m208158a(zcs0Var);
    }

    @Override // p149l.ujs0
    /* JADX INFO: renamed from: l7 */
    public final void mo131159l7(cds0 cds0Var) {
        this.f138073d.m208159b(cds0Var);
    }

    @Override // p149l.ujs0
    /* JADX INFO: renamed from: o4 */
    public final void mo131160o4(PublisherAdViewOptions publisherAdViewOptions) {
        this.f138072c.m128769d(publisherAdViewOptions);
    }

    @Override // p149l.ujs0
    /* JADX INFO: renamed from: q4 */
    public final void mo131162q4(AdManagerAdViewOptions adManagerAdViewOptions) {
        this.f138072c.m128756H(adManagerAdViewOptions);
    }

    @Override // p149l.ujs0
    /* JADX INFO: renamed from: t2 */
    public final void mo131163t2(zzbpp zzbppVar) {
        this.f138072c.m128761M(zzbppVar);
    }

    @Override // p149l.ujs0
    public final fgs0 zze() {
        zcu0 zcu0VarM208164g = this.f138073d.m208164g();
        this.f138072c.m128767b(zcu0VarM208164g.m218110i());
        this.f138072c.m128768c(zcu0VarM208164g.m218109h());
        gyv0 gyv0Var = this.f138072c;
        if (gyv0Var.m128777x() == null) {
            gyv0Var.m128757I(zzq.m12253H());
        }
        return new obv0(this.f138070a, this.f138071b, this.f138072c, zcu0VarM208164g, this.f138074e);
    }
}
