package p149l;

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
import com.google.android.gms.ads.internal.util.C2075b;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzcei;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
public final class xsv0 extends bos0 implements dfy0, h1s0 {

    /* JADX INFO: renamed from: a */
    public final xbt0 f194307a;

    /* JADX INFO: renamed from: b */
    public final Context f194308b;

    /* JADX INFO: renamed from: d */
    public final String f194310d;

    /* JADX INFO: renamed from: e */
    public final rsv0 f194311e;

    /* JADX INFO: renamed from: f */
    public final psv0 f194312f;

    /* JADX INFO: renamed from: g */
    public final zzcei f194313g;

    /* JADX INFO: renamed from: h */
    public final rnu0 f194314h;

    /* JADX INFO: renamed from: j */
    @Nullable
    public nmt0 f194316j;

    /* JADX INFO: renamed from: k */
    @Nullable
    public zmt0 f194317k;

    /* JADX INFO: renamed from: c */
    public AtomicBoolean f194309c = new AtomicBoolean();

    /* JADX INFO: renamed from: i */
    public long f194315i = -1;

    public xsv0(xbt0 xbt0Var, Context context, String str, rsv0 rsv0Var, psv0 psv0Var, zzcei zzceiVar, rnu0 rnu0Var) {
        this.f194307a = xbt0Var;
        this.f194308b = context;
        this.f194310d = str;
        this.f194311e = rsv0Var;
        this.f194312f = psv0Var;
        this.f194313g = zzceiVar;
        this.f194314h = rnu0Var;
        psv0Var.m171249A(this);
    }

    @Override // p149l.ips0
    /* JADX INFO: renamed from: A5 */
    public final void mo137574A5(q1s0 q1s0Var) {
        this.f194312f.m171251D(q1s0Var);
    }

    @Override // p149l.ips0
    /* JADX INFO: renamed from: G */
    public final synchronized void mo137577G() {
        Preconditions.checkMainThread("pause must be called on the main UI thread.");
    }

    @Override // p149l.ips0
    /* JADX INFO: renamed from: H7 */
    public final synchronized void mo137580H7(s8s0 s8s0Var) {
    }

    @Override // p149l.ips0
    /* JADX INFO: renamed from: I1 */
    public final void mo137581I1(zzw zzwVar) {
        this.f194311e.m195131k(zzwVar);
    }

    @Override // p149l.ips0
    /* JADX INFO: renamed from: J */
    public final synchronized void mo137583J() {
        Preconditions.checkMainThread("resume must be called on the main UI thread.");
    }

    @Override // p149l.dfy0
    /* JADX INFO: renamed from: P2 */
    public final synchronized void mo102681P2() {
        if (this.f194317k != null) {
            this.f194315i = vny0.m199064b().elapsedRealtime();
            int iM219374i = this.f194317k.m219374i();
            if (iM219374i > 0) {
                nmt0 nmt0Var = new nmt0(this.f194307a.mo135795d(), vny0.m199064b());
                this.f194316j = nmt0Var;
                nmt0Var.m160158d(iM219374i, new Runnable() { // from class: l.usv0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f178206a.zzp();
                    }
                });
            }
        }
    }

    @Override // p149l.ips0
    /* JADX INFO: renamed from: R3 */
    public final synchronized void mo137586R3(zzq zzqVar) {
        Preconditions.checkMainThread("setAdSize must be called on the main UI thread.");
    }

    @Override // p149l.ips0
    /* JADX INFO: renamed from: S4 */
    public final synchronized void mo137587S4() {
    }

    @Override // p149l.ips0
    /* JADX INFO: renamed from: e2 */
    public final synchronized void mo137590e2(zzfk zzfkVar) {
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0024  */
    @Override // p149l.ips0
    /* JADX INFO: renamed from: f2 */
    public final synchronized boolean mo137591f2(zzl zzlVar) throws RemoteException {
        boolean z;
        try {
            if (((Boolean) q9s0.f153473d.m115379e()).booleanValue()) {
                if (((Boolean) d1s0.m109677c().m144697a(m7s0.f131927Ga)).booleanValue()) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            if (this.f194313g.zzc < ((Integer) d1s0.m109677c().m144697a(m7s0.f131939Ha)).intValue() || !z) {
                Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
            }
            vny0.m199080r();
            if (C2075b.m12314g(this.f194308b) && zzlVar.zzs == null) {
                x2t0.m206866d("Failed to load the ad because app ID is missing.");
                this.f194312f.mo97693u(pzv0.m172256d(4, null, null));
                return false;
            }
            if (mo137596n0()) {
                return false;
            }
            this.f194309c = new AtomicBoolean();
            return this.f194311e.mo113608a(zzlVar, this.f194310d, new vsv0(this), new wsv0(this));
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p149l.ips0
    /* JADX INFO: renamed from: f7 */
    public final synchronized void mo137592f7(t3t0 t3t0Var) {
    }

    @Override // p149l.ips0
    /* JADX INFO: renamed from: g */
    public final synchronized void mo137593g() {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        zmt0 zmt0Var = this.f194317k;
        if (zmt0Var != null) {
            zmt0Var.mo106177b();
        }
    }

    @Override // p149l.dfy0
    /* JADX INFO: renamed from: m4 */
    public final synchronized void mo102686m4() {
        zmt0 zmt0Var = this.f194317k;
        if (zmt0Var != null) {
            zmt0Var.m219377l(vny0.m199064b().elapsedRealtime() - this.f194315i, 1);
        }
    }

    @Override // p149l.dfy0
    /* JADX INFO: renamed from: m5 */
    public final void mo102687m5(int i) {
        if (i == 0) {
            throw null;
        }
        int i2 = i - 1;
        if (i2 == 0) {
            m210839r8(2);
            return;
        }
        if (i2 == 1) {
            m210839r8(4);
        } else if (i2 != 2) {
            m210839r8(6);
        } else {
            m210839r8(3);
        }
    }

    @Override // p149l.ips0
    /* JADX INFO: renamed from: n0 */
    public final synchronized boolean mo137596n0() {
        return this.f194311e.zza();
    }

    @Override // p149l.ips0
    /* JADX INFO: renamed from: p0 */
    public final boolean mo137597p0() {
        return false;
    }

    /* JADX INFO: renamed from: r8 */
    public final synchronized void m210839r8(int i) {
        try {
            if (this.f194309c.compareAndSet(false, true)) {
                this.f194312f.m171253x();
                nmt0 nmt0Var = this.f194316j;
                if (nmt0Var != null) {
                    vny0.m199066d().m196347e(nmt0Var);
                }
                if (this.f194317k != null) {
                    long jElapsedRealtime = -1;
                    if (this.f194315i != -1) {
                        jElapsedRealtime = vny0.m199064b().elapsedRealtime() - this.f194315i;
                    }
                    this.f194317k.m219377l(jElapsedRealtime, i);
                }
                mo137593g();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p149l.ips0
    /* JADX INFO: renamed from: s4 */
    public final synchronized void mo137599s4(boolean z) {
    }

    @Override // p149l.ips0
    /* JADX INFO: renamed from: t */
    public final synchronized void mo137600t() {
    }

    @Override // p149l.h1s0
    public final void zza() {
        m210839r8(3);
    }

    @Override // p149l.ips0
    public final Bundle zzd() {
        return new Bundle();
    }

    @Override // p149l.ips0
    public final synchronized zzq zzg() {
        return null;
    }

    @Override // p149l.ips0
    public final r8s0 zzi() {
        return null;
    }

    @Override // p149l.ips0
    public final sys0 zzj() {
        return null;
    }

    @Override // p149l.ips0
    public final synchronized ncu0 zzk() {
        return null;
    }

    @Override // p149l.ips0
    public final synchronized fgu0 zzl() {
        return null;
    }

    @Override // p149l.ips0
    public final uyl zzn() {
        return null;
    }

    public final /* synthetic */ void zzo() {
        m210839r8(5);
    }

    @VisibleForTesting
    public final void zzp() {
        this.f194307a.mo135794c().execute(new Runnable() { // from class: l.tsv0
            @Override // java.lang.Runnable
            public final void run() {
                this.f171970a.zzo();
            }
        });
    }

    @Override // p149l.ips0
    public final synchronized String zzr() {
        return this.f194310d;
    }

    @Override // p149l.ips0
    public final synchronized String zzs() {
        return null;
    }

    @Override // p149l.ips0
    public final synchronized String zzt() {
        return null;
    }

    @Override // p149l.dfy0
    /* JADX INFO: renamed from: M6 */
    public final void mo102678M6() {
    }

    @Override // p149l.dfy0
    /* JADX INFO: renamed from: O */
    public final void mo102679O() {
    }

    @Override // p149l.dfy0
    /* JADX INFO: renamed from: g7 */
    public final void mo102683g7() {
    }

    @Override // p149l.ips0
    /* JADX INFO: renamed from: C5 */
    public final void mo137575C5(n5s0 n5s0Var) {
    }

    @Override // p149l.ips0
    /* JADX INFO: renamed from: G6 */
    public final void mo137578G6(cus0 cus0Var) {
    }

    @Override // p149l.ips0
    /* JADX INFO: renamed from: H3 */
    public final void mo137579H3(s3u0 s3u0Var) {
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
    /* JADX INFO: renamed from: l1 */
    public final void mo137595l1(sys0 sys0Var) {
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
    /* JADX INFO: renamed from: x2 */
    public final void mo137603x2(r8s0 r8s0Var) {
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
