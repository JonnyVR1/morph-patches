package p153l;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.client.zzdu;
import com.google.android.gms.ads.internal.client.zzfk;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.ads.internal.util.C2098b;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzcei;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
public final class d2w0 extends hxs0 implements joy0, nas0 {

    /* JADX INFO: renamed from: a */
    public final dlt0 f84824a;

    /* JADX INFO: renamed from: b */
    public final Context f84825b;

    /* JADX INFO: renamed from: d */
    public final String f84827d;

    /* JADX INFO: renamed from: e */
    public final x1w0 f84828e;

    /* JADX INFO: renamed from: f */
    public final v1w0 f84829f;

    /* JADX INFO: renamed from: g */
    public final zzcei f84830g;

    /* JADX INFO: renamed from: h */
    public final xwu0 f84831h;

    /* JADX INFO: renamed from: j */
    @Nullable
    public tvt0 f84833j;

    /* JADX INFO: renamed from: k */
    @Nullable
    public fwt0 f84834k;

    /* JADX INFO: renamed from: c */
    public AtomicBoolean f84826c = new AtomicBoolean();

    /* JADX INFO: renamed from: i */
    public long f84832i = -1;

    public d2w0(dlt0 dlt0Var, Context context, String str, x1w0 x1w0Var, v1w0 v1w0Var, zzcei zzceiVar, xwu0 xwu0Var) {
        this.f84824a = dlt0Var;
        this.f84825b = context;
        this.f84827d = str;
        this.f84828e = x1w0Var;
        this.f84829f = v1w0Var;
        this.f84830g = zzceiVar;
        this.f84831h = xwu0Var;
        v1w0Var.m199084A(this);
    }

    @Override // p153l.oys0
    /* JADX INFO: renamed from: A5 */
    public final void mo113742A5(was0 was0Var) {
        this.f84829f.m199086D(was0Var);
    }

    @Override // p153l.oys0
    /* JADX INFO: renamed from: G */
    public final synchronized void mo113745G() {
        Preconditions.checkMainThread("pause must be called on the main UI thread.");
    }

    @Override // p153l.oys0
    /* JADX INFO: renamed from: H7 */
    public final synchronized void mo113748H7(yhs0 yhs0Var) {
    }

    @Override // p153l.oys0
    /* JADX INFO: renamed from: I1 */
    public final void mo113749I1(zzw zzwVar) {
        this.f84828e.m95570k(zzwVar);
    }

    @Override // p153l.oys0
    /* JADX INFO: renamed from: J */
    public final synchronized void mo113751J() {
        Preconditions.checkMainThread("resume must be called on the main UI thread.");
    }

    @Override // p153l.joy0
    /* JADX INFO: renamed from: P2 */
    public final synchronized void mo113755P2() {
        if (this.f84834k != null) {
            this.f84832i = bxy0.m106918b().elapsedRealtime();
            int iM127849i = this.f84834k.m127849i();
            if (iM127849i > 0) {
                tvt0 tvt0Var = new tvt0(this.f84824a.mo116872d(), bxy0.m106918b());
                this.f84833j = tvt0Var;
                tvt0Var.m192835d(iM127849i, new Runnable() { // from class: l.a2w0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f68223a.zzp();
                    }
                });
            }
        }
    }

    @Override // p153l.oys0
    /* JADX INFO: renamed from: R3 */
    public final synchronized void mo113757R3(zzq zzqVar) {
        Preconditions.checkMainThread("setAdSize must be called on the main UI thread.");
    }

    @Override // p153l.oys0
    /* JADX INFO: renamed from: S4 */
    public final synchronized void mo113758S4() {
    }

    @Override // p153l.oys0
    /* JADX INFO: renamed from: e2 */
    public final synchronized void mo113761e2(zzfk zzfkVar) {
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0024  */
    @Override // p153l.oys0
    /* JADX INFO: renamed from: f2 */
    public final synchronized boolean mo113762f2(zzl zzlVar) throws RemoteException {
        boolean z;
        try {
            if (((Boolean) wis0.f189387d.m149974e()).booleanValue()) {
                if (((Boolean) jas0.m144075c().m176505a(sgs0.f167998Ga)).booleanValue()) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            if (this.f84830g.zzc < ((Integer) jas0.m144075c().m176505a(sgs0.f168010Ha)).intValue() || !z) {
                Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
            }
            bxy0.m106934r();
            if (C2098b.m12368g(this.f84825b) && zzlVar.zzs == null) {
                dct0.m115295d("Failed to load the ad because app ID is missing.");
                this.f84829f.mo103145u(v8w0.m200327d(4, null, null));
                return false;
            }
            if (mo113770n0()) {
                return false;
            }
            this.f84826c = new AtomicBoolean();
            return this.f84828e.mo95567a(zzlVar, this.f84827d, new b2w0(this), new c2w0(this));
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p153l.oys0
    /* JADX INFO: renamed from: f7 */
    public final synchronized void mo113763f7(zct0 zct0Var) {
    }

    @Override // p153l.oys0
    /* JADX INFO: renamed from: g */
    public final synchronized void mo113764g() {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        fwt0 fwt0Var = this.f84834k;
        if (fwt0Var != null) {
            fwt0Var.mo127848b();
        }
    }

    @Override // p153l.joy0
    /* JADX INFO: renamed from: m4 */
    public final synchronized void mo113768m4() {
        fwt0 fwt0Var = this.f84834k;
        if (fwt0Var != null) {
            fwt0Var.m127852l(bxy0.m106918b().elapsedRealtime() - this.f84832i, 1);
        }
    }

    @Override // p153l.joy0
    /* JADX INFO: renamed from: m5 */
    public final void mo113769m5(int i) {
        if (i == 0) {
            throw null;
        }
        int i2 = i - 1;
        if (i2 == 0) {
            m113773r8(2);
            return;
        }
        if (i2 == 1) {
            m113773r8(4);
        } else if (i2 != 2) {
            m113773r8(6);
        } else {
            m113773r8(3);
        }
    }

    @Override // p153l.oys0
    /* JADX INFO: renamed from: n0 */
    public final synchronized boolean mo113770n0() {
        return this.f84828e.zza();
    }

    @Override // p153l.oys0
    /* JADX INFO: renamed from: p0 */
    public final boolean mo113771p0() {
        return false;
    }

    /* JADX INFO: renamed from: r8 */
    public final synchronized void m113773r8(int i) {
        try {
            if (this.f84826c.compareAndSet(false, true)) {
                this.f84829f.m199088x();
                tvt0 tvt0Var = this.f84833j;
                if (tvt0Var != null) {
                    bxy0.m106920d().m96487e(tvt0Var);
                }
                if (this.f84834k != null) {
                    long jElapsedRealtime = -1;
                    if (this.f84832i != -1) {
                        jElapsedRealtime = bxy0.m106918b().elapsedRealtime() - this.f84832i;
                    }
                    this.f84834k.m127852l(jElapsedRealtime, i);
                }
                mo113764g();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p153l.oys0
    /* JADX INFO: renamed from: s4 */
    public final synchronized void mo113774s4(boolean z) {
    }

    @Override // p153l.oys0
    /* JADX INFO: renamed from: t */
    public final synchronized void mo113775t() {
    }

    @Override // p153l.nas0
    public final void zza() {
        m113773r8(3);
    }

    @Override // p153l.oys0
    public final Bundle zzd() {
        return new Bundle();
    }

    @Override // p153l.oys0
    public final synchronized zzq zzg() {
        return null;
    }

    @Override // p153l.oys0
    public final xhs0 zzi() {
        return null;
    }

    @Override // p153l.oys0
    public final y7t0 zzj() {
        return null;
    }

    @Override // p153l.oys0
    public final synchronized tlu0 zzk() {
        return null;
    }

    @Override // p153l.oys0
    public final synchronized lpu0 zzl() {
        return null;
    }

    @Override // p153l.oys0
    public final p1m zzn() {
        return null;
    }

    public final /* synthetic */ void zzo() {
        m113773r8(5);
    }

    @VisibleForTesting
    public final void zzp() {
        this.f84824a.mo116871c().execute(new Runnable() { // from class: l.z1w0
            @Override // java.lang.Runnable
            public final void run() {
                this.f202608a.zzo();
            }
        });
    }

    @Override // p153l.oys0
    public final synchronized String zzr() {
        return this.f84827d;
    }

    @Override // p153l.oys0
    public final synchronized String zzs() {
        return null;
    }

    @Override // p153l.oys0
    public final synchronized String zzt() {
        return null;
    }

    @Override // p153l.joy0
    /* JADX INFO: renamed from: M6 */
    public final void mo113753M6() {
    }

    @Override // p153l.joy0
    /* JADX INFO: renamed from: O */
    public final void mo113754O() {
    }

    @Override // p153l.joy0
    /* JADX INFO: renamed from: g7 */
    public final void mo113765g7() {
    }

    @Override // p153l.oys0
    /* JADX INFO: renamed from: C5 */
    public final void mo113743C5(tes0 tes0Var) {
    }

    @Override // p153l.oys0
    /* JADX INFO: renamed from: G6 */
    public final void mo113746G6(i3t0 i3t0Var) {
    }

    @Override // p153l.oys0
    /* JADX INFO: renamed from: H3 */
    public final void mo113747H3(ycu0 ycu0Var) {
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
    /* JADX INFO: renamed from: l1 */
    public final void mo113767l1(y7t0 y7t0Var) {
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
    /* JADX INFO: renamed from: x2 */
    public final void mo113778x2(xhs0 xhs0Var) {
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
