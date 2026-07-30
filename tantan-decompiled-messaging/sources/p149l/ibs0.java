package p149l;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ibs0 extends kxr0 implements ocs0 {
    public ibs0() {
        super("com.google.android.gms.ads.internal.client.IAdLoadCallback");
    }

    @Override // p149l.kxr0
    /* JADX INFO: renamed from: n8 */
    public final boolean mo98344n8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zzc();
        } else {
            if (i != 2) {
                return false;
            }
            zze zzeVar = (zze) lxr0.m152084a(parcel, zze.CREATOR);
            lxr0.m152086c(parcel);
            mo95571t0(zzeVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
