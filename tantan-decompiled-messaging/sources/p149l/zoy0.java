package p149l;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class zoy0 extends zzr0 implements iny0 {
    public zoy0() {
        super("com.google.android.gms.maps.internal.IOnCameraMoveStartedListener");
    }

    @Override // p149l.zzr0
    /* JADX INFO: renamed from: O */
    public final boolean mo102858O(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        mo137252b0(parcel.readInt());
        parcel2.writeNoException();
        return true;
    }
}
