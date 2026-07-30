package p153l;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class cks0 extends p6s0 implements IInterface {
    public cks0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
    }

    /* JADX INFO: renamed from: m4 */
    public final void m110387m4(k3t0 k3t0Var) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        r6s0.m180044f(parcelM171038O, k3t0Var);
        m171041Y2(1, parcelM171038O);
    }
}
