package p153l;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class alt0 extends p6s0 implements clt0 {
    public alt0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.measurement.IMeasurementManager");
    }

    @Override // p153l.clt0
    /* JADX INFO: renamed from: c4 */
    public final void mo98722c4(p1m p1mVar, zkt0 zkt0Var) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        r6s0.m180044f(parcelM171038O, p1mVar);
        r6s0.m180044f(parcelM171038O, zkt0Var);
        m171041Y2(2, parcelM171038O);
    }
}
