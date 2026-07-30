package p149l;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public interface asl extends IInterface {

    /* JADX INFO: renamed from: l.asl$a */
    public static abstract class AbstractBinderC15708a extends flq0 implements asl {

        /* JADX INFO: renamed from: l.asl$a$a */
        public static class a extends kiq0 implements asl {
            public a(IBinder iBinder) {
                super(iBinder);
            }

            @Override // p149l.asl
            /* JADX INFO: renamed from: Z0 */
            public final Bundle mo98596Z0(Bundle bundle) throws RemoteException {
                Parcel parcelM146127O = m146127O();
                wmq0.m204048b(parcelM146127O, bundle);
                Parcel parcelM146128P2 = m146128P2(parcelM146127O);
                Bundle bundle2 = (Bundle) wmq0.m204047a(parcelM146128P2, Bundle.CREATOR);
                parcelM146128P2.recycle();
                return bundle2;
            }
        }

        /* JADX INFO: renamed from: P2 */
        public static asl m98597P2(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            return iInterfaceQueryLocalInterface instanceof asl ? (asl) iInterfaceQueryLocalInterface : new a(iBinder);
        }

        @Override // p149l.flq0
        /* JADX INFO: renamed from: O */
        public final boolean mo98598O(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
            if (i != 1) {
                return false;
            }
            Bundle bundleMo98596Z0 = mo98596Z0((Bundle) wmq0.m204047a(parcel, Bundle.CREATOR));
            parcel2.writeNoException();
            wmq0.m204049c(parcel2, bundleMo98596Z0);
            return true;
        }
    }

    /* JADX INFO: renamed from: Z0 */
    Bundle mo98596Z0(Bundle bundle) throws RemoteException;
}
