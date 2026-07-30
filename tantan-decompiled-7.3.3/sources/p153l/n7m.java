package p153l;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public interface n7m extends IInterface {

    /* JADX INFO: renamed from: r0 */
    public static final String f140613r0 = "androidx$core$app$unusedapprestrictions$IUnusedAppRestrictionsBackportService".replace('$', '.');

    /* JADX INFO: renamed from: y2 */
    void mo1288y2(m7m m7mVar) throws RemoteException;

    /* JADX INFO: renamed from: l.n7m$a */
    public static abstract class AbstractBinderC18816a extends Binder implements n7m {
        public AbstractBinderC18816a() {
            attachInterface(this, n7m.f140613r0);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = n7m.f140613r0;
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
            mo1288y2(m7m.AbstractBinderC18561a.m157288O(parcel.readStrongBinder()));
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
