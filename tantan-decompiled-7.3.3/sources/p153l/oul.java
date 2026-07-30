package p153l;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public interface oul extends IInterface {

    /* JADX INFO: renamed from: l.oul$a */
    public static abstract class AbstractBinderC19221a extends luq0 implements oul {

        /* JADX INFO: renamed from: l.oul$a$a */
        public static class a extends prq0 implements oul {
            public a(IBinder iBinder) {
                super(iBinder);
            }

            @Override // p153l.oul
            /* JADX INFO: renamed from: Z0 */
            public final Bundle mo169316Z0(Bundle bundle) throws RemoteException {
                Parcel parcelM173542O = m173542O();
                cwq0.m112933b(parcelM173542O, bundle);
                Parcel parcelM173543P2 = m173543P2(parcelM173542O);
                Bundle bundle2 = (Bundle) cwq0.m112932a(parcelM173543P2, Bundle.CREATOR);
                parcelM173543P2.recycle();
                return bundle2;
            }
        }

        /* JADX INFO: renamed from: P2 */
        public static oul m169317P2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            return iInterfaceQueryLocalInterface instanceof oul ? (oul) iInterfaceQueryLocalInterface : new a(iBinder);
        }

        @Override // p153l.luq0
        /* JADX INFO: renamed from: O */
        public final boolean mo155961O(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
            if (i != 1) {
                return false;
            }
            Bundle bundleMo169316Z0 = mo169316Z0((Bundle) cwq0.m112932a(parcel, Bundle.CREATOR));
            parcel2.writeNoException();
            cwq0.m112934c(parcel2, bundleMo169316Z0);
            return true;
        }
    }

    /* JADX INFO: renamed from: Z0 */
    Bundle mo169316Z0(Bundle bundle) throws RemoteException;
}
