package p149l;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class lds0 extends kxr0 implements mds0 {
    public lds0() {
        super("com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
    }

    /* JADX INFO: renamed from: o8 */
    public static mds0 m149472o8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
        return iInterfaceQueryLocalInterface instanceof mds0 ? (mds0) iInterfaceQueryLocalInterface : new kds0(iBinder);
    }

    @Override // p149l.kxr0
    /* JADX INFO: renamed from: n8 */
    public final boolean mo98344n8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        ips0 ips0VarM102983o8 = bos0.m102983o8(parcel.readStrongBinder());
        uyl uylVarM196295O = uyl.AbstractBinderC20541a.m196295O(parcel.readStrongBinder());
        lxr0.m152086c(parcel);
        mo145680F4(ips0VarM102983o8, uylVarM196295O);
        parcel2.writeNoException();
        return true;
    }
}
