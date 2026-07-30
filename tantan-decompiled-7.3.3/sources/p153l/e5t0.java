package p153l;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class e5t0 extends q6s0 implements f5t0 {
    public e5t0() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardItem");
    }

    @Override // p153l.q6s0
    /* JADX INFO: renamed from: n8 */
    public final boolean mo96668n8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
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
