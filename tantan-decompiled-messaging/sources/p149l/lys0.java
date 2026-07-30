package p149l;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;

/* JADX INFO: loaded from: classes6.dex */
public abstract class lys0 extends kxr0 implements mys0 {
    public lys0() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
    }

    @Override // p149l.kxr0
    /* JADX INFO: renamed from: n8 */
    public final boolean mo98344n8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zzg();
        } else if (i == 2) {
            int i3 = parcel.readInt();
            lxr0.m152086c(parcel);
            zze(i3);
        } else {
            if (i != 3) {
                return false;
            }
            zze zzeVar = (zze) lxr0.m152084a(parcel, zze.CREATOR);
            lxr0.m152086c(parcel);
            mo104644f(zzeVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
