package p153l;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class utr0 extends gxr0 implements cvr0 {
    public utr0() {
        super("com.android.vending.billing.IInAppBillingServiceCallback");
    }

    @Override // p153l.gxr0
    /* JADX INFO: renamed from: O */
    public final boolean mo132923O(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        Bundle bundle = (Bundle) yyr0.m218003a(parcel, Bundle.CREATOR);
        yyr0.m218004b(parcel);
        zza(bundle);
        parcel2.writeNoException();
        return true;
    }
}
