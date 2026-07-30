package p149l;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class xbs0 extends kxr0 implements ybs0 {
    public xbs0() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    /* JADX INFO: renamed from: o8 */
    public static ybs0 m207734o8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
        return iInterfaceQueryLocalInterface instanceof ybs0 ? (ybs0) iInterfaceQueryLocalInterface : new wbs0(iBinder);
    }

    @Override // p149l.kxr0
    /* JADX INFO: renamed from: n8 */
    public final boolean mo98344n8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        rbs0 pbs0Var;
        switch (i) {
            case 1:
                String string = parcel.readString();
                uyl uylVarM196295O = uyl.AbstractBinderC20541a.m196295O(parcel.readStrongBinder());
                lxr0.m152086c(parcel);
                mo145683B7(string, uylVarM196295O);
                parcel2.writeNoException();
                return true;
            case 2:
                String string2 = parcel.readString();
                lxr0.m152086c(parcel);
                uyl uylVarZzb = zzb(string2);
                parcel2.writeNoException();
                lxr0.m152089f(parcel2, uylVarZzb);
                return true;
            case 3:
                uyl uylVarM196295O2 = uyl.AbstractBinderC20541a.m196295O(parcel.readStrongBinder());
                lxr0.m152086c(parcel);
                mo145685R7(uylVarM196295O2);
                parcel2.writeNoException();
                return true;
            case 4:
                zzc();
                parcel2.writeNoException();
                return true;
            case 5:
                uyl.AbstractBinderC20541a.m196295O(parcel.readStrongBinder());
                parcel.readInt();
                lxr0.m152086c(parcel);
                parcel2.writeNoException();
                return true;
            case 6:
                uyl uylVarM196295O3 = uyl.AbstractBinderC20541a.m196295O(parcel.readStrongBinder());
                lxr0.m152086c(parcel);
                mo145688i7(uylVarM196295O3);
                parcel2.writeNoException();
                return true;
            case 7:
                uyl uylVarM196295O4 = uyl.AbstractBinderC20541a.m196295O(parcel.readStrongBinder());
                lxr0.m152086c(parcel);
                mo145691x(uylVarM196295O4);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    pbs0Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
                    pbs0Var = iInterfaceQueryLocalInterface instanceof rbs0 ? (rbs0) iInterfaceQueryLocalInterface : new pbs0(strongBinder);
                }
                lxr0.m152086c(parcel);
                mo145687d1(pbs0Var);
                parcel2.writeNoException();
                return true;
            case 9:
                uyl uylVarM196295O5 = uyl.AbstractBinderC20541a.m196295O(parcel.readStrongBinder());
                lxr0.m152086c(parcel);
                mo145684I6(uylVarM196295O5);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
