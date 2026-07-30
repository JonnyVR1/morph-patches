package p149l;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public interface x4m extends IInterface {

    /* JADX INFO: renamed from: r0 */
    public static final String f191041r0 = "androidx$core$app$unusedapprestrictions$IUnusedAppRestrictionsBackportService".replace('$', '.');

    /* JADX INFO: renamed from: y2 */
    void mo1287y2(w4m w4mVar) throws RemoteException;

    /* JADX INFO: renamed from: l.x4m$a */
    public static abstract class AbstractBinderC21033a extends Binder implements x4m {
        public AbstractBinderC21033a() {
            attachInterface(this, x4m.f191041r0);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = x4m.f191041r0;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            mo1287y2(w4m.AbstractBinderC20799a.m201533O(parcel.readStrongBinder()));
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
