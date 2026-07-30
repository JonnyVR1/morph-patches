package p149l;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;

/* JADX INFO: loaded from: classes6.dex */
public abstract class dqs0 extends kxr0 implements eqs0 {
    public dqs0() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
    }

    @Override // p149l.kxr0
    /* JADX INFO: renamed from: n8 */
    public final boolean mo98344n8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            String string = parcel.readString();
            lxr0.m152086c(parcel);
            mo117795c(string);
        } else if (i == 2) {
            String string2 = parcel.readString();
            lxr0.m152086c(parcel);
            mo117796i(string2);
        } else {
            if (i != 3) {
                return false;
            }
            zze zzeVar = (zze) lxr0.m152084a(parcel, zze.CREATOR);
            lxr0.m152086c(parcel);
            mo117794C4(zzeVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
