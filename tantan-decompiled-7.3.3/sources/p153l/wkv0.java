package p153l;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzdu;
import com.google.android.gms.ads.internal.client.zzfk;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.ads.internal.util.C2098b;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzcei;
import java.util.Collections;

/* JADX INFO: loaded from: classes6.dex */
public final class wkv0 extends hxs0 implements s9u0 {

    /* JADX INFO: renamed from: a */
    public final Context f189595a;

    /* JADX INFO: renamed from: b */
    public final j2w0 f189596b;

    /* JADX INFO: renamed from: c */
    public final String f189597c;

    /* JADX INFO: renamed from: d */
    public final wlv0 f189598d;

    /* JADX INFO: renamed from: e */
    public zzq f189599e;

    /* JADX INFO: renamed from: f */
    public final m7w0 f189600f;

    /* JADX INFO: renamed from: g */
    public final zzcei f189601g;

    /* JADX INFO: renamed from: h */
    public final xwu0 f189602h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public uwt0 f189603i;

    public wkv0(Context context, zzq zzqVar, String str, j2w0 j2w0Var, wlv0 wlv0Var, zzcei zzceiVar, xwu0 xwu0Var) {
        this.f189595a = context;
        this.f189596b = j2w0Var;
        this.f189599e = zzqVar;
        this.f189597c = str;
        this.f189598d = wlv0Var;
        this.f189600f = j2w0Var.m143292h();
        this.f189601g = zzceiVar;
        this.f189602h = xwu0Var;
        j2w0Var.m143296o(this);
    }

    @Override // p153l.oys0
    /* JADX INFO: renamed from: C5 */
    public final void mo113743C5(tes0 tes0Var) {
        if (m206864t8()) {
            Preconditions.checkMainThread("setAdListener must be called on the main UI thread.");
        }
        this.f189596b.m143295n(tes0Var);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003a A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0021, B:13:0x003f, B:15:0x0043, B:12:0x003a), top: B:22:0x0001 }] */
    @Override // p153l.oys0
    /* JADX INFO: renamed from: G */
    public final synchronized void mo113745G() {
        try {
            if (((Boolean) wis0.f189390g.m149974e()).booleanValue()) {
                if (((Boolean) jas0.m144075c().m176505a(sgs0.f167974Ea)).booleanValue()) {
                    if (this.f189601g.zzc < ((Integer) jas0.m144075c().m176505a(sgs0.f168022Ia)).intValue()) {
                        Preconditions.checkMainThread("pause must be called on the main UI thread.");
                    }
                } else {
                    Preconditions.checkMainThread("pause must be called on the main UI thread.");
                }
            } else {
                Preconditions.checkMainThread("pause must be called on the main UI thread.");
            }
            uwt0 uwt0Var = this.f189603i;
            if (uwt0Var != null) {
                uwt0Var.m152229e().m166368z0(null);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p153l.oys0
    /* JADX INFO: renamed from: G6 */
    public final void mo113746G6(i3t0 i3t0Var) {
        Preconditions.checkMainThread("setAdMetadataListener must be called on the main UI thread.");
    }

    @Override // p153l.oys0
    /* JADX INFO: renamed from: H3 */
    public final void mo113747H3(ycu0 ycu0Var) {
        if (m206864t8()) {
            Preconditions.checkMainThread("setPaidEventListener must be called on the main UI thread.");
        }
        try {
            if (!ycu0Var.zzf()) {
                this.f189602h.m213444e();
            }
        } catch (RemoteException e) {
            dct0.m115294c("Error in making CSI ping for reporting paid event callback", e);
        }
        this.f189598d.m207077O(ycu0Var);
    }

    @Override // p153l.oys0
    /* JADX INFO: renamed from: H7 */
    public final synchronized void mo113748H7(yhs0 yhs0Var) {
        Preconditions.checkMainThread("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.f189596b.m143297p(yhs0Var);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003a A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0021, B:13:0x003f, B:15:0x0043, B:12:0x003a), top: B:22:0x0001 }] */
    @Override // p153l.oys0
    /* JADX INFO: renamed from: J */
    public final synchronized void mo113751J() {
        try {
            if (((Boolean) wis0.f189391h.m149974e()).booleanValue()) {
                if (((Boolean) jas0.m144075c().m176505a(sgs0.f167950Ca)).booleanValue()) {
                    if (this.f189601g.zzc < ((Integer) jas0.m144075c().m176505a(sgs0.f168022Ia)).intValue()) {
                        Preconditions.checkMainThread("resume must be called on the main UI thread.");
                    }
                } else {
                    Preconditions.checkMainThread("resume must be called on the main UI thread.");
                }
            } else {
                Preconditions.checkMainThread("resume must be called on the main UI thread.");
            }
            uwt0 uwt0Var = this.f189603i;
            if (uwt0Var != null) {
                uwt0Var.m152229e().m166366A0(null);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p153l.oys0
    /* JADX INFO: renamed from: R3 */
    public final synchronized void mo113757R3(zzq zzqVar) {
        Preconditions.checkMainThread("setAdSize must be called on the main UI thread.");
        this.f189600f.m157314I(zzqVar);
        this.f189599e = zzqVar;
        uwt0 uwt0Var = this.f189603i;
        if (uwt0Var != null) {
            uwt0Var.mo152139o(this.f189596b.m143291c(), zzqVar);
        }
    }

    @Override // p153l.oys0
    /* JADX INFO: renamed from: e2 */
    public final synchronized void mo113761e2(zzfk zzfkVar) {
        try {
            if (m206864t8()) {
                Preconditions.checkMainThread("setVideoOptions must be called on the main UI thread.");
            }
            this.f189600f.m157328f(zzfkVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p153l.oys0
    /* JADX INFO: renamed from: f2 */
    public final synchronized boolean mo113762f2(zzl zzlVar) throws RemoteException {
        m206862r8(this.f189599e);
        return m206863s8(zzlVar);
    }

    @Override // p153l.oys0
    /* JADX INFO: renamed from: f7 */
    public final synchronized void mo113763f7(zct0 zct0Var) {
        Preconditions.checkMainThread("setCorrelationIdProvider must be called on the main UI thread");
        this.f189600f.m157332q(zct0Var);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003a A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:3:0x0001, B:5:0x000f, B:7:0x0021, B:13:0x003f, B:15:0x0043, B:12:0x003a), top: B:22:0x0001 }] */
    @Override // p153l.oys0
    /* JADX INFO: renamed from: g */
    public final synchronized void mo113764g() {
        try {
            if (((Boolean) wis0.f189388e.m149974e()).booleanValue()) {
                if (((Boolean) jas0.m144075c().m176505a(sgs0.f167962Da)).booleanValue()) {
                    if (this.f189601g.zzc < ((Integer) jas0.m144075c().m176505a(sgs0.f168022Ia)).intValue()) {
                        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
                    }
                } else {
                    Preconditions.checkMainThread("destroy must be called on the main UI thread.");
                }
            } else {
                Preconditions.checkMainThread("destroy must be called on the main UI thread.");
            }
            uwt0 uwt0Var = this.f189603i;
            if (uwt0Var != null) {
                uwt0Var.mo127848b();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p153l.oys0
    /* JADX INFO: renamed from: l1 */
    public final void mo113767l1(y7t0 y7t0Var) {
        if (m206864t8()) {
            Preconditions.checkMainThread("setAppEventListener must be called on the main UI thread.");
        }
        this.f189598d.m207078P(y7t0Var);
    }

    @Override // p153l.oys0
    /* JADX INFO: renamed from: n0 */
    public final synchronized boolean mo113770n0() {
        return this.f189596b.zza();
    }

    @Override // p153l.oys0
    /* JADX INFO: renamed from: p0 */
    public final boolean mo113771p0() {
        return false;
    }

    /* JADX INFO: renamed from: r8 */
    public final synchronized void m206862r8(zzq zzqVar) {
        this.f189600f.m157314I(zzqVar);
        this.f189600f.m157319N(this.f189599e.zzn);
    }

    @Override // p153l.oys0
    /* JADX INFO: renamed from: s4 */
    public final synchronized void mo113774s4(boolean z) {
        try {
            if (m206864t8()) {
                Preconditions.checkMainThread("setManualImpressionsEnabled must be called from the main thread.");
            }
            this.f189600f.m157321P(z);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: s8 */
    public final synchronized boolean m206863s8(zzl zzlVar) throws RemoteException {
        try {
            if (m206864t8()) {
                Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
            }
            bxy0.m106934r();
            if (!C2098b.m12368g(this.f189595a) || zzlVar.zzs != null) {
                q8w0.m175827a(this.f189595a, zzlVar.zzf);
                return this.f189596b.mo95567a(zzlVar, this.f189597c, null, new vkv0(this));
            }
            dct0.m115295d("Failed to load the ad because app ID is missing.");
            wlv0 wlv0Var = this.f189598d;
            if (wlv0Var != null) {
                wlv0Var.mo103145u(v8w0.m200327d(4, null, null));
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p153l.oys0
    /* JADX INFO: renamed from: t */
    public final synchronized void mo113775t() {
        Preconditions.checkMainThread("recordManualImpression must be called on the main UI thread.");
        uwt0 uwt0Var = this.f189603i;
        if (uwt0Var != null) {
            uwt0Var.mo152138n();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0024  */
    /* JADX INFO: renamed from: t8 */
    public final boolean m206864t8() {
        boolean z;
        if (((Boolean) wis0.f189389f.m149974e()).booleanValue()) {
            if (((Boolean) jas0.m144075c().m176505a(sgs0.f167998Ga)).booleanValue()) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        return this.f189601g.zzc < ((Integer) jas0.m144075c().m176505a(sgs0.f168010Ha)).intValue() || !z;
    }

    @Override // p153l.oys0
    /* JADX INFO: renamed from: x2 */
    public final void mo113778x2(xhs0 xhs0Var) {
        if (m206864t8()) {
            Preconditions.checkMainThread("setAdListener must be called on the main UI thread.");
        }
        this.f189598d.m207075D(xhs0Var);
    }

    @Override // p153l.s9u0
    public final synchronized void zza() {
        try {
            if (!this.f189596b.m143298q()) {
                this.f189596b.m143294m();
                return;
            }
            zzq zzqVarM157334x = this.f189600f.m157334x();
            uwt0 uwt0Var = this.f189603i;
            if (uwt0Var != null && uwt0Var.mo152137m() != null && this.f189600f.m157331o()) {
                zzqVarM157334x = u7w0.m194892a(this.f189595a, Collections.singletonList(this.f189603i.mo152137m()));
            }
            m206862r8(zzqVarM157334x);
            try {
                m206863s8(this.f189600f.m157333v());
            } catch (RemoteException unused) {
                dct0.m115298g("Failed to refresh the banner ad.");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p153l.oys0
    public final Bundle zzd() {
        Preconditions.checkMainThread("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    @Override // p153l.oys0
    public final synchronized zzq zzg() {
        Preconditions.checkMainThread("getAdSize must be called on the main UI thread.");
        uwt0 uwt0Var = this.f189603i;
        if (uwt0Var != null) {
            return u7w0.m194892a(this.f189595a, Collections.singletonList(uwt0Var.mo152136l()));
        }
        return this.f189600f.m157334x();
    }

    @Override // p153l.oys0
    public final xhs0 zzi() {
        return this.f189598d.m207080z();
    }

    @Override // p153l.oys0
    public final y7t0 zzj() {
        return this.f189598d.m207074B();
    }

    @Override // p153l.oys0
    @Nullable
    public final synchronized tlu0 zzk() {
        uwt0 uwt0Var;
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168078N6)).booleanValue() && (uwt0Var = this.f189603i) != null) {
            return uwt0Var.m152228d();
        }
        return null;
    }

    @Override // p153l.oys0
    @Nullable
    public final synchronized lpu0 zzl() {
        Preconditions.checkMainThread("getVideoController must be called from the main thread.");
        uwt0 uwt0Var = this.f189603i;
        if (uwt0Var == null) {
            return null;
        }
        return uwt0Var.mo152135k();
    }

    @Override // p153l.oys0
    public final p1m zzn() {
        if (m206864t8()) {
            Preconditions.checkMainThread("getAdFrame must be called on the main UI thread.");
        }
        return h950.m134038Y2(this.f189596b.m143291c());
    }

    @Override // p153l.oys0
    public final synchronized String zzr() {
        return this.f189597c;
    }

    @Override // p153l.oys0
    @Nullable
    public final synchronized String zzs() {
        uwt0 uwt0Var = this.f189603i;
        if (uwt0Var == null || uwt0Var.m152228d() == null) {
            return null;
        }
        return uwt0Var.m152228d().zzg();
    }

    @Override // p153l.oys0
    @Nullable
    public final synchronized String zzt() {
        uwt0 uwt0Var = this.f189603i;
        if (uwt0Var == null || uwt0Var.m152228d() == null) {
            return null;
        }
        return uwt0Var.m152228d().zzg();
    }

    @Override // p153l.oys0
    /* JADX INFO: renamed from: S4 */
    public final void mo113758S4() {
    }

    @Override // p153l.oys0
    /* JADX INFO: renamed from: A5 */
    public final void mo113742A5(was0 was0Var) {
    }

    @Override // p153l.oys0
    /* JADX INFO: renamed from: I1 */
    public final void mo113749I1(zzw zzwVar) {
    }

    @Override // p153l.oys0
    /* JADX INFO: renamed from: I3 */
    public final void mo113750I3(ygt0 ygt0Var) {
    }

    @Override // p153l.oys0
    /* JADX INFO: renamed from: L0 */
    public final void mo113752L0(zzdu zzduVar) {
    }

    @Override // p153l.oys0
    /* JADX INFO: renamed from: P7 */
    public final void mo113756P7(p1m p1mVar) {
    }

    @Override // p153l.oys0
    /* JADX INFO: renamed from: X6 */
    public final void mo113759X6(String str) {
    }

    @Override // p153l.oys0
    /* JADX INFO: renamed from: Y3 */
    public final void mo113760Y3(boolean z) {
    }

    @Override // p153l.oys0
    /* JADX INFO: renamed from: i8 */
    public final void mo113766i8(a7t0 a7t0Var) {
    }

    @Override // p153l.oys0
    /* JADX INFO: renamed from: r6 */
    public final void mo113772r6(String str) {
    }

    @Override // p153l.oys0
    /* JADX INFO: renamed from: v3 */
    public final void mo113776v3(j2t0 j2t0Var) {
    }

    @Override // p153l.oys0
    /* JADX INFO: renamed from: E6 */
    public final void mo113744E6(m2t0 m2t0Var, String str) {
    }

    @Override // p153l.oys0
    /* JADX INFO: renamed from: w7 */
    public final void mo113777w7(zzl zzlVar, uls0 uls0Var) {
    }
}
