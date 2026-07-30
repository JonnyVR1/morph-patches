package p149l;

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
public final class lbv0 extends bos0 {

    /* JADX INFO: renamed from: a */
    public final Context f127342a;

    /* JADX INFO: renamed from: b */
    public final r8s0 f127343b;

    /* JADX INFO: renamed from: c */
    public final iyv0 f127344c;

    /* JADX INFO: renamed from: d */
    public final ont0 f127345d;

    /* JADX INFO: renamed from: e */
    public final ViewGroup f127346e;

    /* JADX INFO: renamed from: f */
    public final rnu0 f127347f;

    public lbv0(Context context, @Nullable r8s0 r8s0Var, iyv0 iyv0Var, ont0 ont0Var, rnu0 rnu0Var) {
        this.f127342a = context;
        this.f127343b = r8s0Var;
        this.f127344c = iyv0Var;
        this.f127345d = ont0Var;
        this.f127347f = rnu0Var;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.removeAllViews();
        View viewMo117678j = ont0Var.mo117678j();
        vny0.m199080r();
        frameLayout.addView(viewMo117678j, new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setMinimumHeight(zzg().zzc);
        frameLayout.setMinimumWidth(zzg().zzf);
        this.f127346e = frameLayout;
    }

    @Override // p149l.ips0
    /* JADX INFO: renamed from: C5 */
    public final void mo137575C5(n5s0 n5s0Var) throws RemoteException {
        x2t0.m206868f("setAdClickListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // p149l.ips0
    /* JADX INFO: renamed from: G */
    public final void mo137577G() throws RemoteException {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        this.f127345d.m117799e().m139011z0(null);
    }

    @Override // p149l.ips0
    /* JADX INFO: renamed from: G6 */
    public final void mo137578G6(cus0 cus0Var) throws RemoteException {
        x2t0.m206868f("setAdMetadataListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // p149l.ips0
    /* JADX INFO: renamed from: H3 */
    public final void mo137579H3(s3u0 s3u0Var) {
        if (!((Boolean) d1s0.m109677c().m144697a(m7s0.f132143Ya)).booleanValue()) {
            x2t0.m206868f("setOnPaidEventListener is not supported in Ad Manager AdView returned by AdLoader.");
            return;
        }
        qcv0 qcv0Var = this.f127344c.f115493c;
        if (qcv0Var != null) {
            try {
                if (!s3u0Var.zzf()) {
                    this.f127347f.m180209e();
                }
            } catch (RemoteException e) {
                x2t0.m206865c("Error in making CSI ping for reporting paid event callback", e);
            }
            qcv0Var.m173930O(s3u0Var);
        }
    }

    @Override // p149l.ips0
    /* JADX INFO: renamed from: H7 */
    public final void mo137580H7(s8s0 s8s0Var) throws RemoteException {
        x2t0.m206868f("setOnCustomRenderedAdLoadedListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // p149l.ips0
    /* JADX INFO: renamed from: J */
    public final void mo137583J() throws RemoteException {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        this.f127345d.m117799e().m139009A0(null);
    }

    @Override // p149l.ips0
    /* JADX INFO: renamed from: R3 */
    public final void mo137586R3(zzq zzqVar) throws RemoteException {
        Preconditions.checkMainThread("setAdSize must be called on the main UI thread.");
        ont0 ont0Var = this.f127345d;
        if (ont0Var != null) {
            ont0Var.mo117683o(this.f127346e, zzqVar);
        }
    }

    @Override // p149l.ips0
    /* JADX INFO: renamed from: e2 */
    public final void mo137590e2(zzfk zzfkVar) throws RemoteException {
        x2t0.m206868f("setVideoOptions is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // p149l.ips0
    /* JADX INFO: renamed from: f2 */
    public final boolean mo137591f2(zzl zzlVar) throws RemoteException {
        x2t0.m206868f("loadAd is not supported for an Ad Manager AdView returned from AdLoader.");
        return false;
    }

    @Override // p149l.ips0
    /* JADX INFO: renamed from: f7 */
    public final void mo137592f7(t3t0 t3t0Var) throws RemoteException {
        x2t0.m206868f("setCorrelationIdProvider is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // p149l.ips0
    /* JADX INFO: renamed from: g */
    public final void mo137593g() throws RemoteException {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        this.f127345d.mo106177b();
    }

    @Override // p149l.ips0
    /* JADX INFO: renamed from: l1 */
    public final void mo137595l1(sys0 sys0Var) throws RemoteException {
        qcv0 qcv0Var = this.f127344c.f115493c;
        if (qcv0Var != null) {
            qcv0Var.m173931P(sys0Var);
        }
    }

    @Override // p149l.ips0
    /* JADX INFO: renamed from: n0 */
    public final boolean mo137596n0() throws RemoteException {
        return false;
    }

    @Override // p149l.ips0
    /* JADX INFO: renamed from: p0 */
    public final boolean mo137597p0() throws RemoteException {
        return false;
    }

    @Override // p149l.ips0
    /* JADX INFO: renamed from: s4 */
    public final void mo137599s4(boolean z) throws RemoteException {
        x2t0.m206868f("setManualImpressionsEnabled is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // p149l.ips0
    /* JADX INFO: renamed from: t */
    public final void mo137600t() throws RemoteException {
        this.f127345d.mo117682n();
    }

    @Override // p149l.ips0
    /* JADX INFO: renamed from: x2 */
    public final void mo137603x2(r8s0 r8s0Var) throws RemoteException {
        x2t0.m206868f("setAdListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // p149l.ips0
    public final Bundle zzd() throws RemoteException {
        x2t0.m206868f("getAdMetadata is not supported in Ad Manager AdView returned by AdLoader.");
        return new Bundle();
    }

    @Override // p149l.ips0
    public final zzq zzg() {
        Preconditions.checkMainThread("getAdSize must be called on the main UI thread.");
        return oyv0.m166723a(this.f127342a, Collections.singletonList(this.f127345d.mo117680l()));
    }

    @Override // p149l.ips0
    public final r8s0 zzi() throws RemoteException {
        return this.f127343b;
    }

    @Override // p149l.ips0
    public final sys0 zzj() throws RemoteException {
        return this.f127344c.f115504n;
    }

    @Override // p149l.ips0
    public final ncu0 zzk() {
        return this.f127345d.m117798d();
    }

    @Override // p149l.ips0
    public final fgu0 zzl() throws RemoteException {
        return this.f127345d.mo117679k();
    }

    @Override // p149l.ips0
    public final uyl zzn() throws RemoteException {
        return s050.m181848Y2(this.f127346e);
    }

    @Override // p149l.ips0
    public final String zzr() throws RemoteException {
        return this.f127344c.f115496f;
    }

    @Override // p149l.ips0
    @Nullable
    public final String zzs() throws RemoteException {
        if (this.f127345d.m117798d() != null) {
            return this.f127345d.m117798d().zzg();
        }
        return null;
    }

    @Override // p149l.ips0
    @Nullable
    public final String zzt() throws RemoteException {
        if (this.f127345d.m117798d() != null) {
            return this.f127345d.m117798d().zzg();
        }
        return null;
    }

    @Override // p149l.ips0
    /* JADX INFO: renamed from: S4 */
    public final void mo137587S4() throws RemoteException {
    }

    @Override // p149l.ips0
    /* JADX INFO: renamed from: A5 */
    public final void mo137574A5(q1s0 q1s0Var) throws RemoteException {
    }

    @Override // p149l.ips0
    /* JADX INFO: renamed from: I1 */
    public final void mo137581I1(zzw zzwVar) throws RemoteException {
    }

    @Override // p149l.ips0
    /* JADX INFO: renamed from: I3 */
    public final void mo137582I3(s7t0 s7t0Var) {
    }

    @Override // p149l.ips0
    /* JADX INFO: renamed from: L0 */
    public final void mo137584L0(zzdu zzduVar) throws RemoteException {
    }

    @Override // p149l.ips0
    /* JADX INFO: renamed from: P7 */
    public final void mo137585P7(uyl uylVar) {
    }

    @Override // p149l.ips0
    /* JADX INFO: renamed from: X6 */
    public final void mo137588X6(String str) throws RemoteException {
    }

    @Override // p149l.ips0
    /* JADX INFO: renamed from: Y3 */
    public final void mo137589Y3(boolean z) throws RemoteException {
    }

    @Override // p149l.ips0
    /* JADX INFO: renamed from: i8 */
    public final void mo137594i8(uxs0 uxs0Var) throws RemoteException {
    }

    @Override // p149l.ips0
    /* JADX INFO: renamed from: r6 */
    public final void mo137598r6(String str) throws RemoteException {
    }

    @Override // p149l.ips0
    /* JADX INFO: renamed from: v3 */
    public final void mo137601v3(dts0 dts0Var) throws RemoteException {
    }

    @Override // p149l.ips0
    /* JADX INFO: renamed from: E6 */
    public final void mo137576E6(gts0 gts0Var, String str) throws RemoteException {
    }

    @Override // p149l.ips0
    /* JADX INFO: renamed from: w7 */
    public final void mo137602w7(zzl zzlVar, ocs0 ocs0Var) {
    }
}
