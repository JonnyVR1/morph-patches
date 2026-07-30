package p153l;

import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.internal.ads.zzcbb;

/* JADX INFO: loaded from: classes6.dex */
public final class k1w0 extends k7t0 {
    /* JADX INFO: renamed from: p8 */
    public static void m147927p8(final s7t0 s7t0Var) {
        dct0.m115295d("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        obt0.f146613b.post(new Runnable() { // from class: l.f0w0
            @Override // java.lang.Runnable
            public final void run() {
                s7t0 s7t0Var2 = s7t0Var;
                if (s7t0Var2 != null) {
                    try {
                        s7t0Var2.zze(1);
                    } catch (RemoteException e) {
                        dct0.m115300i("#007 Could not call remote method.", e);
                    }
                }
            }
        });
    }

    @Override // p153l.l7t0
    /* JADX INFO: renamed from: M5 */
    public final void mo133742M5(zzl zzlVar, s7t0 s7t0Var) throws RemoteException {
        m147927p8(s7t0Var);
    }

    @Override // p153l.l7t0
    /* JADX INFO: renamed from: s5 */
    public final void mo133748s5(zzl zzlVar, s7t0 s7t0Var) throws RemoteException {
        m147927p8(s7t0Var);
    }

    @Override // p153l.l7t0
    public final Bundle zzb() throws RemoteException {
        return new Bundle();
    }

    @Override // p153l.l7t0
    public final tlu0 zzc() {
        return null;
    }

    @Override // p153l.l7t0
    @Nullable
    public final i7t0 zzd() {
        return null;
    }

    @Override // p153l.l7t0
    public final String zze() throws RemoteException {
        return "";
    }

    @Override // p153l.l7t0
    public final boolean zzo() throws RemoteException {
        return false;
    }

    @Override // p153l.l7t0
    /* JADX INFO: renamed from: J4 */
    public final void mo133741J4(e9u0 e9u0Var) throws RemoteException {
    }

    @Override // p153l.l7t0
    /* JADX INFO: renamed from: N5 */
    public final void mo133743N5(ycu0 ycu0Var) {
    }

    @Override // p153l.l7t0
    /* JADX INFO: renamed from: R0 */
    public final void mo133744R0(o7t0 o7t0Var) throws RemoteException {
    }

    @Override // p153l.l7t0
    /* JADX INFO: renamed from: R2 */
    public final void mo133745R2(t7t0 t7t0Var) throws RemoteException {
    }

    @Override // p153l.l7t0
    /* JADX INFO: renamed from: g0 */
    public final void mo133746g0(p1m p1mVar) throws RemoteException {
    }

    @Override // p153l.l7t0
    /* JADX INFO: renamed from: i2 */
    public final void mo133747i2(zzcbb zzcbbVar) {
    }

    @Override // p153l.l7t0
    /* JADX INFO: renamed from: x1 */
    public final void mo133750x1(boolean z) {
    }

    @Override // p153l.l7t0
    /* JADX INFO: renamed from: B0 */
    public final void mo133740B0(p1m p1mVar, boolean z) {
    }
}
