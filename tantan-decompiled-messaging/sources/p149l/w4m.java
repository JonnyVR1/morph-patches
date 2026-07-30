package p149l;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public interface w4m extends IInterface {

    /* JADX INFO: renamed from: q0 */
    public static final String f184573q0 = "androidx$core$app$unusedapprestrictions$IUnusedAppRestrictionsBackportCallback".replace('$', '.');

    /* JADX INFO: renamed from: b6 */
    void m201532b6(boolean z, boolean z2) throws RemoteException;

    /* JADX INFO: renamed from: l.w4m$a */
    public static abstract class AbstractBinderC20799a extends Binder implements w4m {

        /* JADX INFO: renamed from: l.w4m$a$a */
        public static class a implements w4m {

            /* JADX INFO: renamed from: a */
            public IBinder f184574a;

            public a(IBinder iBinder) {
                this.f184574a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f184574a;
            }
        }

        public AbstractBinderC20799a() {
            attachInterface(this, w4m.f184573q0);
        }

        /* JADX INFO: renamed from: O */
        public static w4m m201533O(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(w4m.f184573q0);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof w4m)) ? new a(iBinder) : (w4m) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = w4m.f184573q0;
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
            m201532b6(parcel.readInt() != 0, parcel.readInt() != 0);
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
