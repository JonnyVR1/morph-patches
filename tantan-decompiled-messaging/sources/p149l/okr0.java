package p149l;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class okr0 extends aor0 implements wlr0 {
    public okr0() {
        super("com.android.vending.billing.IInAppBillingServiceCallback");
    }

    @Override // p149l.aor0
    /* JADX INFO: renamed from: O */
    public final boolean mo97950O(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        Bundle bundle = (Bundle) spr0.m185385a(parcel, Bundle.CREATOR);
        spr0.m185386b(parcel);
        zza(bundle);
        parcel2.writeNoException();
        return true;
    }
}
