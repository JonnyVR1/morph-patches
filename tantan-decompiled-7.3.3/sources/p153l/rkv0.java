package p153l;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzdu;
import com.google.android.gms.ads.internal.client.zzfk;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Collections;

/* JADX INFO: loaded from: classes6.dex */
public final class rkv0 extends hxs0 {

    /* JADX INFO: renamed from: a */
    public final Context f163645a;

    /* JADX INFO: renamed from: b */
    public final xhs0 f163646b;

    /* JADX INFO: renamed from: c */
    public final o7w0 f163647c;

    /* JADX INFO: renamed from: d */
    public final uwt0 f163648d;

    /* JADX INFO: renamed from: e */
    public final ViewGroup f163649e;

    /* JADX INFO: renamed from: f */
    public final xwu0 f163650f;

    public rkv0(Context context, @Nullable xhs0 xhs0Var, o7w0 o7w0Var, uwt0 uwt0Var, xwu0 xwu0Var) {
        this.f163645a = context;
        this.f163646b = xhs0Var;
        this.f163647c = o7w0Var;
        this.f163648d = uwt0Var;
        this.f163650f = xwu0Var;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.removeAllViews();
        View viewMo152134j = uwt0Var.mo152134j();
        bxy0.m106934r();
        frameLayout.addView(viewMo152134j, new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setMinimumHeight(zzg().zzc);
        frameLayout.setMinimumWidth(zzg().zzf);
        this.f163649e = frameLayout;
    }

    @Override // p153l.oys0
    /* JADX INFO: renamed from: C5 */
    public final void mo113743C5(tes0 tes0Var) throws RemoteException {
        dct0.m115297f("setAdClickListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // p153l.oys0
    /* JADX INFO: renamed from: G */
    public final void mo113745G() throws RemoteException {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        this.f163648d.m152229e().m166368z0(null);
    }

    @Override // p153l.oys0
    /* JADX INFO: renamed from: G6 */
    public final void mo113746G6(i3t0 i3t0Var) throws RemoteException {
        dct0.m115297f("setAdMetadataListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // p153l.oys0
    /* JADX INFO: renamed from: H3 */
    public final void mo113747H3(ycu0 ycu0Var) {
        if (!((Boolean) jas0.m144075c().m176505a(sgs0.f168214Ya)).booleanValue()) {
            dct0.m115297f("setOnPaidEventListener is not supported in Ad Manager AdView returned by AdLoader.");
            return;
        }
        wlv0 wlv0Var = this.f163647c.f145317c;
        if (wlv0Var != null) {
            try {
                if (!ycu0Var.zzf()) {
                    this.f163650f.m213444e();
                }
            } catch (RemoteException e) {
                dct0.m115294c("Error in making CSI ping for reporting paid event callback", e);
            }
            wlv0Var.m207077O(ycu0Var);
        }
    }

    @Override // p153l.oys0
    /* JADX INFO: renamed from: H7 */
    public final void mo113748H7(yhs0 yhs0Var) throws RemoteException {
        dct0.m115297f("setOnCustomRenderedAdLoadedListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // p153l.oys0
    /* JADX INFO: renamed from: J */
    public final void mo113751J() throws RemoteException {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        this.f163648d.m152229e().m166366A0(null);
    }

    @Override // p153l.oys0
    /* JADX INFO: renamed from: R3 */
    public final void mo113757R3(zzq zzqVar) throws RemoteException {
        Preconditions.checkMainThread("setAdSize must be called on the main UI thread.");
        uwt0 uwt0Var = this.f163648d;
        if (uwt0Var != null) {
            uwt0Var.mo152139o(this.f163649e, zzqVar);
        }
    }

    @Override // p153l.oys0
    /* JADX INFO: renamed from: e2 */
    public final void mo113761e2(zzfk zzfkVar) throws RemoteException {
        dct0.m115297f("setVideoOptions is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // p153l.oys0
    /* JADX INFO: renamed from: f2 */
    public final boolean mo113762f2(zzl zzlVar) throws RemoteException {
        dct0.m115297f("loadAd is not supported for an Ad Manager AdView returned from AdLoader.");
        return false;
    }

    @Override // p153l.oys0
    /* JADX INFO: renamed from: f7 */
    public final void mo113763f7(zct0 zct0Var) throws RemoteException {
        dct0.m115297f("setCorrelationIdProvider is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // p153l.oys0
    /* JADX INFO: renamed from: g */
    public final void mo113764g() throws RemoteException {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        this.f163648d.mo127848b();
    }

    @Override // p153l.oys0
    /* JADX INFO: renamed from: l1 */
    public final void mo113767l1(y7t0 y7t0Var) throws RemoteException {
        wlv0 wlv0Var = this.f163647c.f145317c;
        if (wlv0Var != null) {
            wlv0Var.m207078P(y7t0Var);
        }
    }

    @Override // p153l.oys0
    /* JADX INFO: renamed from: n0 */
    public final boolean mo113770n0() throws RemoteException {
        return false;
    }

    @Override // p153l.oys0
    /* JADX INFO: renamed from: p0 */
    public final boolean mo113771p0() throws RemoteException {
        return false;
    }

    @Override // p153l.oys0
    /* JADX INFO: renamed from: s4 */
    public final void mo113774s4(boolean z) throws RemoteException {
        dct0.m115297f("setManualImpressionsEnabled is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // p153l.oys0
    /* JADX INFO: renamed from: t */
    public final void mo113775t() throws RemoteException {
        this.f163648d.mo152138n();
    }

    @Override // p153l.oys0
    /* JADX INFO: renamed from: x2 */
    public final void mo113778x2(xhs0 xhs0Var) throws RemoteException {
        dct0.m115297f("setAdListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // p153l.oys0
    public final Bundle zzd() throws RemoteException {
        dct0.m115297f("getAdMetadata is not supported in Ad Manager AdView returned by AdLoader.");
        return new Bundle();
    }

    @Override // p153l.oys0
    public final zzq zzg() {
        Preconditions.checkMainThread("getAdSize must be called on the main UI thread.");
        return u7w0.m194892a(this.f163645a, Collections.singletonList(this.f163648d.mo152136l()));
    }

    @Override // p153l.oys0
    public final xhs0 zzi() throws RemoteException {
        return this.f163646b;
    }

    @Override // p153l.oys0
    public final y7t0 zzj() throws RemoteException {
        return this.f163647c.f145328n;
    }

    @Override // p153l.oys0
    public final tlu0 zzk() {
        return this.f163648d.m152228d();
    }

    @Override // p153l.oys0
    public final lpu0 zzl() throws RemoteException {
        return this.f163648d.mo152135k();
    }

    @Override // p153l.oys0
    public final p1m zzn() throws RemoteException {
        return h950.m134038Y2(this.f163649e);
    }

    @Override // p153l.oys0
    public final String zzr() throws RemoteException {
        return this.f163647c.f145320f;
    }

    @Override // p153l.oys0
    @Nullable
    public final String zzs() throws RemoteException {
        if (this.f163648d.m152228d() != null) {
            return this.f163648d.m152228d().zzg();
        }
        return null;
    }

    @Override // p153l.oys0
    @Nullable
    public final String zzt() throws RemoteException {
        if (this.f163648d.m152228d() != null) {
            return this.f163648d.m152228d().zzg();
        }
        return null;
    }

    @Override // p153l.oys0
    /* JADX INFO: renamed from: S4 */
    public final void mo113758S4() throws RemoteException {
    }

    @Override // p153l.oys0
    /* JADX INFO: renamed from: A5 */
    public final void mo113742A5(was0 was0Var) throws RemoteException {
    }

    @Override // p153l.oys0
    /* JADX INFO: renamed from: I1 */
    public final void mo113749I1(zzw zzwVar) throws RemoteException {
    }

    @Override // p153l.oys0
    /* JADX INFO: renamed from: I3 */
    public final void mo113750I3(ygt0 ygt0Var) {
    }

    @Override // p153l.oys0
    /* JADX INFO: renamed from: L0 */
    public final void mo113752L0(zzdu zzduVar) throws RemoteException {
    }

    @Override // p153l.oys0
    /* JADX INFO: renamed from: P7 */
    public final void mo113756P7(p1m p1mVar) {
    }

    @Override // p153l.oys0
    /* JADX INFO: renamed from: X6 */
    public final void mo113759X6(String str) throws RemoteException {
    }

    @Override // p153l.oys0
    /* JADX INFO: renamed from: Y3 */
    public final void mo113760Y3(boolean z) throws RemoteException {
    }

    @Override // p153l.oys0
    /* JADX INFO: renamed from: i8 */
    public final void mo113766i8(a7t0 a7t0Var) throws RemoteException {
    }

    @Override // p153l.oys0
    /* JADX INFO: renamed from: r6 */
    public final void mo113772r6(String str) throws RemoteException {
    }

    @Override // p153l.oys0
    /* JADX INFO: renamed from: v3 */
    public final void mo113776v3(j2t0 j2t0Var) throws RemoteException {
    }

    @Override // p153l.oys0
    /* JADX INFO: renamed from: E6 */
    public final void mo113744E6(m2t0 m2t0Var, String str) throws RemoteException {
    }

    @Override // p153l.oys0
    /* JADX INFO: renamed from: w7 */
    public final void mo113777w7(zzl zzlVar, uls0 uls0Var) {
    }
}
