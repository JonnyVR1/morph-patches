package p153l;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public class h9r0 implements IInterface {

    /* JADX INFO: renamed from: a */
    public final IBinder f108429a;

    /* JADX INFO: renamed from: b */
    public final String f108430b = "com.google.android.gms.appset.internal.IAppSetService";

    public h9r0(IBinder iBinder, String str) {
        this.f108429a = iBinder;
    }

    /* JADX INFO: renamed from: O */
    public final Parcel m134082O() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f108430b);
        return parcelObtain;
    }

    /* JADX INFO: renamed from: P2 */
    public final void m134083P2(int i, Parcel parcel) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f108429a.transact(1, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f108429a;
    }
}
