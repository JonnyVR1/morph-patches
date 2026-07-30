package p149l;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ncw0 extends kxr0 implements ocw0 {
    public ncw0() {
        super("com.google.android.play.core.lmd.protocol.ILmdOverlayServiceListener");
    }

    @Override // p149l.kxr0
    /* JADX INFO: renamed from: n8 */
    public final boolean mo98344n8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        Bundle bundle = (Bundle) lxr0.m152084a(parcel, Bundle.CREATOR);
        lxr0.m152086c(parcel);
        mo159089M3(bundle);
        return true;
    }
}
