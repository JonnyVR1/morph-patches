package p149l;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class gis0 extends kxr0 implements his0 {
    public gis0() {
        super("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheCallback");
    }

    @Override // p149l.kxr0
    /* JADX INFO: renamed from: n8 */
    public final boolean mo98344n8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) lxr0.m152084a(parcel, ParcelFileDescriptor.CREATOR);
        lxr0.m152086c(parcel);
        mo131296A2(parcelFileDescriptor);
        return true;
    }
}
