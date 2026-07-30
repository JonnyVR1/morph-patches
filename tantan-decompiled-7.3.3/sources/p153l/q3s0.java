package p153l;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class q3s0 extends gxr0 implements y4s0 {
    public q3s0() {
        super("com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideServiceCallback");
    }

    @Override // p153l.gxr0
    /* JADX INFO: renamed from: O */
    public final boolean mo132923O(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        int i3 = parcel.readInt();
        yyr0.m218004b(parcel);
        zza(i3);
        return true;
    }
}
