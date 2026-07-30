package p149l;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class u0t0 extends kxr0 implements v0t0 {
    public u0t0() {
        super("com.google.android.gms.ads.internal.signals.ISignalCallback");
    }

    @Override // p149l.kxr0
    /* JADX INFO: renamed from: n8 */
    public final boolean mo98344n8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            parcel.readString();
            parcel.readString();
            lxr0.m152086c(parcel);
        } else if (i == 2) {
            String string = parcel.readString();
            lxr0.m152086c(parcel);
            zzb(string);
        } else {
            if (i != 3) {
                return false;
            }
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            Bundle bundle = (Bundle) lxr0.m152084a(parcel, Bundle.CREATOR);
            lxr0.m152086c(parcel);
            mo147220R4(string2, string3, bundle);
        }
        parcel2.writeNoException();
        return true;
    }
}
