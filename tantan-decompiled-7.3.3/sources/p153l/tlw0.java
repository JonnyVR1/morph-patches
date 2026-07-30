package p153l;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class tlw0 extends q6s0 implements ulw0 {
    public tlw0() {
        super("com.google.android.play.core.lmd.protocol.ILmdOverlayServiceListener");
    }

    @Override // p153l.q6s0
    /* JADX INFO: renamed from: n8 */
    public final boolean mo96668n8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        Bundle bundle = (Bundle) r6s0.m180039a(parcel, Bundle.CREATOR);
        r6s0.m180041c(parcel);
        mo191860M3(bundle);
        return true;
    }
}
