package p149l;

import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.internal.ads.zzcbb;

/* JADX INFO: loaded from: classes6.dex */
public final class esv0 extends eys0 {
    /* JADX INFO: renamed from: p8 */
    public static void m117958p8(final mys0 mys0Var) {
        x2t0.m206866d("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        i2t0.f110583b.post(new Runnable() { // from class: l.zqv0
            @Override // java.lang.Runnable
            public final void run() {
                mys0 mys0Var2 = mys0Var;
                if (mys0Var2 != null) {
                    try {
                        mys0Var2.zze(1);
                    } catch (RemoteException e) {
                        x2t0.m206871i("#007 Could not call remote method.", e);
                    }
                }
            }
        });
    }

    @Override // p149l.fys0
    /* JADX INFO: renamed from: M5 */
    public final void mo104375M5(zzl zzlVar, mys0 mys0Var) throws RemoteException {
        m117958p8(mys0Var);
    }

    @Override // p149l.fys0
    /* JADX INFO: renamed from: s5 */
    public final void mo104381s5(zzl zzlVar, mys0 mys0Var) throws RemoteException {
        m117958p8(mys0Var);
    }

    @Override // p149l.fys0
    public final Bundle zzb() throws RemoteException {
        return new Bundle();
    }

    @Override // p149l.fys0
    public final ncu0 zzc() {
        return null;
    }

    @Override // p149l.fys0
    @Nullable
    public final cys0 zzd() {
        return null;
    }

    @Override // p149l.fys0
    public final String zze() throws RemoteException {
        return "";
    }

    @Override // p149l.fys0
    public final boolean zzo() throws RemoteException {
        return false;
    }

    @Override // p149l.fys0
    /* JADX INFO: renamed from: J4 */
    public final void mo104374J4(yzt0 yzt0Var) throws RemoteException {
    }

    @Override // p149l.fys0
    /* JADX INFO: renamed from: N5 */
    public final void mo104376N5(s3u0 s3u0Var) {
    }

    @Override // p149l.fys0
    /* JADX INFO: renamed from: R0 */
    public final void mo104377R0(iys0 iys0Var) throws RemoteException {
    }

    @Override // p149l.fys0
    /* JADX INFO: renamed from: R2 */
    public final void mo104378R2(nys0 nys0Var) throws RemoteException {
    }

    @Override // p149l.fys0
    /* JADX INFO: renamed from: g0 */
    public final void mo104379g0(uyl uylVar) throws RemoteException {
    }

    @Override // p149l.fys0
    /* JADX INFO: renamed from: i2 */
    public final void mo104380i2(zzcbb zzcbbVar) {
    }

    @Override // p149l.fys0
    /* JADX INFO: renamed from: x1 */
    public final void mo104383x1(boolean z) {
    }

    @Override // p149l.fys0
    /* JADX INFO: renamed from: B0 */
    public final void mo104373B0(uyl uylVar, boolean z) {
    }
}
