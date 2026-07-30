package p153l;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ils0 extends q6s0 implements jls0 {
    public ils0() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
    }

    @Override // p153l.q6s0
    /* JADX INFO: renamed from: n8 */
    public final boolean mo96668n8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            p1m p1mVarM170217O = p1m.AbstractBinderC19271a.m170217O(parcel.readStrongBinder());
            r6s0.m180041c(parcel);
            mo146103R(p1mVarM170217O);
        } else if (i == 2) {
            zzd();
        } else {
            if (i != 3) {
                return false;
            }
            p1m p1mVarM170217O2 = p1m.AbstractBinderC19271a.m170217O(parcel.readStrongBinder());
            r6s0.m180041c(parcel);
            mo146104j2(p1mVarM170217O2);
        }
        parcel2.writeNoException();
        return true;
    }
}
