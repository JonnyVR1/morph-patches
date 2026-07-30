package p149l;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;

/* JADX INFO: loaded from: classes6.dex */
public abstract class rps0 extends kxr0 implements sps0 {
    public rps0() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
    }

    @Override // p149l.kxr0
    /* JADX INFO: renamed from: n8 */
    public final boolean mo98344n8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 2) {
            zzg();
        } else if (i == 3) {
            String string = parcel.readString();
            lxr0.m152086c(parcel);
            mo110191c(string);
        } else {
            if (i != 4) {
                return false;
            }
            zze zzeVar = (zze) lxr0.m152084a(parcel, zze.CREATOR);
            lxr0.m152086c(parcel);
            mo110192f(zzeVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
