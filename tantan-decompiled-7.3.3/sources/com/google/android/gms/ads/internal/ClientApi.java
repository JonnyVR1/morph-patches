package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.ads.zzcei;
import java.util.HashMap;
import p153l.ats0;
import p153l.bjr0;
import p153l.dlt0;
import p153l.eat0;
import p153l.els0;
import p153l.grs0;
import p153l.h6z0;
import p153l.h950;
import p153l.i5t0;
import p153l.irs0;
import p153l.j6w0;
import p153l.jas0;
import p153l.jls0;
import p153l.k1t0;
import p153l.kat0;
import p153l.l7t0;
import p153l.m4w0;
import p153l.mot0;
import p153l.myu0;
import p153l.omu0;
import p153l.oys0;
import p153l.p1m;
import p153l.p2w0;
import p153l.qmu0;
import p153l.r1t0;
import p153l.s0w0;
import p153l.sgs0;
import p153l.syy0;
import p153l.tgu0;
import p153l.tkv0;
import p153l.twy0;
import p153l.uws0;
import p153l.vhr0;
import p153l.xer0;
import p153l.xuy0;
import p153l.zsv0;

/* JADX INFO: loaded from: classes6.dex */
public class ClientApi extends kat0 {
    @KeepForSdk
    public ClientApi() {
    }

    @Override // p153l.tbt0
    /* JADX INFO: renamed from: E0 */
    public final eat0 mo12289E0(p1m p1mVar, uws0 uws0Var, int i) {
        return dlt0.m116865g((Context) h950.m134037P2(p1mVar), uws0Var, i).mo116887u();
    }

    @Override // p153l.tbt0
    /* JADX INFO: renamed from: E2 */
    public final oys0 mo12290E2(p1m p1mVar, zzq zzqVar, String str, uws0 uws0Var, int i) {
        Context context = (Context) h950.m134037P2(p1mVar);
        m4w0 m4w0VarMo116891y = dlt0.m116865g(context, uws0Var, i).mo116891y();
        m4w0VarMo116891y.zzc(context);
        m4w0VarMo116891y.mo157064a(zzqVar);
        m4w0VarMo116891y.zzb(str);
        return m4w0VarMo116891y.zzd().zza();
    }

    @Override // p153l.tbt0
    /* JADX INFO: renamed from: E7 */
    public final oys0 mo12291E7(p1m p1mVar, zzq zzqVar, String str, int i) {
        return new xuy0((Context) h950.m134037P2(p1mVar), zzqVar, str, new zzcei(240304000, i, true, false));
    }

    @Override // p153l.tbt0
    /* JADX INFO: renamed from: F1 */
    public final ats0 mo12292F1(p1m p1mVar, String str, uws0 uws0Var, int i) {
        Context context = (Context) h950.m134037P2(p1mVar);
        return new tkv0(dlt0.m116865g(context, uws0Var, i), context, str);
    }

    @Override // p153l.tbt0
    /* JADX INFO: renamed from: Q2 */
    public final oys0 mo12293Q2(p1m p1mVar, zzq zzqVar, String str, uws0 uws0Var, int i) {
        Context context = (Context) h950.m134037P2(p1mVar);
        p2w0 p2w0VarMo116890x = dlt0.m116865g(context, uws0Var, i).mo116890x();
        p2w0VarMo116890x.zzc(context);
        p2w0VarMo116890x.mo131184a(zzqVar);
        p2w0VarMo116890x.zzb(str);
        return p2w0VarMo116890x.zzd().zza();
    }

    @Override // p153l.tbt0
    /* JADX INFO: renamed from: S5 */
    public final jls0 mo12294S5(p1m p1mVar, p1m p1mVar2, p1m p1mVar3) {
        return new omu0((View) h950.m134037P2(p1mVar), (HashMap) h950.m134037P2(p1mVar2), (HashMap) h950.m134037P2(p1mVar3));
    }

    @Override // p153l.tbt0
    /* JADX INFO: renamed from: W0 */
    public final i5t0 mo12295W0(p1m p1mVar, uws0 uws0Var, int i) {
        Context context = (Context) h950.m134037P2(p1mVar);
        j6w0 j6w0VarMo116892z = dlt0.m116865g(context, uws0Var, i).mo116892z();
        j6w0VarMo116892z.mo143723a(context);
        return j6w0VarMo116892z.zzc().zzb();
    }

    @Override // p153l.tbt0
    /* JADX INFO: renamed from: W2 */
    public final l7t0 mo12296W2(p1m p1mVar, String str, uws0 uws0Var, int i) {
        Context context = (Context) h950.m134037P2(p1mVar);
        j6w0 j6w0VarMo116892z = dlt0.m116865g(context, uws0Var, i).mo116892z();
        j6w0VarMo116892z.mo143723a(context);
        j6w0VarMo116892z.zza(str);
        return j6w0VarMo116892z.zzc().zza();
    }

    @Override // p153l.tbt0
    /* JADX INFO: renamed from: Y0 */
    public final irs0 mo12297Y0(p1m p1mVar, uws0 uws0Var, int i, grs0 grs0Var) {
        Context context = (Context) h950.m134037P2(p1mVar);
        myu0 myu0VarMo116881o = dlt0.m116865g(context, uws0Var, i).mo116881o();
        myu0VarMo116881o.mo111830a(context);
        myu0VarMo116881o.mo111831b(grs0Var);
        return myu0VarMo116881o.zzc().zzd();
    }

    @Override // p153l.tbt0
    /* JADX INFO: renamed from: b1 */
    public final els0 mo12298b1(p1m p1mVar, p1m p1mVar2) {
        return new qmu0((FrameLayout) h950.m134037P2(p1mVar), (FrameLayout) h950.m134037P2(p1mVar2), 240304000);
    }

    @Override // p153l.tbt0
    /* JADX INFO: renamed from: b4 */
    public final oys0 mo12299b4(p1m p1mVar, zzq zzqVar, String str, uws0 uws0Var, int i) {
        Context context = (Context) h950.m134037P2(p1mVar);
        s0w0 s0w0VarMo116889w = dlt0.m116865g(context, uws0Var, i).mo116889w();
        s0w0VarMo116889w.zza(str);
        s0w0VarMo116889w.mo183984a(context);
        return i >= ((Integer) jas0.m144075c().m176505a(sgs0.f168324h5)).intValue() ? s0w0VarMo116889w.zzc().zza() : new zsv0();
    }

    @Override // p153l.tbt0
    /* JADX INFO: renamed from: g0 */
    public final r1t0 mo12300g0(p1m p1mVar) {
        Activity activity = (Activity) h950.m134037P2(p1mVar);
        AdOverlayInfoParcel adOverlayInfoParcelM12313g = AdOverlayInfoParcel.m12313g(activity.getIntent());
        if (adOverlayInfoParcelM12313g == null) {
            return new syy0(activity);
        }
        int i = adOverlayInfoParcelM12313g.zzk;
        if (i == 1) {
            return new twy0(activity);
        }
        if (i == 2) {
            return new vhr0(activity);
        }
        if (i == 3) {
            return new bjr0(activity);
        }
        if (i != 4) {
            return i != 5 ? new syy0(activity) : new xer0(activity);
        }
        return new h6z0(activity, adOverlayInfoParcelM12313g);
    }

    @Override // p153l.tbt0
    /* JADX INFO: renamed from: o6 */
    public final tgu0 mo12301o6(p1m p1mVar, uws0 uws0Var, int i) {
        return dlt0.m116865g((Context) h950.m134037P2(p1mVar), uws0Var, i).mo116883q();
    }

    @Override // p153l.tbt0
    /* JADX INFO: renamed from: q0 */
    public final mot0 mo12302q0(p1m p1mVar, int i) {
        return dlt0.m116865g((Context) h950.m134037P2(p1mVar), null, i).mo116874h();
    }

    @Override // p153l.tbt0
    /* JADX INFO: renamed from: t1 */
    public final k1t0 mo12303t1(p1m p1mVar, uws0 uws0Var, int i) {
        return dlt0.m116865g((Context) h950.m134037P2(p1mVar), uws0Var, i).mo116884r();
    }
}
