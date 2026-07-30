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
import p149l.ais0;
import p149l.bxy0;
import p149l.cis0;
import p149l.cws0;
import p149l.d1s0;
import p149l.dcs0;
import p149l.dxv0;
import p149l.e1t0;
import p149l.ess0;
import p149l.fys0;
import p149l.gft0;
import p149l.gpu0;
import p149l.gvv0;
import p149l.idu0;
import p149l.ips0;
import p149l.jtv0;
import p149l.kdu0;
import p149l.lss0;
import p149l.m7s0;
import p149l.mpy0;
import p149l.mrv0;
import p149l.n7u0;
import p149l.nbv0;
import p149l.nny0;
import p149l.ons0;
import p149l.p8r0;
import p149l.r5r0;
import p149l.rly0;
import p149l.s050;
import p149l.tjv0;
import p149l.ujs0;
import p149l.uyl;
import p149l.v9r0;
import p149l.xbt0;
import p149l.y0t0;
import p149l.ybs0;

/* JADX INFO: loaded from: classes6.dex */
public class ClientApi extends e1t0 {
    @KeepForSdk
    public ClientApi() {
    }

    @Override // p149l.n2t0
    /* JADX INFO: renamed from: E0 */
    public final y0t0 mo12235E0(uyl uylVar, ons0 ons0Var, int i) {
        return xbt0.m207736g((Context) s050.m181847P2(uylVar), ons0Var, i).mo135810u();
    }

    @Override // p149l.n2t0
    /* JADX INFO: renamed from: E2 */
    public final ips0 mo12236E2(uyl uylVar, zzq zzqVar, String str, ons0 ons0Var, int i) {
        Context context = (Context) s050.m181847P2(uylVar);
        gvv0 gvv0VarMo135814y = xbt0.m207736g(context, ons0Var, i).mo135814y();
        gvv0VarMo135814y.zzc(context);
        gvv0VarMo135814y.mo126002a(zzqVar);
        gvv0VarMo135814y.zzb(str);
        return gvv0VarMo135814y.zzd().zza();
    }

    @Override // p149l.n2t0
    /* JADX INFO: renamed from: E7 */
    public final ips0 mo12237E7(uyl uylVar, zzq zzqVar, String str, int i) {
        return new rly0((Context) s050.m181847P2(uylVar), zzqVar, str, new zzcei(240304000, i, true, false));
    }

    @Override // p149l.n2t0
    /* JADX INFO: renamed from: F1 */
    public final ujs0 mo12238F1(uyl uylVar, String str, ons0 ons0Var, int i) {
        Context context = (Context) s050.m181847P2(uylVar);
        return new nbv0(xbt0.m207736g(context, ons0Var, i), context, str);
    }

    @Override // p149l.n2t0
    /* JADX INFO: renamed from: Q2 */
    public final ips0 mo12239Q2(uyl uylVar, zzq zzqVar, String str, ons0 ons0Var, int i) {
        Context context = (Context) s050.m181847P2(uylVar);
        jtv0 jtv0VarMo135813x = xbt0.m207736g(context, ons0Var, i).mo135813x();
        jtv0VarMo135813x.zzc(context);
        jtv0VarMo135813x.mo96272a(zzqVar);
        jtv0VarMo135813x.zzb(str);
        return jtv0VarMo135813x.zzd().zza();
    }

    @Override // p149l.n2t0
    /* JADX INFO: renamed from: S5 */
    public final dcs0 mo12240S5(uyl uylVar, uyl uylVar2, uyl uylVar3) {
        return new idu0((View) s050.m181847P2(uylVar), (HashMap) s050.m181847P2(uylVar2), (HashMap) s050.m181847P2(uylVar3));
    }

    @Override // p149l.n2t0
    /* JADX INFO: renamed from: W0 */
    public final cws0 mo12241W0(uyl uylVar, ons0 ons0Var, int i) {
        Context context = (Context) s050.m181847P2(uylVar);
        dxv0 dxv0VarMo135815z = xbt0.m207736g(context, ons0Var, i).mo135815z();
        dxv0VarMo135815z.mo114029a(context);
        return dxv0VarMo135815z.zzc().zzb();
    }

    @Override // p149l.n2t0
    /* JADX INFO: renamed from: W2 */
    public final fys0 mo12242W2(uyl uylVar, String str, ons0 ons0Var, int i) {
        Context context = (Context) s050.m181847P2(uylVar);
        dxv0 dxv0VarMo135815z = xbt0.m207736g(context, ons0Var, i).mo135815z();
        dxv0VarMo135815z.mo114029a(context);
        dxv0VarMo135815z.zza(str);
        return dxv0VarMo135815z.zzc().zza();
    }

    @Override // p149l.n2t0
    /* JADX INFO: renamed from: Y0 */
    public final cis0 mo12243Y0(uyl uylVar, ons0 ons0Var, int i, ais0 ais0Var) {
        Context context = (Context) s050.m181847P2(uylVar);
        gpu0 gpu0VarMo135804o = xbt0.m207736g(context, ons0Var, i).mo135804o();
        gpu0VarMo135804o.mo127483a(context);
        gpu0VarMo135804o.mo127484b(ais0Var);
        return gpu0VarMo135804o.zzc().zzd();
    }

    @Override // p149l.n2t0
    /* JADX INFO: renamed from: b1 */
    public final ybs0 mo12244b1(uyl uylVar, uyl uylVar2) {
        return new kdu0((FrameLayout) s050.m181847P2(uylVar), (FrameLayout) s050.m181847P2(uylVar2), 240304000);
    }

    @Override // p149l.n2t0
    /* JADX INFO: renamed from: b4 */
    public final ips0 mo12245b4(uyl uylVar, zzq zzqVar, String str, ons0 ons0Var, int i) {
        Context context = (Context) s050.m181847P2(uylVar);
        mrv0 mrv0VarMo135812w = xbt0.m207736g(context, ons0Var, i).mo135812w();
        mrv0VarMo135812w.zza(str);
        mrv0VarMo135812w.mo156087a(context);
        return i >= ((Integer) d1s0.m109677c().m144697a(m7s0.f132253h5)).intValue() ? mrv0VarMo135812w.zzc().zza() : new tjv0();
    }

    @Override // p149l.n2t0
    /* JADX INFO: renamed from: g0 */
    public final lss0 mo12246g0(uyl uylVar) {
        Activity activity = (Activity) s050.m181847P2(uylVar);
        AdOverlayInfoParcel adOverlayInfoParcelM12259g = AdOverlayInfoParcel.m12259g(activity.getIntent());
        if (adOverlayInfoParcelM12259g == null) {
            return new mpy0(activity);
        }
        int i = adOverlayInfoParcelM12259g.zzk;
        if (i == 1) {
            return new nny0(activity);
        }
        if (i == 2) {
            return new p8r0(activity);
        }
        if (i == 3) {
            return new v9r0(activity);
        }
        if (i != 4) {
            return i != 5 ? new mpy0(activity) : new r5r0(activity);
        }
        return new bxy0(activity, adOverlayInfoParcelM12259g);
    }

    @Override // p149l.n2t0
    /* JADX INFO: renamed from: o6 */
    public final n7u0 mo12247o6(uyl uylVar, ons0 ons0Var, int i) {
        return xbt0.m207736g((Context) s050.m181847P2(uylVar), ons0Var, i).mo135806q();
    }

    @Override // p149l.n2t0
    /* JADX INFO: renamed from: q0 */
    public final gft0 mo12248q0(uyl uylVar, int i) {
        return xbt0.m207736g((Context) s050.m181847P2(uylVar), null, i).mo135797h();
    }

    @Override // p149l.n2t0
    /* JADX INFO: renamed from: t1 */
    public final ess0 mo12249t1(uyl uylVar, ons0 ons0Var, int i) {
        return xbt0.m207736g((Context) s050.m181847P2(uylVar), ons0Var, i).mo135807r();
    }
}
