package p153l;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzen;

/* JADX INFO: loaded from: classes6.dex */
public abstract class mjt0 extends q6s0 implements wkt0 {
    public mjt0() {
        super("com.google.android.gms.ads.internal.client.ILiteSdkInfo");
    }

    public static wkt0 asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.ILiteSdkInfo");
        return iInterfaceQueryLocalInterface instanceof wkt0 ? (wkt0) iInterfaceQueryLocalInterface : new mit0(iBinder);
    }

    @Override // p153l.q6s0
    /* JADX INFO: renamed from: n8 */
    public final boolean mo96668n8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zzen liteSdkVersion = getLiteSdkVersion();
            parcel2.writeNoException();
            r6s0.m180043e(parcel2, liteSdkVersion);
        } else {
            if (i != 2) {
                return false;
            }
            uws0 adapterCreator = getAdapterCreator();
            parcel2.writeNoException();
            r6s0.m180044f(parcel2, adapterCreator);
        }
        return true;
    }
}
