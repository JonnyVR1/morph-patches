package p149l;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class yvs0 extends kxr0 implements zvs0 {
    public yvs0() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardItem");
    }

    @Override // p149l.kxr0
    /* JADX INFO: renamed from: n8 */
    public final boolean mo98344n8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            String strZzc = zzc();
            parcel2.writeNoException();
            parcel2.writeString(strZzc);
        } else {
            if (i != 2) {
                return false;
            }
            int iZzb = zzb();
            parcel2.writeNoException();
            parcel2.writeInt(iZzb);
        }
        return true;
    }
}
