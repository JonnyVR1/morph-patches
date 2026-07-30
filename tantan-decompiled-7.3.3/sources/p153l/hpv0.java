package p153l;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzl;

/* JADX INFO: loaded from: classes6.dex */
public final class hpv0 extends kos0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ nqv0 f111052a;

    public /* synthetic */ hpv0(nqv0 nqv0Var, cov0 cov0Var) {
        this.f111052a = nqv0Var;
    }

    @Override // p153l.lps0
    /* JADX INFO: renamed from: l3 */
    public final void mo136584l3(zzl zzlVar) throws RemoteException {
        mo136585p2(zzlVar, 1);
    }

    @Override // p153l.lps0
    /* JADX INFO: renamed from: p2 */
    public final void mo136585p2(zzl zzlVar, int i) throws RemoteException {
        dct0.m115295d("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        obt0.f146613b.post(new xmv0(this));
    }

    @Override // p153l.lps0
    @Nullable
    public final String zze() throws RemoteException {
        return null;
    }

    @Override // p153l.lps0
    @Nullable
    public final String zzf() throws RemoteException {
        return null;
    }

    @Override // p153l.lps0
    public final boolean zzi() throws RemoteException {
        return false;
    }
}
