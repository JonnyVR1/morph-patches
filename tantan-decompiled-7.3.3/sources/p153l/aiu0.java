package p153l;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class aiu0 extends p6s0 implements IInterface {
    public aiu0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOutOfContextTesterCreator");
    }

    /* JADX INFO: renamed from: m4 */
    public final tgu0 m98026m4(p1m p1mVar, uws0 uws0Var, int i) throws RemoteException {
        tgu0 eeu0Var;
        Parcel parcelM171038O = m171038O();
        r6s0.m180044f(parcelM171038O, p1mVar);
        r6s0.m180044f(parcelM171038O, uws0Var);
        parcelM171038O.writeInt(240304000);
        Parcel parcelM171039P2 = m171039P2(1, parcelM171038O);
        IBinder strongBinder = parcelM171039P2.readStrongBinder();
        if (strongBinder == null) {
            eeu0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTester");
            eeu0Var = iInterfaceQueryLocalInterface instanceof tgu0 ? (tgu0) iInterfaceQueryLocalInterface : new eeu0(strongBinder);
        }
        parcelM171039P2.recycle();
        return eeu0Var;
    }
}
