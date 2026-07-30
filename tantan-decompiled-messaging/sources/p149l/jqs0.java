package p149l;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzq;

/* JADX INFO: loaded from: classes6.dex */
public final class jqs0 extends jxr0 implements IInterface {
    public jqs0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManagerCreator");
    }

    /* JADX INFO: renamed from: m4 */
    public final IBinder m142851m4(uyl uylVar, zzq zzqVar, String str, ons0 ons0Var, int i, int i2) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        lxr0.m152089f(parcelM143822O, uylVar);
        lxr0.m152087d(parcelM143822O, zzqVar);
        parcelM143822O.writeString(str);
        lxr0.m152089f(parcelM143822O, ons0Var);
        parcelM143822O.writeInt(240304000);
        parcelM143822O.writeInt(i2);
        Parcel parcelM143823P2 = m143823P2(2, parcelM143822O);
        IBinder strongBinder = parcelM143823P2.readStrongBinder();
        parcelM143823P2.recycle();
        return strongBinder;
    }
}
