package p149l;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzl;

/* JADX INFO: loaded from: classes6.dex */
public final class bgv0 extends efs0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ hhv0 f75527a;

    public /* synthetic */ bgv0(hhv0 hhv0Var, wev0 wev0Var) {
        this.f75527a = hhv0Var;
    }

    @Override // p149l.fgs0
    /* JADX INFO: renamed from: l3 */
    public final void mo101747l3(zzl zzlVar) throws RemoteException {
        mo101748p2(zzlVar, 1);
    }

    @Override // p149l.fgs0
    /* JADX INFO: renamed from: p2 */
    public final void mo101748p2(zzl zzlVar, int i) throws RemoteException {
        x2t0.m206866d("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        i2t0.f110583b.post(new rdv0(this));
    }

    @Override // p149l.fgs0
    @Nullable
    public final String zze() throws RemoteException {
        return null;
    }

    @Override // p149l.fgs0
    @Nullable
    public final String zzf() throws RemoteException {
        return null;
    }

    @Override // p149l.fgs0
    public final boolean zzi() throws RemoteException {
        return false;
    }
}
