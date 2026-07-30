package p153l;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class zyr0 extends f9s0 implements hxr0 {
    public zyr0() {
        super("com.google.android.gms.maps.internal.IOnMarkerClickListener");
    }

    @Override // p153l.f9s0
    /* JADX INFO: renamed from: O */
    public final boolean mo124686O(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        boolean zMo137650l5 = mo137650l5(ayy0.m100972P2(parcel.readStrongBinder()));
        parcel2.writeNoException();
        y5t0.m214318a(parcel2, zMo137650l5);
        return true;
    }
}
