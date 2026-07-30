package p153l;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class aat0 extends q6s0 implements bat0 {
    public aat0() {
        super("com.google.android.gms.ads.internal.signals.ISignalCallback");
    }

    @Override // p153l.q6s0
    /* JADX INFO: renamed from: n8 */
    public final boolean mo96668n8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            parcel.readString();
            parcel.readString();
            r6s0.m180041c(parcel);
        } else if (i == 2) {
            String string = parcel.readString();
            r6s0.m180041c(parcel);
            zzb(string);
        } else {
            if (i != 3) {
                return false;
            }
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            Bundle bundle = (Bundle) r6s0.m180039a(parcel, Bundle.CREATOR);
            r6s0.m180041c(parcel);
            mo103232R4(string2, string3, bundle);
        }
        parcel2.writeNoException();
        return true;
    }
}
