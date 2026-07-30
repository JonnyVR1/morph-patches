package p153l;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.zzbb;

/* JADX INFO: loaded from: classes6.dex */
public abstract class c4t0 extends q6s0 implements n4t0 {
    public c4t0() {
        super("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // p153l.q6s0
    /* JADX INFO: renamed from: n8 */
    public final boolean mo96668n8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) r6s0.m180039a(parcel, ParcelFileDescriptor.CREATOR);
            r6s0.m180041c(parcel);
            mo102538a0(parcelFileDescriptor);
        } else {
            if (i != 2) {
                return false;
            }
            zzbb zzbbVar = (zzbb) r6s0.m180039a(parcel, zzbb.CREATOR);
            r6s0.m180041c(parcel);
            mo102537W(zzbbVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
