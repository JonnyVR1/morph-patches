package p149l;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class u8u0 extends jxr0 implements IInterface {
    public u8u0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOutOfContextTesterCreator");
    }

    /* JADX INFO: renamed from: m4 */
    public final n7u0 m192258m4(uyl uylVar, ons0 ons0Var, int i) throws RemoteException {
        n7u0 y4u0Var;
        Parcel parcelM143822O = m143822O();
        lxr0.m152089f(parcelM143822O, uylVar);
        lxr0.m152089f(parcelM143822O, ons0Var);
        parcelM143822O.writeInt(240304000);
        Parcel parcelM143823P2 = m143823P2(1, parcelM143822O);
        IBinder strongBinder = parcelM143823P2.readStrongBinder();
        if (strongBinder == null) {
            y4u0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTester");
            y4u0Var = iInterfaceQueryLocalInterface instanceof n7u0 ? (n7u0) iInterfaceQueryLocalInterface : new y4u0(strongBinder);
        }
        parcelM143823P2.recycle();
        return y4u0Var;
    }
}
