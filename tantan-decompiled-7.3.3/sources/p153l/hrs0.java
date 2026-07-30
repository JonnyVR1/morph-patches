package p153l;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class hrs0 extends q6s0 implements irs0 {
    public hrs0() {
        super("com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
    }

    @Override // p153l.q6s0
    /* JADX INFO: renamed from: n8 */
    public final boolean mo96668n8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            String string = parcel.readString();
            r6s0.m180041c(parcel);
            mo141849i(string);
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
