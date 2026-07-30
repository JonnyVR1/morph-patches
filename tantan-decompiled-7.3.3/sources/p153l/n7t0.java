package p153l;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;

/* JADX INFO: loaded from: classes6.dex */
public abstract class n7t0 extends q6s0 implements o7t0 {
    public n7t0() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    @Override // p153l.q6s0
    /* JADX INFO: renamed from: n8 */
    public final boolean mo96668n8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        i7t0 g7t0Var;
        switch (i) {
            case 1:
                zzj();
                break;
            case 2:
                zzg();
                break;
            case 3:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    g7t0Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
                    g7t0Var = iInterfaceQueryLocalInterface instanceof i7t0 ? (i7t0) iInterfaceQueryLocalInterface : new g7t0(strongBinder);
                }
                r6s0.m180041c(parcel);
                mo148751u6(g7t0Var);
                break;
            case 4:
                int i3 = parcel.readInt();
                r6s0.m180041c(parcel);
                zzh(i3);
                break;
            case 5:
                zze zzeVar = (zze) r6s0.m180039a(parcel, zze.CREATOR);
                r6s0.m180041c(parcel);
                mo148748a6(zzeVar);
                break;
            case 6:
                zzf();
                break;
            case 7:
                zze();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
