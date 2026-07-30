package p153l;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class p7t0 extends p6s0 implements IInterface {
    public p7t0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator");
    }

    /* JADX INFO: renamed from: m4 */
    public final IBinder m171168m4(p1m p1mVar, String str, uws0 uws0Var, int i) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        r6s0.m180044f(parcelM171038O, p1mVar);
        parcelM171038O.writeString(str);
        r6s0.m180044f(parcelM171038O, uws0Var);
        parcelM171038O.writeInt(240304000);
        Parcel parcelM171039P2 = m171039P2(1, parcelM171038O);
        IBinder strongBinder = parcelM171039P2.readStrongBinder();
        parcelM171039P2.recycle();
        return strongBinder;
    }
}
