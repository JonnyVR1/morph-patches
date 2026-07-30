package p153l;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class fyy0 extends f9s0 implements owy0 {
    public fyy0() {
        super("com.google.android.gms.maps.internal.IOnCameraMoveStartedListener");
    }

    @Override // p153l.f9s0
    /* JADX INFO: renamed from: O */
    public final boolean mo124686O(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        mo123332b0(parcel.readInt());
        parcel2.writeNoException();
        return true;
    }
}
