package p149l;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public class kiq0 implements IInterface {

    /* JADX INFO: renamed from: a */
    public final IBinder f123381a;

    /* JADX INFO: renamed from: b */
    public final String f123382b = "com.google.android.finsky.externalreferrer.IGetInstallReferrerService";

    public kiq0(IBinder iBinder) {
        this.f123381a = iBinder;
    }

    /* JADX INFO: renamed from: O */
    public final Parcel m146127O() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f123382b);
        return parcelObtain;
    }

    /* JADX INFO: renamed from: P2 */
    public final Parcel m146128P2(Parcel parcel) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f123381a.transact(1, parcel, parcelObtain, 0);
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
        return this.f123381a;
    }
}
