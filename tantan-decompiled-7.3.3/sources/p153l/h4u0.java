package p153l;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public class h4u0 implements IInterface {

    /* JADX INFO: renamed from: a */
    public final IBinder f107829a;

    /* JADX INFO: renamed from: b */
    public final String f107830b;

    public h4u0(IBinder iBinder, String str) {
        this.f107829a = iBinder;
        this.f107830b = str;
    }

    /* JADX INFO: renamed from: O */
    public final Parcel m133595O() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f107830b);
        return parcelObtain;
    }

    /* JADX INFO: renamed from: P2 */
    public final void m133596P2(int i, Parcel parcel) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f107829a.transact(i, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f107829a;
    }
}
