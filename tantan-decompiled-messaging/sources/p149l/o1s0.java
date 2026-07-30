package p149l;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;

/* JADX INFO: loaded from: classes6.dex */
public final class o1s0 extends jxr0 implements q1s0 {
    public o1s0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    @Override // p149l.q1s0
    /* JADX INFO: renamed from: K3 */
    public final void mo134006K3(n1s0 n1s0Var) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        lxr0.m152089f(parcelM143822O, n1s0Var);
        m143825Y2(1, parcelM143822O);
    }

    @Override // p149l.q1s0
    /* JADX INFO: renamed from: K7 */
    public final void mo134007K7(zze zzeVar) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        lxr0.m152087d(parcelM143822O, zzeVar);
        m143825Y2(3, parcelM143822O);
    }

    @Override // p149l.q1s0
    /* JADX INFO: renamed from: e */
    public final void mo134008e(int i) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        parcelM143822O.writeInt(i);
        m143825Y2(2, parcelM143822O);
    }
}
