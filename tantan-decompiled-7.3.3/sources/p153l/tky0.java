package p153l;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class tky0 extends f9s0 implements bhy0 {
    public tky0() {
        super("com.google.android.gms.maps.internal.IOnCameraIdleListener");
    }

    @Override // p153l.f9s0
    /* JADX INFO: renamed from: O */
    public final boolean mo124686O(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        mo95878U();
        parcel2.writeNoException();
        return true;
    }
}
