package p153l;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes6.dex */
public abstract class lxs0 extends q6s0 implements mxs0 {
    public lxs0() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
    }

    /* JADX INFO: renamed from: o8 */
    public static mxs0 m156238o8(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
        return iInterfaceQueryLocalInterface instanceof mxs0 ? (mxs0) iInterfaceQueryLocalInterface : new kxs0(iBinder);
    }

    @Override // p153l.q6s0
    /* JADX INFO: renamed from: n8 */
    public final boolean mo96668n8(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            p1m p1mVarZze = zze();
            parcel2.writeNoException();
            r6s0.m180044f(parcel2, p1mVarZze);
        } else {
            if (i != 2) {
                return false;
            }
            boolean zZzf = zzf();
            parcel2.writeNoException();
            ClassLoader classLoader = r6s0.f161495a;
            parcel2.writeInt(zZzf ? 1 : 0);
        }
        return true;
    }
}
