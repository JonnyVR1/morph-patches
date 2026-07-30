package p149l;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzen;

/* JADX INFO: loaded from: classes6.dex */
public abstract class gat0 extends kxr0 implements qbt0 {
    public gat0() {
        super("com.google.android.gms.ads.internal.client.ILiteSdkInfo");
    }

    public static qbt0 asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.ILiteSdkInfo");
        return iInterfaceQueryLocalInterface instanceof qbt0 ? (qbt0) iInterfaceQueryLocalInterface : new g9t0(iBinder);
    }

    @Override // p149l.kxr0
    /* JADX INFO: renamed from: n8 */
    public final boolean mo98344n8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zzen liteSdkVersion = getLiteSdkVersion();
            parcel2.writeNoException();
            lxr0.m152088e(parcel2, liteSdkVersion);
        } else {
            if (i != 2) {
                return false;
            }
            ons0 adapterCreator = getAdapterCreator();
            parcel2.writeNoException();
            lxr0.m152089f(parcel2, adapterCreator);
        }
        return true;
    }
}
