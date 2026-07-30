package p153l;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class q1t0 extends q6s0 implements r1t0 {
    public q1t0() {
        super("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    /* JADX INFO: renamed from: o8 */
    public static r1t0 m174929o8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
        return iInterfaceQueryLocalInterface instanceof r1t0 ? (r1t0) iInterfaceQueryLocalInterface : new p1t0(iBinder);
    }

    @Override // p153l.q6s0
    /* JADX INFO: renamed from: n8 */
    public final boolean mo96668n8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                Bundle bundle = (Bundle) r6s0.m180039a(parcel, Bundle.CREATOR);
                r6s0.m180041c(parcel);
                mo12334z5(bundle);
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
                Bundle bundle2 = (Bundle) r6s0.m180039a(parcel, Bundle.CREATOR);
                r6s0.m180041c(parcel);
                mo12331v0(bundle2);
                parcel2.writeNoException();
                r6s0.m180043e(parcel2, bundle2);
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
                mo12322g();
                parcel2.writeNoException();
                return true;
            case 10:
                zzi();
                parcel2.writeNoException();
                return true;
            case 11:
                boolean zMo12324o = mo12324o();
                parcel2.writeNoException();
                ClassLoader classLoader = r6s0.f161495a;
                parcel2.writeInt(zMo12324o ? 1 : 0);
                return true;
            case 12:
                parcel.readInt();
                parcel.readInt();
                r6s0.m180041c(parcel);
                parcel2.writeNoException();
                return true;
            case 13:
                p1m p1mVarM170217O = p1m.AbstractBinderC19271a.m170217O(parcel.readStrongBinder());
                r6s0.m180041c(parcel);
                mo12315C(p1mVarM170217O);
                parcel2.writeNoException();
                return true;
            case 14:
                mo12320b();
                parcel2.writeNoException();
                return true;
            case 15:
                int i3 = parcel.readInt();
                String[] strArrCreateStringArray = parcel.createStringArray();
                int[] iArrCreateIntArray = parcel.createIntArray();
                r6s0.m180041c(parcel);
                mo12323g1(i3, strArrCreateStringArray, iArrCreateIntArray);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
