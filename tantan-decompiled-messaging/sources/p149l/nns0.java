package p149l;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class nns0 extends kxr0 implements ons0 {
    public nns0() {
        super("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    /* JADX INFO: renamed from: o8 */
    public static ons0 m160368o8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
        return iInterfaceQueryLocalInterface instanceof ons0 ? (ons0) iInterfaceQueryLocalInterface : new mns0(iBinder);
    }

    @Override // p149l.kxr0
    /* JADX INFO: renamed from: n8 */
    public final boolean mo98344n8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            String string = parcel.readString();
            lxr0.m152086c(parcel);
            rns0 rns0VarZzb = zzb(string);
            parcel2.writeNoException();
            lxr0.m152089f(parcel2, rns0VarZzb);
        } else if (i == 2) {
            String string2 = parcel.readString();
            lxr0.m152086c(parcel);
            boolean zMo146589c = mo146589c(string2);
            parcel2.writeNoException();
            parcel2.writeInt(zMo146589c ? 1 : 0);
        } else if (i == 3) {
            String string3 = parcel.readString();
            lxr0.m152086c(parcel);
            bqs0 bqs0VarZzc = zzc(string3);
            parcel2.writeNoException();
            lxr0.m152089f(parcel2, bqs0VarZzc);
        } else {
            if (i != 4) {
                return false;
            }
            String string4 = parcel.readString();
            lxr0.m152086c(parcel);
            boolean zMo146590z = mo146590z(string4);
            parcel2.writeNoException();
            parcel2.writeInt(zMo146590z ? 1 : 0);
        }
        return true;
    }
}
