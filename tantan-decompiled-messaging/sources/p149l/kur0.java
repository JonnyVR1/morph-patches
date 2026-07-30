package p149l;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class kur0 extends aor0 implements svr0 {
    public kur0() {
        super("com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideServiceCallback");
    }

    @Override // p149l.aor0
    /* JADX INFO: renamed from: O */
    public final boolean mo97950O(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        int i3 = parcel.readInt();
        spr0.m185386b(parcel);
        zza(i3);
        return true;
    }
}
