package p149l;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.offline.buffering.zza;

/* JADX INFO: loaded from: classes6.dex */
public abstract class dss0 extends kxr0 implements ess0 {
    public dss0() {
        super("com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    /* JADX INFO: renamed from: o8 */
    public static ess0 m113495o8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
        return iInterfaceQueryLocalInterface instanceof ess0 ? (ess0) iInterfaceQueryLocalInterface : new css0(iBinder);
    }

    @Override // p149l.kxr0
    /* JADX INFO: renamed from: n8 */
    public final boolean mo98344n8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                Intent intent = (Intent) lxr0.m152084a(parcel, Intent.CREATOR);
                lxr0.m152086c(parcel);
                mo108560x0(intent);
                break;
            case 2:
                uyl uylVarM196295O = uyl.AbstractBinderC20541a.m196295O(parcel.readStrongBinder());
                String string = parcel.readString();
                String string2 = parcel.readString();
                lxr0.m152086c(parcel);
                mo117956p7(uylVarM196295O, string, string2);
                break;
            case 3:
                zzh();
                break;
            case 4:
                uyl uylVarM196295O2 = uyl.AbstractBinderC20541a.m196295O(parcel.readStrongBinder());
                lxr0.m152086c(parcel);
                mo108559Y(uylVarM196295O2);
                break;
            case 5:
                String[] strArrCreateStringArray = parcel.createStringArray();
                int[] iArrCreateIntArray = parcel.createIntArray();
                uyl uylVarM196295O3 = uyl.AbstractBinderC20541a.m196295O(parcel.readStrongBinder());
                lxr0.m152086c(parcel);
                mo108558O0(strArrCreateStringArray, iArrCreateIntArray, uylVarM196295O3);
                break;
            case 6:
                uyl uylVarM196295O4 = uyl.AbstractBinderC20541a.m196295O(parcel.readStrongBinder());
                zza zzaVar = (zza) lxr0.m152084a(parcel, zza.CREATOR);
                lxr0.m152086c(parcel);
                mo108561y3(uylVarM196295O4, zzaVar);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
