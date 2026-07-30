package p153l;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class mrs0 extends q6s0 implements nrs0 {
    public mrs0() {
        super("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheCallback");
    }

    @Override // p153l.q6s0
    /* JADX INFO: renamed from: n8 */
    public final boolean mo96668n8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) r6s0.m180039a(parcel, ParcelFileDescriptor.CREATOR);
        r6s0.m180041c(parcel);
        mo164520A2(parcelFileDescriptor);
        return true;
    }
}
