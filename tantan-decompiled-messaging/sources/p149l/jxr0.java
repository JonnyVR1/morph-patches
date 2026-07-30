package p149l;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public class jxr0 implements IInterface {

    /* JADX INFO: renamed from: a */
    public final IBinder f120244a;

    /* JADX INFO: renamed from: b */
    public final String f120245b;

    public jxr0(IBinder iBinder, String str) {
        this.f120244a = iBinder;
        this.f120245b = str;
    }

    /* JADX INFO: renamed from: O */
    public final Parcel m143822O() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f120245b);
        return parcelObtain;
    }

    /* JADX INFO: renamed from: P2 */
    public final Parcel m143823P2(int i, Parcel parcel) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f120244a.transact(i, parcel, parcelObtain, 0);
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

    /* JADX INFO: renamed from: P3 */
    public final void m143824P3(int i, Parcel parcel) throws RemoteException {
        try {
            this.f120244a.transact(i, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    /* JADX INFO: renamed from: Y2 */
    public final void m143825Y2(int i, Parcel parcel) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f120244a.transact(i, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f120244a;
    }
}
