package p149l;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class zeu0 extends kxr0 implements fgu0 {
    public zeu0() {
        super("com.google.android.gms.ads.internal.client.IVideoController");
    }

    /* JADX INFO: renamed from: o8 */
    public static fgu0 m218417o8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
        return iInterfaceQueryLocalInterface instanceof fgu0 ? (fgu0) iInterfaceQueryLocalInterface : new tdu0(iBinder);
    }

    @Override // p149l.kxr0
    /* JADX INFO: renamed from: n8 */
    public final boolean mo98344n8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        uju0 khu0Var;
        switch (i) {
            case 1:
                zzl();
                parcel2.writeNoException();
                return true;
            case 2:
                zzk();
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zM152090g = lxr0.m152090g(parcel);
                lxr0.m152086c(parcel);
                mo121267X(zM152090g);
                parcel2.writeNoException();
                return true;
            case 4:
                boolean zMo121268a = mo121268a();
                parcel2.writeNoException();
                ClassLoader classLoader = lxr0.f130430a;
                parcel2.writeInt(zMo121268a ? 1 : 0);
                return true;
            case 5:
                int iZzh = zzh();
                parcel2.writeNoException();
                parcel2.writeInt(iZzh);
                return true;
            case 6:
                float fZzg = zzg();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzg);
                return true;
            case 7:
                float fZzf = zzf();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzf);
                return true;
            case 8:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    khu0Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
                    khu0Var = iInterfaceQueryLocalInterface instanceof uju0 ? (uju0) iInterfaceQueryLocalInterface : new khu0(strongBinder);
                }
                lxr0.m152086c(parcel);
                mo121269s1(khu0Var);
                parcel2.writeNoException();
                return true;
            case 9:
                float fZze = zze();
                parcel2.writeNoException();
                parcel2.writeFloat(fZze);
                return true;
            case 10:
                boolean zZzp = zzp();
                parcel2.writeNoException();
                ClassLoader classLoader2 = lxr0.f130430a;
                parcel2.writeInt(zZzp ? 1 : 0);
                return true;
            case 11:
                uju0 uju0VarZzi = zzi();
                parcel2.writeNoException();
                lxr0.m152089f(parcel2, uju0VarZzi);
                return true;
            case 12:
                boolean zZzo = zzo();
                parcel2.writeNoException();
                ClassLoader classLoader3 = lxr0.f130430a;
                parcel2.writeInt(zZzo ? 1 : 0);
                return true;
            case 13:
                zzn();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
