package p149l;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class kss0 extends kxr0 implements lss0 {
    public kss0() {
        super("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    /* JADX INFO: renamed from: o8 */
    public static lss0 m147103o8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
        return iInterfaceQueryLocalInterface instanceof lss0 ? (lss0) iInterfaceQueryLocalInterface : new jss0(iBinder);
    }

    @Override // p149l.kxr0
    /* JADX INFO: renamed from: n8 */
    public final boolean mo98344n8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                Bundle bundle = (Bundle) lxr0.m152084a(parcel, Bundle.CREATOR);
                lxr0.m152086c(parcel);
                mo12280z5(bundle);
                parcel2.writeNoException();
                return true;
            case 2:
                parcel2.writeNoException();
                return true;
            case 3:
                zzt();
                parcel2.writeNoException();
                return true;
            case 4:
                zzr();
                parcel2.writeNoException();
                return true;
            case 5:
                zzo();
                parcel2.writeNoException();
                return true;
            case 6:
                Bundle bundle2 = (Bundle) lxr0.m152084a(parcel, Bundle.CREATOR);
                lxr0.m152086c(parcel);
                mo12277v0(bundle2);
                parcel2.writeNoException();
                lxr0.m152088e(parcel2, bundle2);
                return true;
            case 7:
                zzu();
                parcel2.writeNoException();
                return true;
            case 8:
                zzm();
                parcel2.writeNoException();
                return true;
            case 9:
                mo12268g();
                parcel2.writeNoException();
                return true;
            case 10:
                zzi();
                parcel2.writeNoException();
                return true;
            case 11:
                boolean zMo12270o = mo12270o();
                parcel2.writeNoException();
                ClassLoader classLoader = lxr0.f130430a;
                parcel2.writeInt(zMo12270o ? 1 : 0);
                return true;
            case 12:
                parcel.readInt();
                parcel.readInt();
                lxr0.m152086c(parcel);
                parcel2.writeNoException();
                return true;
            case 13:
                uyl uylVarM196295O = uyl.AbstractBinderC20541a.m196295O(parcel.readStrongBinder());
                lxr0.m152086c(parcel);
                mo12261C(uylVarM196295O);
                parcel2.writeNoException();
                return true;
            case 14:
                mo12266b();
                parcel2.writeNoException();
                return true;
            case 15:
                int i3 = parcel.readInt();
                String[] strArrCreateStringArray = parcel.createStringArray();
                int[] iArrCreateIntArray = parcel.createIntArray();
                lxr0.m152086c(parcel);
                mo12269g1(i3, strArrCreateStringArray, iArrCreateIntArray);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
