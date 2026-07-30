package p149l;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class bis0 extends kxr0 implements cis0 {
    public bis0() {
        super("com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
    }

    @Override // p149l.kxr0
    /* JADX INFO: renamed from: n8 */
    public final boolean mo98344n8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            String string = parcel.readString();
            lxr0.m152086c(parcel);
            mo107097i(string);
        } else {
            if (i != 2) {
                return false;
            }
            zze();
        }
        parcel2.writeNoException();
        return true;
    }
}
