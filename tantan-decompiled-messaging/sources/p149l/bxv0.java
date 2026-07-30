package p149l;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.util.C2075b;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzcbb;
import com.google.android.gms.internal.ads.zzcei;

/* JADX INFO: loaded from: classes6.dex */
public final class bxv0 extends eys0 {

    /* JADX INFO: renamed from: a */
    public final swv0 f77825a;

    /* JADX INFO: renamed from: b */
    public final iwv0 f77826b;

    /* JADX INFO: renamed from: c */
    public final String f77827c;

    /* JADX INFO: renamed from: d */
    public final wxv0 f77828d;

    /* JADX INFO: renamed from: e */
    public final Context f77829e;

    /* JADX INFO: renamed from: f */
    public final zzcei f77830f;

    /* JADX INFO: renamed from: g */
    public final ptr0 f77831g;

    /* JADX INFO: renamed from: h */
    public final rnu0 f77832h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public eju0 f77833i;

    /* JADX INFO: renamed from: j */
    public boolean f77834j = ((Boolean) d1s0.m109677c().m144697a(m7s0.f131881D0)).booleanValue();

    public bxv0(@Nullable String str, swv0 swv0Var, Context context, iwv0 iwv0Var, wxv0 wxv0Var, zzcei zzceiVar, ptr0 ptr0Var, rnu0 rnu0Var) {
        this.f77827c = str;
        this.f77825a = swv0Var;
        this.f77826b = iwv0Var;
        this.f77828d = wxv0Var;
        this.f77829e = context;
        this.f77830f = zzceiVar;
        this.f77831g = ptr0Var;
        this.f77832h = rnu0Var;
    }

    @Override // p149l.fys0
    /* JADX INFO: renamed from: B0 */
    public final synchronized void mo104373B0(uyl uylVar, boolean z) throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (this.f77833i == null) {
            x2t0.m206869g("Rewarded can not be shown before loaded");
            this.f77826b.mo134396k(pzv0.m172256d(9, null, null));
            return;
        }
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132477z2)).booleanValue()) {
            this.f77831g.m171378c().mo136907d(new Throwable().getStackTrace());
        }
        this.f77833i.m116907o(z, (Activity) s050.m181847P2(uylVar));
    }

    @Override // p149l.fys0
    /* JADX INFO: renamed from: J4 */
    public final void mo104374J4(yzt0 yzt0Var) {
        iwv0 iwv0Var = this.f77826b;
        if (yzt0Var == null) {
            iwv0Var.m138774z(null);
        } else {
            iwv0Var.m138774z(new zwv0(this, yzt0Var));
        }
    }

    @Override // p149l.fys0
    /* JADX INFO: renamed from: M5 */
    public final synchronized void mo104375M5(zzl zzlVar, mys0 mys0Var) throws RemoteException {
        m104382s8(zzlVar, mys0Var, 3);
    }

    @Override // p149l.fys0
    /* JADX INFO: renamed from: N5 */
    public final void mo104376N5(s3u0 s3u0Var) {
        Preconditions.checkMainThread("setOnPaidEventListener must be called on the main UI thread.");
        try {
            if (!s3u0Var.zzf()) {
                this.f77832h.m180209e();
            }
        } catch (RemoteException e) {
            x2t0.m206865c("Error in making CSI ping for reporting paid event callback", e);
        }
        this.f77826b.m138767A(s3u0Var);
    }

    @Override // p149l.fys0
    /* JADX INFO: renamed from: R0 */
    public final void mo104377R0(iys0 iys0Var) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        this.f77826b.m138768B(iys0Var);
    }

    @Override // p149l.fys0
    /* JADX INFO: renamed from: R2 */
    public final void mo104378R2(nys0 nys0Var) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        this.f77826b.m138772P(nys0Var);
    }

    @Override // p149l.fys0
    /* JADX INFO: renamed from: g0 */
    public final synchronized void mo104379g0(uyl uylVar) throws RemoteException {
        mo104373B0(uylVar, this.f77834j);
    }

    @Override // p149l.fys0
    /* JADX INFO: renamed from: i2 */
    public final synchronized void mo104380i2(zzcbb zzcbbVar) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        wxv0 wxv0Var = this.f77828d;
        wxv0Var.f188521a = zzcbbVar.zza;
        wxv0Var.f188522b = zzcbbVar.zzb;
    }

    @Override // p149l.fys0
    /* JADX INFO: renamed from: s5 */
    public final synchronized void mo104381s5(zzl zzlVar, mys0 mys0Var) throws RemoteException {
        m104382s8(zzlVar, mys0Var, 2);
    }

    /* JADX INFO: renamed from: s8 */
    public final synchronized void m104382s8(zzl zzlVar, mys0 mys0Var, int i) throws RemoteException {
        try {
            boolean z = false;
            if (((Boolean) q9s0.f153481l.m115379e()).booleanValue()) {
                if (((Boolean) d1s0.m109677c().m144697a(m7s0.f131927Ga)).booleanValue()) {
                    z = true;
                }
            }
            if (this.f77830f.zzc < ((Integer) d1s0.m109677c().m144697a(m7s0.f131939Ha)).intValue() || !z) {
                Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
            }
            this.f77826b.m138769D(mys0Var);
            vny0.m199080r();
            if (C2075b.m12314g(this.f77829e) && zzlVar.zzs == null) {
                x2t0.m206866d("Failed to load the ad because app ID is missing.");
                this.f77826b.mo97693u(pzv0.m172256d(4, null, null));
                return;
            }
            if (this.f77833i != null) {
                return;
            }
            kwv0 kwv0Var = new kwv0(null);
            this.f77825a.m186385i(i);
            this.f77825a.mo113608a(zzlVar, this.f77827c, kwv0Var, new axv0(this));
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p149l.fys0
    /* JADX INFO: renamed from: x1 */
    public final synchronized void mo104383x1(boolean z) {
        Preconditions.checkMainThread("setImmersiveMode must be called on the main UI thread.");
        this.f77834j = z;
    }

    @Override // p149l.fys0
    public final Bundle zzb() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        eju0 eju0Var = this.f77833i;
        return eju0Var != null ? eju0Var.m116901i() : new Bundle();
    }

    @Override // p149l.fys0
    @Nullable
    public final ncu0 zzc() {
        eju0 eju0Var;
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132007N6)).booleanValue() && (eju0Var = this.f77833i) != null) {
            return eju0Var.m117798d();
        }
        return null;
    }

    @Override // p149l.fys0
    @Nullable
    public final cys0 zzd() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        eju0 eju0Var = this.f77833i;
        if (eju0Var != null) {
            return eju0Var.m116902j();
        }
        return null;
    }

    @Override // p149l.fys0
    @Nullable
    public final synchronized String zze() throws RemoteException {
        eju0 eju0Var = this.f77833i;
        if (eju0Var == null || eju0Var.m117798d() == null) {
            return null;
        }
        return eju0Var.m117798d().zzg();
    }

    @Override // p149l.fys0
    public final boolean zzo() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        eju0 eju0Var = this.f77833i;
        return (eju0Var == null || eju0Var.m116905m()) ? false : true;
    }
}
