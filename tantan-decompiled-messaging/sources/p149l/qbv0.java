package p149l;

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
import java.util.Collections;

/* JADX INFO: loaded from: classes6.dex */
public final class qbv0 extends bos0 implements m0u0 {

    /* JADX INFO: renamed from: a */
    public final Context f153700a;

    /* JADX INFO: renamed from: b */
    public final dtv0 f153701b;

    /* JADX INFO: renamed from: c */
    public final String f153702c;

    /* JADX INFO: renamed from: d */
    public final qcv0 f153703d;

    /* JADX INFO: renamed from: e */
    public zzq f153704e;

    /* JADX INFO: renamed from: f */
    public final gyv0 f153705f;

    /* JADX INFO: renamed from: g */
    public final zzcei f153706g;

    /* JADX INFO: renamed from: h */
    public final rnu0 f153707h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public ont0 f153708i;

    public qbv0(Context context, zzq zzqVar, String str, dtv0 dtv0Var, qcv0 qcv0Var, zzcei zzceiVar, rnu0 rnu0Var) {
        this.f153700a = context;
        this.f153701b = dtv0Var;
        this.f153704e = zzqVar;
        this.f153702c = str;
        this.f153703d = qcv0Var;
        this.f153705f = dtv0Var.m113610h();
        this.f153706g = zzceiVar;
        this.f153707h = rnu0Var;
        dtv0Var.m113614o(this);
    }

    @Override // p149l.ips0
    /* JADX INFO: renamed from: C5 */
    public final void mo137575C5(n5s0 n5s0Var) {
        if (m173853t8()) {
            Preconditions.checkMainThread("setAdListener must be called on the main UI thread.");
        }
        this.f153701b.m113613n(n5s0Var);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003a A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0021, B:13:0x003f, B:15:0x0043, B:12:0x003a), top: B:22:0x0001 }] */
    @Override // p149l.ips0
    /* JADX INFO: renamed from: G */
    public final synchronized void mo137577G() {
        try {
            if (((Boolean) q9s0.f153476g.m115379e()).booleanValue()) {
                if (((Boolean) d1s0.m109677c().m144697a(m7s0.f131903Ea)).booleanValue()) {
                    if (this.f153706g.zzc < ((Integer) d1s0.m109677c().m144697a(m7s0.f131951Ia)).intValue()) {
                        Preconditions.checkMainThread("pause must be called on the main UI thread.");
                    }
                } else {
                    Preconditions.checkMainThread("pause must be called on the main UI thread.");
                }
            } else {
                Preconditions.checkMainThread("pause must be called on the main UI thread.");
            }
            ont0 ont0Var = this.f153708i;
            if (ont0Var != null) {
                ont0Var.m117799e().m139011z0(null);
            }
        } catch (Throwable th) {
            throw th;
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
        if (m173853t8()) {
            Preconditions.checkMainThread("setPaidEventListener must be called on the main UI thread.");
        }
        try {
            if (!s3u0Var.zzf()) {
                this.f153707h.m180209e();
            }
        } catch (RemoteException e) {
            x2t0.m206865c("Error in making CSI ping for reporting paid event callback", e);
        }
        this.f153703d.m173930O(s3u0Var);
    }

    @Override // p149l.ips0
    /* JADX INFO: renamed from: H7 */
    public final synchronized void mo137580H7(s8s0 s8s0Var) {
        Preconditions.checkMainThread("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.f153701b.m113615p(s8s0Var);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003a A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0021, B:13:0x003f, B:15:0x0043, B:12:0x003a), top: B:22:0x0001 }] */
    @Override // p149l.ips0
    /* JADX INFO: renamed from: J */
    public final synchronized void mo137583J() {
        try {
            if (((Boolean) q9s0.f153477h.m115379e()).booleanValue()) {
                if (((Boolean) d1s0.m109677c().m144697a(m7s0.f131879Ca)).booleanValue()) {
                    if (this.f153706g.zzc < ((Integer) d1s0.m109677c().m144697a(m7s0.f131951Ia)).intValue()) {
                        Preconditions.checkMainThread("resume must be called on the main UI thread.");
                    }
                } else {
                    Preconditions.checkMainThread("resume must be called on the main UI thread.");
                }
            } else {
                Preconditions.checkMainThread("resume must be called on the main UI thread.");
            }
            ont0 ont0Var = this.f153708i;
            if (ont0Var != null) {
                ont0Var.m117799e().m139009A0(null);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p149l.ips0
    /* JADX INFO: renamed from: R3 */
    public final synchronized void mo137586R3(zzq zzqVar) {
        Preconditions.checkMainThread("setAdSize must be called on the main UI thread.");
        this.f153705f.m128757I(zzqVar);
        this.f153704e = zzqVar;
        ont0 ont0Var = this.f153708i;
        if (ont0Var != null) {
            ont0Var.mo117683o(this.f153701b.m113609c(), zzqVar);
        }
    }

    @Override // p149l.ips0
    /* JADX INFO: renamed from: e2 */
    public final synchronized void mo137590e2(zzfk zzfkVar) {
        try {
            if (m173853t8()) {
                Preconditions.checkMainThread("setVideoOptions must be called on the main UI thread.");
            }
            this.f153705f.m128771f(zzfkVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p149l.ips0
    /* JADX INFO: renamed from: f2 */
    public final synchronized boolean mo137591f2(zzl zzlVar) throws RemoteException {
        m173851r8(this.f153704e);
        return m173852s8(zzlVar);
    }

    @Override // p149l.ips0
    /* JADX INFO: renamed from: f7 */
    public final synchronized void mo137592f7(t3t0 t3t0Var) {
        Preconditions.checkMainThread("setCorrelationIdProvider must be called on the main UI thread");
        this.f153705f.m128775q(t3t0Var);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003a A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0021, B:13:0x003f, B:15:0x0043, B:12:0x003a), top: B:22:0x0001 }] */
    @Override // p149l.ips0
    /* JADX INFO: renamed from: g */
    public final synchronized void mo137593g() {
        try {
            if (((Boolean) q9s0.f153474e.m115379e()).booleanValue()) {
                if (((Boolean) d1s0.m109677c().m144697a(m7s0.f131891Da)).booleanValue()) {
                    if (this.f153706g.zzc < ((Integer) d1s0.m109677c().m144697a(m7s0.f131951Ia)).intValue()) {
                        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
                    }
                } else {
                    Preconditions.checkMainThread("destroy must be called on the main UI thread.");
                }
            } else {
                Preconditions.checkMainThread("destroy must be called on the main UI thread.");
            }
            ont0 ont0Var = this.f153708i;
            if (ont0Var != null) {
                ont0Var.mo106177b();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p149l.ips0
    /* JADX INFO: renamed from: l1 */
    public final void mo137595l1(sys0 sys0Var) {
        if (m173853t8()) {
            Preconditions.checkMainThread("setAppEventListener must be called on the main UI thread.");
        }
        this.f153703d.m173931P(sys0Var);
    }

    @Override // p149l.ips0
    /* JADX INFO: renamed from: n0 */
    public final synchronized boolean mo137596n0() {
        return this.f153701b.zza();
    }

    @Override // p149l.ips0
    /* JADX INFO: renamed from: p0 */
    public final boolean mo137597p0() {
        return false;
    }

    /* JADX INFO: renamed from: r8 */
    public final synchronized void m173851r8(zzq zzqVar) {
        this.f153705f.m128757I(zzqVar);
        this.f153705f.m128762N(this.f153704e.zzn);
    }

    @Override // p149l.ips0
    /* JADX INFO: renamed from: s4 */
    public final synchronized void mo137599s4(boolean z) {
        try {
            if (m173853t8()) {
                Preconditions.checkMainThread("setManualImpressionsEnabled must be called from the main thread.");
            }
            this.f153705f.m128764P(z);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: s8 */
    public final synchronized boolean m173852s8(zzl zzlVar) throws RemoteException {
        try {
            if (m173853t8()) {
                Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
            }
            vny0.m199080r();
            if (!C2075b.m12314g(this.f153700a) || zzlVar.zzs != null) {
                kzv0.m147956a(this.f153700a, zzlVar.zzf);
                return this.f153701b.mo113608a(zzlVar, this.f153702c, null, new pbv0(this));
            }
            x2t0.m206866d("Failed to load the ad because app ID is missing.");
            qcv0 qcv0Var = this.f153703d;
            if (qcv0Var != null) {
                qcv0Var.mo97693u(pzv0.m172256d(4, null, null));
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p149l.ips0
    /* JADX INFO: renamed from: t */
    public final synchronized void mo137600t() {
        Preconditions.checkMainThread("recordManualImpression must be called on the main UI thread.");
        ont0 ont0Var = this.f153708i;
        if (ont0Var != null) {
            ont0Var.mo117682n();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0024  */
    /* JADX INFO: renamed from: t8 */
    public final boolean m173853t8() {
        boolean z;
        if (((Boolean) q9s0.f153475f.m115379e()).booleanValue()) {
            if (((Boolean) d1s0.m109677c().m144697a(m7s0.f131927Ga)).booleanValue()) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        return this.f153706g.zzc < ((Integer) d1s0.m109677c().m144697a(m7s0.f131939Ha)).intValue() || !z;
    }

    @Override // p149l.ips0
    /* JADX INFO: renamed from: x2 */
    public final void mo137603x2(r8s0 r8s0Var) {
        if (m173853t8()) {
            Preconditions.checkMainThread("setAdListener must be called on the main UI thread.");
        }
        this.f153703d.m173928D(r8s0Var);
    }

    @Override // p149l.m0u0
    public final synchronized void zza() {
        try {
            if (!this.f153701b.m113616q()) {
                this.f153701b.m113612m();
                return;
            }
            zzq zzqVarM128777x = this.f153705f.m128777x();
            ont0 ont0Var = this.f153708i;
            if (ont0Var != null && ont0Var.mo117681m() != null && this.f153705f.m128774o()) {
                zzqVarM128777x = oyv0.m166723a(this.f153700a, Collections.singletonList(this.f153708i.mo117681m()));
            }
            m173851r8(zzqVarM128777x);
            try {
                m173852s8(this.f153705f.m128776v());
            } catch (RemoteException unused) {
                x2t0.m206869g("Failed to refresh the banner ad.");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p149l.ips0
    public final Bundle zzd() {
        Preconditions.checkMainThread("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    @Override // p149l.ips0
    public final synchronized zzq zzg() {
        Preconditions.checkMainThread("getAdSize must be called on the main UI thread.");
        ont0 ont0Var = this.f153708i;
        if (ont0Var != null) {
            return oyv0.m166723a(this.f153700a, Collections.singletonList(ont0Var.mo117680l()));
        }
        return this.f153705f.m128777x();
    }

    @Override // p149l.ips0
    public final r8s0 zzi() {
        return this.f153703d.m173933z();
    }

    @Override // p149l.ips0
    public final sys0 zzj() {
        return this.f153703d.m173927B();
    }

    @Override // p149l.ips0
    @Nullable
    public final synchronized ncu0 zzk() {
        ont0 ont0Var;
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132007N6)).booleanValue() && (ont0Var = this.f153708i) != null) {
            return ont0Var.m117798d();
        }
        return null;
    }

    @Override // p149l.ips0
    @Nullable
    public final synchronized fgu0 zzl() {
        Preconditions.checkMainThread("getVideoController must be called from the main thread.");
        ont0 ont0Var = this.f153708i;
        if (ont0Var == null) {
            return null;
        }
        return ont0Var.mo117679k();
    }

    @Override // p149l.ips0
    public final uyl zzn() {
        if (m173853t8()) {
            Preconditions.checkMainThread("getAdFrame must be called on the main UI thread.");
        }
        return s050.m181848Y2(this.f153701b.m113609c());
    }

    @Override // p149l.ips0
    public final synchronized String zzr() {
        return this.f153702c;
    }

    @Override // p149l.ips0
    @Nullable
    public final synchronized String zzs() {
        ont0 ont0Var = this.f153708i;
        if (ont0Var == null || ont0Var.m117798d() == null) {
            return null;
        }
        return ont0Var.m117798d().zzg();
    }

    @Override // p149l.ips0
    @Nullable
    public final synchronized String zzt() {
        ont0 ont0Var = this.f153708i;
        if (ont0Var == null || ont0Var.m117798d() == null) {
            return null;
        }
        return ont0Var.m117798d().zzg();
    }

    @Override // p149l.ips0
    /* JADX INFO: renamed from: S4 */
    public final void mo137587S4() {
    }

    @Override // p149l.ips0
    /* JADX INFO: renamed from: A5 */
    public final void mo137574A5(q1s0 q1s0Var) {
    }

    @Override // p149l.ips0
    /* JADX INFO: renamed from: I1 */
    public final void mo137581I1(zzw zzwVar) {
    }

    @Override // p149l.ips0
    /* JADX INFO: renamed from: I3 */
    public final void mo137582I3(s7t0 s7t0Var) {
    }

    @Override // p149l.ips0
    /* JADX INFO: renamed from: L0 */
    public final void mo137584L0(zzdu zzduVar) {
    }

    @Override // p149l.ips0
    /* JADX INFO: renamed from: P7 */
    public final void mo137585P7(uyl uylVar) {
    }

    @Override // p149l.ips0
    /* JADX INFO: renamed from: X6 */
    public final void mo137588X6(String str) {
    }

    @Override // p149l.ips0
    /* JADX INFO: renamed from: Y3 */
    public final void mo137589Y3(boolean z) {
    }

    @Override // p149l.ips0
    /* JADX INFO: renamed from: i8 */
    public final void mo137594i8(uxs0 uxs0Var) {
    }

    @Override // p149l.ips0
    /* JADX INFO: renamed from: r6 */
    public final void mo137598r6(String str) {
    }

    @Override // p149l.ips0
    /* JADX INFO: renamed from: v3 */
    public final void mo137601v3(dts0 dts0Var) {
    }

    @Override // p149l.ips0
    /* JADX INFO: renamed from: E6 */
    public final void mo137576E6(gts0 gts0Var, String str) {
    }

    @Override // p149l.ips0
    /* JADX INFO: renamed from: w7 */
    public final void mo137602w7(zzl zzlVar, ocs0 ocs0Var) {
    }
}
