package p153l;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.util.C2098b;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzcbb;
import com.google.android.gms.internal.ads.zzcei;

/* JADX INFO: loaded from: classes6.dex */
public final class h6w0 extends k7t0 {

    /* JADX INFO: renamed from: a */
    public final y5w0 f108054a;

    /* JADX INFO: renamed from: b */
    public final o5w0 f108055b;

    /* JADX INFO: renamed from: c */
    public final String f108056c;

    /* JADX INFO: renamed from: d */
    public final c7w0 f108057d;

    /* JADX INFO: renamed from: e */
    public final Context f108058e;

    /* JADX INFO: renamed from: f */
    public final zzcei f108059f;

    /* JADX INFO: renamed from: g */
    public final v2s0 f108060g;

    /* JADX INFO: renamed from: h */
    public final xwu0 f108061h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public ksu0 f108062i;

    /* JADX INFO: renamed from: j */
    public boolean f108063j = ((Boolean) jas0.m144075c().m176505a(sgs0.f167952D0)).booleanValue();

    public h6w0(@Nullable String str, y5w0 y5w0Var, Context context, o5w0 o5w0Var, c7w0 c7w0Var, zzcei zzceiVar, v2s0 v2s0Var, xwu0 xwu0Var) {
        this.f108056c = str;
        this.f108054a = y5w0Var;
        this.f108055b = o5w0Var;
        this.f108057d = c7w0Var;
        this.f108058e = context;
        this.f108059f = zzceiVar;
        this.f108060g = v2s0Var;
        this.f108061h = xwu0Var;
    }

    @Override // p153l.l7t0
    /* JADX INFO: renamed from: B0 */
    public final synchronized void mo133740B0(p1m p1mVar, boolean z) throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (this.f108062i == null) {
            dct0.m115298g("Rewarded can not be shown before loaded");
            this.f108055b.mo124507k(v8w0.m200327d(9, null, null));
            return;
        }
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168548z2)).booleanValue()) {
            this.f108060g.m199147c().mo165757d(new Throwable().getStackTrace());
        }
        this.f108062i.m151290o(z, (Activity) h950.m134037P2(p1mVar));
    }

    @Override // p153l.l7t0
    /* JADX INFO: renamed from: J4 */
    public final void mo133741J4(e9u0 e9u0Var) {
        o5w0 o5w0Var = this.f108055b;
        if (e9u0Var == null) {
            o5w0Var.m166179z(null);
        } else {
            o5w0Var.m166179z(new f6w0(this, e9u0Var));
        }
    }

    @Override // p153l.l7t0
    /* JADX INFO: renamed from: M5 */
    public final synchronized void mo133742M5(zzl zzlVar, s7t0 s7t0Var) throws RemoteException {
        m133749s8(zzlVar, s7t0Var, 3);
    }

    @Override // p153l.l7t0
    /* JADX INFO: renamed from: N5 */
    public final void mo133743N5(ycu0 ycu0Var) {
        Preconditions.checkMainThread("setOnPaidEventListener must be called on the main UI thread.");
        try {
            if (!ycu0Var.zzf()) {
                this.f108061h.m213444e();
            }
        } catch (RemoteException e) {
            dct0.m115294c("Error in making CSI ping for reporting paid event callback", e);
        }
        this.f108055b.m166172A(ycu0Var);
    }

    @Override // p153l.l7t0
    /* JADX INFO: renamed from: R0 */
    public final void mo133744R0(o7t0 o7t0Var) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        this.f108055b.m166173B(o7t0Var);
    }

    @Override // p153l.l7t0
    /* JADX INFO: renamed from: R2 */
    public final void mo133745R2(t7t0 t7t0Var) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        this.f108055b.m166177P(t7t0Var);
    }

    @Override // p153l.l7t0
    /* JADX INFO: renamed from: g0 */
    public final synchronized void mo133746g0(p1m p1mVar) throws RemoteException {
        mo133740B0(p1mVar, this.f108063j);
    }

    @Override // p153l.l7t0
    /* JADX INFO: renamed from: i2 */
    public final synchronized void mo133747i2(zzcbb zzcbbVar) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        c7w0 c7w0Var = this.f108057d;
        c7w0Var.f80151a = zzcbbVar.zza;
        c7w0Var.f80152b = zzcbbVar.zzb;
    }

    @Override // p153l.l7t0
    /* JADX INFO: renamed from: s5 */
    public final synchronized void mo133748s5(zzl zzlVar, s7t0 s7t0Var) throws RemoteException {
        m133749s8(zzlVar, s7t0Var, 2);
    }

    /* JADX INFO: renamed from: s8 */
    public final synchronized void m133749s8(zzl zzlVar, s7t0 s7t0Var, int i) throws RemoteException {
        try {
            boolean z = false;
            if (((Boolean) wis0.f189395l.m149974e()).booleanValue()) {
                if (((Boolean) jas0.m144075c().m176505a(sgs0.f167998Ga)).booleanValue()) {
                    z = true;
                }
            }
            if (this.f108059f.zzc < ((Integer) jas0.m144075c().m176505a(sgs0.f168010Ha)).intValue() || !z) {
                Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
            }
            this.f108055b.m166174D(s7t0Var);
            bxy0.m106934r();
            if (C2098b.m12368g(this.f108058e) && zzlVar.zzs == null) {
                dct0.m115295d("Failed to load the ad because app ID is missing.");
                this.f108055b.mo103145u(v8w0.m200327d(4, null, null));
                return;
            }
            if (this.f108062i != null) {
                return;
            }
            q5w0 q5w0Var = new q5w0(null);
            this.f108054a.m214331i(i);
            this.f108054a.mo95567a(zzlVar, this.f108056c, q5w0Var, new g6w0(this));
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p153l.l7t0
    /* JADX INFO: renamed from: x1 */
    public final synchronized void mo133750x1(boolean z) {
        Preconditions.checkMainThread("setImmersiveMode must be called on the main UI thread.");
        this.f108063j = z;
    }

    @Override // p153l.l7t0
    public final Bundle zzb() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        ksu0 ksu0Var = this.f108062i;
        return ksu0Var != null ? ksu0Var.m151284i() : new Bundle();
    }

    @Override // p153l.l7t0
    @Nullable
    public final tlu0 zzc() {
        ksu0 ksu0Var;
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168078N6)).booleanValue() && (ksu0Var = this.f108062i) != null) {
            return ksu0Var.m152228d();
        }
        return null;
    }

    @Override // p153l.l7t0
    @Nullable
    public final i7t0 zzd() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        ksu0 ksu0Var = this.f108062i;
        if (ksu0Var != null) {
            return ksu0Var.m151285j();
        }
        return null;
    }

    @Override // p153l.l7t0
    @Nullable
    public final synchronized String zze() throws RemoteException {
        ksu0 ksu0Var = this.f108062i;
        if (ksu0Var == null || ksu0Var.m152228d() == null) {
            return null;
        }
        return ksu0Var.m152228d().zzg();
    }

    @Override // p153l.l7t0
    public final boolean zzo() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        ksu0 ksu0Var = this.f108062i;
        return (ksu0Var == null || ksu0Var.m151288m()) ? false : true;
    }
}
