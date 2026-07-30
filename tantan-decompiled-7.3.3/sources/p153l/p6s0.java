package p153l;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public class p6s0 implements IInterface {

    /* JADX INFO: renamed from: a */
    public final IBinder f150872a;

    /* JADX INFO: renamed from: b */
    public final String f150873b;

    public p6s0(IBinder iBinder, String str) {
        this.f150872a = iBinder;
        this.f150873b = str;
    }

    /* JADX INFO: renamed from: O */
    public final Parcel m171038O() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f150873b);
        return parcelObtain;
    }

    /* JADX INFO: renamed from: P2 */
    public final Parcel m171039P2(int i, Parcel parcel) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f150872a.transact(i, parcel, parcelObtain, 0);
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
    public final void m171040P3(int i, Parcel parcel) throws RemoteException {
        try {
            this.f150872a.transact(i, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    /* JADX INFO: renamed from: Y2 */
    public final void m171041Y2(int i, Parcel parcel) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f150872a.transact(i, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f150872a;
    }
}
