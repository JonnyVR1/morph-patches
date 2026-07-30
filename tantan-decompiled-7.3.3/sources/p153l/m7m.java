package p153l;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public interface m7m extends IInterface {

    /* JADX INFO: renamed from: q0 */
    public static final String f135089q0 = "androidx$core$app$unusedapprestrictions$IUnusedAppRestrictionsBackportCallback".replace('$', '.');

    /* JADX INFO: renamed from: b6 */
    void m157287b6(boolean z, boolean z2) throws RemoteException;

    /* JADX INFO: renamed from: l.m7m$a */
    public static abstract class AbstractBinderC18561a extends Binder implements m7m {

        /* JADX INFO: renamed from: l.m7m$a$a */
        public static class a implements m7m {

            /* JADX INFO: renamed from: a */
            public IBinder f135090a;

            public a(IBinder iBinder) {
                this.f135090a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f135090a;
            }
        }

        public AbstractBinderC18561a() {
            attachInterface(this, m7m.f135089q0);
        }

        /* JADX INFO: renamed from: O */
        public static m7m m157288O(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(m7m.f135089q0);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof m7m)) ? new a(iBinder) : (m7m) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = m7m.f135089q0;
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
            m157287b6(parcel.readInt() != 0, parcel.readInt() != 0);
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
