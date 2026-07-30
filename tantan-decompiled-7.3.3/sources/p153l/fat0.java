package p153l;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class fat0 extends p6s0 implements hat0 {
    public fat0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator");
    }

    @Override // p153l.hat0
    /* JADX INFO: renamed from: s0 */
    public final eat0 mo124770s0(p1m p1mVar, uws0 uws0Var, int i) throws RemoteException {
        eat0 cat0Var;
        Parcel parcelM171038O = m171038O();
        r6s0.m180044f(parcelM171038O, p1mVar);
        r6s0.m180044f(parcelM171038O, uws0Var);
        parcelM171038O.writeInt(240304000);
        Parcel parcelM171039P2 = m171039P2(2, parcelM171038O);
        IBinder strongBinder = parcelM171039P2.readStrongBinder();
        if (strongBinder == null) {
            cat0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
            cat0Var = iInterfaceQueryLocalInterface instanceof eat0 ? (eat0) iInterfaceQueryLocalInterface : new cat0(strongBinder);
        }
        parcelM171039P2.recycle();
        return cat0Var;
    }
}
