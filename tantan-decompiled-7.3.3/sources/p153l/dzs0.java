package p153l;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;

/* JADX INFO: loaded from: classes6.dex */
public abstract class dzs0 extends q6s0 implements ezs0 {
    public dzs0() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
    }

    @Override // p153l.q6s0
    /* JADX INFO: renamed from: n8 */
    public final boolean mo96668n8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 2) {
            zzg();
        } else if (i == 3) {
            String string = parcel.readString();
            r6s0.m180041c(parcel);
            mo123420c(string);
        } else {
            if (i != 4) {
                return false;
            }
            zze zzeVar = (zze) r6s0.m180039a(parcel, zze.CREATOR);
            r6s0.m180041c(parcel);
            mo113349f(zzeVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
