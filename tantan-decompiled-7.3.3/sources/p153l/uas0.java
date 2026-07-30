package p153l;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;

/* JADX INFO: loaded from: classes6.dex */
public final class uas0 extends p6s0 implements was0 {
    public uas0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    @Override // p153l.was0
    /* JADX INFO: renamed from: K3 */
    public final void mo166850K3(tas0 tas0Var) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        r6s0.m180044f(parcelM171038O, tas0Var);
        m171041Y2(1, parcelM171038O);
    }

    @Override // p153l.was0
    /* JADX INFO: renamed from: K7 */
    public final void mo166851K7(zze zzeVar) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        r6s0.m180042d(parcelM171038O, zzeVar);
        m171041Y2(3, parcelM171038O);
    }

    @Override // p153l.was0
    /* JADX INFO: renamed from: e */
    public final void mo166852e(int i) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        parcelM171038O.writeInt(i);
        m171041Y2(2, parcelM171038O);
    }
}
