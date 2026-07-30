package p153l;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public class prq0 implements IInterface {

    /* JADX INFO: renamed from: a */
    public final IBinder f153826a;

    /* JADX INFO: renamed from: b */
    public final String f153827b = "com.google.android.finsky.externalreferrer.IGetInstallReferrerService";

    public prq0(IBinder iBinder) {
        this.f153826a = iBinder;
    }

    /* JADX INFO: renamed from: O */
    public final Parcel m173542O() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f153827b);
        return parcelObtain;
    }

    /* JADX INFO: renamed from: P2 */
    public final Parcel m173543P2(Parcel parcel) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f153826a.transact(1, parcel, parcelObtain, 0);
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
        return this.f153826a;
    }
}
