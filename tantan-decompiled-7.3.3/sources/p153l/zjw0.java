package p153l;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class zjw0 extends q6s0 implements akw0 {
    public zjw0() {
        super("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    @Override // p153l.q6s0
    /* JADX INFO: renamed from: n8 */
    public final boolean mo96668n8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 2:
                p1m.AbstractBinderC19271a.m170217O(parcel.readStrongBinder());
                parcel.readString();
                r6s0.m180041c(parcel);
                break;
            case 3:
                break;
            case 4:
                parcel.createIntArray();
                r6s0.m180041c(parcel);
                break;
            case 5:
                parcel.createByteArray();
                r6s0.m180041c(parcel);
                break;
            case 6:
                parcel.readInt();
                r6s0.m180041c(parcel);
                break;
            case 7:
                parcel.readInt();
                r6s0.m180041c(parcel);
                break;
            case 8:
                p1m.AbstractBinderC19271a.m170217O(parcel.readStrongBinder());
                parcel.readString();
                parcel.readString();
                r6s0.m180041c(parcel);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
