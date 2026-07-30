package p153l;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.offline.buffering.zza;

/* JADX INFO: loaded from: classes6.dex */
public abstract class j1t0 extends q6s0 implements k1t0 {
    public j1t0() {
        super("com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    /* JADX INFO: renamed from: o8 */
    public static k1t0 m143151o8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
        return iInterfaceQueryLocalInterface instanceof k1t0 ? (k1t0) iInterfaceQueryLocalInterface : new i1t0(iBinder);
    }

    @Override // p153l.q6s0
    /* JADX INFO: renamed from: n8 */
    public final boolean mo96668n8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                Intent intent = (Intent) r6s0.m180039a(parcel, Intent.CREATOR);
                r6s0.m180041c(parcel);
                mo138152x0(intent);
                break;
            case 2:
                p1m p1mVarM170217O = p1m.AbstractBinderC19271a.m170217O(parcel.readStrongBinder());
                String string = parcel.readString();
                String string2 = parcel.readString();
                r6s0.m180041c(parcel);
                mo147925p7(p1mVarM170217O, string, string2);
                break;
            case 3:
                zzh();
                break;
            case 4:
                p1m p1mVarM170217O2 = p1m.AbstractBinderC19271a.m170217O(parcel.readStrongBinder());
                r6s0.m180041c(parcel);
                mo138151Y(p1mVarM170217O2);
                break;
            case 5:
                String[] strArrCreateStringArray = parcel.createStringArray();
                int[] iArrCreateIntArray = parcel.createIntArray();
                p1m p1mVarM170217O3 = p1m.AbstractBinderC19271a.m170217O(parcel.readStrongBinder());
                r6s0.m180041c(parcel);
                mo138150O0(strArrCreateStringArray, iArrCreateIntArray, p1mVarM170217O3);
                break;
            case 6:
                p1m p1mVarM170217O4 = p1m.AbstractBinderC19271a.m170217O(parcel.readStrongBinder());
                zza zzaVar = (zza) r6s0.m180039a(parcel, zza.CREATOR);
                r6s0.m180041c(parcel);
                mo138153y3(p1mVarM170217O4, zzaVar);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
