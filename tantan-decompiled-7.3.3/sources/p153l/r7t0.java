package p153l;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;

/* JADX INFO: loaded from: classes6.dex */
public abstract class r7t0 extends q6s0 implements s7t0 {
    public r7t0() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
    }

    @Override // p153l.q6s0
    /* JADX INFO: renamed from: n8 */
    public final boolean mo96668n8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zzg();
        } else if (i == 2) {
            int i3 = parcel.readInt();
            r6s0.m180041c(parcel);
            zze(i3);
        } else {
            if (i != 3) {
                return false;
            }
            zze zzeVar = (zze) r6s0.m180039a(parcel, zze.CREATOR);
            r6s0.m180041c(parcel);
            mo133955f(zzeVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
