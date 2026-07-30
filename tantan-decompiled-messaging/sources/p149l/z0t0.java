package p149l;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public final class z0t0 extends jxr0 implements b1t0 {
    public z0t0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator");
    }

    @Override // p149l.b1t0
    /* JADX INFO: renamed from: s0 */
    public final y0t0 mo99873s0(uyl uylVar, ons0 ons0Var, int i) throws RemoteException {
        y0t0 w0t0Var;
        Parcel parcelM143822O = m143822O();
        lxr0.m152089f(parcelM143822O, uylVar);
        lxr0.m152089f(parcelM143822O, ons0Var);
        parcelM143822O.writeInt(240304000);
        Parcel parcelM143823P2 = m143823P2(2, parcelM143822O);
        IBinder strongBinder = parcelM143823P2.readStrongBinder();
        if (strongBinder == null) {
            w0t0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
            w0t0Var = iInterfaceQueryLocalInterface instanceof y0t0 ? (y0t0) iInterfaceQueryLocalInterface : new w0t0(strongBinder);
        }
        parcelM143823P2.recycle();
        return w0t0Var;
    }
}
