package p149l;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public interface jyl extends IInterface {

    /* JADX INFO: renamed from: o0 */
    public static final String f120315o0 = "android$support$v4$app$INotificationSideChannel".replace('$', '.');

    /* JADX INFO: renamed from: l.jyl$b */
    public static class C17894b {
        /* JADX INFO: renamed from: c */
        public static <T> T m143876c(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* JADX INFO: renamed from: d */
        public static <T extends Parcelable> void m143877d(Parcel parcel, T t, int i) {
            if (t == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
            }
        }
    }

    /* JADX INFO: renamed from: Q6 */
    void m143870Q6(String str) throws RemoteException;

    /* JADX INFO: renamed from: j4 */
    void mo143871j4(String str, int i, String str2, Notification notification) throws RemoteException;

    /* JADX INFO: renamed from: y1 */
    void m143872y1(String str, int i, String str2) throws RemoteException;

    /* JADX INFO: renamed from: l.jyl$a */
    public static abstract class AbstractBinderC17893a extends Binder implements jyl {

        /* JADX INFO: renamed from: l.jyl$a$a */
        public static class a implements jyl {

            /* JADX INFO: renamed from: a */
            public IBinder f120316a;

            public a(IBinder iBinder) {
                this.f120316a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f120316a;
            }

            @Override // p149l.jyl
            /* JADX INFO: renamed from: j4 */
            public void mo143871j4(String str, int i, String str2, Notification notification) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(jyl.f120315o0);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str2);
                    C17894b.m143877d(parcelObtain, notification, 0);
                    this.f120316a.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public AbstractBinderC17893a() {
            attachInterface(this, jyl.f120315o0);
        }

        /* JADX INFO: renamed from: O */
        public static jyl m143873O(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(jyl.f120315o0);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof jyl)) ? new a(iBinder) : (jyl) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = jyl.f120315o0;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i == 1) {
                mo143871j4(parcel.readString(), parcel.readInt(), parcel.readString(), (Notification) C17894b.m143876c(parcel, Notification.CREATOR));
            } else if (i == 2) {
                m143872y1(parcel.readString(), parcel.readInt(), parcel.readString());
            } else {
                if (i != 3) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                m143870Q6(parcel.readString());
            }
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
