package p149l;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public class b0r0 implements IInterface {

    /* JADX INFO: renamed from: a */
    public final IBinder f72457a;

    /* JADX INFO: renamed from: b */
    public final String f72458b = "com.google.android.gms.appset.internal.IAppSetService";

    public b0r0(IBinder iBinder, String str) {
        this.f72457a = iBinder;
    }

    /* JADX INFO: renamed from: O */
    public final Parcel m99786O() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f72458b);
        return parcelObtain;
    }

    /* JADX INFO: renamed from: P2 */
    public final void m99787P2(int i, Parcel parcel) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f72457a.transact(1, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f72457a;
    }
}
