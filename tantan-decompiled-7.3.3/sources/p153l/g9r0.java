package p153l;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public class g9r0 implements IInterface {

    /* JADX INFO: renamed from: a */
    public final IBinder f102877a;

    /* JADX INFO: renamed from: b */
    public final String f102878b = "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService";

    public g9r0(IBinder iBinder, String str) {
        this.f102877a = iBinder;
    }

    /* JADX INFO: renamed from: O */
    public final Parcel m129602O() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f102878b);
        return parcelObtain;
    }

    /* JADX INFO: renamed from: P2 */
    public final Parcel m129603P2(int i, Parcel parcel) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f102877a.transact(i, parcel, parcelObtain, 0);
                parcelObtain.readException();
                parcel.recycle();
                return parcelObtain;
            } catch (RuntimeException e) {
                parcelObtain.recycle();
                throw e;
            }
        } catch (Throwable th) {
            parcel.recycle();
            throw th;
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f102877a;
    }
}
