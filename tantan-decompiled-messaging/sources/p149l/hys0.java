package p149l;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;

/* JADX INFO: loaded from: classes6.dex */
public abstract class hys0 extends kxr0 implements iys0 {
    public hys0() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    @Override // p149l.kxr0
    /* JADX INFO: renamed from: n8 */
    public final boolean mo98344n8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        cys0 ays0Var;
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
                    ays0Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
                    ays0Var = iInterfaceQueryLocalInterface instanceof cys0 ? (cys0) iInterfaceQueryLocalInterface : new ays0(strongBinder);
                }
                lxr0.m152086c(parcel);
                mo119021u6(ays0Var);
                break;
            case 4:
                int i3 = parcel.readInt();
                lxr0.m152086c(parcel);
                zzh(i3);
                break;
            case 5:
                zze zzeVar = (zze) lxr0.m152084a(parcel, zze.CREATOR);
                lxr0.m152086c(parcel);
                mo119018a6(zzeVar);
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
