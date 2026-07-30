package p153l;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzff;
import com.google.android.gms.internal.ads.zzbpd;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class xlt0 extends p6s0 implements mot0 {
    public xlt0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // p153l.mot0
    /* JADX INFO: renamed from: C3 */
    public final void mo156009C3(uws0 uws0Var) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        r6s0.m180044f(parcelM171038O, uws0Var);
        m171041Y2(11, parcelM171038O);
    }

    @Override // p153l.mot0
    /* JADX INFO: renamed from: G7 */
    public final void mo156010G7(zzff zzffVar) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        r6s0.m180042d(parcelM171038O, zzffVar);
        m171041Y2(14, parcelM171038O);
    }

    @Override // p153l.mot0
    /* JADX INFO: renamed from: b5 */
    public final void mo156016b5(lss0 lss0Var) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        r6s0.m180044f(parcelM171038O, lss0Var);
        m171041Y2(12, parcelM171038O);
    }

    @Override // p153l.mot0
    /* JADX INFO: renamed from: j6 */
    public final void mo156017j6(String str, p1m p1mVar) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        parcelM171038O.writeString(null);
        r6s0.m180044f(parcelM171038O, p1mVar);
        m171041Y2(6, parcelM171038O);
    }

    @Override // p153l.mot0
    /* JADX INFO: renamed from: p6 */
    public final void mo156018p6(String str) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        parcelM171038O.writeString(str);
        m171041Y2(18, parcelM171038O);
    }

    @Override // p153l.mot0
    public final List zzg() throws RemoteException {
        Parcel parcelM171039P2 = m171039P2(13, m171038O());
        ArrayList arrayListCreateTypedArrayList = parcelM171039P2.createTypedArrayList(zzbpd.CREATOR);
        parcelM171039P2.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // p153l.mot0
    public final void zzk() throws RemoteException {
        m171041Y2(1, m171038O());
    }
}
