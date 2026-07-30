package p149l;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public class a0r0 implements IInterface {

    /* JADX INFO: renamed from: a */
    public final IBinder f67063a;

    /* JADX INFO: renamed from: b */
    public final String f67064b = "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService";

    public a0r0(IBinder iBinder, String str) {
        this.f67063a = iBinder;
    }

    /* JADX INFO: renamed from: O */
    public final Parcel m94465O() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f67064b);
        return parcelObtain;
    }

    /* JADX INFO: renamed from: P2 */
    public final Parcel m94466P2(int i, Parcel parcel) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f67063a.transact(i, parcel, parcelObtain, 0);
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
        return this.f67063a;
    }
}
