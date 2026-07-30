package p153l;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzc;

/* JADX INFO: loaded from: classes6.dex */
public final class h6z0 extends q1t0 {

    /* JADX INFO: renamed from: a */
    public final AdOverlayInfoParcel f108070a;

    /* JADX INFO: renamed from: b */
    public final Activity f108071b;

    /* JADX INFO: renamed from: c */
    public boolean f108072c = false;

    /* JADX INFO: renamed from: d */
    public boolean f108073d = false;

    /* JADX INFO: renamed from: e */
    public boolean f108074e = false;

    public h6z0(Activity activity, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.f108070a = adOverlayInfoParcel;
        this.f108071b = activity;
    }

    private final synchronized void zzb() {
        try {
            if (this.f108073d) {
                return;
            }
            joy0 joy0Var = this.f108070a.zzc;
            if (joy0Var != null) {
                joy0Var.mo113769m5(4);
            }
            this.f108073d = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p153l.r1t0
    /* JADX INFO: renamed from: b */
    public final void mo12320b() throws RemoteException {
        joy0 joy0Var = this.f108070a.zzc;
        if (joy0Var != null) {
            joy0Var.mo113768m4();
        }
    }

    @Override // p153l.r1t0
    /* JADX INFO: renamed from: g */
    public final void mo12322g() throws RemoteException {
        this.f108074e = true;
    }

    @Override // p153l.r1t0
    /* JADX INFO: renamed from: o */
    public final boolean mo12324o() throws RemoteException {
        return false;
    }

    @Override // p153l.r1t0
    /* JADX INFO: renamed from: v0 */
    public final void mo12331v0(Bundle bundle) throws RemoteException {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.f108072c);
    }

    @Override // p153l.r1t0
    /* JADX INFO: renamed from: z5 */
    public final void mo12334z5(@Nullable Bundle bundle) {
        joy0 joy0Var;
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168056L8)).booleanValue() && !this.f108074e) {
            this.f108071b.requestWindowFeature(1);
        }
        boolean z = false;
        if (bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false)) {
            z = true;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.f108070a;
        if (adOverlayInfoParcel == null) {
            this.f108071b.finish();
            return;
        }
        if (z) {
            this.f108071b.finish();
            return;
        }
        if (bundle == null) {
            har0 har0Var = adOverlayInfoParcel.zzb;
            if (har0Var != null) {
                har0Var.onAdClicked();
            }
            ggu0 ggu0Var = this.f108070a.zzu;
            if (ggu0Var != null) {
                ggu0Var.zzs();
            }
            if (this.f108071b.getIntent() != null && this.f108071b.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true) && (joy0Var = this.f108070a.zzc) != null) {
                joy0Var.mo113755P2();
            }
        }
        Activity activity = this.f108071b;
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.f108070a;
        bxy0.m106926j();
        zzc zzcVar = adOverlayInfoParcel2.zza;
        if (iar0.m139205b(activity, zzcVar, adOverlayInfoParcel2.zzi, zzcVar.zzi)) {
            return;
        }
        this.f108071b.finish();
    }

    @Override // p153l.r1t0
    public final void zzm() throws RemoteException {
        if (this.f108071b.isFinishing()) {
            zzb();
        }
    }

    @Override // p153l.r1t0
    public final void zzo() throws RemoteException {
        joy0 joy0Var = this.f108070a.zzc;
        if (joy0Var != null) {
            joy0Var.mo113753M6();
        }
        if (this.f108071b.isFinishing()) {
            zzb();
        }
    }

    @Override // p153l.r1t0
    public final void zzr() throws RemoteException {
        if (this.f108072c) {
            this.f108071b.finish();
            return;
        }
        this.f108072c = true;
        joy0 joy0Var = this.f108070a.zzc;
        if (joy0Var != null) {
            joy0Var.mo113765g7();
        }
    }

    @Override // p153l.r1t0
    public final void zzu() throws RemoteException {
        if (this.f108071b.isFinishing()) {
            zzb();
        }
    }

    @Override // p153l.r1t0
    /* JADX INFO: renamed from: a */
    public final void mo12319a() throws RemoteException {
    }

    @Override // p153l.r1t0
    public final void zzi() throws RemoteException {
    }

    @Override // p153l.r1t0
    public final void zzt() throws RemoteException {
    }

    @Override // p153l.r1t0
    /* JADX INFO: renamed from: C */
    public final void mo12315C(p1m p1mVar) throws RemoteException {
    }

    @Override // p153l.r1t0
    /* JADX INFO: renamed from: T6 */
    public final void mo12318T6(int i, int i2, Intent intent) throws RemoteException {
    }

    @Override // p153l.r1t0
    /* JADX INFO: renamed from: g1 */
    public final void mo12323g1(int i, String[] strArr, int[] iArr) {
    }
}
