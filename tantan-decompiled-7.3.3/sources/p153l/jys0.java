package p153l;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public class jys0 implements IInterface {

    /* JADX INFO: renamed from: a */
    public final IBinder f123197a;

    /* JADX INFO: renamed from: b */
    public final String f123198b;

    public jys0(IBinder iBinder, String str) {
        this.f123197a = iBinder;
        this.f123198b = str;
    }

    /* JADX INFO: renamed from: O */
    public final Parcel m147618O() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f123198b);
        return parcelObtain;
    }

    /* JADX INFO: renamed from: P2 */
    public final Parcel m147619P2(int i, Parcel parcel) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f123197a.transact(i, parcel, parcelObtain, 0);
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

    /* JADX INFO: renamed from: Y2 */
    public final void m147620Y2(int i, Parcel parcel) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f123197a.transact(i, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f123197a;
    }
}
