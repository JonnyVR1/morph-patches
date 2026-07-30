package p153l;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzq;

/* JADX INFO: loaded from: classes6.dex */
public final class pzs0 extends p6s0 implements IInterface {
    public pzs0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManagerCreator");
    }

    /* JADX INFO: renamed from: m4 */
    public final IBinder m174620m4(p1m p1mVar, zzq zzqVar, String str, uws0 uws0Var, int i, int i2) throws RemoteException {
        Parcel parcelM171038O = m171038O();
        r6s0.m180044f(parcelM171038O, p1mVar);
        r6s0.m180042d(parcelM171038O, zzqVar);
        parcelM171038O.writeString(str);
        r6s0.m180044f(parcelM171038O, uws0Var);
        parcelM171038O.writeInt(240304000);
        parcelM171038O.writeInt(i2);
        Parcel parcelM171039P2 = m171039P2(2, parcelM171038O);
        IBinder strongBinder = parcelM171039P2.readStrongBinder();
        parcelM171039P2.recycle();
        return strongBinder;
    }
}
