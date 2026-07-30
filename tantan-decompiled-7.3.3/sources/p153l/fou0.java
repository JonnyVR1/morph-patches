package p153l;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class fou0 extends q6s0 implements lpu0 {
    public fou0() {
        super("com.google.android.gms.ads.internal.client.IVideoController");
    }

    /* JADX INFO: renamed from: o8 */
    public static lpu0 m126497o8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
        return iInterfaceQueryLocalInterface instanceof lpu0 ? (lpu0) iInterfaceQueryLocalInterface : new zmu0(iBinder);
    }

    @Override // p153l.q6s0
    /* JADX INFO: renamed from: n8 */
    public final boolean mo96668n8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        atu0 qqu0Var;
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
                boolean zM180045g = r6s0.m180045g(parcel);
                r6s0.m180041c(parcel);
                mo155295X(zM180045g);
                parcel2.writeNoException();
                return true;
            case 4:
                boolean zMo155296a = mo155296a();
                parcel2.writeNoException();
                ClassLoader classLoader = r6s0.f161495a;
                parcel2.writeInt(zMo155296a ? 1 : 0);
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
                    qqu0Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
                    qqu0Var = iInterfaceQueryLocalInterface instanceof atu0 ? (atu0) iInterfaceQueryLocalInterface : new qqu0(strongBinder);
                }
                r6s0.m180041c(parcel);
                mo155297s1(qqu0Var);
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
                ClassLoader classLoader2 = r6s0.f161495a;
                parcel2.writeInt(zZzp ? 1 : 0);
                return true;
            case 11:
                atu0 atu0VarZzi = zzi();
                parcel2.writeNoException();
                r6s0.m180044f(parcel2, atu0VarZzi);
                return true;
            case 12:
                boolean zZzo = zzo();
                parcel2.writeNoException();
                ClassLoader classLoader3 = r6s0.f161495a;
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
