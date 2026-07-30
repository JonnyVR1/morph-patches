package p153l;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class t7t0 extends p6s0 implements IInterface {
    public t7t0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
    }

    /* JADX INFO: renamed from: m4 */
    public final void m189634m4(i7t0 i7t0Var, String str, String str2) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        r6s0.m180044f(parcelM171038O, i7t0Var);
        parcelM171038O.writeString(str);
        parcelM171038O.writeString(str2);
        m171041Y2(2, parcelM171038O);
    }
}
