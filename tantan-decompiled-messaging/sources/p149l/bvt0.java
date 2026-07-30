package p149l;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public class bvt0 implements IInterface {

    /* JADX INFO: renamed from: a */
    public final IBinder f77491a;

    /* JADX INFO: renamed from: b */
    public final String f77492b;

    public bvt0(IBinder iBinder, String str) {
        this.f77491a = iBinder;
        this.f77492b = str;
    }

    /* JADX INFO: renamed from: O */
    public final Parcel m104076O() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f77492b);
        return parcelObtain;
    }

    /* JADX INFO: renamed from: P2 */
    public final void m104077P2(int i, Parcel parcel) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f77491a.transact(i, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f77491a;
    }
}
