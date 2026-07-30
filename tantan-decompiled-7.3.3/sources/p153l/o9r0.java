package p153l;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public class o9r0 implements IInterface {

    /* JADX INFO: renamed from: a */
    public final IBinder f145625a;

    /* JADX INFO: renamed from: b */
    public final String f145626b;

    public o9r0(IBinder iBinder, String str) {
        this.f145625a = iBinder;
        this.f145626b = str;
    }

    /* JADX INFO: renamed from: O */
    public final Parcel m166806O() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f145626b);
        return parcelObtain;
    }

    /* JADX INFO: renamed from: P2 */
    public final Parcel m166807P2(int i, Parcel parcel) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.f145625a.transact(i, parcel, parcelObtain, 0);
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
    public final void m166808Y2(int i, Parcel parcel) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.f145625a.transact(i, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.f145625a;
    }
}
