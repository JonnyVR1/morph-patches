package p149l;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzc;

/* JADX INFO: loaded from: classes6.dex */
public final class bxy0 extends kss0 {

    /* JADX INFO: renamed from: a */
    public final AdOverlayInfoParcel f77840a;

    /* JADX INFO: renamed from: b */
    public final Activity f77841b;

    /* JADX INFO: renamed from: c */
    public boolean f77842c = false;

    /* JADX INFO: renamed from: d */
    public boolean f77843d = false;

    /* JADX INFO: renamed from: e */
    public boolean f77844e = false;

    public bxy0(Activity activity, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.f77840a = adOverlayInfoParcel;
        this.f77841b = activity;
    }

    private final synchronized void zzb() {
        try {
            if (this.f77843d) {
                return;
            }
            dfy0 dfy0Var = this.f77840a.zzc;
            if (dfy0Var != null) {
                dfy0Var.mo102687m5(4);
            }
            this.f77843d = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p149l.lss0
    /* JADX INFO: renamed from: b */
    public final void mo12266b() throws RemoteException {
        dfy0 dfy0Var = this.f77840a.zzc;
        if (dfy0Var != null) {
            dfy0Var.mo102686m4();
        }
    }

    @Override // p149l.lss0
    /* JADX INFO: renamed from: g */
    public final void mo12268g() throws RemoteException {
        this.f77844e = true;
    }

    @Override // p149l.lss0
    /* JADX INFO: renamed from: o */
    public final boolean mo12270o() throws RemoteException {
        return false;
    }

    @Override // p149l.lss0
    /* JADX INFO: renamed from: v0 */
    public final void mo12277v0(Bundle bundle) throws RemoteException {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.f77842c);
    }

    @Override // p149l.lss0
    /* JADX INFO: renamed from: z5 */
    public final void mo12280z5(@Nullable Bundle bundle) {
        dfy0 dfy0Var;
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f131985L8)).booleanValue() && !this.f77844e) {
            this.f77841b.requestWindowFeature(1);
        }
        boolean z = false;
        if (bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false)) {
            z = true;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.f77840a;
        if (adOverlayInfoParcel == null) {
            this.f77841b.finish();
            return;
        }
        if (z) {
            this.f77841b.finish();
            return;
        }
        if (bundle == null) {
            b1r0 b1r0Var = adOverlayInfoParcel.zzb;
            if (b1r0Var != null) {
                b1r0Var.onAdClicked();
            }
            a7u0 a7u0Var = this.f77840a.zzu;
            if (a7u0Var != null) {
                a7u0Var.zzs();
            }
            if (this.f77841b.getIntent() != null && this.f77841b.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true) && (dfy0Var = this.f77840a.zzc) != null) {
                dfy0Var.mo102681P2();
            }
        }
        Activity activity = this.f77841b;
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.f77840a;
        vny0.m199072j();
        zzc zzcVar = adOverlayInfoParcel2.zza;
        if (c1r0.m104874b(activity, zzcVar, adOverlayInfoParcel2.zzi, zzcVar.zzi)) {
            return;
        }
        this.f77841b.finish();
    }

    @Override // p149l.lss0
    public final void zzm() throws RemoteException {
        if (this.f77841b.isFinishing()) {
            zzb();
        }
    }

    @Override // p149l.lss0
    public final void zzo() throws RemoteException {
        dfy0 dfy0Var = this.f77840a.zzc;
        if (dfy0Var != null) {
            dfy0Var.mo102678M6();
        }
        if (this.f77841b.isFinishing()) {
            zzb();
        }
    }

    @Override // p149l.lss0
    public final void zzr() throws RemoteException {
        if (this.f77842c) {
            this.f77841b.finish();
            return;
        }
        this.f77842c = true;
        dfy0 dfy0Var = this.f77840a.zzc;
        if (dfy0Var != null) {
            dfy0Var.mo102683g7();
        }
    }

    @Override // p149l.lss0
    public final void zzu() throws RemoteException {
        if (this.f77841b.isFinishing()) {
            zzb();
        }
    }

    @Override // p149l.lss0
    /* JADX INFO: renamed from: a */
    public final void mo12265a() throws RemoteException {
    }

    @Override // p149l.lss0
    public final void zzi() throws RemoteException {
    }

    @Override // p149l.lss0
    public final void zzt() throws RemoteException {
    }

    @Override // p149l.lss0
    /* JADX INFO: renamed from: C */
    public final void mo12261C(uyl uylVar) throws RemoteException {
    }

    @Override // p149l.lss0
    /* JADX INFO: renamed from: T6 */
    public final void mo12264T6(int i, int i2, Intent intent) throws RemoteException {
    }

    @Override // p149l.lss0
    /* JADX INFO: renamed from: g1 */
    public final void mo12269g1(int i, String[] strArr, int[] iArr) {
    }
}
