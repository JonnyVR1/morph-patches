package p149l;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class tpr0 extends zzr0 implements bor0 {
    public tpr0() {
        super("com.google.android.gms.maps.internal.IOnMarkerClickListener");
    }

    @Override // p149l.zzr0
    /* JADX INFO: renamed from: O */
    public final boolean mo102858O(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        boolean zMo102981l5 = mo102981l5(uoy0.m194581P2(parcel.readStrongBinder()));
        parcel2.writeNoException();
        sws0.m186356a(parcel2, zMo102981l5);
        return true;
    }
}
