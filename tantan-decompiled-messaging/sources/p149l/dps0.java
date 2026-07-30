package p149l;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public class dps0 implements IInterface {

    /* JADX INFO: renamed from: a */
    public final IBinder f87318a;

    /* JADX INFO: renamed from: b */
    public final String f87319b;

    public dps0(IBinder iBinder, String str) {
        this.f87318a = iBinder;
        this.f87319b = str;
    }

    /* JADX INFO: renamed from: O */
    public final Parcel m112927O() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f87319b);
        return parcelObtain;
    }

    /* JADX INFO: renamed from: P2 */
    public final Parcel m112928P2(int i, Parcel parcel) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f87318a.transact(i, parcel, parcelObtain, 0);
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
    public final void m112929Y2(int i, Parcel parcel) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f87318a.transact(i, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f87318a;
    }
}
