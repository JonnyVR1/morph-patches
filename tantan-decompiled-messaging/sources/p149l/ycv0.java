package p149l;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzdu;
import com.google.android.gms.ads.internal.client.zzfk;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.ads.internal.util.C2075b;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzcei;

/* JADX INFO: loaded from: classes6.dex */
public final class ycv0 extends bos0 {

    /* JADX INFO: renamed from: a */
    public final zzq f197492a;

    /* JADX INFO: renamed from: b */
    public final Context f197493b;

    /* JADX INFO: renamed from: c */
    public final evv0 f197494c;

    /* JADX INFO: renamed from: d */
    public final String f197495d;

    /* JADX INFO: renamed from: e */
    public final zzcei f197496e;

    /* JADX INFO: renamed from: f */
    public final qcv0 f197497f;

    /* JADX INFO: renamed from: g */
    public final iwv0 f197498g;

    /* JADX INFO: renamed from: h */
    public final ptr0 f197499h;

    /* JADX INFO: renamed from: i */
    public final rnu0 f197500i;

    /* JADX INFO: renamed from: j */
    @Nullable
    public b8u0 f197501j;

    /* JADX INFO: renamed from: k */
    public boolean f197502k = ((Boolean) d1s0.m109677c().m144697a(m7s0.f131881D0)).booleanValue();

    public ycv0(Context context, zzq zzqVar, String str, evv0 evv0Var, qcv0 qcv0Var, iwv0 iwv0Var, zzcei zzceiVar, ptr0 ptr0Var, rnu0 rnu0Var) {
        this.f197492a = zzqVar;
        this.f197495d = str;
        this.f197493b = context;
        this.f197494c = evv0Var;
        this.f197497f = qcv0Var;
        this.f197498g = iwv0Var;
        this.f197496e = zzceiVar;
        this.f197499h = ptr0Var;
        this.f197500i = rnu0Var;
    }

    @Override // p149l.ips0
    /* JADX INFO: renamed from: G */
    public final synchronized void mo137577G() {
        Preconditions.checkMainThread("pause must be called on the main UI thread.");
        b8u0 b8u0Var = this.f197501j;
        if (b8u0Var != null) {
            b8u0Var.m117799e().m139011z0(null);
        }
    }

    @Override // p149l.ips0
    /* JADX INFO: renamed from: G6 */
    public final void mo137578G6(cus0 cus0Var) {
        Preconditions.checkMainThread("setAdMetadataListener must be called on the main UI thread.");
    }

    @Override // p149l.ips0
    /* JADX INFO: renamed from: H3 */
    public final void mo137579H3(s3u0 s3u0Var) {
        Preconditions.checkMainThread("setPaidEventListener must be called on the main UI thread.");
        try {
            if (!s3u0Var.zzf()) {
                this.f197500i.m180209e();
            }
        } catch (RemoteException e) {
            x2t0.m206865c("Error in making CSI ping for reporting paid event callback", e);
        }
        this.f197497f.m173930O(s3u0Var);
    }

    @Override // p149l.ips0
    /* JADX INFO: renamed from: H7 */
    public final synchronized void mo137580H7(s8s0 s8s0Var) {
        Preconditions.checkMainThread("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.f197494c.m118333h(s8s0Var);
    }

    @Override // p149l.ips0
    /* JADX INFO: renamed from: I3 */
    public final void mo137582I3(s7t0 s7t0Var) {
        this.f197497f.m173932R(s7t0Var);
    }

    @Override // p149l.ips0
    /* JADX INFO: renamed from: J */
    public final synchronized void mo137583J() {
        Preconditions.checkMainThread("resume must be called on the main UI thread.");
        b8u0 b8u0Var = this.f197501j;
        if (b8u0Var != null) {
            b8u0Var.m117799e().m139009A0(null);
        }
    }

    @Override // p149l.ips0
    /* JADX INFO: renamed from: P7 */
    public final synchronized void mo137585P7(uyl uylVar) {
        if (this.f197501j == null) {
            x2t0.m206869g("Interstitial can not be shown before loaded.");
            this.f197497f.mo134396k(pzv0.m172256d(9, null, null));
            return;
        }
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132477z2)).booleanValue()) {
            this.f197499h.m171378c().mo136907d(new Throwable().getStackTrace());
        }
        this.f197501j.m100793j(this.f197502k, (Activity) s050.m181847P2(uylVar));
    }

    @Override // p149l.ips0
    /* JADX INFO: renamed from: S4 */
    public final synchronized void mo137587S4() {
        Preconditions.checkMainThread("showInterstitial must be called on the main UI thread.");
        if (this.f197501j == null) {
            x2t0.m206869g("Interstitial can not be shown before loaded.");
            this.f197497f.mo134396k(pzv0.m172256d(9, null, null));
        } else {
            if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132477z2)).booleanValue()) {
                this.f197499h.m171378c().mo136907d(new Throwable().getStackTrace());
            }
            this.f197501j.m100793j(this.f197502k, null);
        }
    }

    @Override // p149l.ips0
    /* JADX INFO: renamed from: Y3 */
    public final synchronized void mo137589Y3(boolean z) {
        Preconditions.checkMainThread("setImmersiveMode must be called on the main UI thread.");
        this.f197502k = z;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0024  */
    @Override // p149l.ips0
    /* JADX INFO: renamed from: f2 */
    public final synchronized boolean mo137591f2(zzl zzlVar) {
        boolean z;
        try {
            if (((Boolean) q9s0.f153478i.m115379e()).booleanValue()) {
                if (((Boolean) d1s0.m109677c().m144697a(m7s0.f131927Ga)).booleanValue()) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            if (this.f197496e.zzc < ((Integer) d1s0.m109677c().m144697a(m7s0.f131939Ha)).intValue() || !z) {
                Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
            }
            vny0.m199080r();
            if (C2075b.m12314g(this.f197493b) && zzlVar.zzs == null) {
                x2t0.m206866d("Failed to load the ad because app ID is missing.");
                qcv0 qcv0Var = this.f197497f;
                if (qcv0Var != null) {
                    qcv0Var.mo97693u(pzv0.m172256d(4, null, null));
                }
            } else if (!m214208r8()) {
                kzv0.m147956a(this.f197493b, zzlVar.zzf);
                this.f197501j = null;
                return this.f197494c.mo113608a(zzlVar, this.f197495d, new xuv0(this.f197492a), new xcv0(this));
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p149l.ips0
    /* JADX INFO: renamed from: g */
    public final synchronized void mo137593g() {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        b8u0 b8u0Var = this.f197501j;
        if (b8u0Var != null) {
            b8u0Var.m117799e().m139010w0(null);
        }
    }

    @Override // p149l.ips0
    /* JADX INFO: renamed from: i8 */
    public final void mo137594i8(uxs0 uxs0Var) {
        this.f197498g.m138770K(uxs0Var);
    }

    @Override // p149l.ips0
    /* JADX INFO: renamed from: l1 */
    public final void mo137595l1(sys0 sys0Var) {
        Preconditions.checkMainThread("setAppEventListener must be called on the main UI thread.");
        this.f197497f.m173931P(sys0Var);
    }

    @Override // p149l.ips0
    /* JADX INFO: renamed from: n0 */
    public final synchronized boolean mo137596n0() {
        return this.f197494c.zza();
    }

    @Override // p149l.ips0
    /* JADX INFO: renamed from: p0 */
    public final synchronized boolean mo137597p0() {
        Preconditions.checkMainThread("isLoaded must be called on the main UI thread.");
        return m214208r8();
    }

    /* JADX INFO: renamed from: r8 */
    public final synchronized boolean m214208r8() {
        b8u0 b8u0Var = this.f197501j;
        return (b8u0Var == null || b8u0Var.m100792i()) ? false : true;
    }

    @Override // p149l.ips0
    /* JADX INFO: renamed from: w7 */
    public final void mo137602w7(zzl zzlVar, ocs0 ocs0Var) {
        this.f197497f.m173929K(ocs0Var);
        mo137591f2(zzlVar);
    }

    @Override // p149l.ips0
    /* JADX INFO: renamed from: x2 */
    public final void mo137603x2(r8s0 r8s0Var) {
        Preconditions.checkMainThread("setAdListener must be called on the main UI thread.");
        this.f197497f.m173928D(r8s0Var);
    }

    @Override // p149l.ips0
    public final Bundle zzd() {
        Preconditions.checkMainThread("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    @Override // p149l.ips0
    public final zzq zzg() {
        return null;
    }

    @Override // p149l.ips0
    public final r8s0 zzi() {
        return this.f197497f.m173933z();
    }

    @Override // p149l.ips0
    public final sys0 zzj() {
        return this.f197497f.m173927B();
    }

    @Override // p149l.ips0
    @Nullable
    public final synchronized ncu0 zzk() {
        b8u0 b8u0Var;
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132007N6)).booleanValue() && (b8u0Var = this.f197501j) != null) {
            return b8u0Var.m117798d();
        }
        return null;
    }

    @Override // p149l.ips0
    public final fgu0 zzl() {
        return null;
    }

    @Override // p149l.ips0
    public final uyl zzn() {
        return null;
    }

    @Override // p149l.ips0
    public final synchronized String zzr() {
        return this.f197495d;
    }

    @Override // p149l.ips0
    @Nullable
    public final synchronized String zzs() {
        b8u0 b8u0Var = this.f197501j;
        if (b8u0Var == null || b8u0Var.m117798d() == null) {
            return null;
        }
        return b8u0Var.m117798d().zzg();
    }

    @Override // p149l.ips0
    @Nullable
    public final synchronized String zzt() {
        b8u0 b8u0Var = this.f197501j;
        if (b8u0Var == null || b8u0Var.m117798d() == null) {
            return null;
        }
        return b8u0Var.m117798d().zzg();
    }

    @Override // p149l.ips0
    /* JADX INFO: renamed from: t */
    public final void mo137600t() {
    }

    @Override // p149l.ips0
    /* JADX INFO: renamed from: A5 */
    public final void mo137574A5(q1s0 q1s0Var) {
    }

    @Override // p149l.ips0
    /* JADX INFO: renamed from: C5 */
    public final void mo137575C5(n5s0 n5s0Var) {
    }

    @Override // p149l.ips0
    /* JADX INFO: renamed from: I1 */
    public final void mo137581I1(zzw zzwVar) {
    }

    @Override // p149l.ips0
    /* JADX INFO: renamed from: L0 */
    public final void mo137584L0(zzdu zzduVar) {
    }

    @Override // p149l.ips0
    /* JADX INFO: renamed from: R3 */
    public final void mo137586R3(zzq zzqVar) {
    }

    @Override // p149l.ips0
    /* JADX INFO: renamed from: X6 */
    public final void mo137588X6(String str) {
    }

    @Override // p149l.ips0
    /* JADX INFO: renamed from: e2 */
    public final void mo137590e2(zzfk zzfkVar) {
    }

    @Override // p149l.ips0
    /* JADX INFO: renamed from: f7 */
    public final void mo137592f7(t3t0 t3t0Var) {
    }

    @Override // p149l.ips0
    /* JADX INFO: renamed from: r6 */
    public final void mo137598r6(String str) {
    }

    @Override // p149l.ips0
    /* JADX INFO: renamed from: s4 */
    public final void mo137599s4(boolean z) {
    }

    @Override // p149l.ips0
    /* JADX INFO: renamed from: v3 */
    public final void mo137601v3(dts0 dts0Var) {
    }

    @Override // p149l.ips0
    /* JADX INFO: renamed from: E6 */
    public final void mo137576E6(gts0 gts0Var, String str) {
    }
}
