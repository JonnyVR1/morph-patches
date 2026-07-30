package p149l;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class taw0 extends kxr0 implements uaw0 {
    public taw0() {
        super("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    @Override // p149l.kxr0
    /* JADX INFO: renamed from: n8 */
    public final boolean mo98344n8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 2:
                uyl.AbstractBinderC20541a.m196295O(parcel.readStrongBinder());
                parcel.readString();
                lxr0.m152086c(parcel);
                break;
            case 3:
                break;
            case 4:
                parcel.createIntArray();
                lxr0.m152086c(parcel);
                break;
            case 5:
                parcel.createByteArray();
                lxr0.m152086c(parcel);
                break;
            case 6:
                parcel.readInt();
                lxr0.m152086c(parcel);
                break;
            case 7:
                parcel.readInt();
                lxr0.m152086c(parcel);
                break;
            case 8:
                uyl.AbstractBinderC20541a.m196295O(parcel.readStrongBinder());
                parcel.readString();
                parcel.readString();
                lxr0.m152086c(parcel);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
