package p149l;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class zbs0 extends jxr0 implements bcs0 {
    public zbs0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
    }

    @Override // p149l.bcs0
    /* JADX INFO: renamed from: i1 */
    public final IBinder mo101123i1(uyl uylVar, uyl uylVar2, uyl uylVar3, int i) throws RemoteException {
        Parcel parcelM143822O = m143822O();
        lxr0.m152089f(parcelM143822O, uylVar);
        lxr0.m152089f(parcelM143822O, uylVar2);
        lxr0.m152089f(parcelM143822O, uylVar3);
        parcelM143822O.writeInt(240304000);
        Parcel parcelM143823P2 = m143823P2(1, parcelM143822O);
        IBinder strongBinder = parcelM143823P2.readStrongBinder();
        parcelM143823P2.recycle();
        return strongBinder;
    }
}
