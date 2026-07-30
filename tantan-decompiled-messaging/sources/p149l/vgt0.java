package p149l;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class vgt0 extends jxr0 implements IInterface {
    public vgt0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
    }

    /* JADX INFO: renamed from: m4 */
    public final IBinder m198389m4(uyl uylVar, int i) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        lxr0.m152089f(parcelM143822O, uylVar);
        parcelM143822O.writeInt(240304000);
        Parcel parcelM143823P2 = m143823P2(1, parcelM143822O);
        IBinder strongBinder = parcelM143823P2.readStrongBinder();
        parcelM143823P2.recycle();
        return strongBinder;
    }
}
