package p153l;

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
public interface c1m extends IInterface {

    /* JADX INFO: renamed from: o0 */
    public static final String f79411o0 = "android$support$v4$app$INotificationSideChannel".replace('$', '.');

    /* JADX INFO: renamed from: l.c1m$b */
    public static class C16164b {
        /* JADX INFO: renamed from: c */
        public static <T> T m107624c(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* JADX INFO: renamed from: d */
        public static <T extends Parcelable> void m107625d(Parcel parcel, T t, int i) {
            if (t == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
            }
        }
    }

    /* JADX INFO: renamed from: Q6 */
    void m107618Q6(String str) throws RemoteException;

    /* JADX INFO: renamed from: j4 */
    void mo107619j4(String str, int i, String str2, Notification notification) throws RemoteException;

    /* JADX INFO: renamed from: y1 */
    void m107620y1(String str, int i, String str2) throws RemoteException;

    /* JADX INFO: renamed from: l.c1m$a */
    public static abstract class AbstractBinderC16163a extends Binder implements c1m {

        /* JADX INFO: renamed from: l.c1m$a$a */
        public static class a implements c1m {

            /* JADX INFO: renamed from: a */
            public IBinder f79412a;

            public a(IBinder iBinder) {
                this.f79412a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f79412a;
            }

            @Override // p153l.c1m
            /* JADX INFO: renamed from: j4 */
            public void mo107619j4(String str, int i, String str2, Notification notification) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(c1m.f79411o0);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str2);
                    C16164b.m107625d(parcelObtain, notification, 0);
                    this.f79412a.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public AbstractBinderC16163a() {
            attachInterface(this, c1m.f79411o0);
        }

        /* JADX INFO: renamed from: O */
        public static c1m m107621O(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(c1m.f79411o0);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof c1m)) ? new a(iBinder) : (c1m) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = c1m.f79411o0;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i == 1) {
                mo107619j4(parcel.readString(), parcel.readInt(), parcel.readString(), (Notification) C16164b.m107624c(parcel, Notification.CREATOR));
            } else if (i == 2) {
                m107620y1(parcel.readString(), parcel.readInt(), parcel.readString());
            } else {
                if (i != 3) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                m107618Q6(parcel.readString());
            }
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }
    }
}
